package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xiu extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abpg a = new defpackage.xit(0);
    public static final defpackage.xiu b;
    private int e;
    private byte f = 2;
    public java.lang.String c = "";
    public defpackage.abpf d = defpackage.aboy.a;

    static {
        defpackage.xiu xiuVar = new defpackage.xiu();
        b = xiuVar;
        defpackage.abox.P(defpackage.xiu.class, xiuVar);
    }

    private xiu() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002ࠬ", new java.lang.Object[]{"e", "c", "d", defpackage.our.l});
        }
        if (i2 == 3) {
            return new defpackage.xiu();
        }
        if (i2 == 4) {
            return new defpackage.abor(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xiu.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
