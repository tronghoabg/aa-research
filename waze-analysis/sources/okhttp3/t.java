package okhttp3;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f56340a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f56341b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f56342c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque f56343d = new ArrayDeque();

    private final void g(Deque deque, Object obj) {
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        h();
    }

    private final void h() {
        byte[] bArr = okhttp3.internal.b.f55955a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f56341b.iterator();
            h.g.b.x.e(it, "iterator(...)");
            while (it.hasNext()) {
                okhttp3.internal.c.g gVar = (okhttp3.internal.c.g) it.next();
                ArrayDeque arrayDeque = this.f56342c;
                if (arrayDeque.size() >= 64) {
                    break;
                }
                if (gVar.b().get() < 5) {
                    it.remove();
                    gVar.b().incrementAndGet();
                    h.g.b.x.c(gVar);
                    arrayList.add(gVar);
                    arrayDeque.add(gVar);
                }
            }
            f();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((okhttp3.internal.c.g) arrayList.get(i2)).c(a());
        }
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.f56340a;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), okhttp3.internal.b.q(String.valueOf(okhttp3.internal.b.f55959e).concat(" Dispatcher"), false));
            this.f56340a = threadPoolExecutor;
        }
        h.g.b.x.c(threadPoolExecutor);
        return threadPoolExecutor;
    }

    public final void b(okhttp3.internal.c.g gVar) {
        okhttp3.internal.c.g gVar2;
        h.g.b.x.f(gVar, NotificationCompat.CATEGORY_CALL);
        synchronized (this) {
            ArrayDeque arrayDeque = this.f56341b;
            arrayDeque.add(gVar);
            String strA = gVar.a();
            Iterator it = this.f56342c.iterator();
            h.g.b.x.e(it, "iterator(...)");
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = arrayDeque.iterator();
                    h.g.b.x.e(it2, "iterator(...)");
                    while (true) {
                        if (!it2.hasNext()) {
                            gVar2 = null;
                            break;
                        } else {
                            gVar2 = (okhttp3.internal.c.g) it2.next();
                            if (h.g.b.x.n(gVar2.a(), strA)) {
                                break;
                            }
                        }
                    }
                } else {
                    gVar2 = (okhttp3.internal.c.g) it.next();
                    if (h.g.b.x.n(gVar2.a(), strA)) {
                        break;
                    }
                }
            }
            if (gVar2 != null) {
                gVar.d(gVar2);
            }
        }
        h();
    }

    public final synchronized void c(okhttp3.internal.c.j jVar) {
        h.g.b.x.f(jVar, NotificationCompat.CATEGORY_CALL);
        this.f56343d.add(jVar);
    }

    public final void d(okhttp3.internal.c.g gVar) {
        h.g.b.x.f(gVar, NotificationCompat.CATEGORY_CALL);
        gVar.b().decrementAndGet();
        g(this.f56342c, gVar);
    }

    public final void e(okhttp3.internal.c.j jVar) {
        h.g.b.x.f(jVar, NotificationCompat.CATEGORY_CALL);
        g(this.f56343d, jVar);
    }

    public final synchronized void f() {
        this.f56342c.size();
        this.f56343d.size();
    }
}
