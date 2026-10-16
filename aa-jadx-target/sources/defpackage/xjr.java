package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjr extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjr a;
    public int b;
    public int c;
    public int d;
    private byte e = 2;

    static {
        defpackage.xjr xjrVar = new defpackage.xjr();
        a = xjrVar;
        defpackage.abox.P(defpackage.xjr.class, xjrVar);
    }

    private xjr() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔏ\u0000\u0002ᔄ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.xjr();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xjr.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
