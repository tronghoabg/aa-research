package defpackage;

/* loaded from: classes2.dex */
public final class ory extends abnv implements abox {
    public static final ory a;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;

    static {
        ory oryVar = new ory();
        a = oryVar;
        abnv.P(ory.class, oryVar);
    }

    private ory() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ory();
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
        return abnv.L(ory.class);
    }
}
