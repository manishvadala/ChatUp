package jbr.springmvc.repository;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository(value = "userRepository")
public class HibernateUserRepository extends AbstractDao<Long, User> implements UserRepository{

    @Override
    public void createUser(User user) {
        persist(user);
    }

    @Override
    public User validateUser(Login login) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("username", login.getUsername()));
        criteria.add(Restrictions.eq("password", login.getPassword()));
        return (User) criteria.uniqueResult();
    }
}
