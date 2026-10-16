package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abed extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.abed a;
    public int b;
    public int c;
    private int d;
    private byte e = 2;

    static {
        defpackage.abed abedVar = new defpackage.abed();
        a = abedVar;
        defpackage.abox.P(defpackage.abed.class, abedVar);
    }

    private abed() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.abed();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.abed.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
