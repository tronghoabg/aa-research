package defpackage;

/* loaded from: classes3.dex */
public final class abfh extends abnv implements abox {
    public static final abfh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;

    static {
        abfh abfhVar = new abfh();
        a = abfhVar;
        abnv.P(abfh.class, abfhVar);
    }

    private abfh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဆ\u0000\u0002င\u0001\u0003ဆ\u0002\u0004င\u0005\u0005ဇ\u0006\u0006ခ\u0007\u0007ခ\b\tခ\n\nခ\u000b\u000bဆ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "f"});
        }
        if (i2 == 3) {
            return new abfh();
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
        return abnv.L(abfh.class);
    }
}
