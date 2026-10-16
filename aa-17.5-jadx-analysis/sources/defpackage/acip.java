package defpackage;

/* loaded from: classes3.dex */
public final class acip extends abnv implements abox {
    public static final acip a;
    public int b;
    public int c;
    public int d;
    private byte f = 2;
    public int e = 1;

    static {
        acip acipVar = new acip();
        a = acipVar;
        abnv.P(acip.class, acipVar);
    }

    private acip() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001'<\u0003\u0000\u0000\u0002'ᔄ\u0000(ᔄ\u0001<᠌\u0002", new Object[]{"b", "c", "d", "e", achi.h});
        }
        if (i2 == 3) {
            return new acip();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acip.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
