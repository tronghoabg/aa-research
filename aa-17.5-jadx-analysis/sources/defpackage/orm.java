package defpackage;

/* loaded from: classes2.dex */
public final class orm extends abnv implements abox {
    public static final orm a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        orm ormVar = new orm();
        a = ormVar;
        abnv.P(orm.class, ormVar);
    }

    private orm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new orm();
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
        return abnv.L(orm.class);
    }
}
