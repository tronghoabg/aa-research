package defpackage;

/* loaded from: classes.dex */
public final class xkk extends abnv implements abox {
    public static final xkk a;
    public int b;
    public abnf c;
    public boolean d;
    public abnf e;
    public abnf f;
    public abnf g;
    public abnf h;
    public int i;
    public abnf j;
    public boolean k;
    public abnf l;
    public boolean m;
    public abnf n;
    public abnf o;

    static {
        xkk xkkVar = new xkk();
        a = xkkVar;
        abnv.P(xkk.class, xkkVar);
    }

    private xkk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဋ\u0006\bဉ\u0007\tဇ\b\nဉ\t\u000bဇ\n\fဉ\u000b\rဉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new xkk();
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
        return abnv.L(xkk.class);
    }
}
