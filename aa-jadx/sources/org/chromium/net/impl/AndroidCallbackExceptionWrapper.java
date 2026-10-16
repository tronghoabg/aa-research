package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidCallbackExceptionWrapper extends org.chromium.net.CallbackException {
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
