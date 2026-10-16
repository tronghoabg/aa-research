package defpackage;

/* loaded from: classes3.dex */
public final class abdo extends abnv implements abox {
    public static final abdo a;
    public int b;
    public int c = 0;
    public Object d;
    public float e;
    public float f;

    static {
        abdo abdoVar = new abdo();
        a = abdoVar;
        abnv.P(abdo.class, abdoVar);
    }

    private abdo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u0003ခ\u0000\u0004ခ\u0001", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new abdo();
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
        return abnv.L(abdo.class);
    }
}
