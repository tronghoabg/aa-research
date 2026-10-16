package defpackage;

/* loaded from: classes.dex */
public final class yyx extends abnv implements abox {
    public static final yyx a;
    public aboh b = abpf.b;

    static {
        yyx yyxVar = new yyx();
        a = yyxVar;
        abnv.P(yyx.class, yyxVar);
    }

    private yyx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new yyx();
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
        return abnv.L(yyx.class);
    }
}
