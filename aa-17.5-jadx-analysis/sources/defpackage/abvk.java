package defpackage;

/* loaded from: classes3.dex */
public final class abvk extends abnv implements abox {
    public static final abvk a;
    public int b;
    public int c;
    public abod d = abnw.a;
    public int e;
    public int f;

    static {
        abvk abvkVar = new abvk();
        a = abvkVar;
        abnv.P(abvk.class, abvkVar);
    }

    private abvk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abvk();
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
        return abnv.L(abvk.class);
    }
}
