package defpackage;

/* loaded from: classes3.dex */
public final class acfo extends abnv implements abox {
    public static final acfo a;
    public aboh b = abpf.b;

    static {
        acfo acfoVar = new acfo();
        a = acfoVar;
        abnv.P(acfo.class, acfoVar);
    }

    private acfo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0018\u0018\u0001\u0000\u0001\u0000\u0018\u001b", new Object[]{"b", zkg.class});
        }
        if (i2 == 3) {
            return new acfo();
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
        return abnv.L(acfo.class);
    }
}
