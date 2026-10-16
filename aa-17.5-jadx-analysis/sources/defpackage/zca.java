package defpackage;

/* loaded from: classes3.dex */
public final class zca extends abnv implements abox {
    public static final zca a;
    public int b;
    public zby c;
    public int d;
    private byte f = 2;
    public abod e = abnw.a;

    static {
        zca zcaVar = new zca();
        a = zcaVar;
        abnv.P(zca.class, zcaVar);
    }

    private zca() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zca();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zca.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
