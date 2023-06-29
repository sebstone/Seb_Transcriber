package Program.Script.TirSu.TirSuSymbol;

import Program.Script.I_Alphabet;

import java.util.ArrayList;
import java.util.List;

/**
 * TirSu_Alphabet
 */
public enum TirSu_Alphabet implements I_Alphabet
{

    A("a", Letter_Element.HEAD_ROOF, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG),
    B("b", Letter_Element.HEAD_ROOF_INVERTED, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.NECK_HIGH_Short),
    C("c", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.NECK_HIGH_Short),
    D("d", Letter_Element.HEAD_ROOF, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.NECK_HIGH_LONG),
    E("e", Letter_Element.HEAD_T, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG),
    F("f", Letter_Element.HEAD_DOUBLE_T, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG),
    G("g", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID, Letter_Element.NECK_HIGH_Short),
    H("h", Letter_Element.HEAD_ROOF, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG),
    I("i", Letter_Element.NECK_HIGH_LONG, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG, Letter_Element.NECK_HIGH_LONG),
    J("j", "a", Letter_Element.HEAD_ARM_RIGHT, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_LONG),
    K("k", Letter_Element.HEAD_DOUBLE_ARM_RIGHT, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_Short),
    L("l", Letter_Element.HEAD_TRIANGLE, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_Short),
    M("m", Letter_Element.HEAD_TRIANGLE, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.NECK_HIGH_Short),
    N("n", Letter_Element.HEAD_TRIANGLE, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID, Letter_Element.NECK_HIGH_Short),
    O("o", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.CENTER_LINE_LONG, Letter_Element.NECK_HIGH_Short),
    P("p", Letter_Element.HEAD_ROOF_ARM_RIGHT, Letter_Element.NECK_HIGH_LONG, Letter_Element.CENTER_LINE_LONG),
    Q("q", Letter_Element.HEAD_TRIANGLE_INVERSE, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG),
    R("r", Letter_Element.HEAD_ROOF_INVERTED, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID),
    S("s", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.ARM_RIGHT_HIGH, Letter_Element.CENTER_LINE_LONG),
    T("t", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.ARM_RIGHT_HIGH, Letter_Element.ARM_RIGHT_MID, Letter_Element.CENTER_LINE_LONG),
    U("u", Letter_Element.HEAD_U_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG),
    V("v", Letter_Element.HEAD_U_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH),
    W("w", Letter_Element.HEAD_U_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID),
    X("x", Letter_Element.HEAD_RIGHT_OPEN_SQUARE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG),
    Y("y", Letter_Element.HEAD_ROOF_INVERTED, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG),
    Z("z", Letter_Element.HEAD_RIGHT_OPEN_SQUARE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.CENTER_LINE_LONG, Letter_Element.T_ARM_HIGH),

    CH("ch", "-ch-", Letter_Element.HEAD_ROOF, Letter_Element.HEAD_ELLIPSE_MID, Letter_Element.CENTER_LINE_MID, Letter_Element.T_ARM_LOW),
    EA("ea", "-ea-", Letter_Element.HEAD_T, Letter_Element.HEAD_ROOF, Letter_Element.NECK_HIGH_LONG, Letter_Element.CENTER_LINE_LONG),
    OA("oa", "-oa-", Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.ARM_RIGHT_HIGH, Letter_Element.ARM_LEFT_HIGH, Letter_Element.CENTER_LINE_LONG),
    OI("oi", "-oi-", Letter_Element.HEAD_ROOF_INVERTED, Letter_Element.HEAD_ELLIPSE_MID , Letter_Element.CENTER_LINE_MID),
    OU("ou", "-ou-", Letter_Element.HEAD_U_Mid, Letter_Element.HEAD_ELLIPSE_HIGH, Letter_Element.CENTER_LINE_MID),
    SH("sh", "-sh-", Letter_Element.HEAD_ROOF, Letter_Element.HEAD_ELLIPSE_MID, Letter_Element.ARM_RIGHT_MID, Letter_Element.CENTER_LINE_MID),
    TH("th", "-th-", Letter_Element.HEAD_ROOF, Letter_Element.HEAD_ELLIPSE_MID, Letter_Element.ARM_RIGHT_LOW, Letter_Element.ARM_RIGHT_MID, Letter_Element.CENTER_LINE_MID),
    ZH("zh", "-zh-", Letter_Element.HEAD_RIGHT_OPEN_SQUARE_HIGH, Letter_Element.NECK_HIGH_Short, Letter_Element.T_ARM_HIGH, Letter_Element.T_ARM_MID, Letter_Element.CENTER_LINE_LONG);

    // Constructor ---------------------------------------------------------------- \\
    private TirSu_Alphabet(String pLetter, Letter_Element... pElements)
    {
        this._Letter = pLetter;
        this._ReplacementSymbol = pLetter;
        for (Letter_Element letter_Element : pElements)
        {
            this._Elements.add(letter_Element);
        }

    }

    private TirSu_Alphabet(String pLetter, String pReplacementSymbol, Letter_Element... pElements)
    {
        this._Letter = pLetter;
        this._ReplacementSymbol = pReplacementSymbol;
        for (Letter_Element letter_Element : pElements)
        {
            this._Elements.add(letter_Element);
        }
    }

    // Variables ---------------------------------------------------------------- \\
    private String _Letter;
    private String _ReplacementSymbol;
    private List<Letter_Element> _Elements = new ArrayList<>();

    // Getter-Setter ---------------------------------------------------------------- \\

    @Override
    public String getLetter() {
        return _Letter;
    }

    @Override
    public String getReplacementString() {
        return _ReplacementSymbol;
    }

    public List<Letter_Element> get_Elements()
    {
        return _Elements;
    }
}