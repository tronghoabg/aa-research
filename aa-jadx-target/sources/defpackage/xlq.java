package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xlq extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xlq a;
    public int b;
    public defpackage.xig d;
    private byte e = 2;
    public int c = 1;

    static {
        defpackage.xlq xlqVar = new defpackage.xlq();
        a = xlqVar;
        defpackage.abox.P(defpackage.xlq.class, xlqVar);
    }

    private xlq() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001", new java.lang.Object[]{"b", "c", defpackage.our.u, "d"});
        }
        if (i2 == 3) {
            return new defpackage.xlq();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xlq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
