import computation.contextfreegrammar.*;
import java.util.ArrayList;
import java.util.List;

public class TestGrammars {

	public static ContextFreeGrammar makeGrammar() { 
		// You can write your code here to make the context-free grammar from the assignment

    // ******** TEST GRAMMAR 1 ****************

    // Alphabet of DEFUALT VARIABLES
    Variable S = new Variable('S');

    // CNF DERIVED VARIABLES
    Variable T = new Variable('T'); // New START VARIABLE from STEP 1

    Variable U = new Variable('U'); // VARIABLES from STEP 4
    Variable V = new Variable('V');

    Variable L = new Variable('L'); // TERMINAL VARIABLES from STEP 5 of conversion
    Variable R = new Variable('R');

    // Alphabet of TERMINALS
    Terminal l = new Terminal('(');
    Terminal r = new Terminal(')');
    // Word e = new Word();

    // CNF RULES

    // TERMINAL RULES
    Rule rtr = new Rule(R, new Word(r));    // R -> )
    Rule rtl = new Rule(L, new Word(l));    // L -> (

    // NON UNIT RULES
    Rule usr = new Rule(U, new Word(S,R));  // U -> SR
    Rule vsr = new Rule(V, new Word(S,R));  // V -> SR
   
    // HIGH LEVEL RULES

    // RULES beginning with VARIABLE T
    Rule rt1 = new Rule(T, new Word(S,S));  // T -> SS
    Rule rt2 = new Rule(T, new Word(L,V));  // T -> LV
    Rule rt3 = new Rule(T, new Word(L,R));  // T -> LR
    Rule rt4 = new Rule(T, new Word());     // T -> e

    // RULES beginning with VARIABLE S
    Rule rs1 = new Rule(S, new Word(S,S));  // S -> SS
    Rule rs2 = new Rule(S, new Word(L,U));  // S -> LU
    Rule rs3 = new Rule(S, new Word(L,R));  // S -> LR
    

    // LIST OF RULES
    List<Rule> rules = new ArrayList<Rule>();
    
    // T RULES
    rules.add(rt1);
    rules.add(rt2);
    rules.add(rt3);
    rules.add(rt4);

    // S RULES
    rules.add(rs1);
    rules.add(rs2);
    rules.add(rs3);

    // NON UNIT RULES
    rules.add(usr);
    rules.add(vsr);

    // TERMINAL RULES
    rules.add(rtr);
    rules.add(rtl);

    // // ******** TEST GRAMMAR 2 ****************

    // // Alphabet of DEFUALT VARIABLES
    // Variable S = new Variable('S');
    // Variable A = new Variable('A');
    // Variable B = new Variable('B');

    // // CNF DERIVED VARIABLES
    // Variable Z = new Variable('Z'); // New START VARIABLE from STEP 1

    // Variable C = new Variable('C'); // VARIABLES from STEP 4

    // Variable U = new Variable('U'); // TERMINAL VARIABLES from STEP 5 of conversion

    // // Alphabet of TERMINALS
    // Terminal a = new Terminal('a');
    // Terminal b = new Terminal('b');
    // // Word e = new Word();

    // // CNF RULES

    // // TERMINAL RULES
    // Rule rta = new Rule(U, new Word(a));    // R -> )
    // Rule rtb = new Rule(B, new Word(b));    // L -> (

    // // NON UNIT RULES
    // Rule csa = new Rule(C, new Word(S,A));  // C -> SA
   
    // // HIGH LEVEL RULES

    // // RULES beginning with VARIABLE A
    // Rule ra1 = new Rule(A, new Word(a));    // A -> b
    // Rule ra2 = new Rule(A, new Word(A,C));  // A -> AC
    // Rule ra3 = new Rule(A, new Word(U,B));  // A -> UB
    // Rule ra4 = new Rule(A, new Word(a));    // A -> a
    // Rule ra5 = new Rule(A, new Word(S,A));  // A -> SA
    // Rule ra6 = new Rule(A, new Word(A,S));  // A -> AS

    // // RULES beginning with VARIABLE S
    // Rule rs1 = new Rule(S, new Word(A,C));  // S -> AC
    // Rule rs2 = new Rule(S, new Word(U,B));  // S -> UB
    // Rule rs3 = new Rule(S, new Word(a));    // S -> a
    // Rule rs4 = new Rule(S, new Word(S,A));  // S -> SA
    // Rule rs5 = new Rule(S, new Word(A,S));  // S -> AS

    // // RULES beginning with VARIABLE Z
    // Rule rz1 = new Rule(Z, new Word(A,C));  // Z -> AC
    // Rule rz2 = new Rule(Z, new Word(U,B));  // Z -> UB
    // Rule rz3 = new Rule(Z, new Word(a));    // Z -> a
    // Rule rz4 = new Rule(Z, new Word(S,A));  // Z -> SA
    // Rule rz5 = new Rule(Z, new Word(A,S));  // Z -> AS

    // // LIST OF RULES
    // List<Rule> rules = new ArrayList<Rule>();
    
    // // Z RULES
    // rules.add(rz1);
    // rules.add(rz2);
    // rules.add(rz3);
    // rules.add(rz4);
    // rules.add(rz5);

    // // S RULES
    // rules.add(rs1);
    // rules.add(rs2);
    // rules.add(rs3);
    // rules.add(rs4);
    // rules.add(rs5);

    // // A RULES
    // rules.add(ra1);
    // rules.add(ra2);
    // rules.add(ra3);
    // rules.add(ra4);
    // rules.add(ra5);
    // rules.add(ra6);

    // // NON UNIT RULES
    // rules.add(csa);
    
    // // TERMINAL RULES
    // rules.add(rta);
    // rules.add(rtb);

    ContextFreeGrammar cfg = new ContextFreeGrammar(rules);

    // return null;
		return cfg;
	}
}