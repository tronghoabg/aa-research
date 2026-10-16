package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes4.dex */
public final class l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        ((l) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (((((int) 2800) * 31) + 3) * 31) + ((int) 200);
    }

    public final String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=2800, fetchRetryMax=3, fetchRetryDelayMillis=200)";
    }
}
