package org.example;

import java.util.*;

public class Library {
    public Map<String, Map<Character, Character>> masterDictR = new LinkedHashMap<>() {{
        put("UKW-B", UKW_B);
        put("UKW-C", UKW_C);
    }};
    public Map<String, Map<Character, Character>> masterDictKR = new LinkedHashMap<>() {{
        put("UKW-B Thin", UKW_BT);
        put("UKW-C Thin", UKW_CT);
    }};
    public List<Map<Character, Character>> reflector = new ArrayList<>() {{
        add(UKW_B);
        add(UKW_C);
    }};
    public List<Map<Character, Character>> reflectorK = new ArrayList<>() {{
        add(UKW_BT);
        add(UKW_CT);
    }};
    public Map<String, List<Integer>> masterDictT = new LinkedHashMap<>() {{
        put("I", IT);
        put("II", IIT);
        put("III", IIIT);
        put("IV", IVT);
        put("V", VT);
        put("VI", VIT);
        put("VII", VIIT);
        put("VIII", VIIIT);
    }};

    public Map<String, Map<Character, Character>> masterDict = new LinkedHashMap<>() {{
        put("I", I);
        put("II", II);
        put("III", III);
        put("IV", IV);
        put("V", V);
        put("VI", VI);
        put("VII", VII);
        put("VIII", VIII);
    }};

    public Map<String, List<Integer>> masterDictKT = new LinkedHashMap<>() {{
        put("BETA", BETAT);
        put("GAMMA", GAMMAT);
    }};

    public Map<String, Map<Character, Character>> masterDictK = new LinkedHashMap<>() {{
        put("BETA", BETA);
        put("GAMMA", GAMMA);
    }};

    public static final Map<Character, Character> UKW_B = new LinkedHashMap<>() {{
        put('A', 'Y');
        put('B', 'R');
        put('C', 'U');
        put('D', 'H');
        put('E', 'Q');
        put('F', 'S');
        put('G', 'L');
        put('H', 'D');
        put('I', 'P');
        put('J', 'X');
        put('K', 'N');
        put('L', 'G');
        put('M', 'O');
        put('N', 'K');
        put('O', 'M');
        put('P', 'I');
        put('Q', 'E');
        put('R', 'B');
        put('S', 'F');
        put('T', 'Z');
        put('U', 'C');
        put('V', 'W');
        put('W', 'V');
        put('X', 'J');
        put('Y', 'A');
        put('Z', 'T');
    }};

    public static final Map<Character, Character> UKW_C = new LinkedHashMap<>() {{
        put('A', 'F');
        put('B', 'V');
        put('C', 'P');
        put('D', 'J');
        put('E', 'I');
        put('F', 'A');
        put('G', 'O');
        put('H', 'Y');
        put('I', 'E');
        put('J', 'D');
        put('K', 'R');
        put('L', 'Z');
        put('M', 'X');
        put('N', 'W');
        put('O', 'G');
        put('P', 'C');
        put('Q', 'T');
        put('R', 'K');
        put('S', 'U');
        put('T', 'Q');
        put('U', 'S');
        put('V', 'B');
        put('W', 'N');
        put('X', 'M');
        put('Y', 'H');
        put('Z', 'L');
    }};

    public static final Map<Character, Character> UKW_BT = new LinkedHashMap<>() {{
        put('A', 'E');
        put('B', 'N');
        put('C', 'K');
        put('D', 'Q');
        put('E', 'A');
        put('F', 'U');
        put('G', 'Y');
        put('H', 'W');
        put('I', 'J');
        put('J', 'I');
        put('K', 'C');
        put('L', 'O');
        put('M', 'P');
        put('N', 'B');
        put('O', 'L');
        put('P', 'M');
        put('Q', 'D');
        put('R', 'X');
        put('S', 'Z');
        put('T', 'V');
        put('U', 'F');
        put('V', 'T');
        put('W', 'H');
        put('X', 'R');
        put('Y', 'G');
        put('Z', 'S');
    }};

    public static final Map<Character, Character> UKW_CT = new LinkedHashMap<>() {{
        put('A', 'R');
        put('B', 'D');
        put('C', 'O');
        put('D', 'B');
        put('E', 'J');
        put('F', 'N');
        put('G', 'T');
        put('H', 'K');
        put('I', 'V');
        put('J', 'E');
        put('K', 'H');
        put('L', 'M');
        put('M', 'L');
        put('N', 'F');
        put('O', 'C');
        put('P', 'W');
        put('Q', 'Z');
        put('R', 'A');
        put('S', 'X');
        put('T', 'G');
        put('U', 'Y');
        put('V', 'I');
        put('W', 'P');
        put('X', 'S');
        put('Y', 'U');
        put('Z', 'Q');
    }};

