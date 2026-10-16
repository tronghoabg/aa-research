package defpackage;

/* loaded from: classes2.dex */
public final class pba extends abnv implements abox {
    public static final pba a;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public int c = 0;
    public int e = 0;
    public abnx h = abmj.a;

    static {
        pba pbaVar = new pba();
        a = pbaVar;
        abnv.P(pba.class, pbaVar);
    }

    private pba() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0002\u0001\u0005\f\u0007\u0000\u0001\u0000\u0005င\u0000\u0007*\b<\u0001\t<\u0001\n<\u0001\u000b<\u0000\f\u083f\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "h", pax.class, paw.class, paz.class, pav.class, orj.r});
        }
        if (i2 == 3) {
            return new pba();
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
        return abnv.L(pba.class);
    }
}
