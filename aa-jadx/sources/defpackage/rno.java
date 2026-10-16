package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rno extends defpackage.rob {
    final /* synthetic */ com.google.android.gms.car.CarCall a;
    final /* synthetic */ java.lang.String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rno(com.google.android.gms.car.CarCall carCall, java.lang.String str) {
        super("onPostDialWait");
        this.a = carCall;
        this.b = str;
    }

    @Override // defpackage.rob
    public final void a(defpackage.qww qwwVar) throws android.os.RemoteException {
        qwwVar.p(this.a, this.b);
    }
}
