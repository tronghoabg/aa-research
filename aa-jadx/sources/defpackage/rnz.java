package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnz extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ com.google.android.gms.car.CarCall.Details b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnz(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall.Details details) {
        super("onDetailsChanged");
        this.a = carCall;
        this.b = details;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.n(this.a, this.b);
    }
}
