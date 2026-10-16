package defpackage;

/* loaded from: classes2.dex */
public final class oky extends abnv implements abox {
    public static final oky a;
    public int b;
    public int d;
    public long f;
    public int i;
    public boolean j;
    public String c = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String k = "";

    static {
        oky okyVar = new oky();
        a = okyVar;
        abnv.P(oky.class, okyVar);
    }

    private oky() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0001\u0002ဈ\u0002\u0003ဃ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0000\bဇ\u0007\tဈ\b", new Object[]{"b", "d", ywl.e, "e", "f", "g", "h", "i", ywl.c, "c", "j", "k"});
        }
        if (i2 == 3) {
            return new oky();
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
        return abnv.L(oky.class);
    }
}
