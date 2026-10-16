package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ServiceWorkerWebSettingsCompat {

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    @Deprecated(forRemoval = true)
    public abstract Set<String> getRequestedWithHeaderOriginAllowList();

    public abstract boolean isIncludeCookiesOnShouldInterceptRequestEnabled();

    public abstract void setAllowContentAccess(boolean z);

    public abstract void setAllowFileAccess(boolean z);

    public abstract void setBlockNetworkLoads(boolean z);

    public abstract void setCacheMode(int i2);

    public abstract void setIncludeCookiesOnShouldInterceptRequestEnabled(boolean z);

    @Deprecated(forRemoval = true)
    public abstract void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
