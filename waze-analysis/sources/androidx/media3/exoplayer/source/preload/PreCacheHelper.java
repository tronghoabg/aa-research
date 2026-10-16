package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.offline.DefaultDownloaderFactory;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.offline.DownloaderFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.d.b.aj;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PreCacheHelper {
    static final int DEFAULT_MIN_RETRY_COUNT = 5;
    private final Handler applicationHandler = Util.createHandlerForCurrentOrMainLooper();
    private DownloadCallback currentDownloadCallback;
    private final DownloadHelper.Factory downloadHelperFactory;
    private final DownloaderFactory downloaderFactory;
    private final Listener listener;
    private final MediaItem mediaItem;
    private final Handler preCacheHandler;
    private final MediaSource.Factory testMediaSourceFactory;

    /* compiled from: WazeSource */
    final class DownloadCallback implements DownloadHelper.Callback {
        private final DownloadHelper downloadHelper;
        private Downloader downloader;
        private Task downloaderTask;
        private final long durationMs;
        private boolean isCanceled;
        private boolean isPreparationOngoing;
        private final Object lock;
        private DownloadRequest pendingDownloadRequest;
        private final ReleasableExecutorSupplier releasableExecutorSupplier;
        private final long startPositionMs;
        final /* synthetic */ PreCacheHelper this$0;

        public DownloadCallback(PreCacheHelper preCacheHelper, long j2, long j3) {
            DownloadHelper downloadHelperCreate;
            Objects.requireNonNull(preCacheHelper);
            this.this$0 = preCacheHelper;
            an.u(Looper.myLooper() == preCacheHelper.preCacheHandler.getLooper());
            this.lock = new Object();
            this.startPositionMs = j2;
            this.durationMs = j3;
            if (preCacheHelper.testMediaSourceFactory != null) {
                this.releasableExecutorSupplier = null;
                downloadHelperCreate = preCacheHelper.downloadHelperFactory.create(preCacheHelper.testMediaSourceFactory.createMediaSource(preCacheHelper.mediaItem));
                this.downloadHelper = downloadHelperCreate;
            } else {
                ReleasableExecutorSupplier releasableExecutorSupplier = new ReleasableExecutorSupplier(preCacheHelper.preCacheHandler);
                this.releasableExecutorSupplier = releasableExecutorSupplier;
                preCacheHelper.downloadHelperFactory.setLoadExecutor(releasableExecutorSupplier);
                downloadHelperCreate = preCacheHelper.downloadHelperFactory.create(preCacheHelper.mediaItem);
                this.downloadHelper = downloadHelperCreate;
                releasableExecutorSupplier.setDownloadCallback(this);
            }
            this.isPreparationOngoing = true;
            downloadHelperCreate.prepare(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$notifyListeners$0(Consumer consumer) {
            synchronized (this.lock) {
                if (this.isCanceled) {
                    return;
                }
                if (this.this$0.listener != null) {
                    consumer.accept(this.this$0.listener);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadProgress$0(final Task task) {
            if (task != this.downloaderTask) {
                return;
            }
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$onDownloadProgress$1(task, (PreCacheHelper.Listener) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadProgress$1(Task task, Listener listener) {
            listener.onPreCacheProgress(this.this$0.mediaItem, task.contentLength, task.bytesDownloaded, task.percentDownloaded);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStopped$0(Task task) {
            if (task != this.downloaderTask) {
                return;
            }
            this.downloaderTask = null;
            final IOException iOException = task.finalException;
            if (!task.isRemove && iOException != null) {
                notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda2
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(Object obj) {
                        this.f$0.lambda$onDownloadStopped$1(iOException, (PreCacheHelper.Listener) obj);
                    }
                });
            } else {
                if (task.isRemove) {
                    return;
                }
                notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda3
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(Object obj) {
                        this.f$0.lambda$onDownloadStopped$2((PreCacheHelper.Listener) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStopped$1(IOException iOException, Listener listener) {
            listener.onDownloadError(this.this$0.mediaItem, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDownloadStopped$2(Listener listener) {
            listener.onPreCacheCompleted(this.this$0.mediaItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepareError$0(IOException iOException, Listener listener) {
            listener.onPrepareError(this.this$0.mediaItem, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPrepared$0(MediaItem mediaItem, Listener listener) {
            listener.onPrepared(this.this$0.mediaItem, mediaItem);
        }

        private void notifyListeners(final Consumer<Listener> consumer) {
            this.this$0.applicationHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$notifyListeners$0(consumer);
                }
            });
        }

        public void cancel(boolean z) {
            Downloader downloader;
            an.u(Looper.myLooper() == this.this$0.preCacheHandler.getLooper());
            synchronized (this.lock) {
                this.isCanceled = true;
            }
            this.pendingDownloadRequest = null;
            this.downloadHelper.release();
            Task task = this.downloaderTask;
            if (task == null || !task.isRemove) {
                Task task2 = this.downloaderTask;
                if (task2 != null) {
                    task2.cancel();
                }
                if (!z || (downloader = this.downloader) == null) {
                    return;
                }
                Task task3 = new Task(downloader, true, 5, this);
                this.downloaderTask = task3;
                task3.start();
            }
        }

        public boolean isReusable(long j2, long j3) {
            Task task;
            boolean z = true;
            an.u(Looper.myLooper() == this.this$0.preCacheHandler.getLooper());
            synchronized (this.lock) {
                if (this.isCanceled || j2 != this.startPositionMs || j3 != this.durationMs || (!this.isPreparationOngoing && ((task = this.downloaderTask) == null || task.isRemove))) {
                    z = false;
                }
            }
            return z;
        }

        public void maybeSubmitPendingDownloadRequest() {
            an.u(Looper.myLooper() == this.this$0.preCacheHandler.getLooper());
            if (this.pendingDownloadRequest != null) {
                this.downloader = this.this$0.downloaderFactory.createDownloader(this.pendingDownloadRequest);
                Task task = new Task(this.downloader, false, 5, this);
                this.downloaderTask = task;
                task.start();
                this.pendingDownloadRequest = null;
            }
        }

        public void onDownloadProgress(final Task task) {
            this.this$0.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onDownloadProgress$0(task);
                }
            });
        }

        public void onDownloadStopped(final Task task) {
            this.this$0.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onDownloadStopped$0(task);
                }
            });
        }

        @Override // androidx.media3.exoplayer.offline.DownloadHelper.Callback
        public void onPrepareError(DownloadHelper downloadHelper, final IOException iOException) {
            an.u(Looper.myLooper() == this.this$0.preCacheHandler.getLooper());
            an.u(downloadHelper == this.downloadHelper);
            this.isPreparationOngoing = false;
            this.downloadHelper.release();
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda6
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$onPrepareError$0(iOException, (PreCacheHelper.Listener) obj);
                }
            });
        }

        @Override // androidx.media3.exoplayer.offline.DownloadHelper.Callback
        public void onPrepared(DownloadHelper downloadHelper, boolean z) {
            an.u(Looper.myLooper() == this.this$0.preCacheHandler.getLooper());
            an.u(downloadHelper == this.downloadHelper);
            this.isPreparationOngoing = false;
            DownloadRequest downloadRequest = downloadHelper.getDownloadRequest(null, this.startPositionMs, this.durationMs);
            this.downloadHelper.release();
            final MediaItem mediaItem = downloadRequest.toMediaItem(this.this$0.mediaItem.buildUpon());
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$DownloadCallback$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$onPrepared$0(mediaItem, (PreCacheHelper.Listener) obj);
                }
            });
            this.pendingDownloadRequest = downloadRequest;
            ReleasableExecutorSupplier releasableExecutorSupplier = this.releasableExecutorSupplier;
            if (releasableExecutorSupplier == null || releasableExecutorSupplier.wereExecutorsReleased()) {
                maybeSubmitPendingDownloadRequest();
            }
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.preload.PreCacheHelper$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onDownloadError(Listener listener, MediaItem mediaItem, IOException iOException) {
            }

            public static void $default$onPreCacheCompleted(Listener listener, MediaItem mediaItem) {
            }

            public static void $default$onPreCacheProgress(Listener listener, MediaItem mediaItem, long j2, long j3, float f2) {
            }

            public static void $default$onPrepareError(Listener listener, MediaItem mediaItem, IOException iOException) {
            }

            public static void $default$onPrepared(Listener listener, MediaItem mediaItem, MediaItem mediaItem2) {
            }
        }

        void onDownloadError(MediaItem mediaItem, IOException iOException);

        void onPreCacheCompleted(MediaItem mediaItem);

        void onPreCacheProgress(MediaItem mediaItem, long j2, long j3, float f2);

        void onPrepareError(MediaItem mediaItem, IOException iOException);

        void onPrepared(MediaItem mediaItem, MediaItem mediaItem2);
    }

    /* compiled from: WazeSource */
    final class ReleasableExecutorSupplier implements aj<ReleasableExecutor> {
        private DownloadCallback downloadCallback;
        private int executorCount;
        private final Handler preCacheHandler;

        private ReleasableExecutorSupplier(Handler handler) {
            this.preCacheHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onExecutorReleased$0() {
            an.u(wereExecutorsReleased());
            DownloadCallback downloadCallback = this.downloadCallback;
            if (downloadCallback != null) {
                downloadCallback.maybeSubmitPendingDownloadRequest();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExecutorReleased() {
            synchronized (this) {
                an.u(this.executorCount > 0);
                this.executorCount--;
                if (wereExecutorsReleased()) {
                    this.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$ReleasableExecutorSupplier$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.lambda$onExecutorReleased$0();
                        }
                    });
                }
            }
        }

        @Override // com.google.d.b.aj
        /* renamed from: get, reason: merged with bridge method [inline-methods] */
        public ReleasableExecutor get2() {
            synchronized (this) {
                this.executorCount++;
            }
            return new ReleasableSingleThreadExecutor(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$ReleasableExecutorSupplier$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onExecutorReleased();
                }
            });
        }

        public void setDownloadCallback(DownloadCallback downloadCallback) {
            this.downloadCallback = downloadCallback;
        }

        public boolean wereExecutorsReleased() {
            boolean z;
            synchronized (this) {
                z = this.executorCount == 0;
            }
            return z;
        }
    }

    /* compiled from: WazeSource */
    final class ReleasableSingleThreadExecutor implements ReleasableExecutor {
        private final ExecutorService executor;
        private final Runnable releaseRunnable;

        private ReleasableSingleThreadExecutor(Runnable runnable) {
            this.executor = Util.newSingleThreadExecutor("PreCacheHelper:Loader");
            this.releaseRunnable = runnable;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.executor.execute(runnable);
        }

        @Override // androidx.media3.exoplayer.util.ReleasableExecutor
        public void release() {
            execute(this.releaseRunnable);
            this.executor.shutdown();
        }
    }

    /* compiled from: WazeSource */
    class Task extends Thread implements Downloader.ProgressListener {
        private volatile long bytesDownloaded;
        private volatile long contentLength;
        private DownloadCallback downloadCallback;
        private final Downloader downloader;
        private volatile IOException finalException;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private volatile float percentDownloaded;

        private Task(Downloader downloader, boolean z, int i2, DownloadCallback downloadCallback) {
            this.downloader = downloader;
            this.isRemove = z;
            this.minRetryCount = i2;
            this.downloadCallback = downloadCallback;
            this.contentLength = -1L;
        }

        private static int getRetryDelayMillis(int i2) {
            return Math.min((i2 - 1) * 1000, 5000);
        }

        public void cancel() {
            this.downloadCallback = null;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // androidx.media3.exoplayer.offline.Downloader.ProgressListener
        public void onProgress(long j2, long j3, float f2) {
            this.contentLength = j2;
            this.bytesDownloaded = j3;
            this.percentDownloaded = f2;
            DownloadCallback downloadCallback = this.downloadCallback;
            if (downloadCallback != null) {
                downloadCallback.onDownloadProgress(this);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException, IOException {
            try {
                try {
                    if (this.isRemove) {
                        this.downloader.remove();
                    } else {
                        long j2 = -1;
                        int i2 = 0;
                        while (!this.isCanceled) {
                            try {
                                this.downloader.download(this);
                                break;
                            } catch (IOException e2) {
                                if (!this.isCanceled) {
                                    if (this.bytesDownloaded != j2) {
                                        j2 = this.bytesDownloaded;
                                        i2 = 0;
                                    }
                                    i2++;
                                    if (i2 > this.minRetryCount) {
                                        throw e2;
                                    }
                                    Thread.sleep(getRetryDelayMillis(i2));
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    this.finalException = e3;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            }
            DownloadCallback downloadCallback = this.downloadCallback;
            if (downloadCallback != null) {
                downloadCallback.onDownloadStopped(this);
            }
        }
    }

    PreCacheHelper(MediaItem mediaItem, MediaSource.Factory factory, DownloadHelper.Factory factory2, DownloaderFactory downloaderFactory, Looper looper, Listener listener) {
        this.mediaItem = mediaItem;
        this.testMediaSourceFactory = factory;
        this.downloadHelperFactory = factory2;
        this.downloaderFactory = downloaderFactory;
        this.listener = listener;
        this.preCacheHandler = Util.createHandler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preCache$0(long j2, long j3) {
        DownloadCallback downloadCallback = this.currentDownloadCallback;
        if (downloadCallback == null || !downloadCallback.isReusable(j2, j3)) {
            DownloadCallback downloadCallback2 = this.currentDownloadCallback;
            if (downloadCallback2 != null) {
                downloadCallback2.cancel(false);
            }
            this.currentDownloadCallback = new DownloadCallback(this, j2, j3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(boolean z) {
        DownloadCallback downloadCallback = this.currentDownloadCallback;
        if (downloadCallback != null) {
            downloadCallback.cancel(z);
            this.currentDownloadCallback = null;
        }
        this.preCacheHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$0() {
        DownloadCallback downloadCallback = this.currentDownloadCallback;
        if (downloadCallback != null) {
            downloadCallback.cancel(false);
        }
    }

    public void preCache(final long j2, final long j3) {
        this.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$preCache$0(j2, j3);
            }
        });
    }

    public void release(final boolean z) {
        this.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$release$0(z);
            }
        });
    }

    public void stop() {
        this.preCacheHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$stop$0();
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Factory {
        private final Cache cache;
        private Listener listener;
        private final Looper preCacheLooper;
        private final RenderersFactory renderersFactory;
        private final DataSource.Factory upstreamDataSourceFactory;
        private TrackSelectionParameters trackSelectionParameters = TrackSelectionParameters.DEFAULT;
        private Executor downloadExecutor = new Executor() { // from class: androidx.media3.exoplayer.source.preload.PreCacheHelper$Factory$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        };

        public Factory(Context context, Cache cache, Looper looper) {
            this.cache = cache;
            this.preCacheLooper = looper;
            this.upstreamDataSourceFactory = new DefaultDataSource.Factory(context);
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        public PreCacheHelper create(MediaItem mediaItem) {
            CacheDataSource.Factory factory = new CacheDataSource.Factory();
            factory.setUpstreamDataSourceFactory(this.upstreamDataSourceFactory);
            factory.setCache(this.cache);
            DownloadHelper.Factory factory2 = new DownloadHelper.Factory();
            factory2.setDataSourceFactory(factory);
            factory2.setRenderersFactory(this.renderersFactory);
            factory2.setTrackSelectionParameters(this.trackSelectionParameters);
            return new PreCacheHelper(mediaItem, null, factory2, new DefaultDownloaderFactory(factory, this.downloadExecutor), this.preCacheLooper, this.listener);
        }

        public Factory setDownloadExecutor(Executor executor) {
            this.downloadExecutor = executor;
            return this;
        }

        public Factory setListener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Factory setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public Factory(Context context, Cache cache, DataSource.Factory factory, Looper looper) {
            this.cache = cache;
            this.preCacheLooper = looper;
            this.upstreamDataSourceFactory = factory;
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        public Factory(Context context, Cache cache, RenderersFactory renderersFactory, Looper looper) {
            this.cache = cache;
            this.preCacheLooper = looper;
            this.upstreamDataSourceFactory = new DefaultDataSource.Factory(context);
            this.renderersFactory = renderersFactory;
        }

        public Factory(Cache cache, DataSource.Factory factory, RenderersFactory renderersFactory, Looper looper) {
            this.cache = cache;
            this.preCacheLooper = looper;
            this.upstreamDataSourceFactory = factory;
            this.renderersFactory = renderersFactory;
        }
    }
}
