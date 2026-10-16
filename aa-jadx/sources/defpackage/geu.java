package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class geu extends android.view.GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ defpackage.gev a;

    public geu(defpackage.gev gevVar) {
        this.a = gevVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        defpackage.gev gevVar = this.a;
        gevVar.k = motionEvent.getX();
        gevVar.l = motionEvent.getY();
        gevVar.m = 1;
        return true;
    }
}
