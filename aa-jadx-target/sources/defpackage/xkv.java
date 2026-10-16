package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xkv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xkv a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    private byte k = 2;

    static {
        defpackage.xkv xkvVar = new defpackage.xkv();
        a = xkvVar;
        defpackage.abox.P(defpackage.xkv.class, xkvVar);
    }

    private xkv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new defpackage.xkv();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xkv.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
