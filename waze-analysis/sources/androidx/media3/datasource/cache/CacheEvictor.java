package androidx.media3.datasource.cache;

import androidx.media3.datasource.cache.Cache;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j2, long j3);

    boolean requiresCacheSpanTouches();
}
