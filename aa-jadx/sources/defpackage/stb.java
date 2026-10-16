package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class stb extends defpackage.sor {
    public final defpackage.ssz a;

    public stb(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.slx slxVar, defpackage.sly slyVar) {
        super(context, looper, 63, somVar, slxVar, slyVar);
        this.a = new defpackage.ssz();
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof defpackage.std ? (defpackage.std) iInterfaceQueryLocalInterface : new defpackage.std(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // defpackage.sok
    public final boolean f() {
        return true;
    }
}
