/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taskmanager;



/**
 *
 * @author K1907860
 */
public class TaskManagerTest {
    
    public static void main(String[] args){
        TaskManager tm  = new TaskManager(); 
        
        // Tests P2R1: 
        System.out.println("P2R1 Testing");
        System.out.println("Pre-Condition");
        System.out.println(tm.countUsers());
        System.out.println(tm.countTasks());
        // Adding data to the user. 
        User testUser1 = new User("1,James Denholm-Price");
        User testUser2 = new User("2,Ahemd Shihab");
        Task testTask1 = new Task("1,Revise for Gateway Test,1,2020-11-23");
        Task testTask2 = new Task("2,Get the heck outta here,2,2020-12-11");
        System.out.println(testUser1.toString().equals("1,James Denholm-Price"));
        System.out.println(testUser2.toString().equals("2,Ahemd Shihab"));

        // Post-condition  
        System.out.println("Post-Condition");
        tm.addUser(testUser1);
        tm.addUser(testUser2);
        tm.addTask(testTask1);
        tm.addTask(testTask2);
        System.out.println(tm.getTasks().size() == 2);
        System.out.println(tm.getUsers().size() == 2);
        System.out.println(tm.getTasks().contains(testTask1));
        System.out.println(tm.getTasks().contains(testTask1));
        System.out.println(tm.getUsers().contains(testUser1));
        System.out.println(tm.getUsers().contains(testUser2));        
        

        //Testing P2R2: 
        System.out.println("P2R2 Testing");
        System.out.println(tm.getTask(1) == testTask1);
        System.out.println(tm.getUser(1) == testUser1);
        System.out.println(tm.removeTask(tm.getTask(1)));
        System.out.println(tm.removeUser(tm.getUser(1)));
        // List must have 1 memebr each 
        System.out.println(tm.getTasks().size() == 1);
        System.out.println(tm.getUsers().size() == 1);
        // List shoundn't have removed item 
        System.out.println(!tm.getTasks().contains(testTask1));
        System.out.println(!tm.getUsers().contains(testUser1));


        //P2R3 
        System.out.println("Testing P2R3");
        String propertyToEdit; 
        Task assignTask = tm.getTask(2);
        User toUser = tm.getUser(2);
        // pre-condition;
        System.out.println(toUser.getTasks().isEmpty());
        System.out.println(tm.getTasks().size()==1);
        System.out.println(toUser==testUser2);
        System.out.println(assignTask==testTask2);
        //post-condition
        System.out.println(toUser.addTask(assignTask)==true);
        System.out.println(toUser.getTasks().size()== 1);
        System.out.println(toUser.getTasks().contains(assignTask));
        System.out.println(tm.getTasks().size()==1);
        //FOR TASK
        System.out.println("Teseting P2R4 TASK");
        propertyToEdit = "priority";
        Task taskToEdit = tm.getTask(2);
        String intToEdit = tm.getValue(taskToEdit, propertyToEdit);
        System.out.println(intToEdit.equals("2"));
        String intToChange = "1";
        System.out.println(tm.setValue(taskToEdit, propertyToEdit, intToChange));
        System.out.println(taskToEdit.getPriority() == 1);

        
        //P2R4: for user
        // Change Ahmed Shihabs with id: 2 to ahmed Shihab
        System.out.println("Teseting P2R4 USER");
        propertyToEdit = "name";
        User userToEdit  = tm.getUser(2);
        String valueToEdit = tm.getValue(userToEdit, propertyToEdit);

        System.out.println(valueToEdit.equals("Ahmed Shihab"));
        String valueToChange = "Ahmed Shihab The Magnificent";
        tm.setValue(userToEdit, propertyToEdit, valueToChange);
        System.out.println(userToEdit.getName().equals(valueToChange));
        System.out.println(userToEdit);


        // P2R5 TESTING 

        // Change Ahmed Shihabs with id: 2 to ahmed Shihab
//        User editUser = tm.getUser(2); 
//        System.out.println(editUser); 
//        String valueToEdit = editUser.getName(); 
//        String valueToChange = "Ahmed Shihab The magnificient"; 
//        editUser.setName(valueToChange); 
//        System.out.println(editUser); 
        // P2R5 TESTING 

        System.out.println("Testing P2R5");
        
        SubTask testSubTask1 = new SubTask("1,Buy Train Ticket,false");
        System.out.println(testSubTask1.toString().equals("1,Buy Train Ticket,false"));
        Task targetTask = tm.getTask(2);
        boolean added  = targetTask.addSubTask(testSubTask1);
        System.out.println(added);
        System.out.println(targetTask.getSubTasks().size() ==1);
        System.out.println(targetTask.getSubTasks().contains(testSubTask1));
        
        
                System.out.println("Testing P2R5***");

        TaskManager ManagerP2R5 = new TaskManager(); 
        User testUsers2 = new User("2,Ahemd Shihab");
        Task testTasks1 = new Task("1,Revise for Gateway Test,1,2020-11-23");
        SubTask newSubTask = new SubTask("1,Buy Train Ticket,false");
        testUsers2.addTask(testTasks1); // Adding task to the user. 
        ManagerP2R5.addUser(testUsers2);
        // Pre-condition 
        // Checking User's Task contains 0 subtaks. 
        System.out.println(ManagerP2R5.getUser(2).getTasks().get(0).getSubTasks().size() == 0); 
        // Adding newSubTask to a Task of a user. 
        // Post condtion
        ManagerP2R5.getUser(2).getTasks().get(0).addSubTask(newSubTask);
        System.out.println(ManagerP2R5.getUser(2).getTasks().get(0).getSubTasks().size() == 1); 

        
        
        /// Create a user. 
        // Add that user to the list. 
        // create a task 
        // add that task to the user. 
        // create a subtask. 
        // pre conditon 
         // check if the user has any task. 
         // get the user by id. 
         // get the task of that user. 
         // add the subtask to teh user. 
         // check if the value has incremnted. 
        
        
        
        


        //P2R6
        System.out.println("Testing P2R6");
        //USER
        System.out.println("P2R6: User Test");
        String filename = "userTest.csv";
        TaskManager fileTestTM = new TaskManager();
        //fileTestTM.readUsersFromCsvFile(filename); 
        fileTestTM.readFromCsvFile(filename, TaskManager.TypeTU.User); 
        System.out.println(fileTestTM.getUsers().size() == 2);
        System.out.println(fileTestTM.getUsers().get(0).toString().equals("1,James Denholm-Price"));
        System.out.println(fileTestTM.getUsers().get(1).toString().equals("2,Ahmed Shihab"));
        //TASK
        System.out.println("P2R6: Task Test");
        filename = "taskTest.csv";
        //fileTestTM = new TaskManager(); // Use it to run this test. for P2R6 comment this. 
        fileTestTM.readFromCsvFile(filename, TaskManager.TypeTU.Task);
        System.out.println(fileTestTM.getTasks().size() == 2);
        System.out.println(fileTestTM.getTasks().get(0).toString().equals("1,Revise for Gateway Test,1,2020-11-23"));
        System.out.println(fileTestTM.getTasks().get(1).toString().equals("2,Get the heck outta here,2,2020-12-11"));


        //Testing P2R7
        // Writing data to file. 
        System.out.println("Testing P2R7: TASKS");
        TaskManager fileTestTM2 = new TaskManager();

        filename = "taskWriteTest.csv";
        //fileTestTM2.writeTasksToCsvFile(filename);
        fileTestTM.writeToCsvFile(filename, TaskManager.TypeTU.Task);
        // Reading the file from the written documents to see statisfy the requriments.
        
        fileTestTM2.readFromCsvFile(filename, TaskManager.TypeTU.Task);
        System.out.println(fileTestTM2.getTasks().size() == 2);
        System.out.println(fileTestTM2.getTasks().get(0).toString().equals("1,Revise for Gateway Test,1,2020-11-23"));
        System.out.println(fileTestTM2.getTasks().get(1).toString().equals("2,Get the heck outta here,2,2020-12-11"));
      // Writing data to file. 
        System.out.println("Testing P2R7: USERS");
        filename = "userWriteTest.csv";
        //fileTestTM2.writeUsersToCsvFile(filename);
        fileTestTM.writeToCsvFile(filename, TaskManager.TypeTU.User);

        // Reading the file from the written documents to see statisfy the requriments. 
        //fileTestTM2.readUsersFromCsvFile(filename);
        fileTestTM2.readFromCsvFile(filename, TaskManager.TypeTU.User); 
        System.out.println(fileTestTM2.getUsers().size() == 2);
        System.out.println(fileTestTM2.getUsers().get(0).toString().equals("1,James Denholm-Price"));
        System.out.println(fileTestTM2.getUsers().get(1).toString().equals("2,Ahmed Shihab"));
        
    }
    

        
    
    
    
    
}
