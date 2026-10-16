package defpackage;

/* loaded from: classes3.dex */
public final class aavp extends abnv implements abox {
    public static final aavp a;
    public boolean b;
    private int c;

    static {
        aavp aavpVar = new aavp();
        a = aavpVar;
        abnv.P(aavp.class, aavpVar);
    }

    private aavp() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001ëë\u0001\u0000\u0000\u0000ëဇ\u0019", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new aavp();
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
        return abnv.L(aavp.class);
    }
}
