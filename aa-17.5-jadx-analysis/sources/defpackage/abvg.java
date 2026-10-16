package defpackage;

/* loaded from: classes3.dex */
public final class abvg extends abnv implements abox {
    public static final abvg a;
    public boolean b;
    public String c = "";

    static {
        abvg abvgVar = new abvg();
        a = abvgVar;
        abnv.P(abvg.class, abvgVar);
    }

    private abvg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abvg();
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
        return abnv.L(abvg.class);
    }
}
