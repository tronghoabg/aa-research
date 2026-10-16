package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnx extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ com.google.android.gms.car.CarCall b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnx(com.google.android.gms.car.CarCall carCall, com.google.android.gms.car.CarCall carCall2) {
        super("onParentChanged");
        this.a = carCall;
        this.b = carCall2;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.o(this.a, this.b);
    }
}
