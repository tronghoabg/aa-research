package defpackage;

/* loaded from: classes3.dex */
public final class yvz extends abnv implements abox {
    public static final yvz a;

    static {
        yvz yvzVar = new yvz();
        a = yvzVar;
        abnv.P(yvz.class, yvzVar);
    }

    private yvz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new yvz();
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
        return abnv.L(yvz.class);
    }
}
