package defpackage;

/* loaded from: classes3.dex */
public final class zqk extends abnv implements abox {
    public static final zqk a;
    public long b;
    private int c;

    static {
        zqk zqkVar = new zqk();
        a = zqkVar;
        abnv.P(zqk.class, zqkVar);
    }

    private zqk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new zqk();
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
        return abnv.L(zqk.class);
    }
}
