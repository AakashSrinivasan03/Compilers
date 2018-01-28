/* Generated By:JavaCC: Do not edit this line. MiniExprConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface MiniExprConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int FORMAL_COMMENT = 7;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 8;
  /** RegularExpression Id. */
  int LPAREN = 9;
  /** RegularExpression Id. */
  int RPAREN = 10;
  /** RegularExpression Id. */
  int LB = 11;
  /** RegularExpression Id. */
  int RB = 12;
  /** RegularExpression Id. */
  int SEMICOLON = 13;
  /** RegularExpression Id. */
  int ASSIGN = 14;
  /** RegularExpression Id. */
  int PLUS = 15;
  /** RegularExpression Id. */
  int MINUS = 16;
  /** RegularExpression Id. */
  int TIMES = 17;
  /** RegularExpression Id. */
  int PRINT = 18;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 19;
  /** RegularExpression Id. */
  int IDENTIFIER = 20;
  /** RegularExpression Id. */
  int LETTER = 21;
  /** RegularExpression Id. */
  int DIGIT = 22;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<FORMAL_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "\"(\"",
    "\")\"",
    "\"{\"",
    "\"}\"",
    "\";\"",
    "\"=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"print\"",
    "<INTEGER_LITERAL>",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
  };

}
