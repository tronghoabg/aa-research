package defpackage;

/* loaded from: classes3.dex */
public final class xit extends abnv implements abox {
    public static final xit a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        xit xitVar = new xit();
        a = xitVar;
        abnv.P(xit.class, xitVar);
    }

    private xit() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xit();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xit.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
