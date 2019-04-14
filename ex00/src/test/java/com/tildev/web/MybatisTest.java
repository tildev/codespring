/**
 * 
 */
package com.tildev.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tildev
 * @date 2019. 4. 15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MybatisTest {

    @Inject
    private SqlSessionFactory sqlFactory;

    @Test
    public void testFactory() {
        System.out.println(sqlFactory);
    }

    @Test
    public void testSession() throws Exception {
        SqlSession session;
        try {
            session = sqlFactory.openSession();
            System.out.println(session);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
