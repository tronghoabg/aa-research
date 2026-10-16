package defpackage;

/* loaded from: classes3.dex */
public final class aahs extends abnv implements abox {
    public static final aahs a;
    public aboh b = abpf.b;

    static {
        aahs aahsVar = new aahs();
        a = aahsVar;
        abnv.P(aahs.class, aahsVar);
    }

    private aahs() {
        abor aborVar = abor.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new aahs();
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
        return abnv.L(aahs.class);
    }
}
