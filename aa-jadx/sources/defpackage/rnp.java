package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnp extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnp(com.google.android.gms.car.CarCall carCall) {
        super("onCallDestroyed");
        this.a = carCall;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.h(this.a);
    }
}
