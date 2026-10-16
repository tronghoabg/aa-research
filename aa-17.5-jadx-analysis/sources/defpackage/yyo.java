package defpackage;

/* loaded from: classes3.dex */
public final class yyo extends abnv implements abox {
    public static final yyo a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        yyo yyoVar = new yyo();
        a = yyoVar;
        abnv.P(yyo.class, yyoVar);
    }

    private yyo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004ဏ\u0003", new Object[]{"b", "c", "d", "e", ywl.f, "f"});
        }
        if (i2 == 3) {
            return new yyo();
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
        return abnv.L(yyo.class);
    }
}
