package org.gokuma.persistence;

import org.gokuma.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
