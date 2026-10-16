package defpackage;

/* loaded from: classes3.dex */
public final class zok extends abnv implements abox {
    public static final zok a;
    public int b;
    public abms c = abms.d;
    public abod d;
    public abod e;

    static {
        zok zokVar = new zok();
        a = zokVar;
        abnv.P(zok.class, zokVar);
    }

    private zok() {
        abnw abnwVar = abnw.a;
        this.d = abnwVar;
        this.e = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0007\n\u0003\u0000\u0002\u0000\u0007ည\u0001\t\u0016\n\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zok();
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
        return abnv.L(zok.class);
    }
}
