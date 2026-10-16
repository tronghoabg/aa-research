package defpackage;

/* loaded from: classes3.dex */
public final class acfu extends abnv implements abox {
    public static final acfu a;
    private int b;
    private abts c;
    private abkz d;
    private aapc e;
    private byte f = 2;

    static {
        acfu acfuVar = new acfu();
        a = acfuVar;
        abnv.P(acfu.class, acfuVar);
    }

    private acfu() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0002\u0011\u0003\u0000\u0000\u0002\u0002ᐉ\n\u0005ᐉ\u0000\u0011ဉ\r", new Object[]{"b", "d", "c", "e"});
        }
        if (i2 == 3) {
            return new acfu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfu.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
