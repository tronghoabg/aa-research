package defpackage;

/* loaded from: classes3.dex */
public final class abry extends abnv implements abox {
    public static final abry a;
    public int b;
    public String c = "";
    public String d = "";
    public zpi e;
    public long f;
    public long g;

    static {
        abry abryVar = new abry();
        a = abryVar;
        abnv.P(abry.class, abryVar);
    }

    private abry() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဉ\u0004\u0007ဃ\u0005\bဃ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abry();
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
        return abnv.L(abry.class);
    }
}
