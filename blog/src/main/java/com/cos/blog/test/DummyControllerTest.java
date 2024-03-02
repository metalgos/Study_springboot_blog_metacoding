package com.cos.blog.test;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired // 의존성 주입
    private UserRepository userRepository;


    @GetMapping("/dummy/users")
    public List<User> list() {

        return userRepository.findAll();
    }


    @GetMapping("dummy/user")
    public List<User> pageList(@PageableDefault(size = 2, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        Page<User> pagingUser = userRepository.findAll(pageable);

        //페이징이 첫번쨰 인가?
        if(pagingUser.isFirst()){


        }
        List<User> users = pagingUser.getContent();
        return users;
    }

    //{id}로 주소 파라미터 전달받을수있음
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id) {

        //user/4를 요청시 데이터베이스에 내용이 없으면 값이 null
        //null값을 방지하기 위해 옵셔널로 값을 감싼다.
        //옵셔널 이용하는 방법은 아래 와 같음
        /*
        Optional<User> byId = userRepository.findById(id)()
        if(byId.isPresent())
*/

        //선호하지 않는 방법
        /*
       User user = userRepository.findById(id).orElseGet(new Supplier<User>() {
            @Override
            public User get() {
                return new User();
            }
        });
*/

        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당유저는 없습니다. id : " + id);
            }
        });
        //요청 : 웹
        //user객체 - 자바오브젝트
        //자바 객체는 웹 프라우저가 이해할수 있도록 json으로 변경해서 반환됨
        //예전에는 gson 라이브러리 이용, 스프링부트는 메세지 컨버터가 응답시 자동작동
        //스프링 부트는 만약에 자바 오브젝트를 리턴하게 되면 메세지컨버터가 jackson라이브러리 호출해서 자동변환
        return user;
    }


    //http://localhost:8000/blog/dummy/join (요청)
    // http body에 데이터를 가지고 (요청)
    @PostMapping("/dummy/join")

    //public String join(String username, String password, String email){

    //System.out.println("username : "+username);
    // System.out.println("password : " +password);
    // System.out.println("email : "+email);

    public String join(User user) {
        System.out.println("id" + user.getId());
        System.out.println("username : " + user.getUsername());
        System.out.println("password : " + user.getPassword());
        System.out.println("email : " + user.getEmail());
        System.out.println("role : " + user.getRole());

        user.setRole(RoleType.USER); //enum으로 set
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";

    }
}
