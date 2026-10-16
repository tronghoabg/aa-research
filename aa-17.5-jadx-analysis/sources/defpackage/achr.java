package defpackage;

/* loaded from: classes3.dex */
public final class achr extends abnv implements abox {
    public static final achr a;
    public int b;
    public acht d;
    private achu e;
    private achq f;
    private byte g = 2;
    public int c = 1;

    static {
        achr achrVar = new achr();
        a = achrVar;
        abnv.P(achr.class, achrVar);
    }

    private achr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u000e\u0004\u0000\u0000\u0004\u0001ᴌ\u0000\u0002ᐉ\u0001\rᐉ\u0004\u000eᐉ\u0005", new Object[]{"b", "c", achi.d, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new achr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achr.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
