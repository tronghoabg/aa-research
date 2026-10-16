package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sag extends defpackage.saf {
    private final java.io.StringWriter a;

    private sag(java.io.StringWriter stringWriter) {
        super(new java.io.PrintWriter(stringWriter));
        this.a = stringWriter;
    }

    public static defpackage.sag n() {
        return new defpackage.sag(new java.io.StringWriter());
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
