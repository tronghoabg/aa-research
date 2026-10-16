package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sjx extends defpackage.sor {
    public sjx(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.slx slxVar, defpackage.sly slyVar) {
        super(context, looper, 40, somVar, slxVar, slyVar);
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof defpackage.ska ? (defpackage.ska) iInterfaceQueryLocalInterface : new defpackage.ska(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return new com.google.android.gms.common.Feature[]{defpackage.sjk.a, defpackage.sjk.c};
    }
}
