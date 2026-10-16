package defpackage;

/* loaded from: classes2.dex */
public final class rrl extends abnv implements abox {
    public static final rrl a;
    public aboh b = abpf.b;

    static {
        rrl rrlVar = new rrl();
        a = rrlVar;
        abnv.P(rrl.class, rrlVar);
    }

    private rrl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", rrm.class});
        }
        if (i2 == 3) {
            return new rrl();
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
        return abnv.L(rrl.class);
    }
}
