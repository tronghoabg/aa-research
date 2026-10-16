package defpackage;

/* loaded from: classes3.dex */
public final class zbp extends abnv implements abox {
    public static final zbp a;
    public int b;
    public zbq c;
    public long d;
    private byte e = 2;

    static {
        zbp zbpVar = new zbp();
        a = zbpVar;
        abnv.P(zbp.class, zbpVar);
    }

    private zbp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zbp();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbp.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
