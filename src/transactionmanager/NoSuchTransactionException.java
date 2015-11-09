package transactionmanager;

public class NoSuchTransactionException extends Exception {
    private Integer transactionId;

    public NoSuchTransactionException() {
        transactionId = null;
    }

    public NoSuchTransactionException(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        if(transactionId == null)
            return "An unknown transaction was used.";
        else
            return "No such transaction " + String.valueOf(transactionId);
    }
}