    public static final Map<Character, Character> I = new LinkedHashMap<>() {{
        put('A', 'E');
        put('B', 'K');
        put('C', 'M');
        put('D', 'F');
        put('E', 'L');
        put('F', 'G');
        put('G', 'D');
        put('H', 'Q');
        put('I', 'V');
        put('J', 'Z');
        put('K', 'N');
        put('L', 'T');
        put('M', 'O');
        put('N', 'W');
        put('O', 'Y');
        put('P', 'H');
        put('Q', 'X');
        put('R', 'U');
        put('S', 'S');
        put('T', 'P');
        put('U', 'A');
        put('V', 'I');
        put('W', 'B');
        put('X', 'R');
        put('Y', 'C');
        put('Z', 'J');
    }};
    public static final List<Integer> IT = new ArrayList<>() {{
        add(19);
    }};

    public static final Map<Character, Character> II = new LinkedHashMap<>() {{
        put('A', 'A');
        put('B', 'J');
        put('C', 'D');
        put('D', 'K');
        put('E', 'S');
        put('F', 'I');
        put('G', 'R');
        put('H', 'U');
        put('I', 'X');
        put('J', 'B');
        put('K', 'L');
        put('L', 'H');
        put('M', 'W');
        put('N', 'T');
        put('O', 'M');
        put('P', 'C');
        put('Q', 'Q');
        put('R', 'G');
        put('S', 'Z');
        put('T', 'N');
        put('U', 'P');
        put('V', 'Y');
        put('W', 'F');
        put('X', 'V');
        put('Y', 'O');
        put('Z', 'E');
    }};
    public static final List<Integer> IIT = new ArrayList<>() {{
        add(7);
    }};

    public static final Map<Character, Character> III = new LinkedHashMap<>() {{
        put('A', 'B');
        put('B', 'D');
        put('C', 'F');
        put('D', 'H');
        put('E', 'J');
        put('F', 'L');
        put('G', 'C');
        put('H', 'P');
        put('I', 'R');
        put('J', 'T');
        put('K', 'X');
        put('L', 'V');
        put('M', 'Z');
        put('N', 'N');
        put('O', 'Y');
        put('P', 'E');
        put('Q', 'I');
        put('R', 'W');
        put('S', 'G');
        put('T', 'A');
        put('U', 'K');
        put('V', 'M');
        put('W', 'U');
        put('X', 'S');
        put('Y', 'Q');
        put('Z', 'O');
    }};
    public static final List<Integer> IIIT = new ArrayList<>() {{
        add(24);
    }};

    public static final Map<Character, Character> IV = new LinkedHashMap<>() {{
        put('A', 'E');
        put('B', 'S');
        put('C', 'O');
        put('D', 'V');
        put('E', 'P');
        put('F', 'Z');
        put('G', 'J');
        put('H', 'A');
        put('I', 'Y');
        put('J', 'Q');
        put('K', 'U');
        put('L', 'I');
        put('M', 'R');
        put('N', 'H');
        put('O', 'X');
        put('P', 'L');
        put('Q', 'N');
        put('R', 'F');
        put('S', 'T');
        put('T', 'G');
        put('U', 'K');
        put('V', 'D');
        put('W', 'C');
        put('X', 'M');
        put('Y', 'W');
        put('Z', 'B');
    }};
    public static final List<Integer> IVT = new ArrayList<>() {{
        add(12);
    }};

    public static final Map<Character, Character> V = new LinkedHashMap<>() {{
        put('A', 'V');
        put('B', 'Z');
        put('C', 'B');
        put('D', 'R');
        put('E', 'G');
        put('F', 'I');
        put('G', 'T');
        put('H', 'Y');
        put('I', 'U');
        put('J', 'P');
        put('K', 'S');
        put('L', 'D');
        put('M', 'N');
        put('N', 'H');
        put('O', 'L');
        put('P', 'X');
        put('Q', 'A');
        put('R', 'W');
        put('S', 'M');
        put('T', 'J');
        put('U', 'Q');
        put('V', 'O');
        put('W', 'F');
        put('X', 'E');
        put('Y', 'C');
        put('Z', 'K');
    }};
    public static final List<Integer> VT = new ArrayList<>() {{
        add(2);
    }};

