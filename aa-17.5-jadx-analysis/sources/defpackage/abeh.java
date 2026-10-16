package defpackage;

/* loaded from: classes3.dex */
public final class abeh extends abnv implements abox {
    public static final abeh a;
    public abod b;
    public abod c;
    public abod d;

    static {
        abeh abehVar = new abeh();
        a = abehVar;
        abnv.P(abeh.class, abehVar);
    }

    private abeh() {
        abnw abnwVar = abnw.a;
        this.b = abnwVar;
        this.c = abnwVar;
        this.d = abnwVar;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002'\u0003'", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abeh();
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
        return abnv.L(abeh.class);
    }
}
