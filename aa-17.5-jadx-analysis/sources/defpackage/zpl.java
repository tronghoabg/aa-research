package defpackage;

/* loaded from: classes3.dex */
public final class zpl extends abnv implements abox {
    public static final zpl a;
    private int b;
    private zpr c;
    private zps d;
    private zpq e;
    private zpu f;
    private byte g = 2;

    static {
        zpl zplVar = new zpl();
        a = zplVar;
        abnv.P(zpl.class, zplVar);
    }

    private zpl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0005\u000f\u0004\u0000\u0000\u0004\u0005ᐉ\u0005\nᐉ\f\u000eᐉ\u0007\u000fᐉ\u000b", new Object[]{"b", "c", "f", "d", "e"});
        }
        if (i2 == 3) {
            return new zpl();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zpl.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
