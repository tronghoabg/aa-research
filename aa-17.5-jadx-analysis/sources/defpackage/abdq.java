package defpackage;

/* loaded from: classes3.dex */
public final class abdq extends abnv implements abox {
    public static final abdq a;
    private byte d = 2;
    public abod b = abnw.a;
    public aboh c = abpf.b;

    static {
        abdq abdqVar = new abdq();
        a = abdqVar;
        abnv.P(abdq.class, abdqVar);
    }

    private abdq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001ࠞ\u0002Л", new Object[]{"b", abce.t, "c", abcf.class});
        }
        if (i2 == 3) {
            return new abdq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abdq.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
