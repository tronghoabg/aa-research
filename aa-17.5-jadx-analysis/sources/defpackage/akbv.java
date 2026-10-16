package defpackage;

/* loaded from: classes2.dex */
public final class akbv extends abnv implements abox {
    public static final akbv a;
    private static volatile abpc c;
    public abot b = abot.a;

    static {
        akbv akbvVar = new akbv();
        a = akbvVar;
        abnv.P(akbv.class, akbvVar);
    }

    private akbv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        abpc abnqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", akbu.a});
        }
        if (i2 == 3) {
            return new akbv();
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
        abpc abpcVar = c;
        if (abpcVar != null) {
            return abpcVar;
        }
        synchronized (akbv.class) {
            abnqVar = c;
            if (abnqVar == null) {
                abnqVar = new abnq(a);
                c = abnqVar;
            }
        }
        return abnqVar;
    }
}
