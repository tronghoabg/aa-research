package defpackage;

/* loaded from: classes2.dex */
public final class osm extends abnv implements abox {
    public static final osm a;
    public int b;
    public int d;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        osm osmVar = new osm();
        a = osmVar;
        abnv.P(osm.class, osmVar);
    }

    private osm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", orj.j, "e", "f"});
        }
        if (i2 == 3) {
            return new osm();
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
        return abnv.L(osm.class);
    }
}
