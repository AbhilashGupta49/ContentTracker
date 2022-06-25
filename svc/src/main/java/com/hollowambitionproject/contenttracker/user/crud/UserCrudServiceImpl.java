package com.hollowambitionproject.contenttracker.user.crud;

import com.hollowambitionproject.contenttracker.user.model.User;
import org.springframework.stereotype.Service;

/**
 * User CRUD Service Implementation.
 */
@Service
public class UserCrudServiceImpl implements UserCrudService {

    /**
     * @param id userID
     * @return User
     */
    @Override
    public User getUser(final String id) {
        return new User("a", "b", "k");
    }
}