    public static final Map<Character, Character> VI = new LinkedHashMap<>() {{
        put('A', 'J');
        put('B', 'P');
        put('C', 'G');
        put('D', 'V');
        put('E', 'O');
        put('F', 'U');
        put('G', 'M');
        put('H', 'F');
        put('I', 'Y');
        put('J', 'Q');
        put('K', 'B');
        put('L', 'E');
        put('M', 'N');
        put('N', 'H');
        put('O', 'Z');
        put('P', 'R');
        put('Q', 'D');
        put('R', 'K');
        put('S', 'A');
        put('T', 'S');
        put('U', 'X');
        put('V', 'L');
        put('W', 'I');
        put('X', 'C');
        put('Y', 'T');
        put('Z', 'W');
    }};
    public static final List<Integer> VIT = new ArrayList<>() {{
        add(2);
        add(15);
    }};

    public static final Map<Character, Character> VII = new LinkedHashMap<>() {{
        put('A', 'N');
        put('B', 'Z');
        put('C', 'J');
        put('D', 'H');
        put('E', 'G');
        put('F', 'R');
        put('G', 'C');
        put('H', 'X');
        put('I', 'M');
        put('J', 'Y');
        put('K', 'S');
        put('L', 'W');
        put('M', 'B');
        put('N', 'O');
        put('O', 'U');
        put('P', 'F');
        put('Q', 'A');
        put('R', 'I');
        put('S', 'V');
        put('T', 'L');
        put('U', 'P');
        put('V', 'E');
        put('W', 'K');
        put('X', 'Q');
        put('Y', 'D');
        put('Z', 'T');
    }};
    public static final List<Integer> VIIT = new ArrayList<>() {{
        add(2);
        add(15);
    }};

    public static final Map<Character, Character> VIII = new LinkedHashMap<>() {{
        put('A', 'F');
        put('B', 'K');
        put('C', 'Q');
        put('D', 'H');
        put('E', 'T');
        put('F', 'L');
        put('G', 'X');
        put('H', 'O');
        put('I', 'C');
        put('J', 'B');
        put('K', 'J');
        put('L', 'S');
        put('M', 'P');
        put('N', 'D');
        put('O', 'Z');
        put('P', 'R');
        put('Q', 'A');
        put('R', 'M');
        put('S', 'E');
        put('T', 'W');
        put('U', 'N');
        put('V', 'I');
        put('W', 'U');
        put('X', 'Y');
        put('Y', 'G');
        put('Z', 'V');
    }};
    public static final List<Integer> VIIIT = new ArrayList<>() {{
        add(2);
        add(15);
    }};

    public static final Map<Character, Character> BETA = new LinkedHashMap<>() {{
        put('A', 'L');
        put('B', 'E');
        put('C', 'Y');
        put('D', 'J');
        put('E', 'V');
        put('F', 'C');
        put('G', 'N');
        put('H', 'I');
        put('I', 'X');
        put('J', 'W');
        put('K', 'P');
        put('L', 'B');
        put('M', 'Q');
        put('N', 'M');
        put('O', 'D');
        put('P', 'R');
        put('Q', 'T');
        put('R', 'A');
        put('S', 'K');
        put('T', 'Z');
        put('U', 'G');
        put('V', 'F');
        put('W', 'U');
        put('X', 'H');
        put('Y', 'O');
        put('Z', 'S');
    }};
    public static final List<Integer> BETAT = new ArrayList<>();

    public static final Map<Character, Character> GAMMA = new LinkedHashMap<>() {{
        put('A', 'F');
        put('B', 'S');
        put('C', 'O');
        put('D', 'K');
        put('E', 'A');
        put('F', 'N');
        put('G', 'U');
        put('H', 'E');
        put('I', 'R');
        put('J', 'H');
        put('K', 'M');
        put('L', 'B');
        put('M', 'T');
        put('N', 'I');
        put('O', 'Y');
        put('P', 'C');
        put('Q', 'W');
        put('R', 'L');
        put('S', 'Q');
        put('T', 'P');
        put('U', 'Z');
        put('V', 'X');
        put('W', 'V');
        put('X', 'G');
        put('Y', 'J');
        put('Z', 'D');
    }};
    public static final List<Integer> GAMMAT = new ArrayList<>();
}
