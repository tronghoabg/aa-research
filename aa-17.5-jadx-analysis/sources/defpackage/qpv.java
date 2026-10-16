package defpackage;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class qpv extends rbj {
    private boolean a;

    public qpv(qpx qpxVar, Looper looper) {
        super(qpxVar, looper);
        this.a = false;
    }

    public final synchronized void a(long j) {
        if (this.a) {
            return;
        }
        removeMessages(0);
        sendMessageDelayed(obtainMessage(0), j);
    }

    public final synchronized void b() {
        if (this.a) {
            return;
        }
        this.a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qpx qpxVar = (qpx) v();
        if (qpxVar != null && message.what == 0) {
            qpxVar.g(null);
        }
    }
}
