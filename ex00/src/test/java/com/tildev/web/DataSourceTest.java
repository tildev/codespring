/**
 * 
 */
package com.tildev.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tildev
 * @date 2019. 4. 3.
 */
// @RunWith 에러가 뜨면, 
// 프로젝트 마우스 오른쪽 클릭 -> Build Path -> Configure Build Path... -> Library 탭의 Add Library... 클릭
// Junit 4 를 추가해 주자.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DataSourceTest {

    @Inject
    private DataSource ds;

    @Test
    public void testConnection() throws Exception {
        Connection con;
        try {
            con = ds.getConnection();
            System.out.println(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
