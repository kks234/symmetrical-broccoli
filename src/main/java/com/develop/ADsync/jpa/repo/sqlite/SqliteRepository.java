package com.develop.ADsync.jpa.repo.sqlite;

import com.develop.ADsync.jpa.entity.sqlite.SaveUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqliteRepository extends JpaRepository<SaveUser, Integer> {
}
