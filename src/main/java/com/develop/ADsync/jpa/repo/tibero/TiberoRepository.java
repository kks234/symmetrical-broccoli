package com.develop.ADsync.jpa.repo.tibero;

import com.develop.ADsync.jpa.entity.tibero.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TiberoRepository extends JpaRepository<UserTest, Integer> {

}
