package defpackage;

/* loaded from: classes.dex */
public final class orl extends abnv implements abox {
    public static final orl a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    static {
        orl orlVar = new orl();
        a = orlVar;
        abnv.P(orl.class, orlVar);
    }

    private orl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\r\u0000\u0001\u0001\u000f\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\nဇ\u0007\u000bဇ\b\fဇ\t\rဇ\f\u000eဇ\n\u000fဇ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "o", "m", "n"});
        }
        if (i2 == 3) {
            return new orl();
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
        return abnv.L(orl.class);
    }
}
