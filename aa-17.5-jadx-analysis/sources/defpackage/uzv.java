package defpackage;

/* loaded from: classes3.dex */
public final class uzv extends abnv implements abox {
    public static final uzv a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h = "";
    public boolean i = true;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        uzv uzvVar = new uzv();
        a = uzvVar;
        abnv.P(uzv.class, uzvVar);
    }

    private uzv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000b\u0000\u0001\u0002\f\u000b\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0006\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\b\t᠌\t\nဇ\n\u000bဇ\u0007\fဈ\u0005", new Object[]{"b", "c", "d", "i", "e", "f", "g", "k", "l", tap.g, "m", "j", "h"});
        }
        if (i2 == 3) {
            return new uzv();
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
        return abnv.L(uzv.class);
    }
}
