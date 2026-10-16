package defpackage;

/* loaded from: classes3.dex */
public final class abfg extends abnv implements abox {
    public static final abfg a;
    private byte c = 2;
    public aboh b = abpf.b;

    static {
        abfg abfgVar = new abfg();
        a = abfgVar;
        abnv.P(abfg.class, abfgVar);
    }

    private abfg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abff.class});
        }
        if (i2 == 3) {
            return new abfg();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abfg.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
