package defpackage;

/* loaded from: classes3.dex */
public final class abgi extends abns implements abnt {
    public static final abgi a;
    public int b;
    public abgn c;
    public abfu d;
    public int e;
    public abgw f;
    private byte i = 2;
    public String g = "";
    public abod h = abnw.a;

    static {
        abgi abgiVar = new abgi();
        a = abgiVar;
        abnv.P(abgi.class, abgiVar);
    }

    private abgi() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဆ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new abgi();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgi.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
