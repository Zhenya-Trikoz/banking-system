package dao.iface;

import domain.models.Phone;
import domain.models.User;

public interface PhoneDAO {
    void createPhone(User user);
    Phone readPhone(String phone);
    Phone updatePhone();
    void deletePhone();
}
