package defpackage;

/* loaded from: classes.dex */
public final class yxh extends abnv implements abox {
    public static final yxh a;
    public int b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int i;
    public int j;
    public String c = "";
    public String h = "";

    static {
        yxh yxhVar = new yxh();
        a = yxhVar;
        abnv.P(yxh.class, yxhVar);
    }

    private yxh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဋ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new yxh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(yxh.class);
    }
}
