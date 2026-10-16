package defpackage;

/* loaded from: classes.dex */
public final class abrd extends abnv implements abox {
    public static final abrd a;
    public int b;
    public float c;
    public long d;
    private int e;

    static {
        abrd abrdVar = new abrd();
        a = abrdVar;
        abnv.P(abrd.class, abrdVar);
    }

    private abrd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ဃ\u0002", new Object[]{"e", "b", ywl.i, "c", "d"});
        }
        if (i2 == 3) {
            return new abrd();
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
        return abnv.L(abrd.class);
    }
}
