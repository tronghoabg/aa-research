package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qnb {
    public static final java.lang.String a;
    public static final java.lang.String b;

    static {
        java.lang.String strReplaceAll = java.lang.String.valueOf(defpackage.sks.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        a = strReplaceAll;
        b = "ma".concat(java.lang.String.valueOf(strReplaceAll));
    }
}
