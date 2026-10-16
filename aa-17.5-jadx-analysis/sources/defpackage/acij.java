package defpackage;

/* loaded from: classes3.dex */
public final class acij extends abnv implements abox {
    public static final acij a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        acij acijVar = new acij();
        a = acijVar;
        abnv.P(acij.class, acijVar);
    }

    private acij() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u00129\u0003\u0000\u0000\u0000\u0012ဇ\u00008ဇ\u00019ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acij();
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
        return abnv.L(acij.class);
    }
}
