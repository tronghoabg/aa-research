package defpackage;

/* loaded from: classes3.dex */
public final class acio extends abnv implements abox {
    public static final acio a;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        acio acioVar = new acio();
        a = acioVar;
        abnv.P(acio.class, acioVar);
    }

    private acio() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u00016>\u0003\u0000\u0000\u00026ᔄ\u00007ᔄ\u0001>᠌\u0002", new Object[]{"b", "c", "d", "e", achi.k});
        }
        if (i2 == 3) {
            return new acio();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acio.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
