package defpackage;

/* loaded from: classes3.dex */
public final class abjs extends abnv implements abox {
    public static final abjs a;
    public int b = 0;
    public Object c;

    static {
        abjs abjsVar = new abjs();
        a = abjsVar;
        abnv.P(abjs.class, abjsVar);
    }

    private abjs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0001\u0000\u0001Ϩ\u0003\u0000\u0000\u0000\u00017\u0000\u0002:\u0000Ϩ=\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new abjs();
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
        return abnv.L(abjs.class);
    }
}
