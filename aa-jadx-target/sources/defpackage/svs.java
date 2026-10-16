package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class svs extends defpackage.sor {
    public svs(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.slx slxVar, defpackage.sly slyVar) {
        super(context, looper, 51, somVar, slxVar, slyVar);
    }

    @Override // defpackage.sok
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 9410000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof defpackage.svr ? (defpackage.svr) iInterfaceQueryLocalInterface : new defpackage.svr(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.svg.k;
    }
}
