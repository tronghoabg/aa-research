package defpackage;

/* loaded from: classes3.dex */
public final class abvn extends abnv implements abox {
    public static final abvn a;
    public int b = 0;
    public Object c;

    static {
        abvn abvnVar = new abvn();
        a = abvnVar;
        abnv.P(abvn.class, abvnVar);
    }

    private abvn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", abvj.class, abvh.class, abvm.class, abvk.class, abvi.class, abvl.class});
        }
        if (i2 == 3) {
            return new abvn();
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
        return abnv.L(abvn.class);
    }
}
