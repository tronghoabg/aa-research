package org.chromium.net.impl;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* loaded from: classes2.dex */
class AndroidHttpExceptionWrapper extends CronetException {
    public AndroidHttpExceptionWrapper(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
