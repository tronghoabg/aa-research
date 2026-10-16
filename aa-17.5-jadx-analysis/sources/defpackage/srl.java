package defpackage;

/* loaded from: classes2.dex */
public final class srl extends abnv implements abox {
    public static final srl a;
    public static final abnh b;

    static {
        srl srlVar = new srl();
        a = srlVar;
        abnv.P(srl.class, srlVar);
        b = abnv.W(ajey.a, srlVar, srlVar, null, 8, abqd.MESSAGE);
    }

    private srl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new srl();
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
        return abnv.L(srl.class);
    }
}
