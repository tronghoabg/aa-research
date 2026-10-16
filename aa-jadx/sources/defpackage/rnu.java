package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnu extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnu(com.google.android.gms.car.CarCall carCall) {
        super("onCallAdded");
        this.a = carCall;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.g(this.a);
    }
}
