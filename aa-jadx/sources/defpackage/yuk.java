package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yuk implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.String a;
    private final int b;

    public yuk(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    private java.lang.Object readResolve() {
        return new defpackage.yul(this.a, this.b);
    }
}
