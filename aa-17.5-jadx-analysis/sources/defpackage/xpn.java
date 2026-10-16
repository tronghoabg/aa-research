package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class xpn extends abnv implements abox {
    public static final xpn a;
    public int b;
    public int c = 1;
    public String d = "";

    static {
        xpn xpnVar = new xpn();
        a = xpnVar;
        abnv.P(xpn.class, xpnVar);
    }

    private xpn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"b", "c", xou.h, "d"});
        }
        if (i2 == 3) {
            return new xpn();
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
        return abnv.L(xpn.class);
    }
}
