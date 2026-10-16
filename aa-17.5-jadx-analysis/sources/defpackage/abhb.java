package defpackage;

/* loaded from: classes3.dex */
public final class abhb extends abnv implements abox {
    public static final abhb a;
    public int b;
    public boolean c;

    static {
        abhb abhbVar = new abhb();
        a = abhbVar;
        abnv.P(abhb.class, abhbVar);
    }

    private abhb() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0000\nဇ\u001e", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abhb();
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
        return abnv.L(abhb.class);
    }
}
