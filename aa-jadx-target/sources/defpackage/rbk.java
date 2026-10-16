package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rbk implements android.view.ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ defpackage.rbr a;

    public rbk(defpackage.rbr rbrVar) {
        this.a = rbrVar;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
            defpackage.rbr rbrVar = this.a;
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "%s onTouchModeChanged(isInTouchMode:%b) [attachedToWindow:%b, hasInputFocus:%b, inTouchMode:%b]", rbrVar.m, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(rbrVar.n), java.lang.Boolean.valueOf(rbrVar.o), java.lang.Boolean.valueOf(rbrVar.p));
        }
        defpackage.rbr rbrVar2 = this.a;
        if (rbrVar2.n) {
            boolean z2 = rbrVar2.p;
            if (z != z2) {
                rbrVar2.j(rbrVar2.o, z2);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                rbrVar2.m();
            }
            if (rbrVar2.z) {
                rbrVar2.l(rbrVar2.f().getDecorView());
            }
        }
    }
}
