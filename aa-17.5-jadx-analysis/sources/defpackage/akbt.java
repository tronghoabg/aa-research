package defpackage;

/* loaded from: classes2.dex */
public final class akbt extends abnv implements abox {
    public static final akbt a;
    private static volatile abpc c;
    public aboh b = abpf.b;

    static {
        akbt akbtVar = new akbt();
        a = akbtVar;
        abnv.P(akbt.class, akbtVar);
    }

    private akbt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        abpc abnqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"b", akbs.class});
        }
        if (i2 == 3) {
            return new akbt();
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
        synchronized (akbt.class) {
            abnqVar = c;
            if (abnqVar == null) {
                abnqVar = new abnq(a);
                c = abnqVar;
            }
        }
        return abnqVar;
    }
}
