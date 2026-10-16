package androidx.media3.exoplayer.offline;

import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.offline.Downloader;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ProgressiveDownloader implements Downloader {
    private final CacheWriter cacheWriter;
    private final CacheDataSource dataSource;
    final DataSpec dataSpec;
    private volatile RunnableFutureTask<Void, IOException> downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final PriorityTaskManager priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor, long j2, long j3) {
        an.B(executor);
        this.executor = executor;
        an.B(mediaItem.localConfiguration);
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.setUri(mediaItem.localConfiguration.uri);
        builder.setKey(mediaItem.localConfiguration.customCacheKey);
        builder.setFlags(4);
        builder.setPosition(j2);
        builder.setLength(j3);
        DataSpec dataSpecBuild = builder.build();
        this.dataSpec = dataSpecBuild;
        CacheDataSource cacheDataSourceCreateDataSourceForDownloading = factory.createDataSourceForDownloading();
        this.dataSource = cacheDataSourceCreateDataSourceForDownloading;
        this.cacheWriter = new CacheWriter(cacheDataSourceCreateDataSourceForDownloading, dataSpecBuild, null, new CacheWriter.ProgressListener() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader$$ExternalSyntheticLambda0
            @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
            public final void onProgress(long j4, long j5, long j6) {
                this.f$0.onProgress(j4, j5, j6);
            }
        });
        this.priorityTaskManager = factory.getUpstreamPriorityTaskManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProgress(long j2, long j3, long j4) {
        if (this.progressListener == null) {
            return;
        }
        float fPercentFloat = -1.0f;
        if (j2 != -1 && j2 != 0) {
            fPercentFloat = Util.percentFloat(j3, j2);
        }
        Downloader.ProgressListener progressListener = this.progressListener;
        an.B(progressListener);
        progressListener.onProgress(j2, j3, fPercentFloat);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void download(Downloader.ProgressListener progressListener) {
        this.progressListener = progressListener;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        boolean z = false;
        if (priorityTaskManager != null) {
            priorityTaskManager.add(-4000);
        }
        while (!z) {
            try {
                if (this.isCanceled) {
                    break;
                }
                this.downloadRunnable = new RunnableFutureTask<Void, IOException>(this) { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                    final /* synthetic */ ProgressiveDownloader this$0;

                    {
                        Objects.requireNonNull(this);
                        this.this$0 = this;
                    }

                    @Override // androidx.media3.common.util.RunnableFutureTask
                    protected void cancelWork() {
                        this.this$0.cacheWriter.cancel();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // androidx.media3.common.util.RunnableFutureTask
                    public Void doWork() throws InterruptedIOException {
                        this.this$0.cacheWriter.cache();
                        return null;
                    }
                };
                PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.proceed(-4000);
                }
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                    z = true;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    an.B(cause);
                    Throwable th = cause;
                    if (cause instanceof PriorityTaskManager.PriorityTooLowException) {
                        continue;
                    } else {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        Util.sneakyThrow(cause);
                    }
                }
            } finally {
                RunnableFutureTask<Void, IOException> runnableFutureTask = this.downloadRunnable;
                an.B(runnableFutureTask);
                runnableFutureTask.blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.priorityTaskManager;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.remove(-4000);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        CacheDataSource cacheDataSource = this.dataSource;
        cacheDataSource.getCache().removeResource(cacheDataSource.getCacheKeyFactory().buildCacheKey(this.dataSpec));
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, long j2, long j3) {
        this(mediaItem, factory, new Executor() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, j2, j3);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, factory, executor, 0L, -1L);
    }

    public ProgressiveDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new Executor() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
    }
}
