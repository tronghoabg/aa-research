package defpackage;

/* loaded from: classes.dex */
public final class oum extends abnv implements abox {
    public static final oum a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        oum oumVar = new oum();
        a = oumVar;
        abnv.P(oum.class, oumVar);
    }

    private oum() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abob abobVar = otu.f;
            Object[] objArr = {"b", "c", "d", "f", "e", "g", abobVar, "h", abobVar, "i", abobVar, "j", "k", "l", "m", "n", abobVar};
            abob abobVar2 = otu.e;
            return new abpg(a, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0002\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007\tဏ\b\nင\t\u000bင\n\f᠌\u000b", objArr);
        }
        if (i2 == 3) {
            return new oum();
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
        return abnv.L(oum.class);
    }
}
