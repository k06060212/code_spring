package org.gokuma.web;

import javax.inject.Inject;

import org.gokuma.domain.MemberVO;
import org.gokuma.persistence.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		
		System.out.println(dao.getTime());
		
	}
	
	@Test
	public void testInsertMember() throws Exception{
		
		MemberVO vo = new MemberVO();
		// test시 userid 는 primary key로 설정되어 있으므로 변경 후 테스트 해볼 것
		vo.setUserid("user01");
		vo.setUserpw("user00");
		vo.setUsername("user00");
		vo.setEmail("user00@aaa.com");
		
		dao.insertMember(vo);
	}
	
//	public void readMember() throws Exception{
//		
//		MemberVO vo = new MemberVO();
//		
//		
//		
//		dao.readMemberVO(null);
//	}
//	
//	public void readWithPW() throws Exception{
//		
//		MemberVO vo = new MemberVO();
//		
//		
//		
//		dao.readWithPW(null, null);
//	}
}
