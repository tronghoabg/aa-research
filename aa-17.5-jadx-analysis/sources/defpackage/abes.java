package defpackage;

/* loaded from: classes3.dex */
public final class abes extends abnv implements abox {
    public static final abes a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int g;
    public int i;
    public int j;
    public abbn k;
    public abbn l;
    public abod f = abnw.a;
    public String h = "";

    static {
        abes abesVar = new abes();
        a = abesVar;
        abnv.P(abes.class, abesVar);
    }

    private abes() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001ဆ\u0000\u0002င\u0003\u0003\u0016\u0004ဈ\u0007\bဏ\u0006\nဉ\u000b\u000bဉ\f\fင\t\u000eင\n\u000fဆ\u0002", new Object[]{"b", "c", "e", "f", "h", "g", "k", "l", "i", "j", "d"});
        }
        if (i2 == 3) {
            return new abes();
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
        return abnv.L(abes.class);
    }
}
