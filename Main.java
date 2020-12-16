import java.util.Arrays;
import java.util.Scanner;

import computation.contextfreegrammar.*;
import computation.parser.*;
import computation.parsetree.*;

import java.util.ArrayList;
import java.util.List;

class Main {

	// Change this to true to skip straight to the tests
	// - useful if you understand the code and are just testing your parser.
	private final static boolean SKIP_TO_TESTS = false;

	// The parser we will test. 
	// If you create a new class, add your constructor here instead e.g.
	// private static IParser parser = new MyParser();
	private static IParser parser = new Parser();

  public static void checkCNF() {
    // ContextFreeGrammar cfg = MyGrammar.makeGrammar();
    ContextFreeGrammar cfg = TestGrammars.makeGrammar();


    if(cfg.isInChomskyNormalForm()) {
      System.out.println("Grammar IS in Chomsky Normal Form");
    }
    else {
      System.out.println("Grammar IS NOT in Chomsky Normal Form");
    }
  }

  public static void relevantRules (String term) {

  }

  public static void customCode() {
		// You can write your own custom code here and run it with option 3.
		// Good for testing your code works!
		// Any code here is totally informal and does not count towards your submission.

		// Below is the kind of code you might want to write to test your parser

    // Word terminal_check1 = new Word("A");
    // System.out.println(terminal_check1 + " is a terminal: " + terminal_check1.isTerminal()); // should print false

    // Word terminal_check2 = new Word("+");
    // System.out.println(terminal_check2 + " is a terminal: " + terminal_check2.isTerminal()); // should print true
    
    // List<Rule> rules = cfg.getRules();

    // System.out.println("\n" + rules);
    // System.out.println("\nNumber of rules: " + rules.size());

    // *********************************************************************************************************************************************************************************************************************************************************************
    // *** TestGrammars TESTS ***
    // ContextFreeGrammar cfg = TestGrammars.makeGrammar();

    // System.out.println(cfg.getRules());

    // TESTS TO RETURN TRUE
    // Word testString1 = new Word("(())()"); // this should print true! - pass

    // Word testString1 = new Word("((())())"); // this should print true! - 

    // Word testString1 = new Word("()"); // this should print true! - pass

    // Word testString1 = new Word(); // this should print true! - pass

    // Word testString1 = new Word("a"); // this should print true! - 

    // Word testString1 = new Word("ab"); // this should print true! - 

    // Word testString1 = new Word("a"); // this should print ! - 

    //TESTS TO RETURN FALSE
    // Word testString1 = new Word("("); // should print false! - pass

    // Word testString1 = new Word(")("); // this should print false! - pass

    // Word testString1 = new Word("(())())"); // this should print false! - 

    // Word testString1 = new Word(); // this should print false! - 

    // Word testString1 = new Word(""); // this should print ! - 

    // Word testString1 = new Word(""); // this should print ! - 

    // *** MyGrammar TESTS ***
    ContextFreeGrammar cfg = MyGrammar.makeGrammar();

    // System.out.println(cfg.getRules());

    // TESTS TO RETURN TRUE
    Word testString1 = new Word("x+x"); // this should print true! - pass

    // Word testString1 = new Word("(x)"); // this should print true! - pass

    // Word testString1 = new Word("1*0"); // this should print true! - pass

    // Word testString1 = new Word("x+1"); // this should print true! - pass

    // Word testString1 = new Word("x"); // this should print true! - pass

    // Word testString1 = new Word("1+1*1"); // this should print true! - pass

    // Word testString1 = new Word("x+1*(0+0)"); // this should print true! - pass

    //TESTS TO RETURN FALSE
    // Word testString1 = new Word("()"); // should print false! - 

    // Word testString1 = new Word("1x"); // this should print false! - pass

    // Word testString1 = new Word("1+"); // this should print false! - pass

    // Word testString1 = new Word(" "); // should print false! - pass

    // Word testString1 = new Word(); // should print false! - pass

    // Word testString1 = new Word("1+10"); // this should print false! - pass

    // Word testString1 = new Word("1+1**1)"); // this should print false! - pass

    parser.isInLanguage(cfg,testString1);
		
    // *********************************************************************************************************************************************************************************************************************************************************************
    
    // int n_w = testString1.toString().length();
    // int l_d = 2*n_w-1;

    // System.out.println("\nn is equal to: " + n_w);
    // System.out.println("2n-1 equals: " + l_d);

    // Variable start = cfg.getStartVariable();
    // System.out.println("\nStart Variable (Variable): " + start);
    // System.out.println("Start Variable (String): " + start.toString());

    // ArrayList<Word> currentwords = new ArrayList<Word>(); // All words which can be generated up to n steps

    // currentwords.add(new Word(cfg.getStartVariable()));
    // System.out.println("\nCurrent Words List: " + currentwords);

    // ArrayList<Variable> LHS = new ArrayList<Variable>();
    // for (Rule rule : rules) {
    //   LHS.add(rule.getVariable());
    // }
    // System.out.println("\nVariables List: (" + LHS.size() + ") " + LHS);

    // ArrayList<Word> RHS = new ArrayList<Word>();
    // for (Rule rule : rules) {
    //   RHS.add(rule.getExpansion());
    // }
    // System.out.println("\nExpansions List: (" + RHS.size() + ") " + RHS);
    // System.out.println(" ");

    // for (int steps = 0; steps < l_d; steps++) { // for 2n - 1 steps
    // // for (int steps = 0; steps < 2; steps++) { // for 2 steps

    //   System.out.println("\nStep: " + steps);

    //   ArrayList<Word> newwords = new ArrayList<Word>();

    //   for (int i = 0; i < currentwords.size(); i++) { // for each word, expand leftmost term
        
    //     System.out.println("\nWords to expand: " + currentwords);

    //     String lookup_exp = currentwords.get(i).toString(); // get word
    //     System.out.println("This word: " + currentwords.get(i));

    //     String[] lookup_term = lookup_exp.split(""); // split this word
    //     System.out.println("Terms in word: " + Arrays.toString(lookup_term));

    //     // for each term: read term 
    //         // if it is NOT terminal
    //           // check variants
    //           // costruct expansions list
    //           // replace
    //           // break
    //         // else 
    //           // skip to next letter
        
    //     for (int t = 0; t < lookup_term.length; t++) { // for each term: read term 

    //       Word term_to_expand = new Word(lookup_term[t]);

    //       ArrayList<Rule> relevant_rules = new ArrayList<Rule>();
    //       ArrayList<Word> relevant_expns = new ArrayList<Word>();

    //       if (!term_to_expand.isTerminal()) { // if it is NOT terminal

    //         // check variants
    //         for (int j = 0; j < LHS.size(); j++) { // find each relevant rule

    //           String compare_term = LHS.get(j).toString(); // set lookup comparator in rule list
              
    //           if (lookup_term[t].equals(compare_term)) { // lookup expansions and add to list of relevant rules

    //             relevant_rules.add(rules.get(j));
                
    //           }
    //           else {
    //             // skip to next rule in list
    //           }

    //         }

    //         System.out.println("Replacing " + term_to_expand + " using the following " + relevant_rules.size() + " expansion rules: " + relevant_rules);

    //         // contruct expansions list

    //         // ArrayList<Word> relevant_expns = new ArrayList<Word>();

    //         for (int rr = 0; rr < relevant_rules.size(); rr++) {
    //           relevant_expns.add(relevant_rules.get(rr).getExpansion());
    //         }

    //         System.out.println("Expansions: " + relevant_expns);

    //         // replace
    //         for (int nw = 0; nw < relevant_expns.size(); nw++) {
    //           newwords.add(currentwords.get(i).replace(t,relevant_expns.get(nw)));
    //         }
    //         System.out.println("New words: " + newwords);

    //         // break
    //         break; // stop expanding this word, skip to next word

    //       }
    //       else {
    //         // skip to next term in word
    //       }

    //     }

    //   }

    //   // include terminal rules
    //   for (Rule rule : rules) {
        
    //     if (( rule.getVariable() == cfg.getStartVariable() ) && ( rule.getExpansion().isTerminal()) ) {
    //       newwords.add(rule.getExpansion());
    //     }
          
    //   }

    //   currentwords = newwords;
    //   System.out.println("Expanded words: " + currentwords);

    // }

    // // AFTER 2n-1 STEPS - CHECK WORD IS IN currentwords

    // boolean accepted = false;

    // /* 
    //   if currentwords contains w
    //     return true
    //   else
    //     return false
    // */

    // if (currentwords.contains(testString1)){
    //   accepted = true;
    // }
    // else {
    //   accepted = false;
    // }

    // System.out.println("\nThe word " + testString1 + " is in the CFL: " + accepted);

    // System.out.println("\nThe word " + testString1 + " is in the CFL: " + parser.isInLanguage(cfg,testString1));

    
    // Word getsymbs = new Word("()(())SS");
    // System.out.println(getsymbs.toString());

    // System.out.println(getsymbs.get(7));

	}



