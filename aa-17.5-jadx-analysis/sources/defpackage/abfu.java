package defpackage;

/* loaded from: classes3.dex */
public final class abfu extends abnv implements abox {
    public static final abfu a;
    public int b;
    public int d;
    public abfy f;
    private int g;
    public aboh c = abpf.b;
    public String e = "";

    static {
        abfu abfuVar = new abfu();
        a = abfuVar;
        abnv.P(abfu.class, abfuVar);
    }

    private abfu() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001င\u0000\u0002\u001b\u0005᠌\u0002\u0006ဈ\u0003\u0007ဉ\u0004", new Object[]{"g", "b", "c", abgy.class, "d", abce.o, "e", "f"});
        }
        if (i2 == 3) {
            return new abfu();
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
        return abnv.L(abfu.class);
    }
}
