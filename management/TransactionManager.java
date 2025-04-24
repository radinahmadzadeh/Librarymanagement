package management;

import library.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public Transaction addTransaction(String bookTitle, String memberName, String type) {
        Transaction transaction = new Transaction(
                "TXN-" + System.currentTimeMillis(),
                bookTitle,
                memberName,
                type
        );
        transactions.add(transaction);
        return transaction;
    }

    public Transaction getTransactionByIndex(int index) {
        if (index >= 0 && index < transactions.size()) {
            return transactions.get(index);
        }
        return null;
    }
}
