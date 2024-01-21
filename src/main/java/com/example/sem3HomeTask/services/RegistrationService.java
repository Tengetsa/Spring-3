package com.example.sem3HomeTask.services;

import com.example.sem3HomeTask.domain.User;
import com.example.sem3HomeTask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    //Метод processRegistration
    public void processRegistration(String name, int age, String email){
        dataProcessingService.addUserToList(userService.createUser(name, age,email));
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    //region Field
    @Autowired
    private DataProcessingService dataProcessingService;

    // Добавить поля UserService, NotificationService(добавить в IOC контейнер аннотацией
    // @Autowired или через конструктор класса)

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    // Добавляем связь с репозиторием
    @Autowired
    private UserRepository userRepository;
    //endregion
}
