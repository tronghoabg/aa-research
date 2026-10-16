package defpackage;

/* loaded from: classes2.dex */
public final class ajfn extends abnv implements abox {
    public static final ajfn a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public ajfm k;
    public ajfm l;
    public abot m = abot.a;

    static {
        ajfn ajfnVar = new ajfn();
        a = ajfnVar;
        abnv.P(ajfn.class, ajfnVar);
    }

    private ajfn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000b\u0000\u0001\u0003\u0010\u000b\u0001\u0000\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102", new Object[]{"b", "e", "f", "g", "h", "i", "j", "k", "l", "c", "d", "m", new lds(abqd.INT32, 0, abqd.INT64, 0L)});
        }
        if (i2 == 3) {
            return new ajfn();
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
        return abnv.L(ajfn.class);
    }
}
