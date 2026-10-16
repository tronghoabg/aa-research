package defpackage;

/* loaded from: classes3.dex */
public final class abda extends abnv implements abox {
    public static final abda a;
    public int b;
    public int c;
    private int d;
    private byte e = 2;

    static {
        abda abdaVar = new abda();
        a = abdaVar;
        abnv.P(abda.class, abdaVar);
    }

    private abda() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new abda();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abda.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
