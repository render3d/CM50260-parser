import computation.contextfreegrammar.*;
import java.util.ArrayList;
import java.util.List;

public class MyGrammar {

	public static ContextFreeGrammar makeGrammar() {
		// You can write your code here to make the context-free grammar from the assignment

    // Alphabet of DEFUALT VARIABLES
    Variable T = new Variable('T');
    Variable F = new Variable('F');
    Variable S = new Variable('S');

    // CNF DERIVED VARIABLES
    Variable Z = new Variable('Z'); // New START VARIABLE from STEP 1

    Variable U = new Variable('U'); // VARIABLES from STEP 4
    Variable V = new Variable('V');
    Variable W = new Variable('W');

    Variable A = new Variable('A'); // TERMINAL VARIABLES from STEP 5 of conversion
    Variable M = new Variable('M');
    Variable L = new Variable('L');
    Variable R = new Variable('R');

    // Alphabet of TERMINALS
    Terminal a = new Terminal('+');
    Terminal m = new Terminal('*');
    Terminal l = new Terminal('(');
    Terminal r = new Terminal(')');
    Terminal o = new Terminal('1');
    Terminal z = new Terminal('0');
    Terminal x = new Terminal('x');

    // CNF RULES

    // TERMINAL RULES
    Rule rta = new Rule(A, new Word(a));    // A -> +
    Rule rtm = new Rule(M, new Word(m));    // M -> *
    Rule rtr = new Rule(R, new Word(r));    // R -> )
    Rule rtl = new Rule(L, new Word(l));    // L -> (

    // NON UNIT RULES
    Rule rsa = new Rule(U, new Word(S,A));  // U -> SA
    Rule rmf = new Rule(V, new Word(M,F));  // V -> MF
    Rule rsr = new Rule(W, new Word(S,R));  // W -> SR
   
    // HIGH LEVEL RULES

    // RULES beginning with VARIABLE Z
    Rule rz1 = new Rule(Z, new Word(U,T));  // Z -> UT
    Rule rz2 = new Rule(Z, new Word(T,V));  // Z -> TV
    Rule rz3 = new Rule(Z, new Word(L,W));  // Z -> LW
    Rule rz4 = new Rule(Z, new Word(o));    // Z -> 1
    Rule rz5 = new Rule(Z, new Word(z));    // Z -> 0
    Rule rz6 = new Rule(Z, new Word(x));    // Z -> x

    // RULES beginning with VARIABLE S
    Rule rs1 = new Rule(S, new Word(U,T));  // S -> UT
    Rule rs2 = new Rule(S, new Word(T,V));  // S -> TV
    Rule rs3 = new Rule(S, new Word(L,W));  // S -> LW
    Rule rs4 = new Rule(S, new Word(o));    // S -> 1
    Rule rs5 = new Rule(S, new Word(z));    // S -> 0
    Rule rs6 = new Rule(S, new Word(x));    // S -> x

    // RULES beginning with VARIABLE T
    Rule rt1 = new Rule(T, new Word(T,V));  // T -> TV
    Rule rt2 = new Rule(T, new Word(L,W));  // T -> LW
    Rule rt3 = new Rule(T, new Word(o));    // T -> 1
    Rule rt4 = new Rule(T, new Word(z));    // T -> 0
    Rule rt5 = new Rule(T, new Word(x));    // T -> x

    // RULES beginning with VARIABLE F
    Rule rf1 = new Rule(F, new Word(L,W));  // F -> LW
    Rule rf2 = new Rule(F, new Word(o));    // F -> 1
    Rule rf3 = new Rule(F, new Word(z));    // F -> 0
    Rule rf4 = new Rule(F, new Word(x));    // F -> x

    // LIST OF RULES
    List<Rule> rules = new ArrayList<Rule>();
    
    // Z RULES
    rules.add(rz1);
    rules.add(rz2);
    rules.add(rz3);
    rules.add(rz4);
    rules.add(rz5);
    rules.add(rz6);

    // S RULES
    rules.add(rs1);
    rules.add(rs2);
    rules.add(rs3);
    rules.add(rs4);
    rules.add(rs5);
    rules.add(rs6);

    // T RULES
    rules.add(rt1);
    rules.add(rt2);
    rules.add(rt3);
    rules.add(rt4);
    rules.add(rt5);

    // F RULES
    rules.add(rf1);
    rules.add(rf2);
    rules.add(rf3);
    rules.add(rf4);

    // NON UNIT RULES
    rules.add(rsa);
    rules.add(rmf);
    rules.add(rsr);

    // TERMINAL RULES
    rules.add(rta);
    rules.add(rtm);
    rules.add(rtr);
    rules.add(rtl);

    ContextFreeGrammar cfg = new ContextFreeGrammar(rules);

    // return null;
		return cfg;
	}

}
