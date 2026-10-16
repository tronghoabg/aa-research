package K1;

import A7.CallableC0255h0;
import A7.RunnableC0278p;
import android.os.Handler;
import android.os.Looper;
import b7.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f6325f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f6330e;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f6327b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6328c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f6329d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final b f6326a = new b(this, new CallableC0255h0(this, 3));

    public a(d dVar) {
        this.f6330e = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f6325f == null) {
                    f6325f = new Handler(Looper.getMainLooper());
                }
                handler = f6325f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC0278p(25, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6330e.b();
    }
}
