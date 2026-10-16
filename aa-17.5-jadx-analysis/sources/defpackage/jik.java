package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;

/* loaded from: classes.dex */
final class jik extends rbj {
    public final ydx a;
    final /* synthetic */ jim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jik(jim jimVar, Looper looper) {
        super(null, looper);
        this.b = jimVar;
        this.a = new ydx(10);
    }

    public final void a(long j) {
        sendMessageDelayed(obtainMessage(1), j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.add(Pair.create(Integer.valueOf(message.what), Long.valueOf(System.currentTimeMillis())));
        int i = message.what;
        if (i == 1) {
            this.b.B();
        } else {
            if (i != 2) {
                return;
            }
            this.b.C((jhf) message.obj);
        }
    }
}
