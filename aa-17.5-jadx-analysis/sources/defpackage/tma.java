package defpackage;

/* loaded from: classes3.dex */
public final class tma extends abnv implements abox {
    public static final tma a;
    public int b;
    public String c = "";
    public String d = "";
    public abms e;
    public String f;
    public int g;
    public String h;
    public abms i;
    public int j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public tlz o;
    public tlz p;
    public tlz q;

    static {
        tma tmaVar = new tma();
        a = tmaVar;
        abnv.P(tma.class, tmaVar);
    }

    private tma() {
        abms abmsVar = abms.d;
        this.e = abmsVar;
        this.f = "";
        this.h = "";
        this.i = abmsVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003\n\u0004Ȉ\u0005\f\u0006ለ\u0001\u0007ည\u0002\bင\u0003\tဂ\u0004\nဇ\u0005\u000bဇ\u0006\fဇ\u0007\rဉ\b\u000eဉ\t\u000fဉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        }
        if (i2 == 3) {
            return new tma();
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
        return abnv.L(tma.class);
    }
}
