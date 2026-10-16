package defpackage;

/* loaded from: classes3.dex */
public final class abhf extends abnv implements abox {
    public static final abhf a;
    public int b;
    public long c;

    static {
        abhf abhfVar = new abhf();
        a = abhfVar;
        abnv.P(abhf.class, abhfVar);
    }

    private abhf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abhf();
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
        return abnv.L(abhf.class);
    }
}
