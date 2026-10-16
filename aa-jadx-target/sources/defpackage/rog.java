package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rog implements defpackage.rpj {
    final /* synthetic */ defpackage.ror a;

    public rog(defpackage.ror rorVar) {
        this.a = rorVar;
    }

    @Override // defpackage.rpj
    public final void a() {
        this.a.k();
    }

    @Override // defpackage.rpj
    public final void b(android.view.Surface surface) {
        defpackage.qyu qyuVar = this.a.i;
        if (qyuVar != null) {
            try {
                qyuVar.s(surface);
            } catch (android.os.RemoteException unused) {
                defpackage.rrx.d(5, "CAR.PROJECTION.CAHI", null, "%s Failed to release surface", this.a.t);
            }
        }
    }

    @Override // defpackage.rpj
    public final void c() {
        defpackage.ror rorVar = this.a;
        defpackage.rfc rfcVar = rorVar.w;
        if (rfcVar != null) {
            rfcVar.J(rorVar.C);
        }
        android.view.View view = rorVar.s;
        if (view == null || !(view.getParent() instanceof android.view.ViewGroup)) {
            return;
        }
        defpackage.rrx.a("CAR.PROJECTION.CAHI", null, "Removing contentView from parent on UI stop");
        ((android.view.ViewGroup) rorVar.s.getParent()).removeView(rorVar.s);
    }
}
