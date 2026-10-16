package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rnr extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ android.os.Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnr(com.google.android.gms.car.CarCall carCall, java.lang.String str, android.os.Bundle bundle) {
        super("onConnectionEvent");
        this.a = carCall;
        this.b = str;
        this.c = bundle;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.m(this.a, this.b, this.c);
    }
}
