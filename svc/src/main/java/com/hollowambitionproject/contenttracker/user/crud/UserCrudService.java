package com.hollowambitionproject.contenttracker.user.crud;

import com.hollowambitionproject.contenttracker.user.model.User;

/**
 * Interface for UserCrudService.
 */
public interface UserCrudService {

    /**
     * @param id userID
     * @return User
     */
    User getUser(String id);
}
