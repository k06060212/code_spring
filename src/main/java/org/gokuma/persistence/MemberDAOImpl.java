package org.gokuma.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.gokuma.domain.MemberVO;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace="org.gokuma.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+" .insertMember", vo);
	}
	
}
