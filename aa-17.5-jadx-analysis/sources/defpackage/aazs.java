package defpackage;

/* loaded from: classes3.dex */
public final class aazs extends abnv implements abox {
    public static final aazs a;
    public int b;
    public int g;
    public int h;
    public zkm i;
    private byte j = 2;
    public String c = "";
    public aboh d = abpf.b;
    public String e = "";
    public String f = "";

    static {
        aazs aazsVar = new aazs();
        a = aazsVar;
        abnv.P(aazs.class, aazsVar);
    }

    private aazs() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဏ\u0003\u0007ᐉ\u0005\bဏ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new aazs();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aazs.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
