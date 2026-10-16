package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* loaded from: classes2.dex */
public class QuicExceptionImpl extends QuicException {
    private final int a;
    private final int b;
    private final NetworkExceptionImpl c;

    public QuicExceptionImpl(String str, int i, int i2, int i3, int i4) {
        super(str, null);
        this.c = new NetworkExceptionImpl(str, i, i2);
        this.a = i3;
        this.b = i4;
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.c.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.c.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c.getMessage() + ", QuicDetailedErrorCode=" + this.a + ", Source=" + this.b;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.c.immediatelyRetryable();
    }

    @Deprecated
    public QuicExceptionImpl(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, 0);
    }
}
