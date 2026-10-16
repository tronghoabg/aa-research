package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qoz implements defpackage.sws {
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ qoz(java.lang.Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.sws
    public final void d(java.lang.Exception exc) {
        com.google.android.gms.common.ConnectionResult connectionResult;
        if (this.c == 0) {
            ((java.util.concurrent.atomic.AtomicLong) ((defpackage.rif) this.b).c).set(this.a);
            return;
        }
        android.util.Log.i("AdvertisingIdClient", "getting error as ".concat(java.lang.String.valueOf(exc.getMessage())));
        if ((exc instanceof defpackage.sls) && (connectionResult = ((defpackage.sls) exc).a.i) != null && connectionResult.c == 24) {
            ((defpackage.qlq) this.b).c.set(this.a);
        }
    }
}
