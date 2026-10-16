package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class xlh extends abnv implements abox {
    public static final xlh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private byte g = 2;

    static {
        xlh xlhVar = new xlh();
        a = xlhVar;
        abnv.P(xlh.class, xlhVar);
    }

    private xlh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003င\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", xku.g});
        }
        if (i2 == 3) {
            return new xlh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(xlh.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
