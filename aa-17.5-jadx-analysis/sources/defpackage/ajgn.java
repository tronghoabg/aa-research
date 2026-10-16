package defpackage;

/* loaded from: classes3.dex */
public final class ajgn extends abnv implements abox {
    public static final ajgn a;
    public int b;
    public String c = "";
    public abog d = abor.a;

    static {
        ajgn ajgnVar = new ajgn();
        a = ajgnVar;
        abnv.P(ajgn.class, ajgnVar);
    }

    private ajgn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ajgn();
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
        return abnv.L(ajgn.class);
    }
}
