package defpackage;

/* loaded from: classes3.dex */
public final class absf extends abnv implements abox {
    public static final absf a;

    static {
        absf absfVar = new absf();
        a = absfVar;
        abnv.P(absf.class, absfVar);
    }

    private absf() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new absf();
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
        return abnv.L(absf.class);
    }
}
