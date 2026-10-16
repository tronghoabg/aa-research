package defpackage;

/* loaded from: classes3.dex */
public final class zac extends abnv implements abox {
    public static final zac a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        zac zacVar = new zac();
        a = zacVar;
        abnv.P(zac.class, zacVar);
    }

    private zac() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new zac();
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
        return abnv.L(zac.class);
    }
}
