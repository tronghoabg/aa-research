package defpackage;

/* loaded from: classes2.dex */
public final class osp extends abnv implements abox {
    public static final osp a;
    public aboh b = abpf.b;

    static {
        osp ospVar = new osp();
        a = ospVar;
        abnv.P(osp.class, ospVar);
    }

    private osp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", oso.class});
        }
        if (i2 == 3) {
            return new osp();
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
        return abnv.L(osp.class);
    }
}
