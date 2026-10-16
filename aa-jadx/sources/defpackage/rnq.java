package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnq extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ java.util.List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnq(com.google.android.gms.car.CarCall carCall, java.util.List list) {
        super("onConferenceableCallsChanged");
        this.a = carCall;
        this.b = list;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.l(this.a, this.b);
    }
}
