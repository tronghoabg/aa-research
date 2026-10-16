package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnw extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnw(com.google.android.gms.car.CarCall carCall, int i) {
        super("onStateChanged");
        this.a = carCall;
        this.b = i;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.q(this.a, this.b);
    }
}
