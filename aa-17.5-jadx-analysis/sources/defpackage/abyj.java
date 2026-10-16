package defpackage;

/* loaded from: classes3.dex */
public final class abyj extends abnv implements abox {
    public static final abyj a;
    public boolean b;
    public String c = "";

    static {
        abyj abyjVar = new abyj();
        a = abyjVar;
        abnv.P(abyj.class, abyjVar);
    }

    private abyj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abyj();
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
        return abnv.L(abyj.class);
    }
}
