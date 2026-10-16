package defpackage;

/* loaded from: classes3.dex */
public final class ajet extends abnv implements abox {
    public static final ajet a;
    public int b;
    public int c;
    public long d;
    public ajeo e;

    static {
        ajet ajetVar = new ajet();
        a = ajetVar;
        abnv.P(ajet.class, ajetVar);
    }

    private ajet() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ajet();
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
        return abnv.L(ajet.class);
    }
}
