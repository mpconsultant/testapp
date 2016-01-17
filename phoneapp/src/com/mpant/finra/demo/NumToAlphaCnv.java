package com.mpant.finra.demo;
import java.util.LinkedList;
import java.util.List;

public class NumToAlphaCnv {
	 
		  public static String[][] mappings = { { "0" }, { "1" }, { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" }, { "J", "K", "L" }, { "M", "N", "O" }, { "P", "Q", "R", "S" }, { "T", "U", "V" }, { "W", "X", "Y", "Z" } };
		  
		  public static void generateCombosHelper(List<String> combos, String prefix, String remaining)
		  {
		    int digit = Integer.parseInt(remaining.substring(0, 1));
		    if (remaining.length() == 1) {
		      for (int i = 0; i < mappings[digit].length; i++) {
		        combos.add(prefix + mappings[digit][i]);
		      }
		    } else {
		      for (int i = 0; i < mappings[digit].length; i++) {
		        generateCombosHelper(combos, prefix + mappings[digit][i], remaining.substring(1));
		      }
		    }
		  }
		  
		  public static List<String> generateCombos(String phoneNumber)
		  {
		    List<String> combos = new LinkedList();
		    
		    generateCombosHelper(combos, "", phoneNumber);
		    
		    return combos;
		  }
		  
		  public static List numalpha(String phonenum)
		  {
		    List<String> combos = generateCombos(phonenum);
		    
		    return combos;
		  }
		}

