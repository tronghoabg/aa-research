package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acbp extends defpackage.abou implements defpackage.abov {
    public static final defpackage.acbp a;
    public int b;
    public abvh c;
    public int d;
    public zqk e;
    private byte f = 2;

    static {
        defpackage.acbp acbpVar = new defpackage.acbp();
        a = acbpVar;
        defpackage.abox.P(defpackage.acbp.class, acbpVar);
    }

    private acbp() {
    }

    @Override // defpackage.abox
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.abqi(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new java.lang.Object[]{"b", "c", "d", abtn.g, "e"});
        }
        if (i2 == 3) {
            return new defpackage.acbp();
        }
        if (i2 == 4) {
            return new defpackage.abot(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.abox.L(defpackage.acbp.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
