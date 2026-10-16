package org.chromium.support_lib_boundary;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface HttpCacheBoundaryInterface {
    long getDefaultQuotaBytes();

    long getQuotaBytes();

    boolean isUsingDefaultQuota();

    void setQuotaBytes(long j2);

    void useDefaultQuota();
}
