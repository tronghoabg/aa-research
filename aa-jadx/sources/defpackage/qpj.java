package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qpj extends defpackage.sor {
    public qpj(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.smx smxVar, defpackage.snr snrVar) {
        super(context, looper, 343, somVar, smxVar, snrVar);
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return iInterfaceQueryLocalInterface instanceof defpackage.qpl ? (defpackage.qpl) iInterfaceQueryLocalInterface : new defpackage.qpl(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.sok
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.sok
    public final boolean f() {
        return true;
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{new com.google.android.gms.common.Feature("google_auth_api", -1, 1L, false), defpackage.qoy.c, defpackage.qoy.d, defpackage.qoy.a};
    }
}
