package defpackage;

/* loaded from: classes3.dex */
public final class abch extends abnv implements abox {
    public static final abch a;
    public int b;
    public int c;
    public abci d;
    public abav e;
    public abcg f;
    public abas h;
    private byte i = 2;
    public aboh g = abpf.b;

    static {
        abch abchVar = new abch();
        a = abchVar;
        abnv.P(abch.class, abchVar);
    }

    private abch() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001င\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", abbo.class, "h"});
        }
        if (i2 == 3) {
            return new abch();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abch.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
