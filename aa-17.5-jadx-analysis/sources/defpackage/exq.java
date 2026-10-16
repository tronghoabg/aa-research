package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class exq extends Handler {
    final /* synthetic */ exv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exq(exv exvVar, Looper looper) {
        super(looper);
        this.a = exvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.d();
    }
}
