package defpackage;

/* loaded from: classes3.dex */
public final class acdj extends abnv implements abox {
    public static final acdj a;
    public boolean b;
    private int c;

    static {
        acdj acdjVar = new acdj();
        a = acdjVar;
        abnv.P(acdj.class, acdjVar);
    }

    private acdj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဇ\u0005", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new acdj();
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
        return abnv.L(acdj.class);
    }
}
