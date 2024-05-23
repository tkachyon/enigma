package org.example;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Program {

    private static final String pat = "[A-Z]-[A-Z]";
    private static Map<Character, Character> PLUG = new HashMap<>() {{
        put('A', 'A');
        put('B', 'B');
        put('C', 'C');
        put('D', 'D');
        put('E', 'E');
        put('F', 'F');
        put('G', 'G');
        put('H', 'H');
        put('I', 'I');
        put('J', 'J');
        put('K', 'K');
        put('L', 'L');
        put('M', 'M');
        put('N', 'N');
        put('O', 'O');
        put('P', 'P');
        put('Q', 'Q');
        put('R', 'R');
        put('S', 'S');
        put('T', 'T');
        put('U', 'U');
        put('V', 'V');
        put('W', 'W');
        put('X', 'X');
        put('Y', 'Y');
        put('Z', 'Z');
    }};

    public static Rotor create(String name, boolean kriegsmarine, Scanner scanner) {
        Library lib = new Library();
        List<Integer> turn = new ArrayList<>();
        Map<Character, Character> temp = new HashMap<>();
        if (kriegsmarine) {
            turn = lib.masterDictKT.get(name);
            temp = lib.masterDictK.get(name);
        } else {
            turn = lib.masterDictT.get(name);
            temp = lib.masterDict.get(name);
        }

        Map<Character, Character> tempR = temp.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        // Input Ring Setting
        int sett = -1;
        while (sett < 0 || sett > 25) {
            System.out.println("Input Ring Setting (Ringstellung)(0-25)");
            if (scanner.hasNextInt()) {
                sett = scanner.nextInt();
                if (sett < 0 || sett > 25) {
                    System.out.println("Choose between 0 and 25!");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 0 and 25.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Input Ring Offset
        int offs = -1;
        while (offs < 0 || offs > 25) {
            System.out.println("Input Ring Offset (Grundstellung)(0-25)");
            if (scanner.hasNextInt()) {
                offs = scanner.nextInt();
                if (offs < 0 || offs > 25) {
                    System.out.println("Choose between 0 and 25!");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 0 and 25.");
                scanner.next(); // Consume the invalid input
            }
        }
//        scanner.nextLine(); // Consume newline
        return new Rotor(temp, offs, turn, sett, tempR, kriegsmarine);
    }

    private static Map<Character, Character> activeReflector;
    private static List<Rotor> rotors;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Library lib = new Library();
            PLUG = new HashMap<>() {{
                put('A', 'A');
                put('B', 'B');
                put('C', 'C');
                put('D', 'D');
                put('E', 'E');
                put('F', 'F');
                put('G', 'G');
                put('H', 'H');
                put('I', 'I');
                put('J', 'J');
                put('K', 'K');
                put('L', 'L');
                put('M', 'M');
                put('N', 'N');
                put('O', 'O');
                put('P', 'P');
                put('Q', 'Q');
                put('R', 'R');
                put('S', 'S');
                put('T', 'T');
                put('U', 'U');
                put('V', 'V');
                put('W', 'W');
                put('X', 'X');
                put('Y', 'Y');
                put('Z', 'Z');
            }};
            Pattern r = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);

            int plugboardCount = -1;
            while (plugboardCount < 0 || plugboardCount > 13) {
                System.out.println("How many letters to be connected on the plugboard?(0-13)");
                if (scanner.hasNextInt()) {
                    plugboardCount = scanner.nextInt();
                    if (plugboardCount < 0 || plugboardCount > 13) {
                        System.out.println("Choose the number from 0 to 13!");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number from 0 to 13.");
                    scanner.next(); 
                }
            }
            scanner.nextLine(); // Consume newline

            if (plugboardCount != 0) {
                System.out.println("Input the plugboard settings (in format \"A-B\"):");
                for (int i = 0; i < plugboardCount; i++) {
                    System.out.println("Current connection: #" + (i + 1));
                    String temporary = scanner.nextLine().toUpperCase();
                    Matcher m = r.matcher(temporary);
                    if (!m.matches()) {
                        i--;
                        System.out.println("Please input in format \"A-B\" ");
                        continue;
                    }

                    char first = temporary.charAt(0);
                    char second = temporary.charAt(2);
                    if(first == second){
                        System.out.println("You cannot set a letter to itself!");
                        i--;
                        continue;
                    }
                    if (PLUG.get(first) == first && PLUG.get(second) == second) {
                        PLUG.put(first, second);
                        PLUG.put(second, first);
                    } else {
                        System.out.println("You already set this letter on the plugboard!");
                        i--;
                    }
                }
            }

            rotors = new ArrayList<>();
            int amount = 0;
            do {
                System.out.println("Do you want to use 3 (Default) or 4 (Kriegsmarine version) rotors?");
                if (scanner.hasNextInt()) {
                    amount = scanner.nextInt();
                    if (amount != 3 && amount != 4) {
                        System.out.println("Wrong input! Please choose either 3 or 4 rotors.");
                        amount = 0;
                    }
                } else {
                    System.out.println("Invalid input. Please enter either 3 or 4.");
                    scanner.next(); // Consume the invalid input
                }
            } while (amount != 3 && amount != 4);

            if (amount == 3) {
                System.out.println("What reflector do you want to use (Umkehrwalze)?(Input number)");
                int ccc = 0;
                for (String j : lib.masterDictR.keySet()) {
                    ccc += 1;
                    System.out.println("#" + ccc + ": " + j);
                }

                int reflectorInput = -1;
                while (reflectorInput < 1 || reflectorInput > lib.reflector.size()) {
                    if (scanner.hasNextInt()) {
                        reflectorInput = scanner.nextInt();
                        if (reflectorInput < 1 || reflectorInput > lib.reflector.size()) {
                            System.out.println("Reflector with that number does not exist!");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid reflector number.");
                        scanner.next(); // Consume the invalid input
                    }
                }

                activeReflector = lib.reflector.get(reflectorInput - 1);
            } else if (amount == 4) {
                System.out.println("What thin reflector do you want to use (thin) (Umkehrwalze)?(Input number)");
                int ccc = 0;
                for (String j : lib.masterDictKR.keySet()) {
                    ccc += 1;
                    System.out.println("#" + ccc + ": " + j);
                }

                int reflectorInput = -1;
                while (reflectorInput < 1 || reflectorInput > lib.reflectorK.size()) {
                    if (scanner.hasNextInt()) {
                        reflectorInput = scanner.nextInt();
                        if (reflectorInput < 1 || reflectorInput > lib.reflectorK.size()) {
                            System.out.println("Reflector with that number does not exist!");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid reflector number.");
                        scanner.next(); // Consume the invalid input
                    }
                }

                activeReflector = lib.reflectorK.get(reflectorInput - 1);
            }

            for (int i = 0; i < amount; i++) {
                Rotor temp = null;
                if (i == 3) {
                    System.out.println("What should rotor #" + (i + 1) + " (thin) be? Choose out of the following:");
                    int co = 0;
                    for (String j : lib.masterDictK.keySet()) {
                        co += 1;
                        System.out.print("#" + co + ": " + j + ", ");
                    }
                    scanner.nextLine(); // Consume newline
                    String roman = scanner.nextLine().toUpperCase();
                    if (lib.masterDictK.containsKey(roman)) {
                        temp = create(roman, true, scanner);
                    } else {
                        System.out.println("No such rotor exists! Please input a valid rotor.");
                        i--;
                    }

                } else {
                    System.out.println("What should rotor #" + (i + 1) + " be? Choose out of the following:");
                    int cc = 0;
                    for (String j : lib.masterDict.keySet()) {
                        cc += 1;
                        System.out.print("#" + cc + ": " + j + ", ");
                    }

                    scanner.nextLine(); // Consume newline
                    String roman = scanner.nextLine().toUpperCase();
                    if (lib.masterDict.containsKey(roman)) {
                        temp = create(roman, false, scanner);
                    } else {
                        System.out.println("No such rotor exists! Please input a valid rotor.");
                        i--;
                    }
                }

                if (temp != null) {
                    rotors.add(temp);
                }
            }

            scanner.nextLine(); // Consume newline
            String input;
            StringBuilder inputData = new StringBuilder();
            String result = "";
            int counter = 0;
            System.out.println("Type the message");
            while (scanner.hasNextLine()) {
                input = scanner.nextLine();
                if (input.isEmpty()) {
                    break;
                }
                inputData.append(input);
            }
            Pattern inp = Pattern.compile("[A-Z]", Pattern.CASE_INSENSITIVE);
            String inputStr = inputData.toString().toUpperCase();
            for (int i = 0; i < inputStr.length(); i++) {
                if (inp.matcher(String.valueOf(inputStr.charAt(i))).matches()) {
                    result += encode(inputStr.charAt(i));
                    counter += 1;
                    if (counter % 5 == 0) {
                        result += " ";
                    }
                }
            }

            System.out.println(result);

            System.out.println("Do you want to continue? (Y/N)");
            String answer = scanner.nextLine();
            while(!answer.equalsIgnoreCase("N") && !answer.equalsIgnoreCase("Y")){
                System.out.println("Wrong input, please write Y or N.");
                System.out.println("Do you want to continue? (Y/N)");
                answer = scanner.nextLine();
            }
            if (answer.equalsIgnoreCase("N")) {
                break;
            }
        }
        scanner.close();
    }

    public static char rotate(char ch, int n, int z) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (((ch - 'A' + n + 26 - z) % 26) + 'A');
        }
        return ch;
    }

    public static char encode(char lett) {
        int k = 0;
        rotors.get(k).setCount(rotors.get(k).getCount() + 1);
        while (k < rotors.size()) {
            if (rotors.get(k).getTurnover().contains(rotors.get(k).getCount()) && k != rotors.size() - 1 && !rotors.get(k + 1).isKrieg()) {
                rotors.get(k + 1).setCount(rotors.get(k + 1).getCount() + 1);
                if (rotors.get(k + 1).getTurnover().contains(rotors.get(k + 1).getCount() + 1) && k + 1 != rotors.size() - 1) {
                    rotors.get(k + 1).setCount(rotors.get(k + 1).getCount() + 1);
                }
            }

            if (rotors.get(k).getCount() > 25) {
                rotors.get(k).setCount(0);
            }

            k += 1;
        }
        lett = PLUG.get(lett);
        for (Rotor rotor : rotors) {
            lett = rotate(lett, rotor.getCount(), rotor.getSetting());
            lett = rotor.getWiring().get(lett);
        }

        lett = activeReflector.get(lett);
        for (int i = rotors.size() - 1; i >= 0; i--) {
            lett = rotors.get(i).getReverse().get(lett);
            lett = rotate(lett, -rotors.get(i).getCount(), -rotors.get(i).getSetting());
        }
        lett = PLUG.get(lett);

        return lett;
    }
}

class Rotor {
    private Map<Character, Character> wiring;
    private int count;
    private List<Integer> turnover;
    private int setting;
    private Map<Character, Character> reverse;
    private boolean krieg;

    public Rotor(Map<Character, Character> wiring, int count, List<Integer> turnover, int setting, Map<Character, Character> reverse, boolean krieg) {
        this.wiring = wiring;
        this.count = count;
        this.turnover = turnover;
        this.setting = setting;
        this.reverse = reverse;
        this.krieg = krieg;
    }

    public Map<Character, Character> getWiring() {
        return wiring;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Integer> getTurnover() {
        return turnover;
    }

    public int getSetting() {
        return setting;
    }

    public Map<Character, Character> getReverse() {
        return reverse;
    }

    public boolean isKrieg() {
        return krieg;
    }
}
