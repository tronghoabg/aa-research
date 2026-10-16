package defpackage;

/* loaded from: classes3.dex */
public final class aatb extends abnv implements abox {
    public static final aatb a;

    static {
        aatb aatbVar = new aatb();
        a = aatbVar;
        abnv.P(aatb.class, aatbVar);
    }

    private aatb() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aatb();
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
        return abnv.L(aatb.class);
    }
}
