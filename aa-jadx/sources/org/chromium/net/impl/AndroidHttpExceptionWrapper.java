package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidHttpExceptionWrapper extends org.chromium.net.CronetException {
    public AndroidHttpExceptionWrapper(android.net.http.HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
