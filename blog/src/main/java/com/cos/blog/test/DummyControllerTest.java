package com.cos.blog.test;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired // 의존성 주입
    private UserRepository userRepository;



    //{id}로 주소 파라미터 전달받을수있음
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){

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
                return new IllegalArgumentException("해당유저는 없습니다. id : "+id);
            }
        });


        return user;
    }











    //http://localhost:8000/blog/dummy/join (요청)
    // http body에 데이터를 가지고 (요청)
    @PostMapping("/dummy/join")

    //public String join(String username, String password, String email){

        //System.out.println("username : "+username);
       // System.out.println("password : " +password);
       // System.out.println("email : "+email);

    public String join(User user){
        System.out.println("id" + user.getId());
        System.out.println("username : "+user.getUsername());
        System.out.println("password : " + user.getPassword());
        System.out.println("email : "+user.getEmail());
        System.out.println("role : "+user.getRole());

        user.setRole(RoleType.USER); //enum으로 set
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";

    }
}
