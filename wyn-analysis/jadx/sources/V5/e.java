package V5;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
import s8.C4026b;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f13030g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f13031h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f13032a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f13033b;

    /* renamed from: c, reason: collision with root package name */
    public c f13034c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f13035d;

    /* renamed from: e, reason: collision with root package name */
    public final C4026b f13036e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13037f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C4026b c4026b = new C4026b(7);
        this.f13032a = mediaCodec;
        this.f13033b = handlerThread;
        this.f13036e = c4026b;
        this.f13035d = new AtomicReference();
    }

    public static d b() {
        ArrayDeque arrayDeque = f13030g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(d dVar) {
        ArrayDeque arrayDeque = f13030g;
        synchronized (arrayDeque) {
            arrayDeque.add(dVar);
        }
    }

    public final void a() {
        if (this.f13037f) {
            try {
                c cVar = this.f13034c;
                cVar.getClass();
                cVar.removeCallbacksAndMessages(null);
                C4026b c4026b = this.f13036e;
                c4026b.b();
                c cVar2 = this.f13034c;
                cVar2.getClass();
                cVar2.obtainMessage(2).sendToTarget();
                synchronized (c4026b) {
                    while (!c4026b.f45322b) {
                        c4026b.wait();
                    }
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }
}
