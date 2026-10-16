package defpackage;

/* loaded from: classes3.dex */
public final class aanx extends abns implements abnt {
    public static final aanx a;
    private int b;
    private abkz c;
    private aapc d;
    private byte e = 2;

    static {
        aanx aanxVar = new aanx();
        a = aanxVar;
        abnv.P(aanx.class, aanxVar);
    }

    private aanx() {
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
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0007ဉ\n", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aanx();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aanx.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
