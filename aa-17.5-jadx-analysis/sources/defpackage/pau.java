package defpackage;

/* loaded from: classes2.dex */
public final class pau extends abnv implements abox {
    public static final pau a;
    public aboh b = abpf.b;
    public boolean c;
    private int d;

    static {
        pau pauVar = new pau();
        a = pauVar;
        abnv.P(pau.class, pauVar);
    }

    private pau() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"d", "b", abnf.class, "c"});
        }
        if (i2 == 3) {
            return new pau();
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
        return abnv.L(pau.class);
    }
}
