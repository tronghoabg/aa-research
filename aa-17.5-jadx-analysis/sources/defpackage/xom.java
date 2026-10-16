package defpackage;

/* loaded from: classes3.dex */
public final class xom extends abnv implements abox {
    public static final xom a;
    public int b;
    public int d;
    public int e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        xom xomVar = new xom();
        a = xomVar;
        abnv.P(xom.class, xomVar);
    }

    private xom() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000\u0003᠌\u0001", new Object[]{"b", "c", xol.class, "d", "e", xku.m});
        }
        if (i2 == 3) {
            return new xom();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xom.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
