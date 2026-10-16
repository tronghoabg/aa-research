package defpackage;

/* loaded from: classes3.dex */
public final class zbv extends abnv implements abox {
    public static final zbv a;
    private int b;
    private zai c;
    private byte d = 2;

    static {
        zbv zbvVar = new zbv();
        a = zbvVar;
        abnv.P(zbv.class, zbvVar);
    }

    private zbv() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zbv();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbv.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
