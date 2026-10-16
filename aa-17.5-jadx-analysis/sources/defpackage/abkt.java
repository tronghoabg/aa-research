package defpackage;

/* loaded from: classes3.dex */
public final class abkt extends abnv implements abox {
    public static final abkt a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        abkt abktVar = new abkt();
        a = abktVar;
        abnv.P(abkt.class, abktVar);
    }

    private abkt() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001᠌\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\nင\u0000", new Object[]{"b", "d", abho.r, "e", "f", "g", "c"});
        }
        if (i2 == 3) {
            return new abkt();
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
        return abnv.L(abkt.class);
    }
}
