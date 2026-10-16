package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.PlaceholderDataSource;
import androidx.media3.datasource.PriorityDataSource;
import androidx.media3.datasource.TeeDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.ContentMetadata;
import com.google.d.b.an;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    private static final int CACHE_NOT_IGNORED = -1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final long MIN_READ_BEFORE_CHECKING_CACHE = 102400;
    private Uri actualUri;
    private final boolean blockOnCache;
    private long bytesRemaining;
    private final Cache cache;
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource cacheReadDataSource;
    private final DataSource cacheWriteDataSource;
    private long checkCachePosition;
    private DataSource currentDataSource;
    private long currentDataSourceBytesRead;
    private DataSpec currentDataSpec;
    private CacheSpan currentHoleSpan;
    private boolean currentRequestIgnoresCache;
    private final EventListener eventListener;
    private final boolean ignoreCacheForUnsetLengthRequests;
    private final boolean ignoreCacheOnError;
    private long readPosition;
    private DataSpec requestDataSpec;
    private boolean seenCacheError;
    private long totalCachedBytesRead;
    private final DataSource upstreamDataSource;

    /* compiled from: WazeSource */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    /* compiled from: WazeSource */
    public interface EventListener {
        void onCacheIgnored(int i2);

        void onCachedBytesRead(long j2, long j3);
    }

    /* compiled from: WazeSource */
    public final class Factory implements DataSource.Factory {
        private Cache cache;
        private boolean cacheIsReadOnly;
        private DataSink.Factory cacheWriteDataSinkFactory;
        private EventListener eventListener;
        private int flags;
        private DataSource.Factory upstreamDataSourceFactory;
        private int upstreamPriority;
        private PriorityTaskManager upstreamPriorityTaskManager;
        private DataSource.Factory cacheReadDataSourceFactory = new FileDataSource.Factory();
        private CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;

        private CacheDataSource createDataSourceInternal(DataSource dataSource, int i2, int i3) {
            Cache cache = this.cache;
            an.B(cache);
            DataSink dataSinkCreateDataSink = null;
            if (!this.cacheIsReadOnly && dataSource != null) {
                DataSink.Factory factory = this.cacheWriteDataSinkFactory;
                if (factory != null) {
                    dataSinkCreateDataSink = factory.createDataSink();
                } else {
                    CacheDataSink.Factory factory2 = new CacheDataSink.Factory();
                    factory2.setCache(cache);
                    dataSinkCreateDataSink = factory2.createDataSink();
                }
            }
            return new CacheDataSource(cache, dataSource, this.cacheReadDataSourceFactory.createDataSource(), dataSinkCreateDataSink, this.cacheKeyFactory, i2, this.upstreamPriorityTaskManager, i3, this.eventListener);
        }

        @Override // androidx.media3.datasource.DataSource.Factory
        public CacheDataSource createDataSource() {
            DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags, this.upstreamPriority);
        }

        public CacheDataSource createDataSourceForDownloading() {
            DataSource.Factory factory = this.upstreamDataSourceFactory;
            return createDataSourceInternal(factory != null ? factory.createDataSource() : null, this.flags | 1, -4000);
        }

        public CacheDataSource createDataSourceForRemovingDownload() {
            return createDataSourceInternal(null, this.flags | 1, -4000);
        }

        public Cache getCache() {
            return this.cache;
        }

        public CacheKeyFactory getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.upstreamPriorityTaskManager;
        }

        public Factory setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public Factory setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.cacheKeyFactory = cacheKeyFactory;
            return this;
        }

        public Factory setCacheReadDataSourceFactory(DataSource.Factory factory) {
            this.cacheReadDataSourceFactory = factory;
            return this;
        }

        public Factory setCacheWriteDataSinkFactory(DataSink.Factory factory) {
            this.cacheWriteDataSinkFactory = factory;
            this.cacheIsReadOnly = factory == null;
            return this;
        }

        public Factory setEventListener(EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        public Factory setFlags(int i2) {
            this.flags = i2;
            return this;
        }

        public Factory setUpstreamDataSourceFactory(DataSource.Factory factory) {
            this.upstreamDataSourceFactory = factory;
            return this;
        }

        public Factory setUpstreamPriority(int i2) {
            this.upstreamPriority = i2;
            return this;
        }

        public Factory setUpstreamPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.upstreamPriorityTaskManager = priorityTaskManager;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i2, PriorityTaskManager priorityTaskManager, int i3, EventListener eventListener) {
        this.cache = cache;
        this.cacheReadDataSource = dataSource2;
        this.cacheKeyFactory = cacheKeyFactory == null ? CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.blockOnCache = 1 == (i2 & 1);
        this.ignoreCacheOnError = (i2 & 2) != 0;
        this.ignoreCacheForUnsetLengthRequests = (i2 & 4) != 0;
        TeeDataSource teeDataSource = null;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new PriorityDataSource(dataSource, priorityTaskManager, i3) : dataSource;
            this.upstreamDataSource = dataSource;
            if (dataSink != null) {
                teeDataSource = new TeeDataSource(dataSource, dataSink);
            }
        } else {
            this.upstreamDataSource = PlaceholderDataSource.INSTANCE;
        }
        this.cacheWriteDataSource = teeDataSource;
        this.eventListener = eventListener;
    }

    private void closeCurrentSource() {
        DataSource dataSource = this.currentDataSource;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
            this.currentDataSpec = null;
            this.currentDataSource = null;
            CacheSpan cacheSpan = this.currentHoleSpan;
            if (cacheSpan != null) {
                this.cache.releaseHoleSpan(cacheSpan);
                this.currentHoleSpan = null;
            }
        } catch (Throwable th) {
            this.currentDataSpec = null;
            this.currentDataSource = null;
            CacheSpan cacheSpan2 = this.currentHoleSpan;
            if (cacheSpan2 != null) {
                this.cache.releaseHoleSpan(cacheSpan2);
                this.currentHoleSpan = null;
            }
            throw th;
        }
    }

    private static Uri getRedirectedUriOrDefault(Cache cache, String str, Uri uri) {
        Uri redirectedUri = ContentMetadata.CC.getRedirectedUri(cache.getContentMetadata(str));
        return redirectedUri != null ? redirectedUri : uri;
    }

    private void handleBeforeThrow(Throwable th) {
        if (isReadingFromCache() || (th instanceof Cache.CacheException)) {
            this.seenCacheError = true;
        }
    }

    private boolean isBypassingCache() {
        return this.currentDataSource == this.upstreamDataSource;
    }

    private boolean isReadingFromCache() {
        return this.currentDataSource == this.cacheReadDataSource;
    }

    private boolean isReadingFromUpstream() {
        return !isReadingFromCache();
    }

    private boolean isWritingToCache() {
        return this.currentDataSource == this.cacheWriteDataSource;
    }

    private void notifyBytesRead() {
        EventListener eventListener = this.eventListener;
        if (eventListener == null || this.totalCachedBytesRead <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.cache.getCacheSpace(), this.totalCachedBytesRead);
        this.totalCachedBytesRead = 0L;
    }

    private void notifyCacheIgnored(int i2) {
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i2);
        }
    }

    private void openNextSource(DataSpec dataSpec, boolean z) throws InterruptedIOException {
        CacheSpan cacheSpanStartReadWrite;
        long j2;
        long jMin;
        DataSpec dataSpecBuild;
        DataSource dataSource;
        String str = dataSpec.key;
        int i2 = Util.SDK_INT;
        if (this.currentRequestIgnoresCache) {
            cacheSpanStartReadWrite = null;
        } else {
            boolean z2 = this.blockOnCache;
            Cache cache = this.cache;
            if (z2) {
                try {
                    cacheSpanStartReadWrite = cache.startReadWrite(str, this.readPosition, this.bytesRemaining);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                cacheSpanStartReadWrite = cache.startReadWriteNonBlocking(str, this.readPosition, this.bytesRemaining);
            }
        }
        if (cacheSpanStartReadWrite == null) {
            dataSource = this.upstreamDataSource;
            DataSpec.Builder builderBuildUpon = dataSpec.buildUpon();
            builderBuildUpon.setPosition(this.readPosition);
            builderBuildUpon.setLength(this.bytesRemaining);
            dataSpecBuild = builderBuildUpon.build();
            j2 = -1;
        } else if (cacheSpanStartReadWrite.isCached) {
            Uri uriFromFile = Uri.fromFile(cacheSpanStartReadWrite.file);
            long j3 = cacheSpanStartReadWrite.position;
            long j4 = this.readPosition - j3;
            long j5 = cacheSpanStartReadWrite.length;
            j2 = -1;
            long j6 = this.bytesRemaining;
            long jMin2 = j5 - j4;
            if (j6 != -1) {
                jMin2 = Math.min(jMin2, j6);
            }
            DataSpec.Builder builderBuildUpon2 = dataSpec.buildUpon();
            builderBuildUpon2.setUri(uriFromFile);
            builderBuildUpon2.setUriPositionOffset(j3);
            builderBuildUpon2.setPosition(j4);
            builderBuildUpon2.setLength(jMin2);
            dataSpecBuild = builderBuildUpon2.build();
            dataSource = this.cacheReadDataSource;
        } else {
            j2 = -1;
            if (cacheSpanStartReadWrite.isOpenEnded()) {
                jMin = this.bytesRemaining;
            } else {
                jMin = cacheSpanStartReadWrite.length;
                long j7 = this.bytesRemaining;
                if (j7 != -1) {
                    jMin = Math.min(jMin, j7);
                }
            }
            DataSpec.Builder builderBuildUpon3 = dataSpec.buildUpon();
            builderBuildUpon3.setPosition(this.readPosition);
            builderBuildUpon3.setLength(jMin);
            dataSpecBuild = builderBuildUpon3.build();
            dataSource = this.cacheWriteDataSource;
            if (dataSource == null) {
                dataSource = this.upstreamDataSource;
                this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                cacheSpanStartReadWrite = null;
            }
        }
        long j8 = Long.MAX_VALUE;
        if (!this.currentRequestIgnoresCache && dataSource == this.upstreamDataSource) {
            j8 = MIN_READ_BEFORE_CHECKING_CACHE + this.readPosition;
        }
        this.checkCachePosition = j8;
        if (z) {
            an.u(isBypassingCache());
            if (dataSource == this.upstreamDataSource) {
                return;
            }
            try {
                closeCurrentSource();
            } catch (Throwable th) {
                if (cacheSpanStartReadWrite.isHoleSpan()) {
                    this.cache.releaseHoleSpan(cacheSpanStartReadWrite);
                }
                throw th;
            }
        }
        if (cacheSpanStartReadWrite != null && cacheSpanStartReadWrite.isHoleSpan()) {
            this.currentHoleSpan = cacheSpanStartReadWrite;
        }
        this.currentDataSource = dataSource;
        this.currentDataSpec = dataSpecBuild;
        this.currentDataSourceBytesRead = 0L;
        long jOpen = dataSource.open(dataSpecBuild);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (dataSpecBuild.length == j2 && jOpen != j2) {
            this.bytesRemaining = jOpen;
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition + jOpen);
        }
        if (isReadingFromUpstream()) {
            this.actualUri = dataSource.getUri();
            ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, dataSpec.uri.equals(this.actualUri) ? null : this.actualUri);
        }
        if (isWritingToCache()) {
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void setNoBytesRemainingAndMaybeStoreLength(String str) {
        this.bytesRemaining = 0L;
        if (isWritingToCache()) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.readPosition);
            this.cache.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private int shouldIgnoreCacheForRequest(DataSpec dataSpec) {
        if (this.ignoreCacheOnError && this.seenCacheError) {
            return 0;
        }
        return (this.ignoreCacheForUnsetLengthRequests && dataSpec.length == -1) ? 1 : -1;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        an.B(transferListener);
        this.cacheReadDataSource.addTransferListener(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.requestDataSpec = null;
        this.actualUri = null;
        this.readPosition = 0L;
        notifyBytesRead();
        try {
            closeCurrentSource();
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    public Cache getCache() {
        return this.cache;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return isReadingFromUpstream() ? this.upstreamDataSource.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.actualUri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        long contentLength;
        try {
            String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
            DataSpec.Builder builderBuildUpon = dataSpec.buildUpon();
            builderBuildUpon.setKey(strBuildCacheKey);
            DataSpec dataSpecBuild = builderBuildUpon.build();
            this.requestDataSpec = dataSpecBuild;
            this.actualUri = getRedirectedUriOrDefault(this.cache, strBuildCacheKey, dataSpecBuild.uri);
            this.readPosition = dataSpec.position;
            int iShouldIgnoreCacheForRequest = shouldIgnoreCacheForRequest(dataSpec);
            boolean z = iShouldIgnoreCacheForRequest != -1;
            this.currentRequestIgnoresCache = z;
            if (z) {
                notifyCacheIgnored(iShouldIgnoreCacheForRequest);
            }
            if (this.currentRequestIgnoresCache) {
                this.bytesRemaining = -1L;
                contentLength = -1;
            } else {
                contentLength = ContentMetadata.CC.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                this.bytesRemaining = contentLength;
                if (contentLength != -1) {
                    contentLength -= dataSpec.position;
                    this.bytesRemaining = contentLength;
                    if (contentLength < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long j2 = dataSpec.length;
            if (j2 != -1) {
                contentLength = contentLength == -1 ? j2 : Math.min(contentLength, j2);
                this.bytesRemaining = contentLength;
            }
            if (contentLength > 0 || contentLength == -1) {
                openNextSource(dataSpecBuild, false);
            }
            long j3 = dataSpec.length;
            return j3 != -1 ? j3 : this.bytesRemaining;
        } catch (Throwable th) {
            handleBeforeThrow(th);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r17.currentDataSourceBytesRead < r13) goto L27;
     */
    @Override // androidx.media3.common.DataReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            long r3 = r1.bytesRemaining
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L12
            return r4
        L12:
            androidx.media3.datasource.DataSpec r3 = r1.requestDataSpec
            com.google.d.b.an.B(r3)
            r7 = r3
            androidx.media3.datasource.DataSpec r7 = (androidx.media3.datasource.DataSpec) r7
            androidx.media3.datasource.DataSpec r7 = r1.currentDataSpec
            com.google.d.b.an.B(r7)
            r8 = r7
            androidx.media3.datasource.DataSpec r8 = (androidx.media3.datasource.DataSpec) r8
            long r8 = r1.readPosition     // Catch: java.lang.Throwable -> L99
            long r10 = r1.checkCachePosition     // Catch: java.lang.Throwable -> L99
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L2e
            r8 = 1
            r1.openNextSource(r3, r8)     // Catch: java.lang.Throwable -> L99
        L2e:
            androidx.media3.datasource.DataSource r8 = r1.currentDataSource     // Catch: java.lang.Throwable -> L99
            com.google.d.b.an.B(r8)     // Catch: java.lang.Throwable -> L99
            r9 = r8
            androidx.media3.datasource.DataSource r9 = (androidx.media3.datasource.DataSource) r9     // Catch: java.lang.Throwable -> L99
            r9 = r18
            r10 = r19
            int r8 = r8.read(r9, r10, r0)     // Catch: java.lang.Throwable -> L99
            r11 = -1
            if (r8 == r4) goto L63
            boolean r0 = r1.isReadingFromCache()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L4e
            long r2 = r1.totalCachedBytesRead     // Catch: java.lang.Throwable -> L99
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.totalCachedBytesRead = r2     // Catch: java.lang.Throwable -> L99
        L4e:
            long r2 = r1.readPosition     // Catch: java.lang.Throwable -> L99
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.readPosition = r2     // Catch: java.lang.Throwable -> L99
            long r2 = r1.currentDataSourceBytesRead     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.currentDataSourceBytesRead = r2     // Catch: java.lang.Throwable -> L99
            long r2 = r1.bytesRemaining     // Catch: java.lang.Throwable -> L99
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L8d
            long r2 = r2 - r4
            r1.bytesRemaining = r2     // Catch: java.lang.Throwable -> L99
            return r8
        L63:
            boolean r4 = r1.isReadingFromUpstream()     // Catch: java.lang.Throwable -> L99
            if (r4 == 0) goto L81
            long r13 = r7.length     // Catch: java.lang.Throwable -> L99
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L76
            r15 = r5
            long r5 = r1.currentDataSourceBytesRead     // Catch: java.lang.Throwable -> L99
            int r4 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r4 >= 0) goto L82
        L76:
            java.lang.String r0 = r3.key     // Catch: java.lang.Throwable -> L99
            int r2 = androidx.media3.common.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L99
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L99
            r1.setNoBytesRemainingAndMaybeStoreLength(r0)     // Catch: java.lang.Throwable -> L99
            return r8
        L81:
            r15 = r5
        L82:
            long r4 = r1.bytesRemaining     // Catch: java.lang.Throwable -> L99
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 > 0) goto L8e
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 != 0) goto L8d
            goto L8e
        L8d:
            return r8
        L8e:
            r1.closeCurrentSource()     // Catch: java.lang.Throwable -> L99
            r1.openNextSource(r3, r2)     // Catch: java.lang.Throwable -> L99
            int r0 = r17.read(r18, r19, r20)     // Catch: java.lang.Throwable -> L99
            return r0
        L99:
            r0 = move-exception
            r1.handleBeforeThrow(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.cache.CacheDataSource.read(byte[], int, int):int");
    }

    public CacheDataSource(Cache cache, DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, int i2) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, CacheDataSink.DEFAULT_FRAGMENT_SIZE), i2, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i2, EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i2, eventListener, null);
    }

    public CacheDataSource(Cache cache, DataSource dataSource, DataSource dataSource2, DataSink dataSink, int i2, EventListener eventListener, CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i2, null, -1000, eventListener);
    }
}
