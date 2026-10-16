package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class soc extends defpackage.soe {
    public final int a;
    public final android.os.Bundle b;
    final /* synthetic */ defpackage.sok c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soc(defpackage.sok sokVar, int i, android.os.Bundle bundle) {
        super(sokVar, java.lang.Boolean.TRUE);
        this.c = sokVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(com.google.android.gms.common.ConnectionResult connectionResult);

    protected abstract boolean b();

    @Override // defpackage.soe
    protected final /* bridge */ /* synthetic */ void c() {
        defpackage.sok sokVar = this.c;
        int i = this.a;
        if (i != 0) {
            sokVar.G(1, null);
            android.os.Bundle bundle = this.b;
            a(new com.google.android.gms.common.ConnectionResult(1, i, bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null, null, null));
        } else {
            if (b()) {
                return;
            }
            sokVar.G(1, null);
            a(new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null));
        }
    }
}
