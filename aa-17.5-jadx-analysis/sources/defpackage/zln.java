package defpackage;

/* loaded from: classes3.dex */
public final class zln extends abnv implements abox {
    public static final zln a;
    private int b;
    private zpl c;
    private byte d = 2;

    static {
        zln zlnVar = new zln();
        a = zlnVar;
        abnv.P(zln.class, zlnVar);
    }

    private zln() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zln();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zln.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
