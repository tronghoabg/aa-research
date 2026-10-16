package defpackage;

/* loaded from: classes3.dex */
public final class abvp extends abnv implements abox {
    public static final abvp a;
    public String b = "";
    public String c = "";

    static {
        abvp abvpVar = new abvp();
        a = abvpVar;
        abnv.P(abvp.class, abvpVar);
    }

    private abvp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abvp();
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
        return abnv.L(abvp.class);
    }
}
