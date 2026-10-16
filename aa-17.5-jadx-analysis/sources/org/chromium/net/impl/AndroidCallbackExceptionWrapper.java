package org.chromium.net.impl;

import org.chromium.net.CallbackException;

/* loaded from: classes2.dex */
class AndroidCallbackExceptionWrapper extends CallbackException {
    protected AndroidCallbackExceptionWrapper(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
