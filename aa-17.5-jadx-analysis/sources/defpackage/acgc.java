package defpackage;

/* loaded from: classes3.dex */
public final class acgc extends abns implements abnt {
    public static final acgc a;
    private int b;
    private acga c;
    private aapc d;
    private byte e = 2;

    static {
        acgc acgcVar = new acgc();
        a = acgcVar;
        abnv.P(acgc.class, acgcVar);
    }

    private acgc() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\nဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acgc();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgc.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
