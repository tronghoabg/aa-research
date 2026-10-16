package defpackage;

/* loaded from: classes3.dex */
public final class abxo extends abnv implements abox {
    public static final abxo a;
    public String b = "";
    public String c = "";

    static {
        abxo abxoVar = new abxo();
        a = abxoVar;
        abnv.P(abxo.class, abxoVar);
    }

    private abxo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abxo();
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
        return abnv.L(abxo.class);
    }
}
