package Ie;

import S3.f;
import android.os.Handler;

/* loaded from: classes5.dex */
public final class d implements Runnable, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5447a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f5448b;

    public d(Handler handler, Runnable runnable) {
        this.f5447a = handler;
        this.f5448b = runnable;
    }

    @Override // Je.b
    public final void dispose() {
        this.f5447a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5448b.run();
        } catch (Throwable th) {
            f.A(th);
        }
    }
}
