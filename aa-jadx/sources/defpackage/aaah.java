package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aaah extends android.os.Handler {
    final /* synthetic */ defpackage.aaai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaah(defpackage.aaai aaaiVar, android.os.Handler handler) {
        super(handler.getLooper());
        this.a = aaaiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            defpackage.aaai aaaiVar = this.a;
            aaaiVar.j.onShowPress(aaaiVar.p);
            return;
        }
        if (i == 2) {
            defpackage.aaai aaaiVar2 = this.a;
            aaaiVar2.i.removeMessages(3);
            aaaiVar2.m = true;
            aaaiVar2.j.onLongPress(aaaiVar2.p);
            return;
        }
        if (i != 3) {
            throw new java.lang.IllegalStateException("Unknown message ".concat(java.lang.String.valueOf(java.lang.String.valueOf(message))));
        }
        defpackage.aaai aaaiVar3 = this.a;
        android.view.GestureDetector.OnDoubleTapListener onDoubleTapListener = aaaiVar3.k;
        if (onDoubleTapListener == null || aaaiVar3.l) {
            return;
        }
        onDoubleTapListener.onSingleTapConfirmed(aaaiVar3.p);
    }
}
