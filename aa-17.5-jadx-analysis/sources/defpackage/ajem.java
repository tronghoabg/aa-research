package defpackage;

/* loaded from: classes2.dex */
public final class ajem extends abnv implements abox {
    public static final ajem a;
    public int b;
    public ajel c;
    private byte d = 2;

    static {
        ajem ajemVar = new ajem();
        a = ajemVar;
        abnv.P(ajem.class, ajemVar);
    }

    private ajem() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ajem();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajem.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
