package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xpn extends defpackage.abox implements defpackage.abpz {
    public static final defpackage.xpn a;
    public int b;
    public int d;
    public int e;
    private byte f = 2;
    public defpackage.abpj c = defpackage.abqh.b;

    static {
        defpackage.xpn xpnVar = new defpackage.xpn();
        a = xpnVar;
        defpackage.abox.P(defpackage.xpn.class, xpnVar);
    }

    private xpn() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000\u0003᠌\u0001", new java.lang.Object[]{"b", "c", defpackage.xpm.class, "d", "e", defpackage.xlv.m});
        }
        if (i2 == 3) {
            return new defpackage.xpn();
        }
        if (i2 == 4) {
            return new defpackage.abor(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.xpn.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
