package defpackage;

/* loaded from: classes3.dex */
public final class abse extends abnv implements abox {
    public static final abse a;

    static {
        abse abseVar = new abse();
        a = abseVar;
        abnv.P(abse.class, abseVar);
    }

    private abse() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new abse();
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
        return abnv.L(abse.class);
    }
}
