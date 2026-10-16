package defpackage;

/* loaded from: classes.dex */
public final class yza extends abnv implements abox {
    public static final yza a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;

    static {
        yza yzaVar = new yza();
        a = yzaVar;
        abnv.P(yza.class, yzaVar);
    }

    private yza() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", ywl.h, "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new yza();
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
        return abnv.L(yza.class);
    }
}
