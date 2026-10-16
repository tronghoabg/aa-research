package defpackage;

/* loaded from: classes3.dex */
public final class aarp extends abnv implements abox {
    public static final aarp a;

    static {
        aarp aarpVar = new aarp();
        a = aarpVar;
        abnv.P(aarp.class, aarpVar);
    }

    private aarp() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aarp();
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
        return abnv.L(aarp.class);
    }
}
