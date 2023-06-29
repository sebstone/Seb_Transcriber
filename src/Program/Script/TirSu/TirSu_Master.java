package Program.Script.TirSu;

import Program.Script.Script;
import Program.Script.TirSu.TirSuSymbol.TirSu_Alphabet;
import elements.Group_Element;

public class TirSu_Master implements Script {
    @Override
    public String transcribeInput(String pInput) {
        String transcribedString = "";
        for (TirSu_Alphabet letter : TirSu_Alphabet.values()) {
            pInput.replaceAll(letter.getLetter(), letter.getReplacementString());
        }
        System.out.println(transcribedString);
        return transcribedString;
    }

    @Override
    public Group_Element getSymbol() {
        return null;
    }

    @Override
    public Group_Element getWord() {
        return null;
    }

    @Override
    public Group_Element getSentence() {
        return null;
    }
}
