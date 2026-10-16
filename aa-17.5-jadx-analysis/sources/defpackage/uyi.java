package defpackage;

/* loaded from: classes3.dex */
public final class uyi extends abnv implements abox {
    public static final uyi a;
    public int b;
    public boolean c;
    public int d = 10;
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        uyi uyiVar = new uyi();
        a = uyiVar;
        abnv.P(uyi.class, uyiVar);
    }

    private uyi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new uyi();
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
        return abnv.L(uyi.class);
    }
}
