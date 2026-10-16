package defpackage;

/* loaded from: classes.dex */
public final class jbu extends abnv implements abox {
    public static final jbu a;
    public int b;
    public boolean c;
    public boolean d;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public long e = 5000;
    public long f = 5000;
    public long g = 250;
    public long h = 250;
    public boolean o = true;

    static {
        jbu jbuVar = new jbu();
        a = jbuVar;
        abnv.P(jbu.class, jbuVar);
    }

    private jbu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\r\u0000\u0001\u0002$\r\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0004\bဂ\u0005\rဂ\u0006\u000eဂ\u0007 ဇ\b!ဇ\t\"င\n#င\u000b$ဇ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new jbu();
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
        return abnv.L(jbu.class);
    }
}
