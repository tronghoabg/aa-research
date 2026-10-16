package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidNetworkExceptionWrapper extends org.chromium.net.NetworkException {
    public final android.net.http.NetworkException a;

    public AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), networkException);
        this.a = networkException;
        if (!z && defpackage.omv$$ExternalSyntheticApiModelOutline1.m378m((java.lang.Object) networkException)) {
            throw new java.lang.IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
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
