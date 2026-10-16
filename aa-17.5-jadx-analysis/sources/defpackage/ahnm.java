package defpackage;

/* loaded from: classes.dex */
public final class ahnm {
    public static final ahnm INSTANCE = new ahnm();
    public static final ahnj NO_NAME_PROVIDED = ahnj.special("<no name provided>");
    public static final ahnj ROOT_PACKAGE = ahnj.special("<root package>");
    public static final ahnj DEFAULT_NAME_FOR_COMPANION_OBJECT = ahnj.identifier("Companion");
    public static final ahnj SAFE_IDENTIFIER_FOR_NO_NAME = ahnj.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
    public static final ahnj ANONYMOUS = ahnj.special("<anonymous>");
    public static final ahnf ANONYMOUS_FQ_NAME = ahnf.Companion.topLevel(ahnj.special("<anonymous>"));
    public static final ahnj UNARY = ahnj.special("<unary>");
    public static final ahnj THIS = ahnj.special("<this>");
    public static final ahnj INIT = ahnj.special("<init>");
    public static final ahnj WHEN_SUBJECT = ahnj.special("<when-subject>");
    public static final ahnj ITERATOR = ahnj.special("<iterator>");
    public static final ahnj DESTRUCT = ahnj.special("<destruct>");
    public static final ahnj LOCAL = ahnj.special("<local>");
    public static final ahnj UNDERSCORE_FOR_UNUSED_VAR = ahnj.special("<unused var>");
    public static final ahnj IMPLICIT_SET_PARAMETER = ahnj.special("<set-?>");
    public static final ahnj ARRAY = ahnj.special("<array>");
    public static final ahnj RECEIVER = ahnj.special("<receiver>");
    public static final ahnj ENUM_GET_ENTRIES = ahnj.special("<get-entries>");

    private ahnm() {
    }

    public static final ahnj safeIdentifier(ahnj ahnjVar) {
        return (ahnjVar == null || ahnjVar.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : ahnjVar;
    }

    public final boolean isSafeIdentifier(ahnj ahnjVar) {
        ahnjVar.getClass();
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return strAsString.length() > 0 && !ahnjVar.isSpecial();
    }
}
