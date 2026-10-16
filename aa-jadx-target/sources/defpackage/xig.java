package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xig extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xig a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        defpackage.xig xigVar = new defpackage.xig();
        a = xigVar;
        defpackage.abox.P(defpackage.xig.class, xigVar);
    }

    private xig() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.xig();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xig.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
