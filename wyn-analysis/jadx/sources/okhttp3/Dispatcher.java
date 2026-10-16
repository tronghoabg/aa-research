package okhttp3;

import bg.ThreadFactoryC1532a;
import com.google.android.gms.common.api.f;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Dispatcher {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f42249a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f42250b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f42251c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f42252d = new ArrayDeque();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f42249a == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = AbstractC3340k.k(" Dispatcher", Util.f42444g);
                AbstractC3340k.e(name, "name");
                this.f42249a = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new ThreadFactoryC1532a(0, name, false));
            }
            threadPoolExecutor = this.f42249a;
            AbstractC3340k.b(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            d();
        }
        g();
    }

    public final void c(RealCall.AsyncCall asyncCall) {
        asyncCall.f42594b.decrementAndGet();
        b(this.f42251c, asyncCall);
    }

    public final synchronized void d() {
    }

    public final synchronized int e() {
        return 64;
    }

    public final synchronized int f() {
        return 5;
    }

    public final void g() {
        byte[] bArr = Util.f42438a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f42250b.iterator();
                AbstractC3340k.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    int size = this.f42251c.size();
                    e();
                    if (size >= 64) {
                        break;
                    }
                    int i5 = asyncCall.f42594b.get();
                    f();
                    if (i5 < 5) {
                        it.remove();
                        asyncCall.f42594b.incrementAndGet();
                        arrayList.add(asyncCall);
                        this.f42251c.add(asyncCall);
                    }
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            int i11 = i10 + 1;
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) arrayList.get(i10);
            ExecutorService executorServiceA = a();
            asyncCall2.getClass();
            RealCall realCall = asyncCall2.f42595c;
            Dispatcher dispatcher = realCall.f42577a.f42316a;
            byte[] bArr2 = Util.f42438a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceA).execute(asyncCall2);
                } catch (Throwable th2) {
                    realCall.f42577a.f42316a.c(asyncCall2);
                    throw th2;
                }
            } catch (RejectedExecutionException e7) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e7);
                realCall.f(interruptedIOException);
                asyncCall2.f42593a.onFailure(realCall, interruptedIOException);
                realCall.f42577a.f42316a.c(asyncCall2);
            }
            i10 = i11;
        }
    }

    public final synchronized int h() {
        return this.f42251c.size() + this.f42252d.size();
    }
}
