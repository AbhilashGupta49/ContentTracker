package com.hollowambitionproject.contenttracker.user.crud;

import com.hollowambitionproject.contenttracker.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User CRUD APIs.
 */
@RestController
@RequestMapping("/user")
public class UserCrudController {

    /**
     * User CRUD Service.
     */
    @Autowired
    private UserCrudService userCrudService;

    /**
     * @param id userID
     * @return User
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(
            final @NonNull @PathVariable String id) {
        /* Check RBAC */
        User user = userCrudService.getUser(id);
        if (user == null) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(userCrudService.getUser(id), HttpStatus.OK);
    }
}
