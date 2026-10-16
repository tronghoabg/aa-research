package defpackage;

/* loaded from: classes3.dex */
public final class zcd extends abnv implements abox {
    public static final zcd a;
    public int b;
    public int c;
    private int d;
    private zcc e;
    private yvl f;
    private yvm g;
    private yvh h;
    private zag i;
    private zbv j;
    private ywe k;
    private byte l = 2;

    static {
        zcd zcdVar = new zcd();
        a = zcdVar;
        abnv.P(zcd.class, zcdVar);
    }

    private zcd() {
        abms abmsVar = abms.d;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0003\u0001X\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u001eᐉ\u001a9ᐉ\u001b<ᐉ;>ᐉ=OᐉHXဉP", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new zcd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zcd.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
