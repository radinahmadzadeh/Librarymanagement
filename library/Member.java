package library;

import java.util.LinkedList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Transaction> transactions;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.transactions = new LinkedList<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Transaction getLastTransaction() {
        if (transactions.isEmpty()) {
            return null;
        }
        return transactions.get(transactions.size() - 1);
    }
    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
