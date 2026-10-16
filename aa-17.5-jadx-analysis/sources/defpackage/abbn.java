package defpackage;

/* loaded from: classes3.dex */
public final class abbn extends abnv implements abox {
    public static final abbn a;
    public int b;
    public String c = "";
    public int d;

    static {
        abbn abbnVar = new abbn();
        a = abbnVar;
        abnv.P(abbn.class, abbnVar);
    }

    private abbn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abbn();
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
        return abnv.L(abbn.class);
    }
}
