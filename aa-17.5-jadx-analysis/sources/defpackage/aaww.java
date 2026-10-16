package defpackage;

/* loaded from: classes3.dex */
public final class aaww extends abnv implements abox {
    public static final aaww a;

    static {
        aaww aawwVar = new aaww();
        a = aawwVar;
        abnv.P(aaww.class, aawwVar);
    }

    private aaww() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aaww();
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
        return abnv.L(aaww.class);
    }
}
