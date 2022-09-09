package com.enko.books.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, Integer> {

        UserInfo findOneByEmail(String email);
}
