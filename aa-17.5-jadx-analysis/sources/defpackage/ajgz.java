package defpackage;

/* loaded from: classes2.dex */
public final class ajgz extends abnv implements abox {
    public static final ajgz a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;

    static {
        ajgz ajgzVar = new ajgz();
        a = ajgzVar;
        abnv.P(ajgz.class, ajgzVar);
    }

    private ajgz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ajgz();
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
        return abnv.L(ajgz.class);
    }
}
