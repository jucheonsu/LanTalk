package lantalk.service;

import jakarta.transaction.Transactional;
import lantalk.model.dto.UserDto;
import lantalk.model.entity.UserEntity;
import lantalk.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean signup(UserDto userDto) {
        UserEntity userEntity = userDto.toEntity();
        UserEntity saveUserEntity = userRepository.save(userEntity);
        return true;
    }

}