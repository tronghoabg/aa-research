package defpackage;

/* loaded from: classes3.dex */
public final class ablb extends abnv implements abox {
    public static final ablb a;
    private int b;
    private ablm c;
    private byte d = 2;

    static {
        ablb ablbVar = new ablb();
        a = ablbVar;
        abnv.P(ablb.class, ablbVar);
    }

    private ablb() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ablb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ablb.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
