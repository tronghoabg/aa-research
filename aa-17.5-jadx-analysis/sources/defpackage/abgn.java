package defpackage;

/* loaded from: classes3.dex */
public final class abgn extends abnv implements abox {
    public static final abgn a;
    public abgj b;
    private int d;
    private abgj e;
    private abgj f;
    private abgj g;
    private abgj h;
    private byte i = 2;
    public aboh c = abpf.b;

    static {
        abgn abgnVar = new abgn();
        a = abgnVar;
        abnv.P(abgn.class, abgnVar);
    }

    private abgn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\n\f\u0002\u0000\u0001\u0002\nᐉ\u0003\fЛ", new Object[]{"d", "b", "c", abgk.class});
        }
        if (i2 == 3) {
            return new abgn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgn.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
