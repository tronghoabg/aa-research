package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class tvp extends android.os.Handler {
    final /* synthetic */ defpackage.tvs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvp(defpackage.tvs tvsVar, android.os.Handler handler) {
        super(handler.getLooper());
        this.a = tvsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.k.i();
            return;
        }
        if (i == 2) {
            defpackage.tvs tvsVar = this.a;
            tvsVar.j.removeMessages(3);
            tvsVar.n = true;
            tvsVar.k.a(tvsVar.q);
            return;
        }
        if (i != 3) {
            throw new java.lang.RuntimeException("Unknown message ".concat(java.lang.String.valueOf(java.lang.String.valueOf(message))));
        }
        defpackage.tvs tvsVar2 = this.a;
        android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener = tvsVar2.l;
        if (onDoubleTapListener == null || tvsVar2.m) {
            return;
        }
        onDoubleTapListener.onSingleTapConfirmed(tvsVar2.q);
    }
}
