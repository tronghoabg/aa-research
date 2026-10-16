package defpackage;

/* loaded from: classes2.dex */
public final class ork extends abnv implements abox {
    public static final ork a;
    public int b;
    public boolean d;
    public long e;
    public int h;
    public absj i;
    public abot f = abot.a;
    public aboh c = abpf.b;
    public String g = "";

    static {
        ork orkVar = new ork();
        a = orkVar;
        abnv.P(ork.class, orkVar);
    }

    private ork() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဂ\u0001\u00042\u0005ဈ\u0002\u0006᠌\u0003\u0007ဉ\u0004", new Object[]{"b", "c", ori.class, "d", "e", "f", new lds(abqd.INT32, 0, abqd.STRING, ""), "g", "h", orj.a, "i"});
        }
        if (i2 == 3) {
            return new ork();
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
        return abnv.L(ork.class);
    }
}
