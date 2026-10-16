package defpackage;

/* loaded from: classes3.dex */
public final class aatz extends abnv implements abox {
    public static final aatz a;

    static {
        aatz aatzVar = new aatz();
        a = aatzVar;
        abnv.P(aatz.class, aatzVar);
    }

    private aatz() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aatz();
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
        return abnv.L(aatz.class);
    }
}
