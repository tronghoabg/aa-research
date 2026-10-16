package Y4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16689a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16690b;

    public /* synthetic */ g(Handler handler, int i5) {
        this.f16689a = i5;
        this.f16690b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16689a) {
            case 0:
                this.f16690b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f16690b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                runnable.getClass();
                Handler handler2 = this.f16690b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f16690b.post(runnable);
                return;
        }
    }

    public g(int i5) {
        this.f16689a = i5;
        switch (i5) {
            case 3:
                this.f16690b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f16690b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
