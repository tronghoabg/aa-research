package defpackage;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class iql extends rbj {
    private boolean a;

    public iql(iqn iqnVar, Looper looper) {
        super(iqnVar, looper);
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
        iqn iqnVar = (iqn) v();
        if (iqnVar != null && message.what == 0) {
            iqnVar.k(null);
        }
    }
}
