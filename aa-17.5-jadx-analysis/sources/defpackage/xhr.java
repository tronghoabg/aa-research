package defpackage;

/* loaded from: classes3.dex */
public final class xhr extends abnv implements abox {
    public static final xhr a;
    public boolean c;
    private int d;
    private byte e = 2;
    public int b = 1;

    static {
        xhr xhrVar = new xhr();
        a = xhrVar;
        abnv.P(xhr.class, xhrVar);
    }

    private xhr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔇ\u0001", new Object[]{"d", "b", xln.b, "c"});
        }
        if (i2 == 3) {
            return new xhr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xhr.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
