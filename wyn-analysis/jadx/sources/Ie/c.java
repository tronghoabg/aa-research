package Ie;

import He.l;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5445a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f5446b;

    public c(Handler handler) {
        this.f5445a = handler;
    }

    @Override // He.l
    public final Je.b a(Runnable runnable, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit2 == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z2 = this.f5446b;
        Me.b bVar = Me.b.f7635a;
        if (z2) {
            return bVar;
        }
        Handler handler = this.f5445a;
        d dVar = new d(handler, runnable);
        Message messageObtain = Message.obtain(handler, dVar);
        messageObtain.obj = this;
        this.f5445a.sendMessageDelayed(messageObtain, timeUnit2.toMillis(0L));
        if (!this.f5446b) {
            return dVar;
        }
        this.f5445a.removeCallbacks(dVar);
        return bVar;
    }

    @Override // Je.b
    public final void dispose() {
        this.f5446b = true;
        this.f5445a.removeCallbacksAndMessages(this);
    }
}
