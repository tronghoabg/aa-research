package defpackage;

/* loaded from: classes3.dex */
public final class abjt extends abnv implements abox {
    public static final abjt a;
    public abco b;
    public int d;
    private int e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        abjt abjtVar = new abjt();
        a = abjtVar;
        abnv.P(abjt.class, abjtVar);
    }

    private abjt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဏ\u0001", new Object[]{"e", "b", "c", abik.class, "d"});
        }
        if (i2 == 3) {
            return new abjt();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abjt.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
