package defpackage;

/* loaded from: classes3.dex */
public final class vop extends abnv implements abox {
    public static final vop a;
    public int b;
    public abpt d;
    public int e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        vop vopVar = new vop();
        a = vopVar;
        abnv.P(vop.class, vopVar);
    }

    private vop() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", ajgw.class, "d", "e", tap.h});
        }
        if (i2 == 3) {
            return new vop();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(vop.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
