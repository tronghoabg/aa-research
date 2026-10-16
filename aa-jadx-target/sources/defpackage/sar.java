package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sar implements defpackage.rpj {
    final /* synthetic */ com.google.android.gms.car.DrawingSpec a;
    final /* synthetic */ defpackage.sau b;

    public sar(defpackage.sau sauVar, com.google.android.gms.car.DrawingSpec drawingSpec) {
        this.a = drawingSpec;
        this.b = sauVar;
    }

    @Override // defpackage.rpj
    public final void a() {
        this.b.k(this.a);
    }

    @Override // defpackage.rpj
    public final void b(android.view.Surface surface) {
        try {
            this.b.i.i();
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // defpackage.rpj
    public final void c() {
        this.b.l();
    }
}
