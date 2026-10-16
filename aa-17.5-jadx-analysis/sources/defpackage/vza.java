package defpackage;

/* loaded from: classes3.dex */
public final class vza extends abnv implements abox {
    public static final vza a;
    public static final abnh j;
    public int b;
    public boolean d;
    public boolean h;
    public String c = "";
    public String e = "";
    public String f = "";
    public abod g = abnw.a;
    public aboh i = abpf.b;

    static {
        vza vzaVar = new vza();
        a = vzaVar;
        abnv.P(vza.class, vzaVar);
        j = abnv.W(vys.a, vzaVar, vzaVar, null, 334728578, abqd.MESSAGE);
    }

    private vza() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new vza();
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
        return abnv.L(vza.class);
    }
}
