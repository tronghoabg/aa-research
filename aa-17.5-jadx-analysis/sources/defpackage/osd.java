package defpackage;

/* loaded from: classes2.dex */
public final class osd extends abnv implements abox {
    public static final osd a;
    public int b;
    public boolean g;
    public String c = "";
    public abms d = abms.d;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        osd osdVar = new osd();
        a = osdVar;
        abnv.P(osd.class, osdVar);
    }

    private osd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ည\u0001\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "e", "f", "d", "g", "h"});
        }
        if (i2 == 3) {
            return new osd();
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
        return abnv.L(osd.class);
    }
}
