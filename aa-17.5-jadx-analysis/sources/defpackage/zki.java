package defpackage;

/* loaded from: classes3.dex */
public final class zki extends abnv implements abox {
    public static final zki a;
    public String b;
    private int c;

    static {
        zki zkiVar = new zki();
        a = zkiVar;
        abnv.P(zki.class, zkiVar);
    }

    private zki() {
        abms abmsVar = abms.d;
        this.b = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new zki();
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
        return abnv.L(zki.class);
    }
}
