package defpackage;

/* loaded from: classes3.dex */
public final class aber extends abns implements abnt {
    public static final aber a;
    public int c;
    public abod d;
    public abod e;
    private int f;
    private byte g = 2;
    public abms b = abms.d;

    static {
        aber aberVar = new aber();
        a = aberVar;
        abnv.P(aber.class, aberVar);
    }

    private aber() {
        abnw abnwVar = abnw.a;
        this.d = abnwVar;
        this.e = abnwVar;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001ည\u0000\u0003'\u0005'\u0006င\u0001", new Object[]{"f", "b", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new aber();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aber.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
