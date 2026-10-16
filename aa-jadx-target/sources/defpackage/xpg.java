package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xpg extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpg a;
    public int b;
    private byte d = 2;
    public int c = 1;

    static {
        defpackage.xpg xpgVar = new defpackage.xpg();
        a = xpgVar;
        defpackage.abox.P(defpackage.xpg.class, xpgVar);
    }

    private xpg() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new java.lang.Object[]{"b", "c", defpackage.our.u});
        }
        if (i2 == 3) {
            return new defpackage.xpg();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xpg.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
