package defpackage;

/* loaded from: classes3.dex */
public final class abuj extends abnv implements abox {
    public static final abuj a;
    private int b;
    private abui c;
    private byte d = 2;

    static {
        abuj abujVar = new abuj();
        a = abujVar;
        abnv.P(abuj.class, abujVar);
    }

    private abuj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0001\u0019ᐉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abuj();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abuj.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
