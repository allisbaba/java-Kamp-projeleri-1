package TaskBes.core.concretes;

import TaskBes.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {
    @Override
    public void ValidatorMessage() {
        System.out.println("Doğrulama mesajı gönderildi");
    }
}
