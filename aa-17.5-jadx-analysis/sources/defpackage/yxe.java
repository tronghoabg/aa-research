package defpackage;

/* loaded from: classes.dex */
public final class yxe extends abnv implements abox {
    public static final yxe a;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        yxe yxeVar = new yxe();
        a = yxeVar;
        abnv.P(yxe.class, yxeVar);
    }

    private yxe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new yxe();
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
        return abnv.L(yxe.class);
    }
}
