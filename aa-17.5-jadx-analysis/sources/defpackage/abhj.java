package defpackage;

/* loaded from: classes3.dex */
public final class abhj extends abns implements abnt {
    public static final abhj a;
    public int b;
    public abdl c;
    public int d;
    private byte f = 2;
    public int e = -1;

    static {
        abhj abhjVar = new abhj();
        a = abhjVar;
        abnv.P(abhj.class, abhjVar);
    }

    private abhj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0005᠌\u0001\u0006င\u0002", new Object[]{"b", "c", "d", abho.b, "e"});
        }
        if (i2 == 3) {
            return new abhj();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abhj.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
