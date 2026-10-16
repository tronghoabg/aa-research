package defpackage;

/* loaded from: classes3.dex */
public final class zjj extends abnv implements abox {
    public static final zjj a;
    private int b;
    private zjl c;
    private zjh d;
    private zji e;
    private byte f = 2;

    static {
        zjj zjjVar = new zjj();
        a = zjjVar;
        abnv.P(zjj.class, zjjVar);
    }

    private zjj() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0007\u000f\u0003\u0000\u0000\u0003\u0007ᐉ\u0005\u000eᐉ\u0001\u000fᐉ\f", new Object[]{"b", "d", "c", "e"});
        }
        if (i2 == 3) {
            return new zjj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjj.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
