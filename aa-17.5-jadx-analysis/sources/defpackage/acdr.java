package defpackage;

/* loaded from: classes3.dex */
public final class acdr extends abnv implements abox {
    public static final acdr a;
    public int b;
    public float c;
    public float d;

    static {
        acdr acdrVar = new acdr();
        a = acdrVar;
        abnv.P(acdr.class, acdrVar);
    }

    private acdr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acdr();
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
        return abnv.L(acdr.class);
    }
}
