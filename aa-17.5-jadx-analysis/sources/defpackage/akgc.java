package defpackage;

/* loaded from: classes2.dex */
public final class akgc extends abnv implements abox {
    public static final akgc a;
    public int b;
    public String c = "";
    public String d = "";
    public tlj e;

    static {
        akgc akgcVar = new akgc();
        a = akgcVar;
        abnv.P(akgc.class, akgcVar);
    }

    private akgc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new akgc();
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
        return abnv.L(akgc.class);
    }
}
