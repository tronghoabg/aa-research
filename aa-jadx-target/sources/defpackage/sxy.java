package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sxy extends defpackage.sor {
    private final java.util.concurrent.atomic.AtomicReference a;

    public sxy(android.content.Context context, android.os.Looper looper, defpackage.som somVar, defpackage.slx slxVar, defpackage.sly slyVar) {
        super(context, looper, 41, somVar, slxVar, slyVar);
        this.a = new java.util.concurrent.atomic.AtomicReference();
    }

    public final void H(defpackage.qxn qxnVar, defpackage.qxn qxnVar2, defpackage.sms smsVar) throws android.os.RemoteException {
        defpackage.sxs sxwVar = new sxw((defpackage.sxt) v(), smsVar, qxnVar2);
        if (qxnVar == null) {
            if (qxnVar2 == null) {
                smsVar.g();
                return;
            } else {
                ((defpackage.sxt) v()).e(qxnVar2, sxwVar);
                return;
            }
        }
        defpackage.sxt sxtVar = (defpackage.sxt) v();
        android.os.Parcel parcelFp = sxtVar.fp();
        defpackage.ijx.i(parcelFp, qxnVar);
        defpackage.ijx.i(parcelFp, sxwVar);
        sxtVar.fr(10, parcelFp);
    }

    @Override // defpackage.sor, defpackage.sok, defpackage.slr
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.sok
    protected final /* synthetic */ android.os.IInterface b(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof defpackage.sxt ? (defpackage.sxt) iInterfaceQueryLocalInterface : new defpackage.sxt(iBinder);
    }

    @Override // defpackage.sok
    protected final java.lang.String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.sok
    protected final java.lang.String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.sok
    public final boolean f() {
        return true;
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] g() {
        return defpackage.sxg.g;
    }

    @Override // defpackage.sok
    public final void y() {
        try {
            defpackage.qxn qxnVar = (defpackage.qxn) this.a.getAndSet(null);
            if (qxnVar != null) {
                sxv sxvVar = new sxv();
                defpackage.sxt sxtVar = (defpackage.sxt) v();
                android.os.Parcel parcelFp = sxtVar.fp();
                defpackage.ijx.i(parcelFp, qxnVar);
                defpackage.ijx.i(parcelFp, sxvVar);
                sxtVar.fr(5, parcelFp);
            }
        } catch (android.os.RemoteException e) {
            android.util.Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.y();
    }
}