	/* ******************************************************************************************************
	 * You should not need to edit anything below this line.
	 * 
	 * There is nothing stopping you from editing it if you want, but make sure you know what you are doing.
	 * ******************************************************************************************************
	 */

	private static Scanner userin = new Scanner(System.in);

	public static void main(String[] args) {
		if(!SKIP_TO_TESTS) {
			System.out.println("|------- Welcome to the demo script. I recommend turning on word wrap in your console. -------|\n"
					+          "|------- Make the width of the window at least this wide without wrapping if possible. -------|\n");
			int input = -1;
			do {
				System.out.println("What would you like to do?");
				System.out.println("0 – Explain the assignment (start here if brand new)");
				System.out.println("1 – Demo the code");
				System.out.println("2 – Run simple tests on Parser.java");
				System.out.println("3 - Run custom code (see the code for Main.java)");
        System.out.println("4 - Run Chomsky Normal Form Check");
        System.out.println("5 - Print CFG in CNF, G0");
				System.out.println("9 – Quit");

				try {
					input = userin.nextInt();
				} catch(Exception e) {
					userin.nextLine();
					System.out.println("Invalid choice...");
					continue;
				}

				userin.nextLine();
				System.out.println();

				if(input == 0) {
					explainAssignment();
				} else if(input == 1) {
					demoCode();
				} else if(input == 2) {
					runTests();
				} else if(input == 3) {
					customCode();
        } else if(input == 4) {
					checkCNF();
				} else if(input == 5) {
          ContextFreeGrammar cfg = MyGrammar.makeGrammar();
					System.out.println(cfg);
				}else if(input != 9) {
					System.out.println("Invalid choice...");
				}

				if(input != 9) pause();
			} while(input != 9);
		}
		else {
			runTests();
		}
	}

