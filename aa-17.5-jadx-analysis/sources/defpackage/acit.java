package defpackage;

/* loaded from: classes3.dex */
public final class acit extends abnv implements abox {
    public static final acit a;
    public int b;
    public int c;
    private int e;
    private byte f = 2;
    public abms d = abms.d;

    static {
        acit acitVar = new acit();
        a = acitVar;
        abnv.P(acit.class, acitVar);
    }

    private acit() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001EG\u0003\u0000\u0000\u0003Eᔄ\u0000Fᔄ\u0001Gᔊ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new acit();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acit.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
