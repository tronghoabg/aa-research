package defpackage;

/* loaded from: classes3.dex */
public final class aald extends abnv implements abox {
    public static final aald a;
    private int b;
    private abkz c;
    private byte d = 2;

    static {
        aald aaldVar = new aald();
        a = aaldVar;
        abnv.P(aald.class, aaldVar);
    }

    private aald() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aald();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aald.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
