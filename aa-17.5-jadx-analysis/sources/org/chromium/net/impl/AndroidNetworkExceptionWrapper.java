package org.chromium.net.impl;

import defpackage.ols$$ExternalSyntheticApiModelOutline2;
import org.chromium.net.NetworkException;

/* loaded from: classes2.dex */
class AndroidNetworkExceptionWrapper extends NetworkException {
    public final android.net.http.NetworkException a;

    public AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), networkException);
        this.a = networkException;
        if (!z && ols$$ExternalSyntheticApiModelOutline2.m373m((Object) networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -508;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.isImmediatelyRetryable();
    }

    public AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException) {
        this(networkException, false);
    }
}
