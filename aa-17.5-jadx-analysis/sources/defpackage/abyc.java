package defpackage;

/* loaded from: classes3.dex */
public final class abyc extends abnv implements abox {
    public static final abyc a;
    public int b;
    public int c;
    public String d = "";

    static {
        abyc abycVar = new abyc();
        a = abycVar;
        abnv.P(abyc.class, abycVar);
    }

    private abyc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abyc();
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
        return abnv.L(abyc.class);
    }
}
