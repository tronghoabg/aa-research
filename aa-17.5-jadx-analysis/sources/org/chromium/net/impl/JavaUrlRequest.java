package org.chromium.net.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Process;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import defpackage.a;
import defpackage.ahkw;
import defpackage.akbj;
import j$.time.Duration;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.JavaUrlRequest;
import org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink;
import org.chromium.net.impl.JavaUrlRequestUtils;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes2.dex */
final class JavaUrlRequest extends ExperimentalUrlRequest {
    public static final String a = "JavaUrlRequest";
    public final AsyncUrlRequestCallback b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public final VersionSafeCallbacks.UploadDataProviderWrapper j;
    public final Executor k;
    public String m;
    public ReadableByteChannel n;
    public UrlResponseInfoImpl o;
    public String p;
    public HttpURLConnection q;
    public OutputStreamDataSink r;
    public final JavaCronetEngine s;
    public final int t;
    public final CronetLogger u;
    public final long v;
    public int w;
    public int x;
    public boolean y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    final class AsyncUrlRequestCallback {
        final VersionSafeCallbacks.UrlRequestCallback a;
        final Executor b;
        final Executor c;

        public AsyncUrlRequestCallback(UrlRequest.Callback callback, Executor executor) {
            this.a = new VersionSafeCallbacks.UrlRequestCallback(callback);
            String str = JavaUrlRequest.a;
            if (JavaUrlRequest.this.h) {
                this.b = executor;
                this.c = null;
            } else {
                this.b = new JavaUrlRequestUtils.DirectPreventingExecutor(executor);
                this.c = executor;
            }
        }

        final void a(final JavaUrlRequestUtils.CheckedRunnable checkedRunnable, String str) {
            try {
                final JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                String str2 = JavaUrlRequest.a;
                b(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3 = JavaUrlRequest.a;
                        try {
                            checkedRunnable.a();
                        } catch (Throwable th) {
                            final JavaUrlRequest javaUrlRequest2 = javaUrlRequest;
                            javaUrlRequest2.d(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str4 = JavaUrlRequest.a;
                                    javaUrlRequest2.x++;
                                }
                            }, "enterUserErrorState");
                            javaUrlRequest2.b(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th));
                        }
                    }
                }, str);
            } catch (RejectedExecutionException e) {
                JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                CronetExceptionImpl cronetExceptionImpl = new CronetExceptionImpl("Exception posting task to executor", e);
                String str3 = JavaUrlRequest.a;
                javaUrlRequest2.b(cronetExceptionImpl);
            }
        }

        final void b(final Runnable runnable, final String str) {
            new akbj("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
            this.b.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    new akbj("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
                    runnable.run();
                }
            });
        }

        public final void c() {
            Runnable runnable = new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() throws NumberFormatException {
                    Map<String, List<String>> allHeaders;
                    String str;
                    boolean z;
                    int i;
                    long length;
                    long j;
                    long length2;
                    long j2;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
                    long j7;
                    CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState;
                    JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback = this.a;
                    try {
                        JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                        String str2 = JavaUrlRequest.a;
                        CronetLogger cronetLogger = javaUrlRequest.u;
                        long j8 = javaUrlRequest.t;
                        UrlResponseInfoImpl urlResponseInfoImpl = javaUrlRequest.o;
                        if (urlResponseInfoImpl != null) {
                            allHeaders = urlResponseInfoImpl.getAllHeaders();
                            UrlResponseInfoImpl urlResponseInfoImpl2 = javaUrlRequest.o;
                            str = urlResponseInfoImpl2.c;
                            int i2 = urlResponseInfoImpl2.a;
                            z = urlResponseInfoImpl2.b;
                            i = i2;
                        } else {
                            allHeaders = Collections.EMPTY_MAP;
                            str = "";
                            z = false;
                            i = 0;
                        }
                        String str3 = str;
                        if (z) {
                            j = 0;
                            length = 0;
                        } else {
                            length = 0;
                            for (Map.Entry entry : javaUrlRequest.e.entrySet()) {
                                if (((String) entry.getKey()) != null) {
                                    length += r16.length();
                                }
                                if (((String) entry.getValue()) != null) {
                                    length += r9.length();
                                }
                            }
                            j = -1;
                        }
                        if (z) {
                            j3 = j;
                            j4 = length;
                            j5 = 0;
                            j6 = 0;
                            j2 = 0;
                        } else {
                            if (allHeaders == null) {
                                length2 = 0;
                            } else {
                                length2 = 0;
                                for (Map.Entry<String, List<String>> entry2 : allHeaders.entrySet()) {
                                    if (entry2.getKey() != null) {
                                        length2 += r17.length();
                                    }
                                    if (entry2.getValue() != null) {
                                        Iterator<String> it = entry2.getValue().iterator();
                                        while (it.hasNext()) {
                                            if (it.next() != null) {
                                                length2 += r11.length();
                                            }
                                        }
                                    }
                                }
                            }
                            j2 = 0;
                            if (allHeaders.containsKey("Content-Length")) {
                                try {
                                    j7 = Long.parseLong(allHeaders.get("Content-Length").get(0));
                                } catch (NumberFormatException unused) {
                                    j7 = 0;
                                }
                                j3 = j;
                                j4 = length;
                                j5 = length2;
                                j6 = j7;
                            } else {
                                j3 = j;
                                j4 = length;
                                j5 = length2;
                                j6 = -1;
                            }
                        }
                        Duration durationOfSeconds = Duration.ofSeconds(j2);
                        JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                        int i3 = javaUrlRequest2.g.get();
                        if (i3 == 6) {
                            requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.ERROR;
                        } else if (i3 == 7) {
                            requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.SUCCEEDED;
                        } else {
                            if (i3 != 8) {
                                throw new IllegalStateException(a.bn(i3, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                            }
                            requestTerminalState = CronetLogger.CronetTrafficInfo.RequestTerminalState.CANCELLED;
                        }
                        CronetLogger.CronetTrafficInfo.RequestTerminalState requestTerminalState2 = requestTerminalState;
                        int i4 = javaUrlRequest2.x;
                        int i5 = javaUrlRequest2.w;
                        JavaUrlRequest.OutputStreamDataSink outputStreamDataSink = javaUrlRequest2.r;
                        cronetLogger.d(j8, new CronetLogger.CronetTrafficInfo(j4, j3, j5, j6, i, durationOfSeconds, str3, false, false, requestTerminalState2, i4, i5, outputStreamDataSink != null ? outputStreamDataSink.g : 0, false, javaUrlRequest2.y, Process.myUid(), 0, 0, 0, CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN, false, ImplVersion.getCronetVersion(), CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK, -1L, -1L, -1L, -1L, -1L, null, false));
                    } catch (RuntimeException e) {
                        ahkw.f(JavaUrlRequest.a, "Error while trying to log CronetTrafficInfo: ", e);
                    }
                }
            };
            String str = JavaUrlRequest.a;
            JavaUrlRequest.this.d(runnable, "maybeReportMetrics");
        }

        final void d() {
            a(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda4
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void a() throws Exception {
                    JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback = this.a;
                    JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                    String str = JavaUrlRequest.a;
                    if (javaUrlRequest.g.compareAndSet(1, 4)) {
                        asyncUrlRequestCallback.a.onResponseStarted(javaUrlRequest, javaUrlRequest.o);
                    }
                }
            }, "onResponseStarted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class OutputStreamDataSink extends JavaUploadDataSinkBase {
        private final HttpURLConnection i;
        private final AtomicBoolean j;
        private WritableByteChannel k;
        private OutputStream l;

        public OutputStreamDataSink(Executor executor, Executor executor2, HttpURLConnection httpURLConnection, VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper) {
            super(executor, executor2, uploadDataProviderWrapper);
            this.j = new AtomicBoolean(false);
            this.i = httpURLConnection;
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final int a(ByteBuffer byteBuffer) throws IOException {
            int iWrite = 0;
            while (byteBuffer.hasRemaining()) {
                iWrite += this.k.write(byteBuffer);
            }
            this.l.flush();
            return iWrite;
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final Runnable b(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
            String str = JavaUrlRequest.a;
            return new JavaUrlRequest$$ExternalSyntheticLambda12(JavaUrlRequest.this, checkedRunnable);
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final Runnable c(JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
            String str = JavaUrlRequest.a;
            return new JavaUrlRequest$$ExternalSyntheticLambda16(JavaUrlRequest.this, checkedRunnable);
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final void e() throws IOException {
            k();
            String str = JavaUrlRequest.a;
            JavaUrlRequest.this.g();
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final void f() throws IOException {
            if (this.k == null) {
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                String str = JavaUrlRequest.a;
                javaUrlRequest.l = 10;
                HttpURLConnection httpURLConnection = this.i;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                javaUrlRequest.l = 12;
                OutputStream outputStream = httpURLConnection.getOutputStream();
                this.l = outputStream;
                this.k = Channels.newChannel(outputStream);
            }
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final void g(long j) {
            HttpURLConnection httpURLConnection = this.i;
            if (j > 0) {
                httpURLConnection.setFixedLengthStreamingMode(j);
            } else {
                httpURLConnection.setChunkedStreamingMode(8192);
            }
        }

        @Override // org.chromium.net.impl.JavaUploadDataSinkBase
        protected final void h(Throwable th) {
            String str = JavaUrlRequest.a;
            JavaUrlRequest.this.c(th);
        }

        final void k() throws IOException {
            if (this.k == null || !this.j.compareAndSet(false, true)) {
                return;
            }
            this.k.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SerializingExecutor implements Executor {
        private final Executor a;
        private final Runnable b = new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$SerializingExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        private final ArrayDeque c = new ArrayDeque();
        private boolean d;

        public SerializingExecutor(Executor executor) {
            this.a = executor;
        }

        public final void a() {
            ArrayDeque arrayDeque = this.c;
            synchronized (arrayDeque) {
                if (this.d) {
                    return;
                }
                Runnable runnable = (Runnable) arrayDeque.pollFirst();
                this.d = runnable != null;
                while (runnable != null) {
                    try {
                        runnable.run();
                        synchronized (arrayDeque) {
                            runnable = (Runnable) arrayDeque.pollFirst();
                            this.d = runnable != null;
                        }
                    } catch (Throwable th) {
                        synchronized (this.c) {
                            this.d = false;
                            try {
                                this.a.execute(this.b);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArrayDeque arrayDeque = this.c;
            synchronized (arrayDeque) {
                arrayDeque.addLast(runnable);
                try {
                    this.a.execute(this.b);
                } catch (RejectedExecutionException unused) {
                    this.c.removeLast();
                }
            }
        }
    }

    public JavaUrlRequest(JavaCronetEngine javaCronetEngine, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList<Map.Entry<String, String>> arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper;
        new akbj("Cronet JavaUrlRequest#JavaUrlRequest");
        str.getClass();
        callback.getClass();
        executor.getClass();
        executor2.getClass();
        this.h = z;
        this.b = new AsyncUrlRequestCallback(callback, executor2);
        final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
        this.c = new SerializingExecutor(new Executor() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda13
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                String str4 = JavaUrlRequest.a;
                final int i3 = threadStatsTag;
                final boolean z4 = z3;
                final int i4 = i2;
                executor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        String str5 = JavaUrlRequest.a;
                        int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i3);
                        Runnable runnable2 = runnable;
                        boolean z5 = z4;
                        if (z5) {
                            ThreadStatsUid.set(i4);
                        }
                        try {
                            runnable2.run();
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                        } catch (Throwable th) {
                            if (z5) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag2);
                            throw th;
                        }
                    }
                });
            }
        });
        this.s = javaCronetEngine;
        this.t = javaCronetEngine.a;
        this.u = javaCronetEngine.b;
        this.m = str;
        this.d = str2;
        this.v = j;
        str3.getClass();
        if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException("Invalid http method ".concat(str3));
        }
        this.i = str3;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry<String, String> entry = arrayList.get(i3);
            String key = entry.getKey();
            int i4 = 0;
            while (true) {
                if (i4 < key.length()) {
                    char cCharAt = key.charAt(i4);
                    if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                        switch (cCharAt) {
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                break;
                            default:
                                switch (cCharAt) {
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                if (Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                                                    break;
                                                } else {
                                                    i4++;
                                                }
                                                break;
                                        }
                                }
                        }
                    }
                } else if (!entry.getValue().contains("\r\n")) {
                    this.e.put(entry.getKey(), entry.getValue());
                }
            }
            throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf(entry.getKey())));
        }
        if (uploadDataProvider == null) {
            uploadDataProviderWrapper = null;
        } else {
            if (!this.e.containsKey("Content-Type")) {
                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
            }
            uploadDataProviderWrapper = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
        }
        this.j = uploadDataProviderWrapper;
        this.k = (executor3 == null || this.h) ? executor3 : new JavaUrlRequestUtils.DirectPreventingExecutor(executor3);
    }

    public final void a() {
        d(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                ReadableByteChannel readableByteChannel = javaUrlRequest.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    javaUrlRequest.n = null;
                }
            }
        }, "closeResponseChannel");
    }

    public final void b(final CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        final String str = "onFailed";
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        final AsyncUrlRequestCallback asyncUrlRequestCallback = this.b;
        final UrlResponseInfoImpl urlResponseInfoImpl = this.o;
        JavaUrlRequest.this.a();
        final Runnable runnable = new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UrlResponseInfo urlResponseInfo = urlResponseInfoImpl;
                JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback2 = asyncUrlRequestCallback;
                try {
                    asyncUrlRequestCallback2.a.onFailed(JavaUrlRequest.this, urlResponseInfo, cronetException);
                } catch (Exception e) {
                    JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                    String str2 = JavaUrlRequest.a;
                    javaUrlRequest.i("onFailed", e);
                }
                asyncUrlRequestCallback2.c();
                JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                String str3 = JavaUrlRequest.a;
                javaUrlRequest2.s.a();
            }
        };
        try {
            asyncUrlRequestCallback.b(runnable, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = asyncUrlRequestCallback.c;
            if (executor != null) {
                new akbj("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                executor.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        new akbj("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + str + " running callback");
                        runnable.run();
                    }
                });
            }
        }
    }

    public final void c(Throwable th) {
        b(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            final AsyncUrlRequestCallback asyncUrlRequestCallback = this.b;
            final UrlResponseInfoImpl urlResponseInfoImpl = this.o;
            JavaUrlRequest.this.a();
            asyncUrlRequestCallback.b(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback2 = asyncUrlRequestCallback;
                    try {
                        asyncUrlRequestCallback2.a.onCanceled(JavaUrlRequest.this, urlResponseInfoImpl);
                    } catch (Exception e) {
                        JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                        String str = JavaUrlRequest.a;
                        javaUrlRequest.i("onCanceled", e);
                    }
                    asyncUrlRequestCallback2.c();
                    JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                    String str2 = JavaUrlRequest.a;
                    javaUrlRequest2.s.a();
                }
            }, "onCanceled");
        }
    }

    public final void d(final Runnable runnable, final String str) {
        new akbj("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        this.c.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = JavaUrlRequest.a;
                new akbj("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                runnable.run();
            }
        });
    }

    public final void e() {
        final VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = this.j;
        if (uploadDataProviderWrapper == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            this.k.execute(new JavaUrlRequest$$ExternalSyntheticLambda16(this, new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda10
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void a() throws IOException {
                    uploadDataProviderWrapper.close();
                }
            }));
        } catch (RejectedExecutionException e) {
            ahkw.d(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                JavaUrlRequest.OutputStreamDataSink outputStreamDataSink = javaUrlRequest.r;
                if (outputStreamDataSink != null) {
                    try {
                        outputStreamDataSink.k();
                    } catch (IOException e) {
                        ahkw.d(JavaUrlRequest.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = javaUrlRequest.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    javaUrlRequest.q = null;
                }
            }
        }, "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest.1
            @Override // java.lang.Runnable
            public final void run() {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                javaUrlRequest.m = javaUrlRequest.p;
                javaUrlRequest.p = null;
                javaUrlRequest.h();
            }
        });
    }

    public final void g() {
        this.l = 13;
        d(new JavaUrlRequest$$ExternalSyntheticLambda12(this, new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda2
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void a() throws IOException {
                List<String> list;
                String str = JavaUrlRequest.a;
                final JavaUrlRequest javaUrlRequest = this.a;
                if (javaUrlRequest.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = javaUrlRequest.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = javaUrlRequest.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, javaUrlRequest.q.getHeaderField(i)));
                    }
                    i++;
                }
                int responseCode = javaUrlRequest.q.getResponseCode();
                final UrlResponseInfoImpl urlResponseInfoImpl = new UrlResponseInfoImpl(new ArrayList(javaUrlRequest.f), responseCode, javaUrlRequest.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), false, headerField, "", 0L, false);
                if (responseCode >= 300 && responseCode < 400 && (list = urlResponseInfoImpl.getAllHeaders().get("location")) != null) {
                    final String str2 = list.get(0);
                    javaUrlRequest.j(1, 2, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = JavaUrlRequest.a;
                            final JavaUrlRequest javaUrlRequest2 = javaUrlRequest;
                            javaUrlRequest2.p = URI.create(javaUrlRequest2.m).resolve(str2).toString();
                            javaUrlRequest2.f.add(javaUrlRequest2.p);
                            final UrlResponseInfo urlResponseInfo = urlResponseInfoImpl;
                            javaUrlRequest2.j(2, 3, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str4 = JavaUrlRequest.a;
                                    JavaUrlRequest javaUrlRequest3 = javaUrlRequest2;
                                    final String str5 = javaUrlRequest3.p;
                                    final JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback = javaUrlRequest3.b;
                                    final UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                                    asyncUrlRequestCallback.a(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda9
                                        @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                                        public final void a() throws Exception {
                                            JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback2 = asyncUrlRequestCallback;
                                            asyncUrlRequestCallback2.a.onRedirectReceived(JavaUrlRequest.this, urlResponseInfo2, str5);
                                        }
                                    }, "onRedirectReceived");
                                }
                            });
                        }
                    });
                    return;
                }
                javaUrlRequest.o = urlResponseInfoImpl;
                javaUrlRequest.e();
                if (responseCode < 400) {
                    javaUrlRequest.n = InputStreamChannel.a(javaUrlRequest.q.getInputStream());
                    javaUrlRequest.b.d();
                } else {
                    InputStream errorStream = javaUrlRequest.q.getErrorStream();
                    javaUrlRequest.n = errorStream == null ? null : InputStreamChannel.a(errorStream);
                    javaUrlRequest.b.d();
                }
            }
        }), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        final int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.bp(i, "Switch is exhaustive: "));
        }
        AsyncUrlRequestCallback asyncUrlRequestCallback = this.b;
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(statusListener);
        asyncUrlRequestCallback.b(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                urlRequestStatusListener.onStatus(i2);
            }
        }, "sendStatus");
    }

    public final void h() {
        d(new JavaUrlRequest$$ExternalSyntheticLambda12(this, new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda1
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void a() throws ProtocolException, NetworkExceptionImpl {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                if (javaUrlRequest.g.get() == 8) {
                    return;
                }
                URL url = new URL(javaUrlRequest.m);
                HttpURLConnection httpURLConnection = javaUrlRequest.q;
                Network network = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    javaUrlRequest.q = null;
                }
                long j = javaUrlRequest.v;
                if (j == -1) {
                    javaUrlRequest.q = (HttpURLConnection) url.openConnection();
                } else {
                    Network[] allNetworks = ((ConnectivityManager) javaUrlRequest.s.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i];
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            break;
                        }
                        i++;
                    }
                    if (network == null) {
                        throw new NetworkExceptionImpl("Network bound to request not found", 9, -4);
                    }
                    javaUrlRequest.q = (HttpURLConnection) network.openConnection(url);
                }
                javaUrlRequest.q.setInstanceFollowRedirects(false);
                Map map = javaUrlRequest.e;
                if (!map.containsKey("User-Agent")) {
                    map.put("User-Agent", javaUrlRequest.d);
                }
                for (Map.Entry entry : map.entrySet()) {
                    javaUrlRequest.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                javaUrlRequest.q.setRequestMethod(javaUrlRequest.i);
                VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = javaUrlRequest.j;
                if (uploadDataProviderWrapper == null) {
                    javaUrlRequest.l = 10;
                    javaUrlRequest.q.connect();
                    javaUrlRequest.g();
                } else {
                    javaUrlRequest.r = javaUrlRequest.new OutputStreamDataSink(javaUrlRequest.k, javaUrlRequest.c, javaUrlRequest.q, uploadDataProviderWrapper);
                    final JavaUrlRequest.OutputStreamDataSink outputStreamDataSink = javaUrlRequest.r;
                    final boolean z = javaUrlRequest.f.size() == 1;
                    outputStreamDataSink.d(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda1
                        @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                        public final void a() throws IOException {
                            JavaUploadDataSinkBase javaUploadDataSinkBase = outputStreamDataSink;
                            VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper2 = javaUploadDataSinkBase.c;
                            long length2 = uploadDataProviderWrapper2.getLength();
                            javaUploadDataSinkBase.e = length2;
                            if (length2 == 0) {
                                javaUploadDataSinkBase.e();
                                return;
                            }
                            if (length2 <= 0 || length2 >= 8192) {
                                javaUploadDataSinkBase.d = ByteBuffer.allocateDirect(8192);
                            } else {
                                javaUploadDataSinkBase.d = ByteBuffer.allocateDirect(((int) length2) + 1);
                            }
                            boolean z2 = z;
                            javaUploadDataSinkBase.g(javaUploadDataSinkBase.e);
                            if (z2) {
                                javaUploadDataSinkBase.j();
                            } else {
                                javaUploadDataSinkBase.a.set(1);
                                uploadDataProviderWrapper2.rewind(javaUploadDataSinkBase);
                            }
                        }
                    }, "start");
                }
            }
        }), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        ahkw.d(a, a.bq(str, "Exception in ", " method"), exc);
        this.y = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (atomicInteger.compareAndSet(i, i2)) {
            new akbj("Cronet JavaUrlRequest#transitionStates " + JavaUrlRequestUtils.a(i) + " -> " + JavaUrlRequestUtils.a(i2));
            runnable.run();
            return;
        }
        int i3 = atomicInteger.get();
        if (i3 == 8 || i3 == 6) {
            return;
        }
        throw new IllegalStateException("Invalid state transition - expected " + JavaUrlRequestUtils.a(i) + " but was " + JavaUrlRequestUtils.a(i3));
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        Preconditions.a(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        final JavaUrlRequestUtils.CheckedRunnable checkedRunnable = new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda8
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void a() throws IOException {
                int i;
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                ReadableByteChannel readableByteChannel = javaUrlRequest.n;
                final ByteBuffer byteBuffer2 = byteBuffer;
                if (readableByteChannel != null) {
                    javaUrlRequest.w++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    final JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback = javaUrlRequest.b;
                    final UrlResponseInfoImpl urlResponseInfoImpl = javaUrlRequest.o;
                    asyncUrlRequestCallback.a(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda3
                        @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                        public final void a() throws Exception {
                            JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback2 = asyncUrlRequestCallback;
                            JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                            String str2 = JavaUrlRequest.a;
                            if (javaUrlRequest2.g.compareAndSet(5, 4)) {
                                ByteBuffer byteBuffer3 = byteBuffer2;
                                asyncUrlRequestCallback2.a.onReadCompleted(javaUrlRequest2, urlResponseInfoImpl, byteBuffer3);
                            }
                        }
                    }, "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = javaUrlRequest.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (javaUrlRequest.g.compareAndSet(5, 7)) {
                    javaUrlRequest.f();
                    final JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback2 = javaUrlRequest.b;
                    final UrlResponseInfoImpl urlResponseInfoImpl2 = javaUrlRequest.o;
                    asyncUrlRequestCallback2.b(new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$AsyncUrlRequestCallback$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            JavaUrlRequest.AsyncUrlRequestCallback asyncUrlRequestCallback3 = asyncUrlRequestCallback2;
                            try {
                                asyncUrlRequestCallback3.a.onSucceeded(JavaUrlRequest.this, urlResponseInfoImpl2);
                            } catch (Exception e) {
                                JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                                String str2 = JavaUrlRequest.a;
                                javaUrlRequest2.i("onSucceded", e);
                            }
                            asyncUrlRequestCallback3.c();
                            JavaUrlRequest javaUrlRequest3 = JavaUrlRequest.this;
                            String str3 = JavaUrlRequest.a;
                            javaUrlRequest3.s.a();
                        }
                    }, "onSucceeded");
                }
            }
        };
        j(4, 5, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                javaUrlRequest.d(new JavaUrlRequest$$ExternalSyntheticLambda12(javaUrlRequest, checkedRunnable), "read");
            }
        });
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.c.incrementAndGet();
        j(0, 1, new Runnable() { // from class: org.chromium.net.impl.JavaUrlRequest$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                String str = JavaUrlRequest.a;
                JavaUrlRequest javaUrlRequest = this.a;
                javaUrlRequest.f.add(javaUrlRequest.m);
                javaUrlRequest.h();
            }
        });
    }
}
