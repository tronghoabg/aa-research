package defpackage;

/* loaded from: classes.dex */
public final class ywo extends abnv implements abox {
    public static final ywo a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte h = 2;

    static {
        ywo ywoVar = new ywo();
        a = ywoVar;
        abnv.P(ywo.class, ywoVar);
    }

    private ywo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ywo();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ywo.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
