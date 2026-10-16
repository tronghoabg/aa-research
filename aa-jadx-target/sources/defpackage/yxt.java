package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yxt extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.yxt a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte h = 2;

    static {
        defpackage.yxt yxtVar = new defpackage.yxt();
        a = yxtVar;
        defpackage.abox.P(defpackage.yxt.class, yxtVar);
    }

    private yxt() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005င\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.yxt();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.yxt.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
