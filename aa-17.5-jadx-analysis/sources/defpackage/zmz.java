package defpackage;

/* loaded from: classes3.dex */
public final class zmz extends abnv implements abox {
    public static final zmz a;
    private int b;
    private zbo c;
    private zbo d;
    private byte e = 2;

    static {
        zmz zmzVar = new zmz();
        a = zmzVar;
        abnv.P(zmz.class, zmzVar);
    }

    private zmz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\n\u000b\u0002\u0000\u0000\u0002\nᐉ\u0000\u000bᐉ\u0003", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zmz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
