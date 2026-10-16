package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;

/* loaded from: classes3.dex */
final class tus extends Handler {
    final /* synthetic */ tuv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tus(tuv tuvVar, Handler handler) {
        super(handler.getLooper());
        this.a = tuvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.k.i();
            return;
        }
        if (i == 2) {
            tuv tuvVar = this.a;
            tuvVar.j.removeMessages(3);
            tuvVar.n = true;
            tuvVar.k.a(tuvVar.q);
            return;
        }
        if (i != 3) {
            throw new RuntimeException("Unknown message ".concat(String.valueOf(String.valueOf(message))));
        }
        tuv tuvVar2 = this.a;
        GestureDetector.OnDoubleTapListener onDoubleTapListener = tuvVar2.l;
        if (onDoubleTapListener == null || tuvVar2.m) {
            return;
        }
        onDoubleTapListener.onSingleTapConfirmed(tuvVar2.q);
    }
}
