package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rny extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ java.util.List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rny(com.google.android.gms.car.CarCall carCall, java.util.List list) {
        super("onChildrenChanged");
        this.a = carCall;
        this.b = list;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.k(this.a, this.b);
    }
}
