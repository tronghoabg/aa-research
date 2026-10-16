package defpackage;

/* loaded from: classes3.dex */
public final class abel extends abnv implements abox {
    public static final abel a;
    private int b;
    private abbl c;
    private byte d = 2;

    static {
        abel abelVar = new abel();
        a = abelVar;
        abnv.P(abel.class, abelVar);
    }

    private abel() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001ϨϨ\u0001\u0000\u0000\u0001Ϩᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abel();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abel.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
