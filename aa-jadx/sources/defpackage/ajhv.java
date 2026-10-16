package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajhv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.ajhv a;
    public int b;
    public java.lang.Object d;
    public defpackage.ajhx e;
    public int c = 0;
    private byte f = 2;

    static {
        defpackage.ajhv ajhvVar = new defpackage.ajhv();
        a = ajhvVar;
        defpackage.abox.P(defpackage.ajhv.class, ajhvVar);
    }

    private ajhv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new java.lang.Object[]{"d", "c", "b", defpackage.ajgq.class, "e", defpackage.ajia.class});
        }
        if (i2 == 3) {
            return new defpackage.ajhv();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.ajhv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
