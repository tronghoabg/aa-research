package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xll extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xll a;
    public int b;
    public defpackage.aboh c;
    public boolean d;
    public defpackage.aboh e;
    public defpackage.aboh f;
    public defpackage.aboh g;
    public defpackage.aboh h;
    public int i;
    public defpackage.aboh j;
    public boolean k;
    public defpackage.aboh l;
    public boolean m;
    public defpackage.aboh n;
    public defpackage.aboh o;

    static {
        defpackage.xll xllVar = new defpackage.xll();
        a = xllVar;
        defpackage.abox.P(defpackage.xll.class, xllVar);
    }

    private xll() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဋ\u0006\bဉ\u0007\tဇ\b\nဉ\t\u000bဇ\n\fဉ\u000b\rဉ\f", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new defpackage.xll();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.abox.L(defpackage.xll.class);
    }
}
