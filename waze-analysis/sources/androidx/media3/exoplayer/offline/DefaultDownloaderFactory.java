package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.d.b.an;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {
    private final CacheDataSource.Factory cacheDataSourceFactory;
    private final Executor executor;
    private final SparseArray<SegmentDownloaderFactory> segmentDownloaderFactories;

    public DefaultDownloaderFactory(CacheDataSource.Factory factory, Executor executor) {
        an.B(factory);
        this.cacheDataSourceFactory = factory;
        an.B(executor);
        this.executor = executor;
        this.segmentDownloaderFactories = new SparseArray<>();
    }

    private Downloader createSegmentDownloader(DownloadRequest downloadRequest, int i2) {
        SegmentDownloaderFactory segmentDownloaderFactory = getSegmentDownloaderFactory(i2, this.cacheDataSourceFactory);
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setUri(downloadRequest.uri);
        builder.setStreamKeys(downloadRequest.streamKeys);
        builder.setCustomCacheKey(downloadRequest.customCacheKey);
        MediaItem mediaItemBuild = builder.build();
        DownloadRequest.TimeRange timeRange = downloadRequest.timeRange;
        if (timeRange != null) {
            segmentDownloaderFactory.setStartPositionUs(timeRange.startPositionUs).setDurationUs(downloadRequest.timeRange.durationUs);
        }
        return segmentDownloaderFactory.setExecutor(this.executor).create(mediaItemBuild);
    }

    private static SegmentDownloaderFactory createSegmentDownloaderFactory(Class<? extends SegmentDownloaderFactory> cls, CacheDataSource.Factory factory) {
        try {
            return cls.getConstructor(CacheDataSource.Factory.class).newInstance(factory);
        } catch (Exception e2) {
            throw new IllegalStateException("Downloader factory missing", e2);
        }
    }

    private SegmentDownloaderFactory getSegmentDownloaderFactory(int i2, CacheDataSource.Factory factory) {
        if (Util.contains(this.segmentDownloaderFactories, i2)) {
            return this.segmentDownloaderFactories.get(i2);
        }
        try {
            return loadSegmentDownloaderFactory(i2, factory);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Module missing for content type " + i2, e2);
        }
    }

    private SegmentDownloaderFactory loadSegmentDownloaderFactory(int i2, CacheDataSource.Factory factory) {
        SegmentDownloaderFactory segmentDownloaderFactoryCreateSegmentDownloaderFactory;
        if (i2 == 0) {
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        } else if (i2 == 1) {
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unsupported type: " + i2);
            }
            segmentDownloaderFactoryCreateSegmentDownloaderFactory = createSegmentDownloaderFactory(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader$Factory").asSubclass(SegmentDownloaderFactory.class), factory);
        }
        this.segmentDownloaderFactories.put(i2, segmentDownloaderFactoryCreateSegmentDownloaderFactory);
        return segmentDownloaderFactoryCreateSegmentDownloaderFactory;
    }

    @Override // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(downloadRequest.uri, downloadRequest.mimeType);
        if (iInferContentTypeForUriAndMimeType == 0 || iInferContentTypeForUriAndMimeType == 1 || iInferContentTypeForUriAndMimeType == 2) {
            return createSegmentDownloader(downloadRequest, iInferContentTypeForUriAndMimeType);
        }
        if (iInferContentTypeForUriAndMimeType != 4) {
            throw new IllegalArgumentException("Unsupported type: " + iInferContentTypeForUriAndMimeType);
        }
        DownloadRequest.ByteRange byteRange = downloadRequest.byteRange;
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setUri(downloadRequest.uri);
        builder.setCustomCacheKey(downloadRequest.customCacheKey);
        return new ProgressiveDownloader(builder.build(), this.cacheDataSourceFactory, this.executor, byteRange != null ? byteRange.offset : 0L, byteRange != null ? byteRange.length : -1L);
    }

    @Deprecated
    public DefaultDownloaderFactory(CacheDataSource.Factory factory) {
        this(factory, new Executor() { // from class: androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
    }
}
