package defpackage;

/* loaded from: classes3.dex */
public final class zqu extends abnv implements abox {
    public static final zqu a;
    public int b;
    public zqv c;
    public int d;
    private int e;

    static {
        zqu zquVar = new zqu();
        a = zquVar;
        abnv.P(zqu.class, zquVar);
    }

    private zqu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abob abobVar = zli.g;
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"e", "b", abobVar, "c", "d", abobVar});
        }
        if (i2 == 3) {
            return new zqu();
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
        return abnv.L(zqu.class);
    }
}
