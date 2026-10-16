package defpackage;

/* loaded from: classes2.dex */
public final class orp extends abnv implements abox {
    public static final orp a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public long f;
    public boolean g;
    public orv h;

    static {
        orp orpVar = new orp();
        a = orpVar;
        abnv.P(orp.class, orpVar);
    }

    private orp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", orj.k, "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new orp();
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
        return abnv.L(orp.class);
    }
}
