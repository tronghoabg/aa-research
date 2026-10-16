package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xmp extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xmp a;
    public int b;
    public int c;
    public defpackage.xmn e;
    private byte f = 2;
    public int d = 1;

    static {
        defpackage.xmp xmpVar = new defpackage.xmp();
        a = xmpVar;
        defpackage.abox.P(defpackage.xmp.class, xmpVar);
    }

    private xmp() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᴌ\u0001\u0003ᐉ\u0002", new java.lang.Object[]{"b", "c", "d", defpackage.xmo.a, "e"});
        }
        if (i2 == 3) {
            return new defpackage.xmp();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xmp.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
