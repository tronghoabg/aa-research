package defpackage;

/* loaded from: classes3.dex */
public final class zqb extends abnv implements abox {
    public static final zqb a;
    private int b;
    private zjm c;
    private byte d = 2;

    static {
        zqb zqbVar = new zqb();
        a = zqbVar;
        abnv.P(zqb.class, zqbVar);
    }

    private zqb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zqb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zqb.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
