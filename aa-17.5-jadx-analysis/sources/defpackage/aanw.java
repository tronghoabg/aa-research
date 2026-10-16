package defpackage;

/* loaded from: classes3.dex */
public final class aanw extends abns implements abnt {
    public static final aanw a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aanw aanwVar = new aanw();
        a = aanwVar;
        abnv.P(aanw.class, aanwVar);
    }

    private aanw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0006\u0002ဉ\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aanw();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aanw.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
