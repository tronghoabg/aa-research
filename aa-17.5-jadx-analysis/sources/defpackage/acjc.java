package defpackage;

/* loaded from: classes3.dex */
public final class acjc extends abnv implements abox {
    public static final acjc a;
    public int b;
    public acja c;
    private acje d;
    private byte e = 2;

    static {
        acjc acjcVar = new acjc();
        a = acjcVar;
        abnv.P(acjc.class, acjcVar);
    }

    private acjc() {
        abms abmsVar = abms.d;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0002", new Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new acjc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acjc.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
