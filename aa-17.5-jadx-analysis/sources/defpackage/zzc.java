package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;

/* loaded from: classes3.dex */
final class zzc extends Handler {
    final /* synthetic */ zzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzd zzdVar, Handler handler) {
        super(handler.getLooper());
        this.a = zzdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            zzd zzdVar = this.a;
            zzdVar.j.onShowPress(zzdVar.p);
            return;
        }
        if (i == 2) {
            zzd zzdVar2 = this.a;
            zzdVar2.i.removeMessages(3);
            zzdVar2.m = true;
            zzdVar2.j.onLongPress(zzdVar2.p);
            return;
        }
        if (i != 3) {
            throw new IllegalStateException("Unknown message ".concat(String.valueOf(String.valueOf(message))));
        }
        zzd zzdVar3 = this.a;
        GestureDetector.OnDoubleTapListener onDoubleTapListener = zzdVar3.k;
        if (onDoubleTapListener == null || zzdVar3.l) {
            return;
        }
        onDoubleTapListener.onSingleTapConfirmed(zzdVar3.p);
    }
}
