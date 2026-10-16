package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xii extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xii a;
    public int b;
    private byte d = 2;
    public int c = 1;

    static {
        defpackage.xii xiiVar = new defpackage.xii();
        a = xiiVar;
        defpackage.abox.P(defpackage.xii.class, xiiVar);
    }

    private xii() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new java.lang.Object[]{"b", "c", defpackage.our.i});
        }
        if (i2 == 3) {
            return new defpackage.xii();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xii.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
