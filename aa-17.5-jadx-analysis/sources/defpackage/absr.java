package defpackage;

/* loaded from: classes3.dex */
public final class absr extends abnv implements abox {
    public static final absr a;
    public int b;
    public String c;

    static {
        absr absrVar = new absr();
        a = absrVar;
        abnv.P(absr.class, absrVar);
    }

    private absr() {
        abms abmsVar = abms.d;
        this.c = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new absr();
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
        return abnv.L(absr.class);
    }
}
