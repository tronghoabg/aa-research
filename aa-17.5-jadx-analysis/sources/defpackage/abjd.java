package defpackage;

/* loaded from: classes3.dex */
public final class abjd extends abnv implements abox {
    public static final abjd a;
    public aboh b = abpf.b;

    static {
        abjd abjdVar = new abjd();
        a = abjdVar;
        abnv.P(abjd.class, abjdVar);
    }

    private abjd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abjc.class});
        }
        if (i2 == 3) {
            return new abjd();
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
        return abnv.L(abjd.class);
    }
}
