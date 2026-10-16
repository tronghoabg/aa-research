package defpackage;

/* loaded from: classes3.dex */
public final class abxr extends abnv implements abox {
    public static final abxr a;
    public int b;
    public String c = "";
    public abod d = abnw.a;
    public int e;

    static {
        abxr abxrVar = new abxr();
        a = abxrVar;
        abnv.P(abxr.class, abxrVar);
    }

    private abxr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abxr();
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
        return abnv.L(abxr.class);
    }
}
