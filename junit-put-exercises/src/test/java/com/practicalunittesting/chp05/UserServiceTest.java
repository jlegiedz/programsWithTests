package com.practicalunittesting.chp05;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void assignPasswordTest() throws Exception {

        User user = mock(User.class);
        SecurityService securityService = mock(SecurityService.class);
        UserDAO userDAO = mock(UserDAO.class);

        UserServiceImpl userService = new UserServiceImpl(userDAO, securityService);

        String passwordMd5 = "md5password";
        //tell security service how to behave when calling md5 method
        when(securityService.md5(user.getPassword())).thenReturn("md5password");

        userService.assignPassword(user);

        // verify if assignPassword method behaved like this:
        verify(user).setPassword("md5password");
        verify(userDAO).updateUser(user);


//     tested method:
//    public void assignPassword(User user) throws Exception {
//        String passwordMd5 = securityService.md5(user.getPassword());
//        user.setPassword(passwordMd5);
//        userDAO.updateUser(user);
//    }


    }

}
