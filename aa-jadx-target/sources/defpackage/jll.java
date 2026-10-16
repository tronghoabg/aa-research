package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jll implements defpackage.jli {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUTH");
    private final defpackage.xzi b = defpackage.ysr.aQ(new defpackage.imy(7));
    private final defpackage.jlj c = new defpackage.jlj(defpackage.ygw.r("com.google.android.projection.gearhead.pctsverifier", "com.google.android.projection.gearhead.galmonitor"), false);

    @Override // defpackage.jli
    public final void a(android.content.Context context) {
        if (!((defpackage.jlj) this.b.fF()).a(context)) {
            throw new java.lang.SecurityException("Caller is not allowed");
        }
    }

    @Override // defpackage.jli
    public final void b(android.content.Intent intent) {
        intent.putExtra("service_handshake", new com.google.android.gms.carsetup.BinderParcel(new defpackage.jlk()));
    }

    @Override // defpackage.jli
    public final boolean c(android.content.Context context) {
        return this.c.a(context);
    }
}
