package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajfx extends defpackage.abou implements defpackage.abov {
    public static final defpackage.ajfx a;
    private byte b = 2;

    static {
        defpackage.ajfx ajfxVar = new defpackage.ajfx();
        a = ajfxVar;
        defpackage.abox.P(defpackage.ajfx.class, ajfxVar);
    }

    private ajfx() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.ajfx();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.ajfx.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
