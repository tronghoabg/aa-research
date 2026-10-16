package defpackage;

/* loaded from: classes3.dex */
public final class abij extends abnv implements abox {
    public static final abij a;
    public int b;
    public float c;
    public int d;
    public int e;

    static {
        abij abijVar = new abij();
        a = abijVar;
        abnv.P(abij.class, abijVar);
    }

    private abij() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဏ\u0001\u0003ဏ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abij();
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
        return abnv.L(abij.class);
    }
}
