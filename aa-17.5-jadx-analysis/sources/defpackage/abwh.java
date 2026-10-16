package defpackage;

/* loaded from: classes3.dex */
public final class abwh extends abnv implements abox {
    public static final abwh a;
    public int b;
    public abwc c;
    public abvq d;
    public String e = "";
    public abod f = abnw.a;
    public String g = "";

    static {
        abwh abwhVar = new abwh();
        a = abwhVar;
        abnv.P(abwh.class, abwhVar);
    }

    private abwh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004,\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abwh();
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
        return abnv.L(abwh.class);
    }
}
