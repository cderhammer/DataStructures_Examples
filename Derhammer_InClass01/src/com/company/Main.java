package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Conor Derhammer
    // 801155393

/*
The methods are implemented but commented out in Main for easier viewing and debugging.
To view the functionality of each method, please uncomment the method and the associated code
*/


    public static void main(String[] args) {
        // write your code here

        // 1.)
        // fizzBuzz();

        // 2.)
        // System.out.println(isEven(3));

        // 3.)
        // Integer[] arr = {10,18,2,32,46};
        // System.out.println(getMinimum(arr));

        // 4.)
        // getParsedUsers(Data.users);

        // 5.)
        // Use the below code universally for methods that need to pass an ArrayList of Users
        /*
        ArrayList<User> userList1 = new ArrayList<User>();
        for (String str : Data.users) {
            String[] userSplit = str.split(",");
            userList1.add(new User(userSplit[0], userSplit[1], Integer.parseInt(userSplit[2]), userSplit[3],
                    userSplit[4], userSplit[5], userSplit[6]));
        }*/
        // printUsers_OMN(userList1);

        // 6.)
        // printUsersSortedByAge(userList1);

        // 7.)
        // printUsersOldest10(userList1);

        // 8.)
        // printUserStateStats(userList1);

        // 9.)
        // String[] words1 = Data.words_1;
        // String[] words2 = Data.words_2;
        // getWordOverlap(words1, words2);

        // 10.)
        // Use the below code to pass in 2 ArrayLists to check for overlapping user objects
        /*
        ArrayList<User> names1 = new ArrayList<User>();
        for (String str : Data.users) {
            String[] userSplit = str.split(",");
            names1.add(new User(userSplit[0], userSplit[1], Integer.parseInt(userSplit[2]), userSplit[3],
                    userSplit[4], userSplit[5], userSplit[6]));
        }
        ArrayList<User> names2 = new ArrayList<User>();
        for (String str : Data.otherUsers) {
            String[] userSplit = str.split(",");
            names2.add(new User(userSplit[0], userSplit[1], Integer.parseInt(userSplit[2]), userSplit[3],
                    userSplit[4], userSplit[5], userSplit[6]));
        }
        getUserOverlap(names1, names2);
         */
    }

    //Question 1
    public static void fizzBuzz() {
        for (int i = 0; i < 21; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }
        }
    }

    //Question 2
    public static boolean isEven(Integer num){
        return num % 2 == 0;
    }

    //Question 3
    public static Integer getMinimum(Integer[] numbers){
        if (numbers == null || numbers.length == 0)  {
            return null;
        }
        Arrays.sort(numbers);
        return numbers[0];
    }

    //Question 4
    public static ArrayList<User> getParsedUsers(String[] strings) {
        ArrayList<User> userList = new ArrayList<>();
        for (String user : strings) {
            String[] userSplit = user.split(",");
            userList.add(new User(userSplit[0], userSplit[1], Integer.parseInt(userSplit[2]), userSplit[3],
                    userSplit[4], userSplit[5], userSplit[6]));
            System.out.println(user);
        }
        return null;
    }

    //Question 5
    public static void printUsers_OMN(ArrayList<User> users) {
        for (User omnList : users) {
            if (omnList.getFirstName().startsWith("O")) {
                System.out.println(omnList);
            } else if (omnList.getFirstName().startsWith("M")) {
                System.out.println(omnList);
            } else if (omnList.getFirstName().startsWith("N")) {
                System.out.println(omnList);
            }
        }
    }

    //Question 6
    public static void printUsersSortedByAge(ArrayList<User> users){
            Collections.sort(users, Collections.reverseOrder());
            System.out.println(users);

    }

    //Question 7
    public static void printUsersOldest10(ArrayList<User> users){
        Collections.sort(users, Collections.reverseOrder());
        System.out.println(users.subList(0,10));
    }

    //Question 8
    public static void printUserStateStats(ArrayList<User> users) {
        Map<String, Long> userByStateMap = new HashMap<>();
        userByStateMap = users
                .stream()
                .collect(Collectors.groupingBy(User::getState, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
                    throw new IllegalStateException();
                }, LinkedHashMap::new));
        System.out.printf("%2s %4s", "Count", "State");
        System.out.println();
        for (Map.Entry<String, Long> entry : userByStateMap.entrySet()) {

            System.out.printf("%2s %5s", entry.getValue(), entry.getKey());
            System.out.println();
        }
    }

    //Question 9
    public static Set<String> getWordOverlap(String[] listA, String[] listB){
        // Data data = new Data();
        // String[] words1 = Data.words_1;
        // String[] words2 = Data.words_2;
        Set<String> mySet1 = new HashSet<String>(Arrays.asList(listA));
        Set<String> mySet2 = new HashSet<String>(Arrays.asList(listB));

        Set<String> intersection = new HashSet<String>(mySet1);
        intersection.retainAll(mySet2);
        // mySet1.retainAll(mySet2);
        System.out.println(intersection);
        return null;
    }

    //Question 10
    public static ArrayList<User> getUserOverlap(ArrayList<User> usersA, ArrayList<User> usersB){
        Collections.sort(usersA);
        Collections.sort(usersB);
        usersA.retainAll(usersB);
        System.out.println(usersA);
        /*
        ArrayList<User> list = new ArrayList<User>();
        for (User users : usersA){
            if(usersB.contains(users)){
                list.add(users);
            } else if(usersA != usersB){
                System.out.println("No Matches");
            }
        }
        System.out.println(list);
        */
        return null;
    }

}
