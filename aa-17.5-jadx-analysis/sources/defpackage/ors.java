package defpackage;

/* loaded from: classes2.dex */
public final class ors extends abnv implements abox {
    public static final ors a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ors orsVar = new ors();
        a = orsVar;
        abnv.P(ors.class, orsVar);
    }

    private ors() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ors();
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
        return abnv.L(ors.class);
    }
}
