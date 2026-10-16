package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    /* compiled from: WazeSource */
    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    NavigableSet<CacheSpan> addListener(String str, Listener listener);

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations);

    void commitFile(File file, long j2);

    long getCacheSpace();

    long getCachedBytes(String str, long j2, long j3);

    long getCachedLength(String str, long j2, long j3);

    NavigableSet<CacheSpan> getCachedSpans(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String str, long j2, long j3);

    void release();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeListener(String str, Listener listener);

    void removeResource(String str);

    void removeSpan(CacheSpan cacheSpan);

    File startFile(String str, long j2, long j3);

    CacheSpan startReadWrite(String str, long j2, long j3);

    CacheSpan startReadWriteNonBlocking(String str, long j2, long j3);

    /* compiled from: WazeSource */
    public class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }

        public CacheException(Throwable th) {
            super(th);
        }
    }
}
