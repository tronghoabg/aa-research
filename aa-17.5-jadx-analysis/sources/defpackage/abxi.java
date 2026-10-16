package defpackage;

/* loaded from: classes3.dex */
public final class abxi extends abnv implements abox {
    public static final abxi a;

    static {
        abxi abxiVar = new abxi();
        a = abxiVar;
        abnv.P(abxi.class, abxiVar);
    }

    private abxi() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abxi();
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
        return abnv.L(abxi.class);
    }
}
