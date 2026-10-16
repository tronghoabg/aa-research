package okhttp3.internal.http2;

import cg.C1616e;
import cg.C1618g;
import cg.F;
import cg.H;
import cg.J;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Stream {

    /* renamed from: a, reason: collision with root package name */
    public final int f42813a;

    /* renamed from: b, reason: collision with root package name */
    public final Http2Connection f42814b;

    /* renamed from: c, reason: collision with root package name */
    public long f42815c;

    /* renamed from: d, reason: collision with root package name */
    public long f42816d;

    /* renamed from: e, reason: collision with root package name */
    public long f42817e;

    /* renamed from: f, reason: collision with root package name */
    public long f42818f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f42819g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42820h;

    /* renamed from: i, reason: collision with root package name */
    public final FramingSource f42821i;

    /* renamed from: j, reason: collision with root package name */
    public final FramingSink f42822j;
    public final StreamTimeout k;

    /* renamed from: l, reason: collision with root package name */
    public final StreamTimeout f42823l;

    /* renamed from: m, reason: collision with root package name */
    public ErrorCode f42824m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f42825n;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lcg/F;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class FramingSink implements F {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f42826a;

        /* renamed from: b, reason: collision with root package name */
        public final C1618g f42827b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42828c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f42829d;

        public FramingSink(Http2Stream this$0, boolean z2) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42829d = this$0;
            this.f42826a = z2;
            this.f42827b = new C1618g();
        }

        @Override // cg.F
        public final void E(C1618g source, long j8) throws SocketTimeoutException {
            AbstractC3340k.e(source, "source");
            byte[] bArr = Util.f42438a;
            C1618g c1618g = this.f42827b;
            c1618g.E(source, j8);
            while (c1618g.f19902b >= com.applovin.shadow.okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) {
                a(false);
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void a(boolean z2) throws SocketTimeoutException {
            long jMin;
            boolean z10;
            Http2Stream http2Stream = this.f42829d;
            synchronized (http2Stream) {
                http2Stream.f42823l.h();
                while (http2Stream.f42817e >= http2Stream.f42818f && !this.f42826a && !this.f42828c && http2Stream.f() == null) {
                    try {
                        http2Stream.l();
                    } catch (Throwable th) {
                        http2Stream.f42823l.k();
                        throw th;
                    }
                }
                http2Stream.f42823l.k();
                http2Stream.b();
                jMin = Math.min(http2Stream.f42818f - http2Stream.f42817e, this.f42827b.f19902b);
                http2Stream.f42817e += jMin;
                z10 = z2 && jMin == this.f42827b.f19902b;
            }
            this.f42829d.f42823l.h();
            try {
                Http2Stream http2Stream2 = this.f42829d;
                http2Stream2.f42814b.y(http2Stream2.f42813a, z10, this.f42827b, jMin);
            } finally {
                this.f42829d.f42823l.k();
            }
        }

        @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Http2Stream http2Stream = this.f42829d;
            byte[] bArr = Util.f42438a;
            synchronized (http2Stream) {
                if (this.f42828c) {
                    return;
                }
                boolean z2 = http2Stream.f() == null;
                Http2Stream http2Stream2 = this.f42829d;
                if (!http2Stream2.f42822j.f42826a) {
                    if (this.f42827b.f19902b > 0) {
                        while (this.f42827b.f19902b > 0) {
                            a(true);
                        }
                    } else if (z2) {
                        http2Stream2.f42814b.y(http2Stream2.f42813a, true, null, 0L);
                    }
                }
                synchronized (this.f42829d) {
                    this.f42828c = true;
                }
                this.f42829d.f42814b.f42752x.flush();
                this.f42829d.a();
            }
        }

        @Override // cg.F, java.io.Flushable
        public final void flush() throws SocketTimeoutException {
            Http2Stream http2Stream = this.f42829d;
            byte[] bArr = Util.f42438a;
            synchronized (http2Stream) {
                http2Stream.b();
            }
            while (this.f42827b.f19902b > 0) {
                a(false);
                this.f42829d.f42814b.f42752x.flush();
            }
        }

        @Override // cg.F
        public final J timeout() {
            return this.f42829d.f42823l;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lcg/H;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class FramingSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final long f42830a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42831b;

        /* renamed from: c, reason: collision with root package name */
        public final C1618g f42832c;

        /* renamed from: d, reason: collision with root package name */
        public final C1618g f42833d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42834e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f42835f;

        public FramingSource(Http2Stream this$0, long j8, boolean z2) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42835f = this$0;
            this.f42830a = j8;
            this.f42831b = z2;
            this.f42832c = new C1618g();
            this.f42833d = new C1618g();
        }

        public final void a(long j8) {
            byte[] bArr = Util.f42438a;
            this.f42835f.f42814b.w(j8);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j8;
            Http2Stream http2Stream = this.f42835f;
            synchronized (http2Stream) {
                this.f42834e = true;
                C1618g c1618g = this.f42833d;
                j8 = c1618g.f19902b;
                c1618g.a();
                http2Stream.notifyAll();
            }
            if (j8 > 0) {
                a(j8);
            }
            this.f42835f.a();
        }

        @Override // cg.H
        public final long read(C1618g sink, long j8) throws Throwable {
            Throwable streamResetException;
            boolean z2;
            long j10;
            AbstractC3340k.e(sink, "sink");
            long j11 = 0;
            if (j8 < 0) {
                throw new IllegalArgumentException(AbstractC3340k.k(Long.valueOf(j8), "byteCount < 0: ").toString());
            }
            while (true) {
                Http2Stream http2Stream = this.f42835f;
                synchronized (http2Stream) {
                    http2Stream.k.h();
                    try {
                        if (http2Stream.f() != null) {
                            streamResetException = http2Stream.f42825n;
                            if (streamResetException == null) {
                                ErrorCode errorCodeF = http2Stream.f();
                                AbstractC3340k.b(errorCodeF);
                                streamResetException = new StreamResetException(errorCodeF);
                            }
                        } else {
                            streamResetException = null;
                        }
                        if (this.f42834e) {
                            throw new IOException("stream closed");
                        }
                        C1618g c1618g = this.f42833d;
                        long j12 = c1618g.f19902b;
                        z2 = false;
                        if (j12 > j11) {
                            j10 = c1618g.read(sink, Math.min(j8, j12));
                            long j13 = http2Stream.f42815c + j10;
                            http2Stream.f42815c = j13;
                            long j14 = j13 - http2Stream.f42816d;
                            if (streamResetException == null && j14 >= http2Stream.f42814b.f42745q.a() / 2) {
                                http2Stream.f42814b.B(http2Stream.f42813a, j14);
                                http2Stream.f42816d = http2Stream.f42815c;
                            }
                        } else {
                            if (!this.f42831b && streamResetException == null) {
                                http2Stream.l();
                                z2 = true;
                            }
                            j10 = -1;
                        }
                        http2Stream.k.k();
                    } finally {
                    }
                }
                if (!z2) {
                    if (j10 != -1) {
                        a(j10);
                        return j10;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j11 = 0;
            }
        }

        @Override // cg.H
        public final J timeout() {
            return this.f42835f.k;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lcg/e;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class StreamTimeout extends C1616e {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Http2Stream f42836m;

        public StreamTimeout(Http2Stream this$0) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42836m = this$0;
        }

        @Override // cg.C1616e
        public final void j() {
            this.f42836m.e(ErrorCode.CANCEL);
            final Http2Connection http2Connection = this.f42836m.f42814b;
            synchronized (http2Connection) {
                long j8 = http2Connection.f42743o;
                long j10 = http2Connection.f42742n;
                if (j8 < j10) {
                    return;
                }
                http2Connection.f42742n = j10 + 1;
                http2Connection.f42744p = System.nanoTime() + com.applovin.shadow.okhttp3.internal.http2.Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                TaskQueue taskQueue = http2Connection.f42737h;
                final String strK = AbstractC3340k.k(" ping", http2Connection.f42732c);
                taskQueue.c(new Task(strK) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() throws IOException {
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.f42752x.o(false, 2, 0);
                            return -1L;
                        } catch (IOException e7) {
                            http2Connection2.b(e7);
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void k() throws SocketTimeoutException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i5, Http2Connection connection, boolean z2, boolean z10, Headers headers) {
        AbstractC3340k.e(connection, "connection");
        this.f42813a = i5;
        this.f42814b = connection;
        this.f42818f = connection.f42746r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f42819g = arrayDeque;
        this.f42821i = new FramingSource(this, connection.f42745q.a(), z10);
        this.f42822j = new FramingSink(this, z2);
        this.k = new StreamTimeout(this);
        this.f42823l = new StreamTimeout(this);
        if (headers == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            byte[] r0 = okhttp3.internal.Util.f42438a
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.f42821i     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.f42831b     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L19
            boolean r0 = r0.f42834e     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.f42822j     // Catch: java.lang.Throwable -> L32
            boolean r1 = r0.f42826a     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L17
            boolean r0 = r0.f42828c     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            boolean r1 = r2.i()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            if (r0 == 0) goto L28
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r2.c(r0, r1)
            return
        L28:
            if (r1 != 0) goto L31
            okhttp3.internal.http2.Http2Connection r0 = r2.f42814b
            int r1 = r2.f42813a
            r0.i(r1)
        L31:
            return
        L32:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.a():void");
    }

    public final void b() throws IOException {
        FramingSink framingSink = this.f42822j;
        if (framingSink.f42828c) {
            throw new IOException("stream closed");
        }
        if (framingSink.f42826a) {
            throw new IOException("stream finished");
        }
        if (this.f42824m != null) {
            IOException iOException = this.f42825n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f42824m;
            AbstractC3340k.b(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            this.f42814b.f42752x.w(this.f42813a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.f42438a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f42821i.f42831b && this.f42822j.f42826a) {
                return false;
            }
            this.f42824m = errorCode;
            this.f42825n = iOException;
            notifyAll();
            this.f42814b.i(this.f42813a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.f42814b.z(this.f42813a, errorCode);
        }
    }

    public final synchronized ErrorCode f() {
        return this.f42824m;
    }

    public final FramingSink g() {
        synchronized (this) {
            if (!this.f42820h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f42822j;
    }

    public final boolean h() {
        boolean z2 = (this.f42813a & 1) == 1;
        this.f42814b.getClass();
        return true == z2;
    }

    public final synchronized boolean i() {
        if (this.f42824m != null) {
            return false;
        }
        FramingSource framingSource = this.f42821i;
        if (framingSource.f42831b || framingSource.f42834e) {
            FramingSink framingSink = this.f42822j;
            if (framingSink.f42826a || framingSink.f42828c) {
                if (this.f42820h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(Headers headers, boolean z2) {
        boolean zI;
        AbstractC3340k.e(headers, "headers");
        byte[] bArr = Util.f42438a;
        synchronized (this) {
            try {
                if (this.f42820h && z2) {
                    this.f42821i.getClass();
                } else {
                    this.f42820h = true;
                    this.f42819g.add(headers);
                }
                if (z2) {
                    this.f42821i.f42831b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.f42814b.i(this.f42813a);
    }

    public final synchronized void k(ErrorCode errorCode) {
        if (this.f42824m == null) {
            this.f42824m = errorCode;
            notifyAll();
        }
    }

    public final void l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
