package defpackage;

/* loaded from: classes3.dex */
public final class aahz extends abnv implements abox {
    public static final aahz a;
    public int b;

    static {
        aahz aahzVar = new aahz();
        a = aahzVar;
        abnv.P(aahz.class, aahzVar);
    }

    private aahz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new aahz();
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
        return abnv.L(aahz.class);
    }
}
