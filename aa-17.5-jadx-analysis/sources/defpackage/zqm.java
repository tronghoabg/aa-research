package defpackage;

/* loaded from: classes3.dex */
public final class zqm extends abnv implements abox {
    public static final zqm a;
    public int b = 0;
    public Object c;
    public int d;
    public zqq e;
    private int f;

    static {
        zqm zqmVar = new zqm();
        a = zqmVar;
        abnv.P(zqm.class, zqmVar);
    }

    private zqm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဉ\u0001", new Object[]{"c", "b", "f", "d", zli.e, zqj.class, zqk.class, zqt.class, "e"});
        }
        if (i2 == 3) {
            return new zqm();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(zqm.class);
    }
}
