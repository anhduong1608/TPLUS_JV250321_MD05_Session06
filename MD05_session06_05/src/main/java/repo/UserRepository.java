package repo;

import model.ennity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import service.UserService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
private List<user> users;

    public UserRepository(List<user> users) {
        this.users = users2();
    }
    public List<user> getUsers() {
        return users;
    }

    private List<user> users2(){
        List<user> list = new ArrayList<>();
        DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try{
            list.add(new user("Nguyen Van A", 25, LocalDate.parse("2001-01-01",dtf), "a@example.com", "0901234567"));
            list.add(new user("Tran Thi B", 30, LocalDate.parse("2001-01-01",dtf), "b@example.com", "0902345678"));
            list.add(new user("Le Van C", 22, LocalDate.parse("2001-01-01",dtf), "c@example.com", "0903456789"));
            list.add(new user("Pham Thi D", 28, LocalDate.parse("2001-01-01",dtf), "d@example.com", "0904567890"));
            list.add(new user("Hoang Van E", 35, LocalDate.parse("2001-01-01",dtf), "e@example.com", "0905678901"));
            list.add(new user("Vo Thi F", 24, LocalDate.parse("2001-01-01",dtf), "f@example.com", "0906789012"));
            list.add(new user("Dang Van G", 29,LocalDate.parse("2001-01-01",dtf), "g@example.com", "0907890123"));
            list.add(new user("Bui Thi H", 31, LocalDate.parse("2001-01-01",dtf), "h@example.com", "0908901234"));
            list.add(new user("Nguyen Van I", 27, LocalDate.parse("2001-01-01",dtf), "i@example.com", "0909012345"));
            list.add(new user("Tran Thi J", 23, LocalDate.parse("2001-01-01",dtf), "j@example.com", "0910123456"));
        }catch (Exception e){e.printStackTrace();}
        return list;
    }





}
