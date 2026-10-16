package defpackage;

/* loaded from: classes.dex */
public final class xnw extends abnv implements abox {
    public static final xnw a;
    private int c;
    private byte d = 2;
    public int b = 1;

    static {
        xnw xnwVar = new xnw();
        a = xnwVar;
        abnv.P(xnw.class, xnwVar);
    }

    private xnw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"c", "b", xln.c});
        }
        if (i2 == 3) {
            return new xnw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xnw.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
