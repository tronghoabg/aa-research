package androidx.webkit;

import org.chromium.support_lib_boundary.HttpCacheBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class HttpCache {
    private final HttpCacheBoundaryInterface mHttpCacheImpl;

    public HttpCache(HttpCacheBoundaryInterface httpCacheBoundaryInterface) {
        this.mHttpCacheImpl = httpCacheBoundaryInterface;
    }

    public long getDefaultQuotaBytes() {
        return this.mHttpCacheImpl.getDefaultQuotaBytes();
    }

    public long getQuotaBytes() {
        return this.mHttpCacheImpl.getQuotaBytes();
    }

    public boolean isUsingDefaultQuota() {
        return this.mHttpCacheImpl.isUsingDefaultQuota();
    }

    public void setQuotaBytes(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("Quota must be non-negative");
        }
        this.mHttpCacheImpl.setQuotaBytes(j2);
    }

    public void useDefaultQuota() {
        this.mHttpCacheImpl.useDefaultQuota();
    }
}
