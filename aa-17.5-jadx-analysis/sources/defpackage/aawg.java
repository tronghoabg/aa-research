package defpackage;

/* loaded from: classes3.dex */
public final class aawg extends abnv implements abox {
    public static final aawg a;

    static {
        aawg aawgVar = new aawg();
        a = aawgVar;
        abnv.P(aawg.class, aawgVar);
    }

    private aawg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aawg();
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
        return abnv.L(aawg.class);
    }
}
