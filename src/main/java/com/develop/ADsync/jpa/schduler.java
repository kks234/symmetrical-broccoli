package com.develop.ADsync.jpa;

import com.develop.ADsync.jpa.entity.sqlite.SaveUser;
import com.develop.ADsync.jpa.entity.tibero.UserTest;
import com.develop.ADsync.jpa.repo.tibero.TiberoRepository;
import com.develop.ADsync.jpa.repo.sqlite.SqliteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@ComponentScan
public class schduler {
    @Autowired(required = true)
    private SqliteRepository sqlrepo;
    @Autowired(required = true)
    private TiberoRepository tbrepo;


    @Scheduled(fixedDelay = 1000)
    public void main() {
        SaveUser saveUser = new SaveUser();
        saveUser.setField1("content");
        saveUser.setField2(1);
        sqlrepo.save(saveUser);

        UserTest userTest = new UserTest();
        userTest.setContent("kks");
        userTest.setId(1);
        tbrepo.save(userTest);


    }
}
