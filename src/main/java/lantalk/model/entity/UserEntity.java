package lantalk.model.entity;

import jakarta.persistence.*;
import lantalk.model.dto.UserDto;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder @ToString
@Entity @Table(name = "users")
public class UserEntity extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNo;

    @Column(columnDefinition = "bool", nullable = false)
    private boolean userState;

    @Column(columnDefinition = "bool", nullable = false)
    private boolean userMic;

    @Column(columnDefinition = "bool", nullable = false)
    private boolean userSex;

    @Column(columnDefinition = "varchar(30)", nullable = false, unique = true)
    private String userName;

    @Column(columnDefinition = "varchar(30)", nullable = false, unique = true)
    private String userId;

    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String userPwd;

    @Column(columnDefinition = "varchar(50)", nullable = false, unique = true)
    private String userEmail;

    @Column(columnDefinition = "varchar(13)", nullable = false, unique = true)
    private String userPhone;

    public UserDto toDto() {
        return UserDto.builder()
                .userNo(this.userNo)
                .userState(this.userState)
                .userMic(this.userMic)
                .userSex(this.userSex)
                .userName(this.userName)
                .userId(this.userId)
                .userPwd(this.userPwd)
                .userEmail(this.userEmail)
                .userPhone(this.userPhone)
                .cdate(this.getCdate())
                .udate(this.getUdate())
                .build();
    }
}
