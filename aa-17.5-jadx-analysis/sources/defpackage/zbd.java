package defpackage;

/* loaded from: classes3.dex */
public final class zbd extends abnv implements abox {
    public static final zbd a;
    public int b;
    public int c;
    public zau e;
    private int f;
    private int g;
    private zaw h;
    private zbm i;
    private zbg j;
    private zbl k;
    private zas l;
    private zat m;
    private zba n;
    private byte o = 2;
    public aboh d = abpf.b;

    static {
        zbd zbdVar = new zbd();
        a = zbdVar;
        abnv.P(zbd.class, zbdVar);
    }

    private zbd() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\n\u0000\u0003\u0003U\n\u0000\u0001\u0007\u0003င\u0002\u0010ᐉ\r\u001bЛ\u001dᐉ\u0017\u001fဉ\t$ᐉ\b3ဉ%Oᐉ@RᐉAUᐉD", new Object[]{"b", "f", "g", "c", "i", "d", zbc.class, "j", "e", "h", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new zbd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbd.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
