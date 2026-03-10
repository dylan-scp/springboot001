package shopdevjava.shopdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import shopdevjava.shopdev.entity.user.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserEmail(String userEmail);

    UserEntity findByUserName(String userName);

    /**
     * Where userName Like %?
     */
    UserEntity findByUserNameStartingWith(String userName);

    /**
     * Where userName Like ?%
     */
    UserEntity findByUserNameEndingWith(String userName);

    // RAW JSQL
    @Query(value = "SELECT * FROM java_user_001 WHERE user_name = ?1 AND user_email = ?2", nativeQuery = true)
    UserEntity findByUserNameAndUserEmailWithRawJSQL(String userName, String userEmail);

}
