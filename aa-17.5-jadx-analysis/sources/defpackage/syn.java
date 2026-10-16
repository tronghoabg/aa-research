package defpackage;

/* loaded from: classes3.dex */
public final class syn extends abnv implements abox {
    public static final syn a;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        syn synVar = new syn();
        a = synVar;
        abnv.P(syn.class, synVar);
    }

    private syn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new syn();
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
        return abnv.L(syn.class);
    }
}
