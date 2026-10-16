package org.chromium.net.impl;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionTranslationUtils;

/* loaded from: classes2.dex */
class AndroidUrlRequestCallbackWrapper implements UrlRequest$Callback {
    public static final /* synthetic */ int c = 0;
    public final UrlRequest.Callback a;
    public AndroidUrlRequestWrapper b;

    public AndroidUrlRequestCallbackWrapper(UrlRequest.Callback callback) {
        callback.getClass();
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperB = AndroidUrlResponseInfoWrapper.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, androidUrlResponseInfoWrapperB);
        } finally {
            this.b.a(2, androidUrlResponseInfoWrapperB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperB = AndroidUrlResponseInfoWrapper.b(urlResponseInfo);
        CronetException cronetExceptionB = CronetExceptionTranslationUtils.b(httpException);
        try {
            this.a.onFailed(this.b, androidUrlResponseInfoWrapperB, cronetExceptionB);
        } finally {
            this.b.a(1, androidUrlResponseInfoWrapperB, cronetExceptionB);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) throws Exception {
        CronetExceptionTranslationUtils.a(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda1
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object a() throws Exception {
                int i = AndroidUrlRequestCallbackWrapper.c;
                AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper = this.a;
                androidUrlRequestCallbackWrapper.a.onReadCompleted(androidUrlRequestCallbackWrapper.b, AndroidUrlResponseInfoWrapper.b(urlResponseInfo), byteBuffer);
                return null;
            }
        }, Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String str) throws Exception {
        CronetExceptionTranslationUtils.a(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda2
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object a() throws Exception {
                int i = AndroidUrlRequestCallbackWrapper.c;
                AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper = this.a;
                androidUrlRequestCallbackWrapper.a.onRedirectReceived(androidUrlRequestCallbackWrapper.b, AndroidUrlResponseInfoWrapper.b(urlResponseInfo), str);
                return null;
            }
        }, Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) throws Exception {
        CronetExceptionTranslationUtils.a(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda0
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object a() throws Exception {
                int i = AndroidUrlRequestCallbackWrapper.c;
                AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper = this.a;
                androidUrlRequestCallbackWrapper.a.onResponseStarted(androidUrlRequestCallbackWrapper.b, AndroidUrlResponseInfoWrapper.b(urlResponseInfo));
                return null;
            }
        }, Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapperB = AndroidUrlResponseInfoWrapper.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, androidUrlResponseInfoWrapperB);
        } finally {
            this.b.a(0, androidUrlResponseInfoWrapperB, null);
        }
    }
}
