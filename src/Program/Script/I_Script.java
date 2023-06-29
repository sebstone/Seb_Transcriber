package Program.Script;

import elements.Group_Element;

public interface I_Script
{
    String transcribeInput(String pInput);
    Group_Element getSymbol();
    Group_Element getWord();
    Group_Element getSentence();
}
