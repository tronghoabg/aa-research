package defpackage;

/* loaded from: classes3.dex */
public final class zod extends abnv implements abox {
    public static final zod a;
    public boolean f;
    private int g;
    private byte h = 2;
    public String b = "";
    public String c = "";
    public aboh d = abpf.b;
    public String e = "";

    static {
        zod zodVar = new zod();
        a = zodVar;
        abnv.P(zod.class, zodVar);
    }

    private zod() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003\u001a\u0004ဈ\u0002\u0006ဇ\u0003", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zod();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zod.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
