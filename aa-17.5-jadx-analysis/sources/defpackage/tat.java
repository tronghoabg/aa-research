package defpackage;

/* loaded from: classes3.dex */
public final class tat extends abnv implements abox {
    public static final tat a;
    public Object c;
    public int e;
    public double g;
    private int h;
    public int b = 0;
    public String d = "";
    public String f = "";

    static {
        tat tatVar = new tat();
        a = tatVar;
        abnv.P(tat.class, tatVar);
    }

    private tat() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0001\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004က\u0003\n;\u0000\u000b;\u0000\f;\u0000", new Object[]{"c", "b", "h", "d", "e", tap.b, "f", "g"});
        }
        if (i2 == 3) {
            return new tat();
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
        return abnv.L(tat.class);
    }
}
