/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
    import java.util.Scanner;

public class LectureRoomManager {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nMain Menu:");
            System.out.println("W: Add Students");
            System.out.println("X: Remove Students");
            System.out.println("Y: Turn On Light");
            System.out.println("Z: Turn Off Light");
            System.out.println("Q: Quit");
            System.out.print("Please enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case 'W', 'w' -> {
                    System.out.print("Enter the number of students to add: ");
                    int addStudents = input.nextInt();
                    room.addStudents(addStudents);
                }
                case 'X', 'x' -> {
                    System.out.print("Enter the number of students to remove: ");
                    int removeStudents = input.nextInt();
                    room.removeStudents(removeStudents);
                }
                case 'Y', 'y' -> {
                    System.out.print("Enter the light number to turn on (1-3): ");
                    int lightOn = input.nextInt();
                    room.turnOnLight(lightOn);
                }
                case 'Z', 'z' -> {
                    System.out.print("Enter the light number to turn off (1-3): ");
                    int lightOff = input.nextInt();
                    room.turnOffLight(lightOff);
                }
                case 'Q', 'q' -> System.out.println("Quitting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }

            room.displayStatus();
        } while (choice != 'Q' && choice != 'q');

        input.close();
    }

    private static class LectureRoom {

        public LectureRoom() {
        }

        private void displayStatus() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void turnOffLight(int lightOff) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void turnOnLight(int lightOn) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void addStudents(int addStudents) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void removeStudents(int removeStudents) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

    

