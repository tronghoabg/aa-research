package Ie;

import He.l;
import He.m;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class e extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5449a;

    public e(Handler handler) {
        this.f5449a = handler;
    }

    @Override // He.m
    public final l a() {
        return new c(this.f5449a);
    }

    @Override // He.m
    public final Je.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f5449a;
        d dVar = new d(handler, runnable);
        handler.postDelayed(dVar, timeUnit.toMillis(0L));
        return dVar;
    }
}
