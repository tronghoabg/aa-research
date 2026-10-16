package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
class AndroidQuicExceptionWrapper extends org.chromium.net.QuicException {
    private final org.chromium.net.impl.AndroidNetworkExceptionWrapper a;

    public AndroidQuicExceptionWrapper(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.a = new org.chromium.net.impl.AndroidNetworkExceptionWrapper(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -508;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.a.isImmediatelyRetryable();
    }
}
