package defpackage;

/* loaded from: classes3.dex */
public final class zju extends abnv implements abox {
    public static final zju a;
    private int b;
    private zjx c;
    private byte d = 2;

    static {
        zju zjuVar = new zju();
        a = zjuVar;
        abnv.P(zju.class, zjuVar);
    }

    private zju() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zju();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zju.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