	public static void explainAssignment() {
		System.out.println("The very first part of this assignment is to convert a grammar into Chomsky Normal form. "
				+ "You will want to do this on paper. As you are looking at the code, we assume you have completed this step!\n");

		pause();

		System.out.println("The next and main part of the assignment is to write a parser, then apply it to the grammar you created.\n");

		System.out.println("Creating the parser means writing a class. When given a context free "
				+ "grammar in Chomsky Normal form, and a string, your class will:");
		System.out.println("\t1 - Find whether this string is in the langauge generated by this grammar, and");
		System.out.println("\t2 - if so, produce a parse tree for the string.");

		pause();

		System.out.println("But you may wish to start by writing your Chomsky Normal Form grammar in Java. "
				+ "In other words, write some code which creates an object of the ContextFreeGrammar class. "
				+ "You can do this in the skeleton class called MyGrammar.java. "
				+ "This should help familiarise you with how the code works, and then you can write your parser, "
				+ "and apply it to the grammar."
				+ "\n\n"
				+ "Before that, choose option 1 from the menu to get an explanation of the code.\n");

		System.out.println("For more information see the full assignment text on Engage.\n");

	}

	private static void demoCode() {
		System.out.println("Each class has more information written in comments, but this is most "
				+ "clearly readable in the Javadoc documentation that has been provided in HTML form, "
				+ "available via Engage. (Or, if you have downloaded the code directly, open "
				+ "index.html in the doc folder.)");

		pause();

		System.out.println("First, we'll explain the Parser class. This is a blank template for your own code. "
				+ "You could also create your own class from scratch, so long as it implements IParser. "
				+ "Right now the methods in Parser do nothing, you must fill them out.\n");

		System.out.println("If you go back to the main menu and select option 2, it will run some basic tests "
				+ "on the parser code. These are not thorough! But they will demonstrate how it should work. "
				+ "Once you have written some parser code, try running them again. ");

		pause();

		System.out.println("The class ContextFreeGrammar is used to represent a grammar. If you look in the "
				+ "/computation/contextfreegrammar/ folder you will see all the required classes.\n");

		System.out.println("Terminal and Variable are subclasses of Symbol, and represent a single letter.");

		System.out.println("You can create a Terminal or a Variable object using their constructors.");
		System.out.println("\te.g. new Variable('S'); \t\t-- this produces: " + new Variable('S'));
		System.out.println("\t     new Terminal('a'); \t\t-- this produces: " + new Terminal('a'));
		System.out.println("\t     new Terminal('0'); \t\t-- this produces: " + new Terminal('0') + "\n");


		System.out.println("Variables can also have a subscript number from 0 to 9\n"
				+ "\te.g. new Variable(\"A0\"); \t-- this produces: " + new Variable("A0") + "\n");

		System.out.println("And there is a helper method to create an array of subscripted variables:\n"
				+ "\te.g. Variable.subscriptedVariables('S', 4); \t-- this produces: " + Arrays.toString(Variable.subscriptedVariables('S', 4)));

		pause();

		System.out.println("The class Word represents strings. We use the name Word because String is already taken.\n");

		System.out.println("One of the constructors for Word takes a Java String. It assumes upper case letters "
				+ "are variables, and everything else is a terminal. So you can't use subscript variables! "
				+ "I recommend mostly using it for strings of terminals.");

		System.out.println("\te.g. new Word(\"000111\"); \t-- this produces: " + new Word("000111"));
		System.out.println("\t     new Word(\"A0\"); \t\t-- this produces: " + new Word("A0") + " (variable followed by terminal)");
		System.out.println();

		System.out.println("The other way to construct a Word is with multiple symbols:");
		System.out.println("\te.g. new Word(new Variable(\"A0\"), new Terminal('0')); \t-- this produces: " + new Word(new Variable("A0"), new Terminal('0')));
		System.out.println();

		System.out.println("Or this syntax also allows you to pass in an array of symbols:");
		Symbol[] array = {new Variable("A0"),new Terminal('0')};
		System.out.println("\te.g. Symbol[] array = {new Variable(\"A0\"),new Terminal(\"0\")};");
		System.out.println("\t     new Word(array); \t\t-- this produces: " + new Word(array));

		pause();

		System.out.println("To create a grammar, create multiple Rule objects, add them to a list, then "
				+ "call the ContextFreeGrammar constructor.\n");

		System.out.println("Look at the code in ContextFreeGrammar.simpleCNF(). It produces this grammar:");
		System.out.println(ContextFreeGrammar.simpleCNF());

		pause();

		System.out.println("This should be enough information to start writing your CNF grammar in Java, "
				+ "and also writing the first part of the parser which checks whether the string is in the language.");

		pause();

		System.out.println("Once you are ready to make a parse tree, you will need to use the class ParseTreeNode.\n");

		System.out.println("The constructor takes a symbol object, plus zero, one, or two ParseTreeNodes as children.\n");

		System.out.println("Have a look at the code in the main method of ParseTreeNode. It produces this tree:");
		ParseTreeNode.main("");

		pause();

		System.out.println("This is the end of the demo. Dig into the code, look at the documentation, and good luck!");

	}



