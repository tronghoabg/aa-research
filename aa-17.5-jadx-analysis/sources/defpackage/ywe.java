package defpackage;

/* loaded from: classes3.dex */
public final class ywe extends abnv implements abox {
    public static final ywe a;
    private int b;
    private ywd c;

    static {
        ywe yweVar = new ywe();
        a = yweVar;
        abnv.P(ywe.class, yweVar);
    }

    private ywe() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ywe();
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
        return abnv.L(ywe.class);
    }
}
