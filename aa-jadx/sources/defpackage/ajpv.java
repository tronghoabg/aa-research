package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajpv extends java.io.IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ajpv(java.lang.Object... objArr) {
        super(defpackage.ajqd.a(java.lang.String.format("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", objArr)));
    }

    public ajpv() {
        super(defpackage.ajqd.a("Premature end of chunk coded message body: closing chunk expected"));
    }
}
