package domain.system;

import dao.exceptions.DAOException;
import dao.iface.UserDAO;
import dao.sql.SQLUserDAO;
import domain.iface.I_System;
import domain.models.Account;
import domain.models.User;

import java.math.BigDecimal;

public class SystemImpl implements I_System {
    User user;
    UserDAO userDAO;

    public SystemImpl(User user) {
        this.user = user;
    }

    public SystemImpl() {
    }

    @Override
    public void replenishOnTheCard(BigDecimal replenishAmount) {

    }

    @Override
    public void replenishOnTheCard(BigDecimal replenishAmount, long rechargeableCard) {

    }

    @Override
    public void withdrawingMoney(BigDecimal withdrawingAmount) {

    }

    @Override
    public void replenishPhone(BigDecimal replenishAmount) {

    }

    @Override
    public void replenishPhone(BigDecimal replenishAmount, long numberPhone) {

    }

    @Override
    public void registration() {
        System.out.println(user);
        userDAO = new SQLUserDAO();
        try {
            userDAO.createUser(user);
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User authorization(Account account) {
        return null;
    }

}
