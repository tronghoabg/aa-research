package org.chromium.net.impl;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* loaded from: classes2.dex */
class AndroidBidirectionalStreamCallbackWrapper implements BidirectionalStream$Callback {
    public AndroidBidirectionalStreamWrapper a;
    private final BidirectionalStream.Callback b;

    public AndroidBidirectionalStreamCallbackWrapper(BidirectionalStream.Callback callback) {
        callback.getClass();
        this.b = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperA = AndroidUrlResponseInfoWrapper.a(urlResponseInfo);
        try {
            this.b.onCanceled(this.a, androidUrlResponseInfoWrapperA);
        } finally {
            this.a.a(2, androidUrlResponseInfoWrapperA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperA = AndroidUrlResponseInfoWrapper.a(urlResponseInfo);
        CronetException cronetExceptionB = CronetExceptionTranslationUtils.b(httpException);
        try {
            this.b.onFailed(this.a, androidUrlResponseInfoWrapperA, cronetExceptionB);
        } finally {
            this.a.a(1, androidUrlResponseInfoWrapperA, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onReadCompleted(this.a, AndroidUrlResponseInfoWrapper.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.b.onResponseHeadersReceived(this.a, AndroidUrlResponseInfoWrapper.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.b.onResponseTrailersReceived(this.a, AndroidUrlResponseInfoWrapper.a(urlResponseInfo), new AndroidHeaderBlockWrapper(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.b.onStreamReady(this.a);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperA = AndroidUrlResponseInfoWrapper.a(urlResponseInfo);
        try {
            this.b.onSucceeded(this.a, androidUrlResponseInfoWrapperA);
        } finally {
            this.a.a(0, androidUrlResponseInfoWrapperA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.b.onWriteCompleted(this.a, AndroidUrlResponseInfoWrapper.a(urlResponseInfo), byteBuffer, z);
    }
}
