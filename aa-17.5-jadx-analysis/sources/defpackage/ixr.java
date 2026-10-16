package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class ixr extends Handler {
    final /* synthetic */ ixs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixr(ixs ixsVar, Looper looper) {
        super(looper);
        this.a = ixsVar;
    }

    public final synchronized void a() {
        removeCallbacksAndMessages(null);
    }

    public final synchronized void b() {
        removeMessages(100);
        sendMessageDelayed(obtainMessage(100), 2000L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        if (message.what != 100) {
            return;
        }
        ixs ixsVar = this.a;
        synchronized (ixsVar.m) {
            i = ixsVar.n;
            i2 = (-65537) & i;
            ixsVar.n = i2;
        }
        if (i != i2) {
            ixsVar.b(i2, false);
        }
    }
}
