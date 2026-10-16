package org.chromium.net.impl;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public class VersionSafeCallbacks {

    public static final class ApiVersion {
        public static int a() {
            return Integer.parseInt(org.chromium.net.ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 49;
        }
    }

    public static final class BidirectionalStreamCallback extends BidirectionalStream.Callback {
        private final BidirectionalStream.Callback a;

        public BidirectionalStreamCallback(BidirectionalStream.Callback callback) {
            this.a = callback;
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.a.onCanceled(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.a.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.a.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.a.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
            this.a.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onStreamReady(BidirectionalStream bidirectionalStream) {
            this.a.onStreamReady(bidirectionalStream);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.a.onSucceeded(bidirectionalStream, urlResponseInfo);
        }

        @Override // org.chromium.net.BidirectionalStream.Callback
        public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.a.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }
    }

    public static final class LibraryLoader extends CronetEngine.Builder.LibraryLoader {
        private final CronetEngine.Builder.LibraryLoader a;

        public LibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.a = libraryLoader;
        }

        @Override // org.chromium.net.CronetEngine.Builder.LibraryLoader
        public final void loadLibrary(String str) {
            this.a.loadLibrary(str);
        }
    }

    public static final class NetworkQualityRttListenerWrapper extends NetworkQualityRttListener {
        private final NetworkQualityRttListener a;

        public NetworkQualityRttListenerWrapper(NetworkQualityRttListener networkQualityRttListener) {
            super(networkQualityRttListener.getExecutor());
            this.a = networkQualityRttListener;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.a.equals(((NetworkQualityRttListenerWrapper) obj).a);
        }

        @Override // org.chromium.net.NetworkQualityRttListener
        public final Executor getExecutor() {
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

    public static final class NetworkQualityThroughputListenerWrapper extends NetworkQualityThroughputListener {
        private final NetworkQualityThroughputListener a;

        public NetworkQualityThroughputListenerWrapper(NetworkQualityThroughputListener networkQualityThroughputListener) {
            super(networkQualityThroughputListener.getExecutor());
            this.a = networkQualityThroughputListener;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.a.equals(((NetworkQualityThroughputListenerWrapper) obj).a);
        }

        @Override // org.chromium.net.NetworkQualityThroughputListener
        public final Executor getExecutor() {
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

    public static final class RequestFinishedInfoListener extends RequestFinishedInfo.Listener {
        private final RequestFinishedInfo.Listener a;

        public RequestFinishedInfoListener(RequestFinishedInfo.Listener listener) {
            super(listener.getExecutor());
            this.a = listener;
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public final Executor getExecutor() {
            return this.a.getExecutor();
        }

        @Override // org.chromium.net.RequestFinishedInfo.Listener
        public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
            this.a.onRequestFinished(requestFinishedInfo);
        }
    }

    public static final class UploadDataProviderWrapper extends UploadDataProvider {
        private final UploadDataProvider a;

        public UploadDataProviderWrapper(UploadDataProvider uploadDataProvider) {
            this.a = uploadDataProvider;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.a.close();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final long getLength() throws IOException {
            return this.a.getLength();
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            this.a.read(uploadDataSink, byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            this.a.rewind(uploadDataSink);
        }
    }

    public static final class UrlRequestCallback extends UrlRequest.Callback {
        private final UrlRequest.Callback a;

        public UrlRequestCallback(UrlRequest.Callback callback) {
            this.a = callback;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.a.onCanceled(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.a.onFailed(urlRequest, urlResponseInfo, cronetException);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
            this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
            this.a.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
            this.a.onResponseStarted(urlRequest, urlResponseInfo);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.a.onSucceeded(urlRequest, urlResponseInfo);
        }
    }

    public static final class UrlRequestStatusListener extends UrlRequest.StatusListener {
        private final UrlRequest.StatusListener a;

        public UrlRequestStatusListener(UrlRequest.StatusListener statusListener) {
            this.a = statusListener;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public final void onStatus(int i) {
            this.a.onStatus(i);
        }
    }
}
