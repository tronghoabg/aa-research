package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheKeyFactory;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.datasource.cache.ContentMetadata;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import com.google.d.b.aj;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<RunnableFutureTask<?, ?>> activeRunnables;
    private final Cache cache;
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final CacheKeyFactory cacheKeyFactory;
    public final long durationUs;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final DataSpec manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final PriorityTaskManager priorityTaskManager;
    public final long startPositionUs;
    private final ArrayList<StreamKey> streamKeys;

    /* compiled from: WazeSource */
    final class ProgressNotifier implements CacheWriter.ProgressListener {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j2, int i2, long j3, int i3) {
            this.progressListener = progressListener;
            this.contentLength = j2;
            this.totalSegments = i2;
            this.bytesDownloaded = j3;
            this.segmentsDownloaded = i3;
        }

        private float getPercentDownloaded() {
            long j2 = this.contentLength;
            if (j2 != -1 && j2 != 0) {
                return Util.percentFloat(this.bytesDownloaded, j2);
            }
            int i2 = this.totalSegments;
            if (i2 != 0) {
                return Util.percentFloat(this.segmentsDownloaded, i2);
            }
            return -1.0f;
        }

        @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
        public void onProgress(long j2, long j3, long j4) {
            long j5 = this.bytesDownloaded + j4;
            this.bytesDownloaded = j5;
            this.progressListener.onProgress(this.contentLength, j5, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    /* compiled from: WazeSource */
    public class Segment implements Comparable<Segment> {
        public final DataSpec dataSpec;
        public final long startTimeUs;

        public Segment(long j2, DataSpec dataSpec) {
            this.startTimeUs = j2;
            this.dataSpec = dataSpec;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Long.compare(this.startTimeUs, segment.startTimeUs);
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j2, long j3, long j4) {
        an.B(mediaItem.localConfiguration);
        this.manifestDataSpec = getCompressibleDataSpec(mediaItem.localConfiguration.uri);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(mediaItem.localConfiguration.streamKeys);
        this.cacheDataSourceFactory = factory;
        this.executor = executor;
        this.startPositionUs = j3;
        this.durationUs = j4;
        Cache cache = factory.getCache();
        an.B(cache);
        this.cache = cache;
        this.cacheKeyFactory = factory.getCacheKeyFactory();
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
        this.activeRunnables = new ArrayList<>();
        this.maxMergedSegmentStartTimeDiffUs = Util.msToUs(j2);
    }

    private <T> void addActiveRunnable(RunnableFutureTask<T, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            if (this.isCanceled) {
                throw new InterruptedException();
            }
            this.activeRunnables.add(runnableFutureTask);
        }
    }

    private static boolean canMergeSegments(DataSpec dataSpec, DataSpec dataSpec2) {
        if (!dataSpec.uri.equals(dataSpec2.uri)) {
            return false;
        }
        long j2 = dataSpec.length;
        return j2 != -1 && dataSpec.position + j2 == dataSpec2.position && Objects.equals(dataSpec.key, dataSpec2.key) && dataSpec.flags == dataSpec2.flags && dataSpec.httpMethod == dataSpec2.httpMethod && dataSpec.httpRequestHeaders.equals(dataSpec2.httpRequestHeaders);
    }

    protected static DataSpec getCompressibleDataSpec(Uri uri) {
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.setUri(uri);
        builder.setFlags(1);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RunnableFutureTask lambda$getManifest$0(final DataSource dataSource, final DataSpec dataSpec) {
        return new RunnableFutureTask<M, IOException>(this) { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            final /* synthetic */ SegmentDownloader this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public M doWork() {
                return (M) ParsingLoadable.load(dataSource, this.this$0.manifestParser, dataSpec, 4);
            }
        };
    }

    private static void mergeSegments(List<Segment> list, CacheKeyFactory cacheKeyFactory, long j2) {
        HashMap map = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Segment segment = list.get(i3);
            String strBuildCacheKey = cacheKeyFactory.buildCacheKey(segment.dataSpec);
            Integer num = (Integer) map.get(strBuildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j2 || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(strBuildCacheKey, Integer.valueOf(i2));
                list.set(i2, segment);
                i2++;
            } else {
                long j3 = segment.dataSpec.length;
                DataSpec dataSpecSubrange = segment2.dataSpec.subrange(0L, j3 != -1 ? segment2.dataSpec.length + j3 : -1L);
                an.B(num);
                list.set(num.intValue(), new Segment(segment2.startTimeUs, dataSpecSubrange));
            }
        }
        Util.removeRange(list, i2, list.size());
    }

    private void removeActiveRunnable(int i2) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i2);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            this.isCanceled = true;
            for (int i2 = 0; i2 < this.activeRunnables.size(); i2++) {
                this.activeRunnables.get(i2).cancel(true);
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void download(Downloader.ProgressListener progressListener) {
        int i2;
        int size;
        ArrayList<RunnableFutureTask<?, ?>> arrayList;
        int size2;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading;
        byte[] bArr;
        long j2;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        try {
            CacheDataSource cacheDataSourceCreateDataSourceForDownloading2 = this.cacheDataSourceFactory.createDataSourceForDownloading();
            FilterableManifest manifest = getManifest(cacheDataSourceCreateDataSourceForDownloading2, this.manifestDataSpec, false);
            if (!this.streamKeys.isEmpty()) {
                manifest = (FilterableManifest) manifest.copy(this.streamKeys);
            }
            List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForDownloading2, manifest, false);
            Collections.sort(segments);
            mergeSegments(segments, this.cacheKeyFactory, this.maxMergedSegmentStartTimeDiffUs);
            int size3 = segments.size();
            int i3 = 0;
            long j3 = 0;
            long j4 = 0;
            for (int size4 = segments.size() - 1; size4 >= 0; size4--) {
                DataSpec dataSpec = segments.get(size4).dataSpec;
                String strBuildCacheKey = this.cacheKeyFactory.buildCacheKey(dataSpec);
                long j5 = dataSpec.length;
                if (j5 == -1) {
                    long contentLength = ContentMetadata.CC.getContentLength(this.cache.getContentMetadata(strBuildCacheKey));
                    if (contentLength != -1) {
                        j5 = contentLength - dataSpec.position;
                        j2 = j5;
                    } else {
                        j2 = -1;
                    }
                } else {
                    j2 = j5;
                }
                long cachedBytes = this.cache.getCachedBytes(strBuildCacheKey, dataSpec.position, j2);
                j4 += cachedBytes;
                if (j2 != -1) {
                    if (j2 == cachedBytes) {
                        i3++;
                        segments.remove(size4);
                    }
                    if (j3 != -1) {
                        j3 += j2;
                    }
                } else {
                    j3 = -1;
                }
            }
            ProgressNotifier progressNotifier = progressListener != null ? new ProgressNotifier(progressListener, j3, size3, j4, i3) : null;
            arrayDeque.addAll(segments);
            while (!this.isCanceled && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                if (arrayDeque2.isEmpty()) {
                    cacheDataSourceCreateDataSourceForDownloading = this.cacheDataSourceFactory.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    SegmentDownloadRunnable segmentDownloadRunnable = (SegmentDownloadRunnable) arrayDeque2.removeFirst();
                    cacheDataSourceCreateDataSourceForDownloading = segmentDownloadRunnable.dataSource;
                    bArr = segmentDownloadRunnable.temporaryBuffer;
                }
                SegmentDownloadRunnable segmentDownloadRunnable2 = new SegmentDownloadRunnable((Segment) arrayDeque.removeFirst(), cacheDataSourceCreateDataSourceForDownloading, progressNotifier, bArr);
                addActiveRunnable(segmentDownloadRunnable2);
                this.executor.execute(segmentDownloadRunnable2);
                for (int size5 = this.activeRunnables.size() - 1; size5 >= 0; size5--) {
                    SegmentDownloadRunnable segmentDownloadRunnable3 = (SegmentDownloadRunnable) this.activeRunnables.get(size5);
                    if (arrayDeque.isEmpty() || segmentDownloadRunnable3.isDone()) {
                        try {
                            segmentDownloadRunnable3.get();
                            removeActiveRunnable(size5);
                            arrayDeque2.addLast(segmentDownloadRunnable3);
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            an.B(cause);
                            Throwable th = cause;
                            if (cause instanceof PriorityTaskManager.PriorityTooLowException) {
                                arrayDeque.addFirst(segmentDownloadRunnable3.segment);
                                removeActiveRunnable(size5);
                                arrayDeque2.addLast(segmentDownloadRunnable3);
                            } else {
                                if (cause instanceof IOException) {
                                    throw ((IOException) cause);
                                }
                                Util.sneakyThrow(cause);
                            }
                        }
                    }
                }
                segmentDownloadRunnable2.blockUntilStarted();
            }
            while (true) {
                if (i2 >= size) {
                    break;
                }
            }
            while (true) {
                if (size2 < 0) {
                    break;
                }
            }
        } finally {
            i2 = 0;
            while (true) {
                size = this.activeRunnables.size();
                arrayList = this.activeRunnables;
                if (i2 >= size) {
                    break;
                }
                arrayList.get(i2).cancel(true);
                i2++;
            }
            size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                this.activeRunnables.get(size2).blockUntilFinished();
                removeActiveRunnable(size2);
            }
            PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
            if (priorityTaskManager3 != null) {
                priorityTaskManager3.remove(-4000);
            }
        }
    }

    protected final <T> T execute(aj<RunnableFutureTask<T, ?>> ajVar, boolean z) throws Throwable {
        if (z) {
            RunnableFutureTask<T, ?> runnableFutureTask = ajVar.get();
            runnableFutureTask.run();
            try {
                return runnableFutureTask.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                an.B(cause);
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                Util.sneakyThrow(e2);
            }
        }
        while (!this.isCanceled) {
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            if (priorityTaskManager != null) {
                priorityTaskManager.proceed(-4000);
            }
            RunnableFutureTask<T, ?> runnableFutureTask2 = ajVar.get();
            this.addActiveRunnable(runnableFutureTask2);
            this.executor.execute(runnableFutureTask2);
            try {
                return runnableFutureTask2.get();
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                an.B(cause2);
                Throwable th = cause2;
                if (!(cause2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    Util.sneakyThrow(e3);
                }
            } finally {
                runnableFutureTask2.blockUntilFinished();
                this.removeActiveRunnable((RunnableFutureTask<?, ?>) runnableFutureTask2);
            }
        }
        throw new InterruptedException();
    }

    protected final M getManifest(final DataSource dataSource, final DataSpec dataSpec, boolean z) {
        return (M) execute(new aj() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader$$ExternalSyntheticLambda0
            @Override // com.google.d.b.aj
            public final Object get() {
                return this.f$0.lambda$getManifest$0(dataSource, dataSpec);
            }
        }, z);
    }

    protected abstract List<Segment> getSegments(DataSource dataSource, M m, boolean z);

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        CacheDataSource cacheDataSourceCreateDataSourceForRemovingDownload = this.cacheDataSourceFactory.createDataSourceForRemovingDownload();
        try {
            try {
                List<Segment> segments = getSegments(cacheDataSourceCreateDataSourceForRemovingDownload, getManifest(cacheDataSourceCreateDataSourceForRemovingDownload, this.manifestDataSpec, true), true);
                for (int i2 = 0; i2 < segments.size(); i2++) {
                    this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(segments.get(i2).dataSpec));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            this.cache.removeResource(this.cacheKeyFactory.buildCacheKey(this.manifestDataSpec));
        }
    }

    /* compiled from: WazeSource */
    public abstract class BaseFactory<M extends FilterableManifest<M>> implements SegmentDownloaderFactory {
        protected final CacheDataSource.Factory cacheDataSourceFactory;
        protected ParsingLoadable.Parser<M> manifestParser;
        protected long startPositionUs;
        protected Executor executor = new Executor() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader$BaseFactory$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        };
        protected long maxMergedSegmentStartTimeDiffMs = 20000;
        protected long durationUs = C.TIME_UNSET;

        public BaseFactory(CacheDataSource.Factory factory, ParsingLoadable.Parser<M> parser) {
            this.cacheDataSourceFactory = factory;
            this.manifestParser = parser;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setDurationUs(long j2) {
            this.durationUs = j2;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setMaxMergedSegmentStartTimeDiffMs(long j2) {
            this.maxMergedSegmentStartTimeDiffMs = j2;
            return this;
        }

        @Override // androidx.media3.exoplayer.offline.SegmentDownloaderFactory
        public BaseFactory<M> setStartPositionUs(long j2) {
            this.startPositionUs = j2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {
        private final CacheWriter cacheWriter;
        public final CacheDataSource dataSource;
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, CacheDataSource cacheDataSource, ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.dataSource = cacheDataSource;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            this.cacheWriter = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, progressNotifier);
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        protected void cancelWork() {
            this.cacheWriter.cancel();
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        /* renamed from: doWork, reason: avoid collision after fix types in other method */
        protected Void doWork2() throws InterruptedIOException {
            this.cacheWriter.cache();
            ProgressNotifier progressNotifier = this.progressNotifier;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.onSegmentDownloaded();
            return null;
        }

        @Override // androidx.media3.common.util.RunnableFutureTask
        protected /* bridge */ /* synthetic */ Void doWork() throws InterruptedIOException {
            doWork2();
            return null;
        }
    }

    private void removeActiveRunnable(RunnableFutureTask<?, ?> runnableFutureTask) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(runnableFutureTask);
        }
    }

    protected SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor, long j2) {
        this(mediaItem, parser, factory, executor, j2, 0L, C.TIME_UNSET);
    }
}
