package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xne extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xne a;
    public int b;
    public int d;
    private byte e = 2;
    public defpackage.abpj c = defpackage.abqh.b;

    static {
        defpackage.xne xneVar = new defpackage.xne();
        a = xneVar;
        defpackage.abox.P(defpackage.xne.class, xneVar);
    }

    private xne() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new java.lang.Object[]{"b", "c", defpackage.xnc.class, "d"});
        }
        if (i2 == 3) {
            return new defpackage.xne();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xne.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
