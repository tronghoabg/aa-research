package defpackage;

/* loaded from: classes3.dex */
public final class abbd extends abns implements abnt {
    public static final abbd a;
    public int b;
    public int c;
    public abde e;
    public abay f;
    public abct g;
    public abcw h;
    private abbv i;
    private byte j = 2;
    public int d = 1;

    static {
        abbd abbdVar = new abbd();
        a = abbdVar;
        abnv.P(abbd.class, abbdVar);
    }

    private abbd() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001\u0011\u0007\u0000\u0000\u0004\u0001᠌\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\fᐉ\t\u000f᠌\u0001\u0011ဉ\u000f", new Object[]{"b", "c", abce.m, "e", "f", "g", "i", "d", abce.g, "h"});
        }
        if (i2 == 3) {
            return new abbd();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abbd.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
