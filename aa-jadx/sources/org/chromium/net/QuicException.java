package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class QuicException extends org.chromium.net.NetworkException {
    protected QuicException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public int getConnectionCloseSource() {
        return 0;
    }

    public abstract int getQuicDetailedErrorCode();
}
