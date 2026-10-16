package defpackage;

/* loaded from: classes3.dex */
public final class abxc extends abnv<abxc, abxb> implements abox {
    public static final abxc a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        abxc abxcVar = new abxc();
        a = abxcVar;
        abnv.P(abxc.class, abxcVar);
    }

    private abxc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abxc();
        }
        if (i2 == 4) {
            return new abxb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abxc.class);
    }
}
