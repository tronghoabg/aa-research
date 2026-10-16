package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xir extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xir a;
    public int b;
    private byte e = 2;
    public java.lang.String c = "";
    public int d = -1;

    static {
        defpackage.xir xirVar = new defpackage.xir();
        a = xirVar;
        defpackage.abox.P(defpackage.xir.class, xirVar);
    }

    private xir() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᴌ\u0001", new java.lang.Object[]{"b", "c", "d", defpackage.our.l});
        }
        if (i2 == 3) {
            return new defpackage.xir();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xir.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
