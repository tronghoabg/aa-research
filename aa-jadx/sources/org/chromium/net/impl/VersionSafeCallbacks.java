package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public class VersionSafeCallbacks {

    public static final class ApiVersion {
        public static int a() {
            return java.lang.Integer.parseInt(org.chromium.net.ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 49;
        }
    }

    public static final class BidirectionalStreamCallback extends org.chromium.net.BidirectionalStream.Callback {
        private final org.chromium.net.BidirectionalStream.Callback a;

        public BidirectionalStreamCallback(org.chromium.net.BidirectionalStream.Callback callback) {
            this.a = callback;
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onCanceled(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.a.onCanceled(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onFailed(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            this.a.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onReadCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
            this.a.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onResponseHeadersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.a.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onResponseTrailersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.UrlResponseInfo.HeaderBlock headerBlock) {
            this.a.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onStreamReady(org.chromium.net.BidirectionalStream bidirectionalStream) {
            this.a.onStreamReady(bidirectionalStream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onSucceeded(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.a.onSucceeded(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onWriteCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
            this.a.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }
    }

    public static final class LibraryLoader extends org.chromium.net.CronetEngine.Builder.LibraryLoader {
        private final org.chromium.net.CronetEngine.Builder.LibraryLoader a;

        public LibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.a = libraryLoader;
        }

        @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
        public final void loadLibrary(java.lang.String str) {
            this.a.loadLibrary(str);
        }
    }

    public static final class NetworkQualityRttListenerWrapper extends org.chromium.net.NetworkQualityRttListener {
        private final org.chromium.net.NetworkQualityRttListener a;

        public NetworkQualityRttListenerWrapper(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
            super(networkQualityRttListener.getExecutor());
            this.a = networkQualityRttListener;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.a.equals(((org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper) obj).a);
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public final java.util.concurrent.Executor getExecutor() {
            return this.a.getExecutor();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public final void onRttObservation(int i, long j, int i2) {
            this.a.onRttObservation(i, j, i2);
        }
    }

    public static final class NetworkQualityThroughputListenerWrapper extends org.chromium.net.NetworkQualityThroughputListener {
        private final org.chromium.net.NetworkQualityThroughputListener a;

        public NetworkQualityThroughputListenerWrapper(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
            super(networkQualityThroughputListener.getExecutor());
            this.a = networkQualityThroughputListener;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.a.equals(((org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper) obj).a);
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public final java.util.concurrent.Executor getExecutor() {
            return this.a.getExecutor();
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public final void onThroughputObservation(int i, long j, int i2) {
            this.a.onThroughputObservation(i, j, i2);
        }
    }

    public static final class RequestFinishedInfoListener extends org.chromium.net.RequestFinishedInfo.Listener {
        private final org.chromium.net.RequestFinishedInfo.Listener a;

        public RequestFinishedInfoListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
            super(listener.getExecutor());
            this.a = listener;
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public final java.util.concurrent.Executor getExecutor() {
            return this.a.getExecutor();
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public final void onRequestFinished(org.chromium.net.RequestFinishedInfo requestFinishedInfo) {
            this.a.onRequestFinished(requestFinishedInfo);
        }
    }

    public static final class UploadDataProviderWrapper extends org.chromium.net.UploadDataProvider {
        private final org.chromium.net.UploadDataProvider a;

        public UploadDataProviderWrapper(org.chromium.net.UploadDataProvider uploadDataProvider) {
            this.a = uploadDataProvider;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            this.a.close();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() throws java.io.IOException {
            return this.a.getLength();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            this.a.read(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException {
            this.a.rewind(uploadDataSink);
        }
    }

    public static final class UrlRequestCallback extends org.chromium.net.UrlRequest.Callback {
        private final org.chromium.net.UrlRequest.Callback a;

        public UrlRequestCallback(org.chromium.net.UrlRequest.Callback callback) {
            this.a = callback;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onCanceled(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.a.onCanceled(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onFailed(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
            this.a.onFailed(urlRequest, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onReadCompleted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer) throws java.lang.Exception {
            this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onRedirectReceived(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) throws java.lang.Exception {
            this.a.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onResponseStarted(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) throws java.lang.Exception {
            this.a.onResponseStarted(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onSucceeded(org.chromium.net.UrlRequest urlRequest, org.chromium.net.UrlResponseInfo urlResponseInfo) {
            this.a.onSucceeded(urlRequest, urlResponseInfo);
        }
    }

    public static final class UrlRequestStatusListener extends org.chromium.net.UrlRequest.StatusListener {
        private final org.chromium.net.UrlRequest.StatusListener a;

        public UrlRequestStatusListener(org.chromium.net.UrlRequest.StatusListener statusListener) {
            this.a = statusListener;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public final void onStatus(int i) {
            this.a.onStatus(i);
        }
    }
}
