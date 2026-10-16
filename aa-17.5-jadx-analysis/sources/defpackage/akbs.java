package defpackage;

/* loaded from: classes2.dex */
public final class akbs extends abnv implements abox {
    public static final akbs a;
    private static volatile abpc h;
    public int b;
    public Object d;
    public boolean g;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        akbs akbsVar = new akbs();
        a = akbsVar;
        abnv.P(akbs.class, akbsVar);
    }

    private akbs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        abpc abnqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new akbs();
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
        abpc abpcVar = h;
        if (abpcVar != null) {
            return abpcVar;
        }
        synchronized (akbs.class) {
            abnqVar = h;
            if (abnqVar == null) {
                abnqVar = new abnq(a);
                h = abnqVar;
            }
        }
        return abnqVar;
    }
}
