package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adyi extends defpackage.adml {
    static final boolean a;
    public static final /* synthetic */ int b = 0;

    static {
        java.nio.charset.Charset charset = defpackage.adve.a;
        a = defpackage.adkx.a("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // defpackage.adlz
    public final defpackage.admj a(defpackage.admb admbVar) {
        return a ? new adyd(admbVar) : new defpackage.adyh(admbVar);
    }

    @Override // defpackage.adml
    public final defpackage.adno b(java.util.Map map) {
        try {
            java.lang.Boolean boolL = defpackage.adrs.l(map, "shuffleAddressList");
            return new defpackage.adno(a ? new adxz(boolL) : new adyf(boolL));
        } catch (java.lang.RuntimeException e) {
            return new defpackage.adno(defpackage.ador.m.d(e).e("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.adml
    public final java.lang.String c() {
        return "pick_first";
    }

    @Override // defpackage.adml
    public final void d() {
    }

    @Override // defpackage.adml
    public final void e() {
    }
}
