package defpackage;

/* loaded from: classes2.dex */
public final class oty extends abnv implements abox {
    public static final oty a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public abpt g;

    static {
        oty otyVar = new oty();
        a = otyVar;
        abnv.P(oty.class, otyVar);
    }

    private oty() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", orj.l, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new oty();
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
        return abnv.L(oty.class);
    }
}
