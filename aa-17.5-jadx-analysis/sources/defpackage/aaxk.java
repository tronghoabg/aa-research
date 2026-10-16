package defpackage;

/* loaded from: classes3.dex */
public final class aaxk extends abnv implements abox {
    public static final aaxk a;

    static {
        aaxk aaxkVar = new aaxk();
        a = aaxkVar;
        abnv.P(aaxk.class, aaxkVar);
    }

    private aaxk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new aaxk();
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
        return abnv.L(aaxk.class);
    }
}
