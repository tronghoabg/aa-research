package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sqc extends defpackage.sor {
    private final defpackage.spp a;

    public sqc(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.spp sppVar, defpackage.smx smxVar, defpackage.snr snrVar) {
        super(context, looper, 270, somVar, smxVar, snrVar);
        this.a = sppVar;
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof defpackage.spu ? (defpackage.spu) iInterfaceQueryLocalInterface : new defpackage.spu(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.sok
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.skm.d;
    }

    @Override // defpackage.sok
    protected final android.os.Bundle h() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
