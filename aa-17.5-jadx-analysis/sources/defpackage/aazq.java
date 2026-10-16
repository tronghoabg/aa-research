package defpackage;

/* loaded from: classes3.dex */
public final class aazq extends abnv implements abox {
    public static final aazq a;
    public int b;
    public int e;
    public boolean f;
    public zkl g;
    private byte h = 2;
    public String c = "";
    public aboh d = abpf.b;

    static {
        aazq aazqVar = new aazq();
        a = aazqVar;
        abnv.P(aazq.class, aazqVar);
    }

    private aazq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", aazs.class, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aazq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aazq.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
