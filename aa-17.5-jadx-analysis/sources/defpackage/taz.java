package defpackage;

/* loaded from: classes3.dex */
public final class taz extends abnv implements abox {
    public static final taz a;
    public int b;
    public long e;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        taz tazVar = new taz();
        a = tazVar;
        abnv.P(taz.class, tazVar);
    }

    private taz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new taz();
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
        return abnv.L(taz.class);
    }
}
