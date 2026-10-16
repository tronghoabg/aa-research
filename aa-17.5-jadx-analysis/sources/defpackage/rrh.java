package defpackage;

/* loaded from: classes.dex */
public final class rrh extends abnv implements abox {
    public static final rrh a;
    public int b;
    public boolean g;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        rrh rrhVar = new rrh();
        a = rrhVar;
        abnv.P(rrh.class, rrhVar);
    }

    private rrh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new rrh();
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
        return abnv.L(rrh.class);
    }
}
