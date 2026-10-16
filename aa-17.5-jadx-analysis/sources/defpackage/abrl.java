package defpackage;

/* loaded from: classes3.dex */
public final class abrl extends abnv implements abox {
    public static final abrl a;
    public int b;
    public int c;
    private int d;

    static {
        abrl abrlVar = new abrl();
        a = abrlVar;
        abnv.P(abrl.class, abrlVar);
    }

    private abrl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abrl();
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
        return abnv.L(abrl.class);
    }
}
