package defpackage;

/* loaded from: classes2.dex */
public final class qmg {
    public static final String a;
    public static final String b;

    static {
        String strReplaceAll = String.valueOf(sjw.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        a = strReplaceAll;
        b = "ma".concat(String.valueOf(strReplaceAll));
    }
}
