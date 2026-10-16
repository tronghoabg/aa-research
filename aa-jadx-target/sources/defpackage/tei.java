package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tei {
    private final short a;
    private final short b;
    private final int c;

    public tei(short s, short s2, int i) {
        this.a = s;
        this.b = s2;
        this.c = i;
    }

    public final void a(java.io.ByteArrayOutputStream byteArrayOutputStream) throws java.io.IOException {
        byteArrayOutputStream.write(defpackage.sqs.aM(this.a));
        byteArrayOutputStream.write(defpackage.sqs.aM(this.b));
        byteArrayOutputStream.write(defpackage.a.S(this.c));
    }
}
