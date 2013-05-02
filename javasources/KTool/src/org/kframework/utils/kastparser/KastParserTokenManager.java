/* Generated By:JavaCC: Do not edit this line. KastParserTokenManager.java */
package org.kframework.utils.kastparser;
import org.kframework.kil.KApp;
import org.kframework.kil.KLabelConstant;
import org.kframework.kil.KList;
import org.kframework.kil.KSequence;
import org.kframework.kil.Term;
import org.kframework.utils.StringUtil;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/** Token Manager. */
public class KastParserTokenManager implements KastParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xc60L) != 0L)
         {
            jjmatchedKind = 13;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0xc60L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 13;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0xc00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 13;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0xc00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 13;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0xc00L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 13;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 2);
      case 10:
         return jjStopAtPos(0, 4);
      case 13:
         return jjStopAtPos(0, 3);
      case 32:
         return jjStopAtPos(0, 1);
      case 34:
         return jjStopAtPos(0, 12);
      case 35:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 44:
         return jjStopAtPos(0, 9);
      case 46:
         return jjMoveStringLiteralDfa1_0(0x440L);
      case 126:
         return jjMoveStringLiteralDfa1_0(0x20L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 75:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 6;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         break;
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(5, 10);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffacf7ffffffffL & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if ((0x400800000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  break;
               case 1:
                  if ((0xffffacf7ffffffffL & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 3:
                  if (kind > 15)
                     kind = 15;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xbffffffeffffffffL & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                  }
                  else if (curChar == 96)
                     jjstateSet[jjnewStateCnt++] = 3;
                  else if (curChar == 126)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  break;
               case 1:
                  if ((0xbffffffeffffffffL & l) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 2:
                  if (curChar == 96)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if (kind > 15)
                     kind = 15;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 14)
                     kind = 14;
                  break;
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 15)
                     kind = 15;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private static final int jjStopStringLiteralDfa_2(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_2(int pos, long active0)
{
   return jjMoveNfa_2(jjStopStringLiteralDfa_2(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 21);
      default :
         return jjMoveNfa_2(0, 0);
   }
}
static private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffeffffffffffL & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 1:
                  if (kind > 19)
                     kind = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffeffffffffL & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  else if (curChar == 96)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (kind > 19)
                     kind = 19;
                  break;
               case 2:
                  if ((0xfffffffeffffffffL & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 19)
                     kind = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private static final int jjStopStringLiteralDfa_1(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 18);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffbffffffffL & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 1:
                  if (kind > 16)
                     kind = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xffffffffefffffffL & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (kind > 16)
                     kind = 16;
                  break;
               case 2:
                  if ((0xffffffffefffffffL & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 16)
                     kind = 16;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\176\76", "\56\113", "\50", "\51", "\54", 
"\56\113\114\151\163\164", "\43\164\157\153\145\156", null, null, null, null, null, null, null, null, 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "STRING_STATE",
   "KLABEL_STATE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 2, 2, -1, -1, 0, -1, -1, 0, 
};
static final long[] jjtoToken = {
   0x240fe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoMore = {
   0x1bf000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[4];
static private final int[] jjstateSet = new int[8];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public KastParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public KastParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 4; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           TokenLexicalActions(matchedToken);
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 21 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                matchedToken.image = image.substring(0, image.length() - 1);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
