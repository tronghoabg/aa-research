package defpackage;

/* loaded from: classes2.dex */
public final class ajgt extends abnv implements abox {
    public static final ajgt a;

    static {
        ajgt ajgtVar = new ajgt();
        a = ajgtVar;
        abnv.P(ajgt.class, ajgtVar);
    }

    private ajgt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new ajgt();
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
        return abnv.L(ajgt.class);
    }
}
