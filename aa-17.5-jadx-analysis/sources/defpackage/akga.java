package defpackage;

/* loaded from: classes2.dex */
public final class akga extends abnv implements abox {
    public static final akga a;
    public String b = "";
    public int c;
    private int d;

    static {
        akga akgaVar = new akga();
        a = akgaVar;
        abnv.P(akga.class, akgaVar);
    }

    private akga() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new akga();
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
        return abnv.L(akga.class);
    }
}
