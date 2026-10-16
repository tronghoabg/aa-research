package defpackage;

/* loaded from: classes3.dex */
public final class abfy extends abnv implements abox {
    public static final abfy a;
    public abod b = abnw.a;
    public aboh c = abpf.b;

    static {
        abfy abfyVar = new abfy();
        a = abfyVar;
        abnv.P(abfy.class, abfyVar);
    }

    private abfy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001+\u0002\u001b", new Object[]{"b", "c", abfx.class});
        }
        if (i2 == 3) {
            return new abfy();
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
        return abnv.L(abfy.class);
    }
}
