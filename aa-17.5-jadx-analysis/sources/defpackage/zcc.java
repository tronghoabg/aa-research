package defpackage;

/* loaded from: classes3.dex */
public final class zcc extends abnv implements abox {
    public static final zcc a;
    private int b;
    private absq c;
    private byte d = 2;

    static {
        zcc zccVar = new zcc();
        a = zccVar;
        abnv.P(zcc.class, zccVar);
    }

    private zcc() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001  \u0001\u0000\u0000\u0001 ᐉ\u0019", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zcc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zcc.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