	public static void runTests() {
		ContextFreeGrammar cfg = ContextFreeGrammar.simpleCNF();
		Word test;

		if(!SKIP_TO_TESTS) {
			System.out.println("This script runs some very basic tests on your parser.");

			System.out.println("We will use a grammar that generates the language {0ⁿ1ⁿ where n ≥ 0}");
			System.out.println("The grammar is already in Chomsky Normal Form. Here are the rules:");

			System.out.println(cfg);
			pause();
		}

		System.out.println("Testing parser with " + parser.getClass());

		int success = 0, total = 0;

		test = new Word("0011");

		System.out.println(LINE+"\nTest 1:\n" + LINE + "\n");
		System.out.println("Does in-built grammar generate the string " + test);
		System.out.println("Expected result: true\nTest result:");
		total++;

		if(parser.isInLanguage(cfg, test)){
			System.out.println("\tPASS -- parser returned true");
			success++;
		} else{
			System.out.println("\tFAIL -- parser returned false");
		}

		pause();
		test = new Word("1011");

		System.out.println("Test 2:\n" + LINE + "\n");
		System.out.println("Does in-built grammar generate the string " + test);
		System.out.println("Expected result: false\nTest result:");
		total++;

		if(!parser.isInLanguage(cfg, test)){
			System.out.println("\tPASS -- parser returned false");
			success++;
		} else{
			System.out.println("\tFAIL -- parser returned true");
		}

		pause();

		test = new Word("0011");
		System.out.println("Test 3:\n" + LINE + "\n");
		System.out.println("Parse tree for string " + test);
		System.out.println("Expected result:\n");

		ParseTreeNode tree = new ParseTreeNode(new Variable("A0"), new ParseTreeNode(new Variable('Z'), new ParseTreeNode(new Terminal('0'))),new ParseTreeNode(new Variable('B'), new ParseTreeNode(new Variable('A'), new ParseTreeNode(new Variable('Z'), new ParseTreeNode(new Terminal('0'))), new ParseTreeNode(new Variable('Y'), new ParseTreeNode(new Terminal('1')))), new ParseTreeNode(new Variable('Y'), new ParseTreeNode(new Terminal('1')))));
		tree.print();

		ParseTreeNode result = parser.generateParseTree(cfg, test);
		if(result == null) {
			System.out.println("Actual result: null");
		} else {
			System.out.println("Actual result:\n");

			result.print();
		}

		total++;

		if(result != null && result.equals(tree)) {
			System.out.println("PASS -- trees match");
			success++;
		} else if (result == null) {
			System.out.println("FAIL -- result was null");
		} else {
			System.out.println("FAIL -- trees do not match");
		}

		pause();

		System.out.println("Total tests passed: " + success + " out of " + total);
	}

	private static void pause() {
		System.out.println("\n\n(Press enter to continue...)");
		userin.nextLine();
		System.out.println("\n" + "------------------------");
	}

	private static final String LINE = "-------------";

}

