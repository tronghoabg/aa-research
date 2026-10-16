package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wbu extends java.lang.RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public wbu(int i, java.lang.String str, java.lang.Throwable th) {
        java.lang.String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = java.lang.String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
