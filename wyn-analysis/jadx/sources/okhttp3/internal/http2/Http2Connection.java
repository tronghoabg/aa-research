package okhttp3.internal.http2;

import cg.C1609A;
import cg.C1610B;
import cg.C1621j;
import ef.C2515C;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;
import tf.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Http2Connection implements Closeable {

    /* renamed from: A, reason: collision with root package name */
    public static final Companion f42728A = new Companion(0);

    /* renamed from: B, reason: collision with root package name */
    public static final Settings f42729B;

    /* renamed from: a, reason: collision with root package name */
    public final Listener f42730a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f42731b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f42732c;

    /* renamed from: d, reason: collision with root package name */
    public int f42733d;

    /* renamed from: e, reason: collision with root package name */
    public int f42734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42735f;

    /* renamed from: g, reason: collision with root package name */
    public final TaskRunner f42736g;

    /* renamed from: h, reason: collision with root package name */
    public final TaskQueue f42737h;

    /* renamed from: i, reason: collision with root package name */
    public final TaskQueue f42738i;

    /* renamed from: j, reason: collision with root package name */
    public final TaskQueue f42739j;
    public final PushObserver k;

    /* renamed from: l, reason: collision with root package name */
    public long f42740l;

    /* renamed from: m, reason: collision with root package name */
    public long f42741m;

    /* renamed from: n, reason: collision with root package name */
    public long f42742n;

    /* renamed from: o, reason: collision with root package name */
    public long f42743o;

    /* renamed from: p, reason: collision with root package name */
    public long f42744p;

    /* renamed from: q, reason: collision with root package name */
    public final Settings f42745q;

    /* renamed from: r, reason: collision with root package name */
    public Settings f42746r;

    /* renamed from: s, reason: collision with root package name */
    public long f42747s;

    /* renamed from: t, reason: collision with root package name */
    public long f42748t;

    /* renamed from: u, reason: collision with root package name */
    public long f42749u;

    /* renamed from: v, reason: collision with root package name */
    public long f42750v;

    /* renamed from: w, reason: collision with root package name */
    public final Socket f42751w;

    /* renamed from: x, reason: collision with root package name */
    public final Http2Writer f42752x;

    /* renamed from: y, reason: collision with root package name */
    public final ReaderRunnable f42753y;

    /* renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f42754z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final TaskRunner f42783a;

        /* renamed from: b, reason: collision with root package name */
        public Socket f42784b;

        /* renamed from: c, reason: collision with root package name */
        public String f42785c;

        /* renamed from: d, reason: collision with root package name */
        public C1610B f42786d;

        /* renamed from: e, reason: collision with root package name */
        public C1609A f42787e;

        /* renamed from: f, reason: collision with root package name */
        public Listener f42788f;

        /* renamed from: g, reason: collision with root package name */
        public final PushObserver f42789g;

        public Builder(TaskRunner taskRunner) {
            AbstractC3340k.e(taskRunner, "taskRunner");
            this.f42783a = taskRunner;
            this.f42788f = Listener.f42790a;
            this.f42789g = PushObserver.f42850a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f42790a;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i5) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f42790a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void b(Http2Stream http2Stream) {
                    http2Stream.c(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void a(Http2Connection connection, Settings settings) {
            AbstractC3340k.e(connection, "connection");
            AbstractC3340k.e(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lef/C;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class ReaderRunnable implements Http2Reader.Handler, a {

        /* renamed from: a, reason: collision with root package name */
        public final Http2Reader f42791a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Http2Connection f42792b;

        public ReaderRunnable(Http2Connection this$0, Http2Reader http2Reader) {
            AbstractC3340k.e(this$0, "this$0");
            this.f42792b = this$0;
            this.f42791a = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
        
            if (r17 == false) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
        
            r4.j(okhttp3.internal.Util.f42439b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(final boolean r17, final int r18, cg.C1610B r19, final int r20) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.a(boolean, int, cg.B, int):void");
        }

        public final void b(int i5, ErrorCode errorCode, C1621j debugData) {
            int i10;
            Object[] array;
            AbstractC3340k.e(debugData, "debugData");
            debugData.d();
            Http2Connection http2Connection = this.f42792b;
            synchronized (http2Connection) {
                i10 = 0;
                array = http2Connection.f42731b.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                http2Connection.f42735f = true;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i10 < length) {
                Http2Stream http2Stream = http2StreamArr[i10];
                i10++;
                if (http2Stream.f42813a > i5 && http2Stream.h()) {
                    http2Stream.k(ErrorCode.REFUSED_STREAM);
                    this.f42792b.i(http2Stream.f42813a);
                }
            }
        }

        public final void c(final boolean z2, final int i5, int i10, final List list) {
            this.f42792b.getClass();
            if (i5 != 0 && (i5 & 1) == 0) {
                final Http2Connection http2Connection = this.f42792b;
                http2Connection.getClass();
                final String str = http2Connection.f42732c + '[' + i5 + "] onHeaders";
                http2Connection.f42738i.c(new Task(str, http2Connection, i5, list, z2) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f42768e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f42769f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ List f42770g;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) this.f42768e.k).getClass();
                        try {
                            this.f42768e.f42752x.w(this.f42769f, ErrorCode.CANCEL);
                            synchronized (this.f42768e) {
                                this.f42768e.f42754z.remove(Integer.valueOf(this.f42769f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            final Http2Connection http2Connection2 = this.f42792b;
            synchronized (http2Connection2) {
                Http2Stream http2StreamD = http2Connection2.d(i5);
                if (http2StreamD != null) {
                    http2StreamD.j(Util.v(list), z2);
                    return;
                }
                if (http2Connection2.f42735f) {
                    return;
                }
                if (i5 <= http2Connection2.f42733d) {
                    return;
                }
                if (i5 % 2 == http2Connection2.f42734e % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i5, http2Connection2, false, z2, Util.v(list));
                http2Connection2.f42733d = i5;
                http2Connection2.f42731b.put(Integer.valueOf(i5), http2Stream);
                TaskQueue taskQueueE = http2Connection2.f42736g.e();
                final String str2 = http2Connection2.f42732c + '[' + i5 + "] onStream";
                taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        try {
                            http2Connection2.f42730a.b(http2Stream);
                            return -1L;
                        } catch (IOException e7) {
                            Platform.f42887a.getClass();
                            Platform platform = Platform.f42888b;
                            String strK = AbstractC3340k.k(http2Connection2.f42732c, "Http2Connection.Listener failure for ");
                            platform.getClass();
                            Platform.i(strK, 4, e7);
                            try {
                                http2Stream.c(ErrorCode.PROTOCOL_ERROR, e7);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        public final void d(boolean z2, final int i5, final int i10) {
            if (!z2) {
                Http2Connection http2Connection = this.f42792b;
                TaskQueue taskQueue = http2Connection.f42737h;
                final String strK = AbstractC3340k.k(" ping", http2Connection.f42732c);
                final Http2Connection http2Connection2 = this.f42792b;
                taskQueue.c(new Task(strK) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() throws IOException {
                        int i11 = i5;
                        int i12 = i10;
                        Http2Connection http2Connection3 = http2Connection2;
                        http2Connection3.getClass();
                        try {
                            http2Connection3.f42752x.o(true, i11, i12);
                            return -1L;
                        } catch (IOException e7) {
                            http2Connection3.b(e7);
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection3 = this.f42792b;
            synchronized (http2Connection3) {
                try {
                    if (i5 == 1) {
                        http2Connection3.f42741m++;
                    } else if (i5 == 2) {
                        http2Connection3.f42743o++;
                    } else if (i5 == 3) {
                        http2Connection3.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(int i5, final int i10, final List list) {
            final Http2Connection http2Connection = this.f42792b;
            http2Connection.getClass();
            synchronized (http2Connection) {
                if (http2Connection.f42754z.contains(Integer.valueOf(i10))) {
                    http2Connection.z(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.f42754z.add(Integer.valueOf(i10));
                TaskQueue taskQueue = http2Connection.f42738i;
                final String str = http2Connection.f42732c + '[' + i10 + "] onRequest";
                taskQueue.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) http2Connection.k).getClass();
                        try {
                            http2Connection.f42752x.w(i10, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.f42754z.remove(Integer.valueOf(i10));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // tf.a
        public final Object invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ?? r02 = this.f42792b;
            Http2Reader http2Reader = this.f42791a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r32 = 1;
            IOException e7 = null;
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        r02.a(r32, errorCode2, e7);
                        Util.c(http2Reader);
                        throw th;
                    }
                } catch (IOException e10) {
                    e7 = e10;
                    errorCode = errorCode2;
                }
                if (!http2Reader.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        r32 = errorCode2;
                        r02.a(r32, errorCode2, e7);
                        Util.c(http2Reader);
                        throw th;
                    }
                } while (http2Reader.a(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    r02.a(errorCode, errorCode2, null);
                    r32 = errorCode;
                } catch (IOException e11) {
                    e7 = e11;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    r02.a(errorCode2, errorCode2, e7);
                    r32 = errorCode;
                    Util.c(http2Reader);
                    return C2515C.f34653a;
                }
                Util.c(http2Reader);
                return C2515C.f34653a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(7, com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.c(5, com.applovin.shadow.okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE);
        f42729B = settings;
    }

    public Http2Connection(Builder builder) {
        this.f42730a = builder.f42788f;
        String str = builder.f42785c;
        if (str == null) {
            AbstractC3340k.m("connectionName");
            throw null;
        }
        this.f42732c = str;
        this.f42734e = 3;
        TaskRunner taskRunner = builder.f42783a;
        this.f42736g = taskRunner;
        this.f42737h = taskRunner.e();
        this.f42738i = taskRunner.e();
        this.f42739j = taskRunner.e();
        this.k = builder.f42789g;
        Settings settings = new Settings();
        settings.c(7, com.applovin.shadow.okhttp3.internal.http2.Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        this.f42745q = settings;
        this.f42746r = f42729B;
        this.f42750v = r0.a();
        Socket socket = builder.f42784b;
        if (socket == null) {
            AbstractC3340k.m("socket");
            throw null;
        }
        this.f42751w = socket;
        C1609A c1609a = builder.f42787e;
        if (c1609a == null) {
            AbstractC3340k.m("sink");
            throw null;
        }
        this.f42752x = new Http2Writer(c1609a);
        C1610B c1610b = builder.f42786d;
        if (c1610b == null) {
            AbstractC3340k.m("source");
            throw null;
        }
        this.f42753y = new ReaderRunnable(this, new Http2Reader(c1610b));
        this.f42754z = new LinkedHashSet();
    }

    public final void B(final int i5, final long j8) {
        final String str = this.f42732c + '[' + i5 + "] windowUpdate";
        this.f42737h.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws IOException {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.f42752x.z(i5, j8);
                    return -1L;
                } catch (IOException e7) {
                    Http2Connection.Companion companion = Http2Connection.f42728A;
                    http2Connection.b(e7);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) throws IOException {
        int i5;
        Object[] array;
        byte[] bArr = Util.f42438a;
        try {
            o(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f42731b.isEmpty()) {
                array = null;
            } else {
                array = this.f42731b.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f42731b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f42752x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f42751w.close();
        } catch (IOException unused4) {
        }
        this.f42737h.f();
        this.f42738i.f();
        this.f42739j.f();
    }

    public final void b(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        a(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final synchronized Http2Stream d(int i5) {
        return (Http2Stream) this.f42731b.get(Integer.valueOf(i5));
    }

    public final synchronized boolean h(long j8) {
        if (this.f42735f) {
            return false;
        }
        if (this.f42743o < this.f42742n) {
            if (j8 >= this.f42744p) {
                return false;
            }
        }
        return true;
    }

    public final synchronized Http2Stream i(int i5) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f42731b.remove(Integer.valueOf(i5));
        notifyAll();
        return http2Stream;
    }

    public final void o(ErrorCode errorCode) {
        synchronized (this.f42752x) {
            synchronized (this) {
                if (this.f42735f) {
                    return;
                }
                this.f42735f = true;
                this.f42752x.h(this.f42733d, errorCode, Util.f42438a);
            }
        }
    }

    public final synchronized void w(long j8) {
        long j10 = this.f42747s + j8;
        this.f42747s = j10;
        long j11 = j10 - this.f42748t;
        if (j11 >= this.f42745q.a() / 2) {
            B(0, j11);
            this.f42748t += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f42752x.f42840c);
        r6 = r2;
        r8.f42749u += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r9, boolean r10, cg.C1618g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.f42752x
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f42749u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f42750v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f42731b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.f42752x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f42840c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f42749u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f42749u = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.f42752x
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.y(int, boolean, cg.g, long):void");
    }

    public final void z(final int i5, final ErrorCode errorCode) {
        final String str = this.f42732c + '[' + i5 + "] writeSynReset";
        this.f42737h.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws IOException {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.f42752x.w(i5, errorCode);
                    return -1L;
                } catch (IOException e7) {
                    Http2Connection.Companion companion = Http2Connection.f42728A;
                    http2Connection.b(e7);
                    return -1L;
                }
            }
        }, 0L);
    }
}
