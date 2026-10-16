package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 znx, still in use, count: 1, list:
  (r10v0 znx) from 0x0d95: INVOKE 
  (r10v0 znx)
  (r11v0 znx)
  (r12v0 znx)
  (r13v0 znx)
  (r14v0 znx)
  (r15v0 znx)
  (wrap:znx[]:0x0d85: FILLED_NEW_ARRAY (r0v202 znx), (r1v225 znx), (r2v40 znx), (r4v43 znx), (r5v29 znx), (r3v3 znx) A[WRAPPED] (LINE:3462) elemType: znx)
 STATIC call: ygr.t(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object[]):ygr A[MD:(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object[]):ygr VARARG (m), VARARG_CALL] (LINE:3478)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class znx {
    AC,
    AD,
    AE,
    AF,
    AG,
    AI,
    AL,
    AM,
    AN,
    AO,
    AQ,
    AR,
    AS,
    AT,
    AU,
    AW,
    AX,
    AZ,
    BA,
    BB,
    BD,
    BE,
    BF,
    BG,
    BH,
    BI,
    BJ,
    BL,
    BM,
    BN,
    BO,
    BQ,
    BR,
    BS,
    BT,
    BU,
    BV,
    BW,
    BY,
    BZ,
    CA,
    CC,
    CD,
    CF,
    CG,
    CH,
    CI,
    CK,
    CL,
    CM,
    CN,
    CO,
    CP,
    CQ,
    CR,
    CS,
    CU,
    CV,
    CW,
    CX,
    CY,
    CZ,
    DD,
    DE,
    DG,
    DJ,
    DK,
    DM,
    DO,
    DZ,
    EA,
    EC,
    EE,
    EG,
    EH,
    ER,
    ES,
    ET,
    EU,
    EZ,
    FI,
    FJ,
    FK,
    FM,
    FO,
    FR,
    FX,
    GA,
    GB,
    GD,
    GE,
    GF,
    GG,
    GH,
    GI,
    GL,
    GM,
    GN,
    GP,
    GQ,
    GR,
    GS,
    GT,
    GU,
    GW,
    GY,
    HK,
    HM,
    HN,
    HR,
    HT,
    HU,
    IC,
    ID,
    IE,
    IL,
    IM,
    IN,
    IO,
    IQ,
    IR,
    IS,
    IT,
    JE,
    JM,
    JO,
    JP,
    KE,
    KG,
    KH,
    KI,
    KM,
    KN,
    KP,
    KR,
    KW,
    KY,
    KZ,
    LA,
    LB,
    LC,
    LI,
    LK,
    LR,
    LS,
    LT,
    LU,
    LV,
    LY,
    MA,
    MC,
    MD,
    ME,
    MF,
    MG,
    MH,
    MK,
    ML,
    MM,
    MN,
    MO,
    MP,
    MQ,
    MR,
    MS,
    MT,
    MU,
    MV,
    MW,
    MX,
    MY,
    MZ,
    NA,
    NC,
    NE,
    NF,
    NG,
    NI,
    NL,
    NO,
    NP,
    NR,
    NT,
    NU,
    NZ,
    OM,
    PA,
    PE,
    PF,
    PG,
    PH,
    PK,
    PL,
    PM,
    PN,
    PR,
    PS,
    PT,
    PW,
    PY,
    QA,
    QO,
    QU,
    RE,
    RO,
    RS,
    RU,
    RW,
    SA,
    SB,
    SC,
    SD,
    SE,
    SG,
    SH,
    SI,
    SJ,
    SK,
    SL,
    SM,
    SN,
    SO,
    SR,
    SS,
    ST,
    SU,
    SV,
    SX,
    SY,
    SZ,
    TA,
    TC,
    TD,
    TF,
    TG,
    TH,
    TJ,
    TK,
    TL,
    TM,
    TN,
    TO,
    TP,
    TR,
    TT,
    TV,
    TW,
    TZ,
    UA,
    UG,
    UM,
    UN,
    US,
    UY,
    UZ,
    VA,
    VC,
    VE,
    VG,
    VI,
    VN,
    VU,
    WF,
    WS,
    XA,
    XB,
    XC,
    XK,
    YD,
    YE,
    YT,
    YU,
    ZA,
    ZM,
    ZR,
    ZW,
    ZZ,
    UN001("001"),
    UN002("002"),
    UN003("003"),
    UN005("005"),
    UN009("009"),
    UN011("011"),
    UN013("013"),
    UN014("014"),
    UN015("015"),
    UN017("017"),
    UN018("018"),
    UN019("019"),
    UN021("021"),
    UN029("029"),
    UN030("030"),
    UN034("034"),
    UN035("035"),
    UN039("039"),
    UN053("053"),
    UN054("054"),
    UN057("057"),
    UN061("061"),
    UN142("142"),
    UN143("143"),
    UN145("145"),
    UN150("150"),
    UN151("151"),
    UN154("154"),
    UN155("155"),
    UN202("202"),
    UN419("419");

    private static final yfy eW;
    private final String eY;

    static {
        ygr.t(new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx(), new znx());
        ygr.v();
        znx[] znxVarArrValues = values();
        yfu yfuVar = new yfu(4);
        for (znx znxVar : znxVarArrValues) {
            yfuVar.e(znxVar.toString(), znxVar);
        }
        yfuVar.e("UK", GB);
        eW = yfuVar.d(true);
    }

    private znx() {
        this.eY = name();
    }

    @ResultIgnorabilityUnspecified
    public static znx a(String str) {
        znx znxVarC = c(str);
        if (znxVarC != null) {
            return znxVarC;
        }
        throw new IllegalArgumentException(a.bq(str, "'", "' is not a valid CLDR region code."));
    }

    public static znx b(String str) {
        znx znxVarC = c(str);
        return znxVarC != null ? znxVarC : ZZ;
    }

    private static znx c(String str) {
        return (znx) eW.get(woy.as(str));
    }

    public static znx valueOf(String str) {
        return (znx) Enum.valueOf(znx.class, str);
    }

    public static znx[] values() {
        return (znx[]) eX.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.eY;
    }

    private znx(String str) {
        this.eY = str;
    }
}
