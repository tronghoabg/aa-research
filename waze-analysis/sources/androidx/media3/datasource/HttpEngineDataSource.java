package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import com.google.d.b.ab;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private long bytesRemaining;
    private final Clock clock;
    private final int connectTimeoutMs;
    private ab<String> contentTypePredicate;
    private volatile long currentConnectTimeoutMs;
    private DataSpec currentDataSpec;
    private UrlRequestWrapper currentUrlRequestWrapper;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private IOException exception;
    private final Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final HttpEngine httpEngine;
    private final boolean keepPostFor302Redirects;
    private final ConditionVariable operation;
    private ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;
    private UrlResponseInfo responseInfo;
    private boolean transferStarted;
    private final String userAgent;

    /* compiled from: WazeSource */
    final class UrlRequestCallback implements UrlRequest$Callback {
        private volatile boolean isClosed;
        final /* synthetic */ HttpEngineDataSource this$0;

        UrlRequestCallback(HttpEngineDataSource httpEngineDataSource) {
            Objects.requireNonNull(httpEngineDataSource);
            this.this$0 = httpEngineDataSource;
            this.isClosed = false;
        }

        public void close() {
            this.isClosed = true;
        }

        public synchronized void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
            if (this.isClosed) {
                return;
            }
            if (HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12426m((Object) httpException) && HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12407m((Object) httpException).getErrorCode() == 1) {
                this.this$0.exception = new UnknownHostException();
            } else {
                this.this$0.exception = httpException;
            }
            this.this$0.operation.open();
        }

        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            this.this$0.operation.open();
        }

        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            DataSpec dataSpecWithUri;
            int i2;
            if (this.isClosed) {
                return;
            }
            DataSpec dataSpec = this.this$0.currentDataSpec;
            an.B(dataSpec);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod == 2) {
                if (httpStatusCode == 307) {
                    i2 = httpStatusCode;
                } else if (httpStatusCode == 308) {
                    i2 = 308;
                }
                this.this$0.exception = new HttpDataSource.InvalidResponseCodeException(i2, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), dataSpec, Util.EMPTY_BYTE_ARRAY);
                this.this$0.operation.open();
                return;
            }
            if (this.this$0.resetTimeoutOnRedirects) {
                this.this$0.resetConnectTimeout();
            }
            CookieHandler cookieManager = CookieHandler.getDefault();
            if (cookieManager == null && this.this$0.handleSetCookieRequests) {
                cookieManager = new CookieManager();
            }
            String url = urlResponseInfo.getUrl();
            Map asMap = urlResponseInfo.getHeaders().getAsMap();
            HttpUtil.storeCookiesFromHeaders(url, asMap, cookieManager);
            String cookieHeader = HttpUtil.getCookieHeader(url, asMap, cookieManager);
            boolean z = false;
            if (this.this$0.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302) {
                z = true;
            }
            if (!z && (!this.this$0.handleSetCookieRequests || TextUtils.isEmpty(cookieHeader))) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest.cancel();
            if (z || dataSpec.httpMethod != 2) {
                dataSpecWithUri = dataSpec.withUri(Uri.parse(str));
            } else {
                DataSpec.Builder builderBuildUpon = dataSpec.buildUpon();
                builderBuildUpon.setUri(str);
                builderBuildUpon.setHttpMethod(1);
                builderBuildUpon.setHttpBody(null);
                dataSpecWithUri = builderBuildUpon.build();
            }
            if (!TextUtils.isEmpty(cookieHeader)) {
                HashMap map = new HashMap();
                map.putAll(dataSpec.httpRequestHeaders);
                map.put("Cookie", cookieHeader);
                DataSpec.Builder builderBuildUpon2 = dataSpecWithUri.buildUpon();
                builderBuildUpon2.setHttpRequestHeaders(map);
                dataSpecWithUri = builderBuildUpon2.build();
            }
            try {
                UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = this.this$0.buildRequestWrapper(dataSpecWithUri);
                if (this.this$0.currentUrlRequestWrapper != null) {
                    this.this$0.currentUrlRequestWrapper.close();
                }
                this.this$0.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
                this.this$0.currentUrlRequestWrapper.start();
            } catch (IOException e2) {
                this.this$0.exception = e2;
            }
        }

        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpUtil.storeCookiesFromHeaders(urlResponseInfo.getUrl(), urlResponseInfo.getHeaders().getAsMap(), CookieHandler.getDefault());
            this.this$0.responseInfo = urlResponseInfo;
            this.this$0.operation.open();
        }

        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            this.this$0.finished = true;
            this.this$0.operation.open();
        }
    }

    /* compiled from: WazeSource */
    final class UrlRequestWrapper {
        private final UrlRequest urlRequest;
        private final UrlRequestCallback urlRequestCallback;

        UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.urlRequest = urlRequest;
            this.urlRequestCallback = urlRequestCallback;
        }

        public void close() {
            this.urlRequestCallback.close();
            this.urlRequest.cancel();
        }

        public int getStatus() {
            final ConditionVariable conditionVariable = new ConditionVariable();
            final int[] iArr = new int[1];
            this.urlRequest.getStatus(new UrlRequest$StatusListener(this) { // from class: androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1
                {
                    Objects.requireNonNull(this);
                }

                public void onStatus(int i2) {
                    iArr[0] = i2;
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            return iArr[0];
        }

        public UrlRequestCallback getUrlRequestCallback() {
            return this.urlRequestCallback;
        }

        public void read(ByteBuffer byteBuffer) {
            this.urlRequest.read(byteBuffer);
        }

        public void start() {
            this.urlRequest.start();
        }
    }

    HttpEngineDataSource(HttpEngine httpEngine, Executor executor, int i2, int i3, int i4, boolean z, boolean z2, String str, HttpDataSource.RequestProperties requestProperties, ab<String> abVar, boolean z3) {
        super(true);
        an.B(httpEngine);
        this.httpEngine = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12406m((Object) httpEngine);
        an.B(executor);
        this.executor = executor;
        this.requestPriority = i2;
        this.connectTimeoutMs = i3;
        this.readTimeoutMs = i4;
        this.resetTimeoutOnRedirects = z;
        this.handleSetCookieRequests = z2;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = abVar;
        this.keepPostFor302Redirects = z3;
        this.clock = Clock.DEFAULT;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.operation = new ConditionVariable();
    }

    private boolean blockUntilConnectTimeout() {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean zBlock = false;
        while (!zBlock && jElapsedRealtime < this.currentConnectTimeoutMs) {
            ConditionVariable conditionVariable = this.operation;
            long j2 = this.currentConnectTimeoutMs - jElapsedRealtime;
            Clock clock = this.clock;
            zBlock = conditionVariable.block(j2 + 5);
            jElapsedRealtime = clock.elapsedRealtime();
        }
        return zBlock;
    }

    private UrlRequest.Builder buildRequestBuilder(DataSpec dataSpec, UrlRequest$Callback urlRequest$Callback) throws OpenException {
        UrlRequest.Builder directExecutorAllowed = this.httpEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.executor, urlRequest$Callback).setPriority(this.requestPriority).setDirectExecutorAllowed(true);
        HashMap map = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.requestProperties.getSnapshot());
        map.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !map.containsKey("Content-Type")) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (strBuildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            directExecutorAllowed.addHeader("User-Agent", str);
        }
        directExecutorAllowed.setHttpMethod(dataSpec.getHttpMethodString());
        if (dataSpec.httpBody != null) {
            directExecutorAllowed.setUploadDataProvider(new ByteArrayUploadDataProvider(dataSpec.httpBody), this.executor);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UrlRequestWrapper buildRequestWrapper(DataSpec dataSpec) {
        UrlRequestCallback urlRequestCallback = new UrlRequestCallback(this);
        return new UrlRequestWrapper(buildRequestBuilder(dataSpec, urlRequestCallback).build(), urlRequestCallback);
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.readBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        Iterator it = urlResponseInfo.getHeaders().getAsList().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                if (!((String) entry.getValue()).equalsIgnoreCase("identity")) {
                    return true;
                }
            }
        }
        return false;
    }

    private void readInternal(ByteBuffer byteBuffer, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException, SocketTimeoutException {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        int i2 = Util.SDK_INT;
        urlRequestWrapper.read(byteBuffer);
        try {
        } catch (InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            Thread.currentThread().interrupt();
            this.exception = new InterruptedIOException();
        } catch (SocketTimeoutException e2) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2002, 2);
        }
        if (!this.operation.block(this.readTimeoutMs)) {
            throw new SocketTimeoutException();
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource.HttpDataSourceException)) {
                throw HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
            }
            throw ((HttpDataSource.HttpDataSourceException) iOException);
        }
    }

    private byte[] readResponseBody() throws HttpDataSource.HttpDataSourceException, SocketTimeoutException {
        byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, this.currentDataSpec);
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, orCreateReadBuffer.remaining() + length);
                orCreateReadBuffer.get(bArrCopyOf, length, orCreateReadBuffer.remaining());
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + this.connectTimeoutMs;
    }

    private void skipFully(long j2, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException, InterruptedIOException {
        if (j2 == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j2 > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.finished) {
                    throw new OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                an.u(orCreateReadBuffer.hasRemaining());
                int iMin = (int) Math.min(orCreateReadBuffer.remaining(), j2);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + iMin);
                j2 -= iMin;
            } catch (IOException e2) {
                if (e2 instanceof HttpDataSource.HttpDataSourceException) {
                    throw ((HttpDataSource.HttpDataSourceException) e2);
                }
                throw new OpenException(e2, dataSpec, true != (e2 instanceof SocketTimeoutException) ? 2001 : 2002, 14);
            }
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void clearRequestProperty(String str) {
        this.requestProperties.remove(str);
    }

    @Override // androidx.media3.datasource.DataSource
    public synchronized void close() {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper != null) {
            urlRequestWrapper.close();
            this.currentUrlRequestWrapper = null;
        }
        ByteBuffer byteBuffer = this.readBuffer;
        if (byteBuffer != null) {
            byteBuffer.limit(0);
        }
        this.currentDataSpec = null;
        this.responseInfo = null;
        this.exception = null;
        this.finished = false;
        if (this.transferStarted) {
            this.transferStarted = false;
            transferEnded();
        }
    }

    UrlRequestCallback getCurrentUrlRequestCallback() {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper == null) {
            return null;
        }
        return urlRequestWrapper.getUrlRequestCallback();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public int getResponseCode() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.responseInfo.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        DataSpec dataSpec = this.currentDataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException, NumberFormatException, InterruptedIOException {
        byte[] responseBody;
        String firstHeader;
        an.B(dataSpec);
        an.u(!this.transferStarted);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = buildRequestWrapper(dataSpec);
            this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
            urlRequestWrapperBuildRequestWrapper.start();
            transferInitializing(dataSpec);
            try {
                boolean zBlockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.exception;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !an.K(message).contains("err_cleartext_not_permitted")) {
                        throw new OpenException(iOException, dataSpec, 2001, urlRequestWrapperBuildRequestWrapper.getStatus());
                    }
                    throw new HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                }
                if (!zBlockUntilConnectTimeout) {
                    throw new OpenException(new SocketTimeoutException(), dataSpec, 2002, urlRequestWrapperBuildRequestWrapper.getStatus());
                }
                UrlResponseInfo urlResponseInfo = this.responseInfo;
                an.B(urlResponseInfo);
                UrlResponseInfo urlResponseInfoM12408m = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12408m((Object) urlResponseInfo);
                int httpStatusCode = urlResponseInfoM12408m.getHttpStatusCode();
                Map asMap = urlResponseInfoM12408m.getHeaders().getAsMap();
                long j2 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == HttpUtil.getDocumentSize(getFirstHeader(asMap, "Content-Range"))) {
                            this.transferStarted = true;
                            transferStarted(dataSpec);
                            long j3 = dataSpec.length;
                            if (j3 != -1) {
                                return j3;
                            }
                            return 0L;
                        }
                    }
                    try {
                        responseBody = readResponseBody();
                    } catch (IOException unused) {
                        responseBody = Util.EMPTY_BYTE_ARRAY;
                    }
                    throw new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfoM12408m.getHttpStatusText(), httpStatusCode == 416 ? new DataSourceException(2008) : null, asMap, dataSpec, responseBody);
                }
                ab<String> abVar = this.contentTypePredicate;
                if (abVar != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !abVar.apply(firstHeader)) {
                    throw new HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200) {
                    long j4 = dataSpec.position;
                    if (j4 != 0) {
                        j2 = j4;
                    }
                }
                if (isCompressed(urlResponseInfoM12408m)) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long j5 = dataSpec.length;
                    if (j5 != -1) {
                        this.bytesRemaining = j5;
                    } else {
                        long contentLength = HttpUtil.getContentLength(getFirstHeader(asMap, "Content-Length"), getFirstHeader(asMap, "Content-Range"));
                        this.bytesRemaining = contentLength != -1 ? contentLength - j2 : -1L;
                    }
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                skipFully(j2, dataSpec);
                return this.bytesRemaining;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new OpenException(new InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (IOException e2) {
            if (e2 instanceof HttpDataSource.HttpDataSourceException) {
                throw ((HttpDataSource.HttpDataSourceException) e2);
            }
            throw new OpenException(e2, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) throws HttpDataSource.HttpDataSourceException, SocketTimeoutException {
        an.u(this.transferStarted);
        if (i3 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            DataSpec dataSpec = this.currentDataSpec;
            int i4 = Util.SDK_INT;
            readInternal(orCreateReadBuffer, dataSpec);
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            an.u(orCreateReadBuffer.hasRemaining());
        }
        long j2 = this.bytesRemaining;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        long[] jArr = {j2, orCreateReadBuffer.remaining(), i3};
        an.l(true);
        long j3 = jArr[0];
        for (int i5 = 1; i5 < 3; i5++) {
            long j4 = jArr[i5];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        int i6 = (int) j3;
        orCreateReadBuffer.get(bArr, i2, i6);
        long j5 = this.bytesRemaining;
        if (j5 != -1) {
            this.bytesRemaining = j5 - i6;
        }
        bytesTransferred(i6);
        return i6;
    }

    @Override // androidx.media3.datasource.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        this.requestProperties.set(str, str2);
    }

    /* compiled from: WazeSource */
    public final class Factory implements HttpDataSource.Factory {
        private int connectTimeoutMs;
        private ab<String> contentTypePredicate;
        private final HttpDataSource.RequestProperties defaultRequestProperties;
        private final Executor executor;
        private boolean handleSetCookieRequests;
        private final HttpEngine httpEngine;
        private boolean keepPostFor302Redirects;
        private int readTimeoutMs;
        private int requestPriority;
        private boolean resetTimeoutOnRedirects;
        private TransferListener transferListener;
        private String userAgent;

        public Factory(HttpEngine httpEngine, Executor executor) {
            an.B(httpEngine);
            this.httpEngine = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12406m((Object) httpEngine);
            this.executor = executor;
            this.defaultRequestProperties = new HttpDataSource.RequestProperties();
            this.requestPriority = 3;
            this.connectTimeoutMs = 8000;
            this.readTimeoutMs = 8000;
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public HttpDataSource createDataSource() {
            HttpEngineDataSource httpEngineDataSource = new HttpEngineDataSource(this.httpEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                httpEngineDataSource.addTransferListener(transferListener);
            }
            return httpEngineDataSource;
        }

        public Factory setConnectionTimeoutMs(int i2) {
            this.connectTimeoutMs = i2;
            return this;
        }

        public Factory setContentTypePredicate(ab<String> abVar) {
            this.contentTypePredicate = abVar;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public Factory setHandleSetCookieRequests(boolean z) {
            this.handleSetCookieRequests = z;
            return this;
        }

        public Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        public Factory setReadTimeoutMs(int i2) {
            this.readTimeoutMs = i2;
            return this;
        }

        public Factory setRequestPriority(int i2) {
            this.requestPriority = i2;
            return this;
        }

        public Factory setResetTimeoutOnRedirects(boolean z) {
            this.resetTimeoutOnRedirects = z;
            return this;
        }

        public Factory setTransferListener(TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public Factory setUserAgent(String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            setDefaultRequestProperties((Map<String, String>) map);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class OpenException extends HttpDataSource.HttpDataSourceException {
        public final int httpEngineConnectionStatus;

        public OpenException(DataSpec dataSpec, int i2, int i3) {
            super(dataSpec, i2, 1);
            this.httpEngineConnectionStatus = i3;
        }

        public OpenException(IOException iOException, DataSpec dataSpec, int i2, int i3) {
            super(iOException, dataSpec, i2, 1);
            this.httpEngineConnectionStatus = i3;
        }

        public OpenException(String str, DataSpec dataSpec, int i2, int i3) {
            super(str, dataSpec, i2, 1);
            this.httpEngineConnectionStatus = i3;
        }
    }

    public int read(ByteBuffer byteBuffer) throws HttpDataSource.HttpDataSourceException, SocketTimeoutException {
        int iCopyByteBuffer;
        an.u(this.transferStarted);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.bytesRemaining == 0) {
                return -1;
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.readBuffer;
            if (byteBuffer2 != null && (iCopyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j2 = this.bytesRemaining;
                if (j2 != -1) {
                    this.bytesRemaining = j2 - iCopyByteBuffer;
                }
                bytesTransferred(iCopyByteBuffer);
                return iCopyByteBuffer;
            }
            this.operation.close();
            DataSpec dataSpec = this.currentDataSpec;
            int i2 = Util.SDK_INT;
            readInternal(byteBuffer, dataSpec);
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            an.u(iRemaining > byteBuffer.remaining());
            int iRemaining2 = iRemaining - byteBuffer.remaining();
            long j3 = this.bytesRemaining;
            if (j3 != -1) {
                this.bytesRemaining = j3 - iRemaining2;
            }
            bytesTransferred(iRemaining2);
            return iRemaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
