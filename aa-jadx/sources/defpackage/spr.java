package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class spr extends defpackage.sor {
    public spr(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.smx smxVar, defpackage.snr snrVar) {
        super(context, looper, 449, somVar, smxVar, snrVar);
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 253600000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof defpackage.spt ? (defpackage.spt) iInterfaceQueryLocalInterface : new defpackage.spt(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.sok
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.skm.d;
    }
}
