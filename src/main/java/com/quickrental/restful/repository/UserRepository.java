package com.quickrental.restful.repository;

import com.quickrental.restful.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MF Fazeel Mohamed on 5/7/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
