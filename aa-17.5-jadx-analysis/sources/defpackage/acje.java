package defpackage;

/* loaded from: classes3.dex */
public final class acje extends abnv implements abox {
    public static final acje a;
    private int b;
    private int c;
    private int d;
    private int e;
    private abkk f;
    private int g;
    private byte h = 2;

    static {
        acje acjeVar = new acje();
        a = acjeVar;
        abnv.P(acje.class, acjeVar);
    }

    private acje() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u001b\u0005\u0000\u0000\u0005\u0001ᴌ\u0016\u0002ᔄ\u0000\u0003ᔄ\u0001\u0004ᔄ\u0002\u001bᐉ\u000f", new Object[]{"b", "g", achi.m, "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acje();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acje.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
