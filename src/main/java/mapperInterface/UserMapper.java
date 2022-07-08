package mapperInterface;

import entity.User;

import java.util.List;

/**
 * @author chumeng
 * @date 2022/7/8 15:09
 */
public interface UserMapper {

    /**
     *
     * @return
     */
    List<User> findAllUser();
}
