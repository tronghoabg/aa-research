package defpackage;

/* loaded from: classes3.dex */
public final class abbm extends abnv implements abox {
    public static final abbm a;
    public int b;
    public int c;
    public int d;
    public int e;
    public abod f = abnw.a;

    static {
        abbm abbmVar = new abbm();
        a = abbmVar;
        abnv.P(abbm.class, abbmVar);
    }

    private abbm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u0016", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abbm();
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
        return abnv.L(abbm.class);
    }
}
