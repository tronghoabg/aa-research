package defpackage;

/* loaded from: classes3.dex */
public final class tqw extends abnv implements abox {
    public static final tqw a;
    public int b;
    public float c;
    public int d;

    static {
        tqw tqwVar = new tqw();
        a = tqwVar;
        abnv.P(tqw.class, tqwVar);
    }

    private tqw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", tap.c});
        }
        if (i2 == 3) {
            return new tqw();
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
        return abnv.L(tqw.class);
    }
}
