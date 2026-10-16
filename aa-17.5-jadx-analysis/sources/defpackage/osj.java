package defpackage;

/* loaded from: classes2.dex */
public final class osj extends abnv implements abox {
    public static final osj a;
    public int b;
    public osd e;
    public osk f;
    public osk g;
    public ory h;
    public int j;
    public abpt k;
    public String c = "";
    public String d = "";
    public aboh i = abpf.b;

    static {
        osj osjVar = new osj();
        a = osjVar;
        abnv.P(osj.class, osjVar);
    }

    private osj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0005\u0005\u001b\u0006᠌\u0006\u0007ဉ\u0007\bဉ\u0003\tဉ\u0004", new Object[]{"b", "c", "d", "e", "h", "i", ose.class, "j", orj.h, "k", "f", "g"});
        }
        if (i2 == 3) {
            return new osj();
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
        return abnv.L(osj.class);
    }
}
