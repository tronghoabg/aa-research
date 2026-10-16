package defpackage;

/* loaded from: classes3.dex */
public final class abap extends abnv implements abox {
    public static final abap a;
    public aboh b = abpf.b;

    static {
        abap abapVar = new abap();
        a = abapVar;
        abnv.P(abap.class, abapVar);
    }

    private abap() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", abao.class});
        }
        if (i2 == 3) {
            return new abap();
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
        return abnv.L(abap.class);
    }
}
