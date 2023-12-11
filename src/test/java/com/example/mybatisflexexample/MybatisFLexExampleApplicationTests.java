package com.example.mybatisflexexample;

import com.example.mybatisflexexample.mapper.AccountMapper;
import com.example.mybatisflexexample.model.Account;
import com.mybatisflex.core.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisFLexExampleApplicationTests {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        Account account = accountMapper.selectOneById(1);
        System.out.println(account);
    }

}
