package sample.spring;

/**
 * @another Wanchanapon Thanwaranurak
 * @version 4/10/2017.
 */
public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    void subtractFromAccount(int bankAccountId, int amount);
}