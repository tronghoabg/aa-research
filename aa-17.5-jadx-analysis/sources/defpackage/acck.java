package defpackage;

/* loaded from: classes3.dex */
public final class acck extends abnv implements abox {
    public static final acck a;
    private int b;
    private acgf c;
    private acgc d;
    private aapz e;
    private aalq f;
    private aamo g;
    private aapr h;
    private acdo i;
    private acfu j;
    private aaku k;
    private aams l;
    private aams m;
    private aapc n;
    private byte o = 2;

    static {
        acck acckVar = new acck();
        a = acckVar;
        abnv.P(acck.class, acckVar);
    }

    private acck() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\f\u0000\u0001\u0003\u0012\f\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0007\tᐉ\t\nᐉ\n\fဉ\u000e\rᐉ\f\u000eᐉ\r\u000fᐉ\u0005\u0010ᐉ\u0006\u0012ᐉ\u000b", new Object[]{"b", "c", "d", "e", "h", "i", "j", "n", "l", "m", "f", "g", "k"});
        }
        if (i2 == 3) {
            return new acck();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acck.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
