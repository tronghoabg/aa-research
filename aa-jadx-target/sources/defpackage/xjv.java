package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xjv extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xjv a;
    public int c;
    private int e;
    private byte f = 2;
    public int b = 1;
    public defpackage.abpf d = defpackage.aboy.a;

    static {
        defpackage.xjv xjvVar = new defpackage.xjv();
        a = xjvVar;
        defpackage.abox.P(defpackage.xjv.class, xjvVar);
    }

    private xjv() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᴌ\u0000\u0002ဋ\u0001\u0003\u001d", new java.lang.Object[]{"e", "b", defpackage.our.m, "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.xjv();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xjv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
