package defpackage;

/* loaded from: classes2.dex */
public final class ajgc extends abnv implements abox {
    public static final ajgc a;
    public int b;
    public int e;
    public long f;
    public boolean h;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        ajgc ajgcVar = new ajgc();
        a = ajgcVar;
        abnv.P(ajgc.class, ajgcVar);
    }

    private ajgc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007ဈ\u0007\bဇ\u0006", new Object[]{"b", "c", "d", "e", xln.q, "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new ajgc();
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
        return abnv.L(ajgc.class);
    }
}
