package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xpi extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpi a;
    public int b;
    public int c;
    public int d;
    public int e;
    public defpackage.xll f;
    private byte g = 2;

    static {
        defpackage.xpi xpiVar = new defpackage.xpi();
        a = xpiVar;
        defpackage.abox.P(defpackage.xpi.class, xpiVar);
    }

    private xpi() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔋ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new java.lang.Object[]{"b", "c", "d", "e", defpackage.our.r, "f"});
        }
        if (i2 == 3) {
            return new defpackage.xpi();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xpi.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
