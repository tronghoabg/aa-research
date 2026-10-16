package defpackage;

/* loaded from: classes3.dex */
public final class tac extends abnv implements abox {
    public static final tac a;
    public int b;
    public int c;
    public int d;

    static {
        tac tacVar = new tac();
        a = tacVar;
        abnv.P(tac.class, tacVar);
    }

    private tac() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new tac();
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
        return abnv.L(tac.class);
    }
}
