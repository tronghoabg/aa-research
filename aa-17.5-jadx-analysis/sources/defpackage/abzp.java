package defpackage;

/* loaded from: classes3.dex */
public final class abzp extends abnv implements abox {
    public static final abzp a;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        abzp abzpVar = new abzp();
        a = abzpVar;
        abnv.P(abzp.class, abzpVar);
    }

    private abzp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001\u0003\u0004Ȉ\u0006Ȉ\bȈ", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abzp();
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
        return abnv.L(abzp.class);
    }
}
