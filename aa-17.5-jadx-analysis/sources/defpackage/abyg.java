package defpackage;

/* loaded from: classes3.dex */
public final class abyg extends abnv implements abox {
    public static final abyg a;

    static {
        abyg abygVar = new abyg();
        a = abygVar;
        abnv.P(abyg.class, abygVar);
    }

    private abyg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abyg();
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
        return abnv.L(abyg.class);
    }
}
