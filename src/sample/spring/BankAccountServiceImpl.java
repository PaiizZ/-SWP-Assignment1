package sample.spring;

/**
 * @another Wanchanapon Thanwaranurak
 * @version 4/10/2017.
 */
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

    private static Logger logger = Logger
            .getLogger(BankAccountServiceImpl.class);
    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    public int createBankAccount(BankAccountDetails bankAccountDetails) {
        logger.info(String.format("createBankAccount method invoked with params (BankAccountDetails=%s", bankAccountDetails.toString() ));
        return bankAccountDao.createBankAccount(bankAccountDetails);
    }
}