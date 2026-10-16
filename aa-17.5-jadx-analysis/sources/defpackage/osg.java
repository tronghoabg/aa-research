package defpackage;

/* loaded from: classes2.dex */
public final class osg extends abnv implements abox {
    public static final osg a;
    public int b;
    public osc c;

    static {
        osg osgVar = new osg();
        a = osgVar;
        abnv.P(osg.class, osgVar);
    }

    private osg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new osg();
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
        return abnv.L(osg.class);
    }
}
