package defpackage;

/* loaded from: classes3.dex */
public final class ablh extends abnv implements abox {
    public static final ablh a;

    static {
        ablh ablhVar = new ablh();
        a = ablhVar;
        abnv.P(ablh.class, ablhVar);
    }

    private ablh() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ablh();
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
        return abnv.L(ablh.class);
    }
}
