package okhttp3.internal.connection;

import Fe.b;
import N0.a;
import cg.C1616e;
import ff.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealCall implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f42577a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f42578b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f42579c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f42580d;

    /* renamed from: e, reason: collision with root package name */
    public final RealCall$timeout$1 f42581e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f42582f;

    /* renamed from: g, reason: collision with root package name */
    public Object f42583g;

    /* renamed from: h, reason: collision with root package name */
    public ExchangeFinder f42584h;

    /* renamed from: i, reason: collision with root package name */
    public RealConnection f42585i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42586j;
    public Exchange k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42587l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42588m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42589n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f42590o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Exchange f42591p;

    /* renamed from: q, reason: collision with root package name */
    public volatile RealConnection f42592q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class AsyncCall implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Callback f42593a;

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f42594b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RealCall f42595c;

        public AsyncCall(RealCall this$0, Callback callback) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42595c = this$0;
            this.f42593a = callback;
            this.f42594b = new AtomicInteger(0);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            Throwable th;
            IOException e7;
            Dispatcher dispatcher;
            String strK = AbstractC3340k.k(this.f42595c.f42578b.f42376a.h(), "OkHttp ");
            RealCall realCall = this.f42595c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strK);
            try {
                realCall.f42581e.h();
                try {
                    try {
                        z2 = true;
                        try {
                            this.f42593a.onResponse(realCall, realCall.d());
                            dispatcher = realCall.f42577a.f42316a;
                        } catch (IOException e10) {
                            e7 = e10;
                            if (z2) {
                                Platform.f42887a.getClass();
                                Platform platform = Platform.f42888b;
                                StringBuilder sb2 = new StringBuilder();
                                a.r(sb2, realCall.f42590o ? "canceled " : "", "call", " to ");
                                sb2.append(realCall.f42578b.f42376a.h());
                                String strK2 = AbstractC3340k.k(sb2.toString(), "Callback failure for ");
                                platform.getClass();
                                Platform.i(strK2, 4, e7);
                            } else {
                                this.f42593a.onFailure(realCall, e7);
                            }
                            dispatcher = realCall.f42577a.f42316a;
                            dispatcher.c(this);
                        } catch (Throwable th2) {
                            th = th2;
                            realCall.cancel();
                            if (!z2) {
                                IOException iOException = new IOException(AbstractC3340k.k(th, "canceled due to "));
                                b.d(iOException, th);
                                this.f42593a.onFailure(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        realCall.f42577a.f42316a.c(this);
                        throw th3;
                    }
                } catch (IOException e11) {
                    z2 = false;
                    e7 = e11;
                } catch (Throwable th4) {
                    z2 = false;
                    th = th4;
                }
                dispatcher.c(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f42596a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            AbstractC3340k.e(referent, "referent");
            this.f42596a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [cg.J, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient client, Request originalRequest) {
        AbstractC3340k.e(client, "client");
        AbstractC3340k.e(originalRequest, "originalRequest");
        this.f42577a = client;
        this.f42578b = originalRequest;
        this.f42579c = client.f42317b.f42222a;
        S8.b bVar = client.f42320e;
        bVar.getClass();
        byte[] bArr = Util.f42438a;
        EventListener$Companion$NONE$1 this_asFactory = (EventListener$Companion$NONE$1) bVar.f11028b;
        AbstractC3340k.e(this_asFactory, "$this_asFactory");
        this.f42580d = this_asFactory;
        ?? r32 = new C1616e() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // cg.C1616e
            public final void j() {
                this.f42597m.cancel();
            }
        };
        r32.g(0, TimeUnit.MILLISECONDS);
        this.f42581e = r32;
        this.f42582f = new AtomicBoolean();
        this.f42589n = true;
    }

    @Override // okhttp3.Call
    public final void B(Callback callback) {
        AsyncCall asyncCall;
        if (!this.f42582f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f42887a.getClass();
        this.f42583g = Platform.f42888b.g();
        this.f42580d.getClass();
        Dispatcher dispatcher = this.f42577a.f42316a;
        AsyncCall asyncCall2 = new AsyncCall(this, callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.f42250b.add(asyncCall2);
            String str = this.f42578b.f42376a.f42276d;
            Iterator it = dispatcher.f42251c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = dispatcher.f42250b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            asyncCall = null;
                            break;
                        } else {
                            asyncCall = (AsyncCall) it2.next();
                            if (AbstractC3340k.a(asyncCall.f42595c.f42578b.f42376a.f42276d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    asyncCall = (AsyncCall) it.next();
                    if (AbstractC3340k.a(asyncCall.f42595c.f42578b.f42376a.f42276d, str)) {
                        break;
                    }
                }
            }
            if (asyncCall != null) {
                asyncCall2.f42594b = asyncCall.f42594b;
            }
        }
        dispatcher.g();
    }

    public final void a(RealConnection realConnection) {
        byte[] bArr = Util.f42438a;
        if (this.f42585i != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f42585i = realConnection;
        realConnection.f42611p.add(new CallReference(this, this.f42583g));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketG;
        byte[] bArr = Util.f42438a;
        RealConnection realConnection = this.f42585i;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketG = g();
            }
            if (this.f42585i == null) {
                if (socketG != null) {
                    Util.d(socketG);
                }
                this.f42580d.getClass();
            } else if (socketG != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f42586j && i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f42580d.getClass();
            return interruptedIOException;
        }
        EventListener eventListener = this.f42580d;
        AbstractC3340k.b(interruptedIOException);
        eventListener.getClass();
        return interruptedIOException;
    }

    public final void c(boolean z2) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f42589n) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (exchange = this.f42591p) != null) {
            exchange.f42553d.cancel();
            exchange.f42550a.e(exchange, true, true, null);
        }
        this.k = null;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.f42590o) {
            return;
        }
        this.f42590o = true;
        Exchange exchange = this.f42591p;
        if (exchange != null) {
            exchange.f42553d.cancel();
        }
        RealConnection realConnection = this.f42592q;
        if (realConnection != null && (socket = realConnection.f42599c) != null) {
            Util.d(socket);
        }
        this.f42580d.getClass();
    }

    public final Object clone() {
        return new RealCall(this.f42577a, this.f42578b);
    }

    public final Response d() {
        ArrayList arrayList = new ArrayList();
        t.e0(this.f42577a.f42318c, arrayList);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f42577a));
        arrayList.add(new BridgeInterceptor(this.f42577a.f42325j));
        arrayList.add(new CacheInterceptor(this.f42577a.k));
        arrayList.add(ConnectInterceptor.f42545a);
        t.e0(this.f42577a.f42319d, arrayList);
        arrayList.add(new CallServerInterceptor());
        Request request = this.f42578b;
        OkHttpClient okHttpClient = this.f42577a;
        try {
            try {
                Response responseA = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.f42337w, okHttpClient.f42338x, okHttpClient.f42339y).a(this.f42578b);
                if (this.f42590o) {
                    Util.c(responseA);
                    throw new IOException("Canceled");
                }
                f(null);
                return responseA;
            } catch (IOException e7) {
                IOException iOExceptionF = f(e7);
                if (iOExceptionF == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionF;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                f(null);
            }
            throw th;
        }
    }

    public final IOException e(Exchange exchange, boolean z2, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        AbstractC3340k.e(exchange, "exchange");
        if (exchange.equals(this.f42591p)) {
            synchronized (this) {
                z11 = false;
                if (z2) {
                    try {
                        if (!this.f42587l) {
                            if (z10 || !this.f42588m) {
                                z12 = false;
                            }
                        }
                        if (z2) {
                            this.f42587l = false;
                        }
                        if (z10) {
                            this.f42588m = false;
                        }
                        boolean z13 = this.f42587l;
                        boolean z14 = (z13 || this.f42588m) ? false : true;
                        if (!z13 && !this.f42588m) {
                            if (!this.f42589n) {
                                z11 = true;
                            }
                        }
                        z12 = z11;
                        z11 = z14;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                }
            }
            if (z11) {
                this.f42591p = null;
                RealConnection realConnection = this.f42585i;
                if (realConnection != null) {
                    realConnection.h();
                }
            }
            if (z12) {
                return b(iOException);
            }
        }
        return iOException;
    }

    @Override // okhttp3.Call
    public final Response execute() {
        if (!this.f42582f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        h();
        Platform.f42887a.getClass();
        this.f42583g = Platform.f42888b.g();
        this.f42580d.getClass();
        try {
            Dispatcher dispatcher = this.f42577a.f42316a;
            synchronized (dispatcher) {
                dispatcher.f42252d.add(this);
            }
            return d();
        } finally {
            Dispatcher dispatcher2 = this.f42577a.f42316a;
            dispatcher2.getClass();
            dispatcher2.b(dispatcher2.f42252d, this);
        }
    }

    public final IOException f(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f42589n) {
                this.f42589n = false;
                if (!this.f42587l) {
                    if (!this.f42588m) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? b(iOException) : iOException;
    }

    public final Socket g() {
        RealConnection realConnection = this.f42585i;
        AbstractC3340k.b(realConnection);
        byte[] bArr = Util.f42438a;
        ArrayList arrayList = realConnection.f42611p;
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (AbstractC3340k.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i5);
        this.f42585i = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.f42612q = System.nanoTime();
        RealConnectionPool realConnectionPool = this.f42579c;
        realConnectionPool.getClass();
        byte[] bArr2 = Util.f42438a;
        boolean z2 = realConnection.f42606j;
        TaskQueue taskQueue = realConnectionPool.f42618b;
        if (!z2) {
            taskQueue.c(realConnectionPool.f42619c, 0L);
            return null;
        }
        realConnection.f42606j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.f42620d;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            taskQueue.a();
        }
        Socket socket = realConnection.f42600d;
        AbstractC3340k.b(socket);
        return socket;
    }

    @Override // okhttp3.Call
    /* renamed from: isCanceled, reason: from getter */
    public final boolean getF42590o() {
        return this.f42590o;
    }

    @Override // okhttp3.Call
    /* renamed from: request, reason: from getter */
    public final Request getF42578b() {
        return this.f42578b;
    }
}
