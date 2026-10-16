package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vzn extends defpackage.abou implements defpackage.abov {
    public static final defpackage.vzn a;
    public int b;
    public defpackage.ajht c;
    private byte d = 2;

    static {
        defpackage.vzn vznVar = new defpackage.vzn();
        a = vznVar;
        defpackage.abox.P(defpackage.vzn.class, vznVar);
    }

    private vzn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.vzn();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.vzn.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
