package defpackage;

/* loaded from: classes3.dex */
public final class abxf extends abnv<abxf, abxe> implements abox {
    public static final abxf a;
    public int b;
    public String c = "";
    public aboh d = abpf.b;
    public String e = "";

    static {
        abxf abxfVar = new abxf();
        a = abxfVar;
        abnv.P(abxf.class, abxfVar);
    }

    private abxf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0000\u0003\u001b\u0004ဈ\u0001", new Object[]{"b", "c", "d", abxd.class, "e"});
        }
        if (i2 == 3) {
            return new abxf();
        }
        if (i2 == 4) {
            return new abxe();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abxf.class);
    }
}
