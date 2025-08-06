package ra.edu.ennity.service;

import ra.edu.ennity.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.edu.ennity.repo.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<user> getAll() {
        return userRepository.getUsers();
    }
}
