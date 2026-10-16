package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahom {
    public static final defpackage.ahom INSTANCE = new defpackage.ahom();
    public static final defpackage.ahoj NO_NAME_PROVIDED = defpackage.ahoj.special("<no name provided>");
    public static final defpackage.ahoj ROOT_PACKAGE = defpackage.ahoj.special("<root package>");
    public static final defpackage.ahoj DEFAULT_NAME_FOR_COMPANION_OBJECT = defpackage.ahoj.identifier("Companion");
    public static final defpackage.ahoj SAFE_IDENTIFIER_FOR_NO_NAME = defpackage.ahoj.identifier("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
    public static final defpackage.ahoj ANONYMOUS = defpackage.ahoj.special("<anonymous>");
    public static final defpackage.ahof ANONYMOUS_FQ_NAME = defpackage.ahof.Companion.topLevel(defpackage.ahoj.special("<anonymous>"));
    public static final defpackage.ahoj UNARY = defpackage.ahoj.special("<unary>");
    public static final defpackage.ahoj THIS = defpackage.ahoj.special("<this>");
    public static final defpackage.ahoj INIT = defpackage.ahoj.special("<init>");
    public static final defpackage.ahoj WHEN_SUBJECT = defpackage.ahoj.special("<when-subject>");
    public static final defpackage.ahoj ITERATOR = defpackage.ahoj.special("<iterator>");
    public static final defpackage.ahoj DESTRUCT = defpackage.ahoj.special("<destruct>");
    public static final defpackage.ahoj LOCAL = defpackage.ahoj.special("<local>");
    public static final defpackage.ahoj UNDERSCORE_FOR_UNUSED_VAR = defpackage.ahoj.special("<unused var>");
    public static final defpackage.ahoj IMPLICIT_SET_PARAMETER = defpackage.ahoj.special("<set-?>");
    public static final defpackage.ahoj ARRAY = defpackage.ahoj.special("<array>");
    public static final defpackage.ahoj RECEIVER = defpackage.ahoj.special("<receiver>");
    public static final defpackage.ahoj ENUM_GET_ENTRIES = defpackage.ahoj.special("<get-entries>");

    private ahom() {
    }

    public static final defpackage.ahoj safeIdentifier(defpackage.ahoj ahojVar) {
        return (ahojVar == null || ahojVar.isSpecial()) ? SAFE_IDENTIFIER_FOR_NO_NAME : ahojVar;
    }

    public final boolean isSafeIdentifier(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        java.lang.String strAsString = ahojVar.asString();
        strAsString.getClass();
        return strAsString.length() > 0 && !ahojVar.isSpecial();
    }
}
