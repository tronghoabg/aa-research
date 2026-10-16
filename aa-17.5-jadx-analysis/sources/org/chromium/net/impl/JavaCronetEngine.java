package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import defpackage.ahkw;
import defpackage.akbj;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
public final class JavaCronetEngine extends CronetEngineBase {
    private static final String e = "JavaCronetEngine";
    public final int a;
    public final CronetLogger b;
    public final Context d;
    private final String f;
    private final ExecutorService g;
    public final AtomicInteger c = new AtomicInteger();
    private long h = -1;

    public JavaCronetEngine(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        int i;
        new akbj("JavaCronetEngine#JavaCronetEngine");
        Context context = cronetEngineBuilderImpl.c;
        this.d = context;
        int iHashCode = hashCode();
        this.a = iHashCode;
        this.f = cronetEngineBuilderImpl.e;
        this.g = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this) { // from class: org.chromium.net.impl.JavaCronetEngine.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return Executors.defaultThreadFactory().newThread(new Runnable(this) { // from class: org.chromium.net.impl.JavaCronetEngine.1.1
                    @Override // java.lang.Runnable
                    public final void run() throws SecurityException, IllegalArgumentException {
                        Thread.currentThread().setName("JavaCronetEngine");
                        Process.setThreadPriority(0);
                        runnable.run();
                    }
                });
            }
        });
        CronetLogger.CronetSource cronetSource = CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK;
        CronetLogger cronetLoggerA = CronetLoggerFactory.a(context, cronetSource);
        this.b = cronetLoggerA;
        long j = iHashCode;
        try {
            boolean z = cronetEngineBuilderImpl.d;
            String str = cronetEngineBuilderImpl.e;
            String str2 = cronetEngineBuilderImpl.f;
            boolean z2 = cronetEngineBuilderImpl.g;
            boolean z3 = cronetEngineBuilderImpl.h;
            boolean z4 = cronetEngineBuilderImpl.i;
            int iOrdinal = cronetEngineBuilderImpl.j.ordinal();
            if (iOrdinal == 0) {
                i = 0;
            } else if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal == 2) {
                i = 2;
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unknown internal builder cache mode");
                }
                i = 1;
            }
            cronetLoggerA.c(j, new CronetLogger.CronetEngineBuilderInfo(z, str, str2, z2, z3, z4, i, cronetEngineBuilderImpl.k, cronetEngineBuilderImpl.l, 0, cronetEngineBuilderImpl.getLogCronetInitializationRef()), new CronetLogger.CronetVersion(getVersionString().split("/")[1].split("@")[0]), cronetSource);
        } catch (RuntimeException e2) {
            ahkw.d(e, "Error while trying to log JavaCronetEngine creation: ", e2);
        }
        ahkw.h(e, "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
    }

    final void a() {
        this.c.decrementAndGet();
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    protected final ExperimentalBidirectionalStream b(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.h = j;
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public final ExperimentalUrlRequest c(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        if (j != -1) {
            this.h = j;
        }
        return new JavaUrlRequest(this, callback, this.g, executor, str, this.f, z2, z3, i2, z4, i3, this.h, str2, arrayList, uploadDataProvider, executor2);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new URLStreamHandlerFactory(this) { // from class: org.chromium.net.impl.JavaCronetEngine.2
            @Override // java.net.URLStreamHandlerFactory
            public final URLStreamHandler createURLStreamHandler(String str) {
                return null;
            }
        };
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.c.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new UrlRequestBuilderImpl(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) throws IOException {
        return url.openConnection();
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.g.shutdown();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
    }
}
