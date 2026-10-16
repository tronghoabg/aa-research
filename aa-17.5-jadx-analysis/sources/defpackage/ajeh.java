package defpackage;

/* loaded from: classes2.dex */
public final class ajeh extends abnv implements abox {
    public static final ajeh a;
    public int b;
    public Object d;
    public boolean f;
    public int c = 0;
    public String e = "";

    static {
        ajeh ajehVar = new ajeh();
        a = ajehVar;
        abnv.P(ajeh.class, ajehVar);
    }

    private ajeh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002=\u0000\u0005=\u0000\u0006ဇ\u0003", new Object[]{"d", "c", "b", "e", "f"});
        }
        if (i2 == 3) {
            return new ajeh();
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
        return abnv.L(ajeh.class);
    }
}
