package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class rob implements defpackage.snn {
    private final java.lang.String a;

    public rob(java.lang.String str) {
        this.a = str;
    }

    public abstract void a(defpackage.qww qwwVar) throws android.os.RemoteException;

    @Override // defpackage.snn
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        try {
            a((defpackage.qww) obj);
        } catch (android.os.RemoteException e) {
            defpackage.rrx.d(5, "CAR.TEL.CLIENT", e, "Remote Exception during %s", this.a);
        }
    }

    @Override // defpackage.snn
    public final void c() {
        defpackage.rrx.d(5, "CAR.TEL.CLIENT", new java.lang.Exception(), "Notify failed", new java.lang.Object[0]);
    }
}
