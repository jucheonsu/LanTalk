package lantalk.model.dto;

import lantalk.model.entity.UserEntity;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder @ToString
public class UserDto {
    private int userNo;
    private boolean userState;
    private boolean userMic;
    private boolean userSex;
    private String userName;
    private String userId;
    private String userPwd;
    private String userEmail;
    private String userPhone;
    private LocalDateTime cdate;
    private LocalDateTime udate;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .userNo(this.userNo)
                .userState(this.userState)
                .userMic(this.userMic)
                .userSex(this.userSex)
                .userName(this.userName)
                .userId(this.userId)
                .userPwd(this.userPwd)
                .userEmail(this.userEmail)
                .userPhone(this.userPhone)
                .build();
    }
}