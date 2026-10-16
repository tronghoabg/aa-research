package defpackage;

/* loaded from: classes.dex */
public final class ywh extends abnv implements abox {
    public static final ywh a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public long g;

    static {
        ywh ywhVar = new ywh();
        a = ywhVar;
        abnv.P(ywh.class, ywhVar);
    }

    private ywh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ywh();
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
        return abnv.L(ywh.class);
    }
}
