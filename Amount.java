package org.example;

import java.util.Objects;

public class Amount {
    private Double amount;
    private String transactionType;



    public Amount(Double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        if(amount > 20)
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount amount1)) return false;
        return Objects.equals(getAmount(), amount1.getAmount()) && Objects.equals(getTransactionType(), amount1.getTransactionType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getTransactionType());
    }

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
