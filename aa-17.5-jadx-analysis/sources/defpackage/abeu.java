package defpackage;

/* loaded from: classes3.dex */
public final class abeu extends abnv implements abox {
    public static final abeu a;
    public abod b;
    public abod c;

    static {
        abeu abeuVar = new abeu();
        a = abeuVar;
        abnv.P(abeu.class, abeuVar);
    }

    private abeu() {
        abnw abnwVar = abnw.a;
        this.b = abnwVar;
        this.c = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abeu();
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
        return abnv.L(abeu.class);
    }
}
