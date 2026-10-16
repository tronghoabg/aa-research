package defpackage;

/* loaded from: classes3.dex */
public final class accf extends abnv implements abox {
    public static final accf a;

    static {
        accf accfVar = new accf();
        a = accfVar;
        abnv.P(accf.class, accfVar);
    }

    private accf() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new accf();
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
        return abnv.L(accf.class);
    }
}
