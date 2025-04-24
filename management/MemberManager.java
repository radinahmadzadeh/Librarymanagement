package management;

import library.Member;
import library.Transaction;

import java.util.HashMap;
import java.util.Map;

public class MemberManager {
    private Map<String, Member> members;

    public MemberManager() {
        this.members = new HashMap<>();
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }
    public Transaction getLastTransaction(String memberId) {
        Member member = members.get(memberId);
        if (member != null) {
            return member.getLastTransaction();
        }
        return null;
    }
    public void recordTransaction(String memberId, Transaction transaction) {
        Member member = members.get(memberId);
        if (member != null) {
            member.recordTransaction(transaction);
        } else {
            System.out.println("Member with ID " + memberId + " not found.");
        }
    }
}
