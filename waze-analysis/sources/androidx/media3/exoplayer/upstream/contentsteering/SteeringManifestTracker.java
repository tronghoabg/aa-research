package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bs;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SteeringManifestTracker {
    static final long FALLBACK_DELAY_UNTIL_NEXT_LOAD_MS = 300000;
    private static final String RETRY_AFTER_HEADER = "Retry-After";
    private static final String TAG = "SteeringManifestTracker";
    private Callback callback;
    private final Clock clock;
    private final DataSource.Factory dataSourceFactory;
    private final aj<ReleasableExecutor> downloadExecutorSupplier;
    private MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HandlerWrapper handler;
    private boolean hasStarted;
    private SteeringManifest steeringManifest;
    private Loader steeringManifestLoader;
    private final SteeringManifestLoaderCallback steeringManifestLoaderCallback;
    private HandlerWrapper steeringManifestReloadHandler;
    private Uri steeringManifestUrl;

    /* compiled from: WazeSource */
    public interface Callback {
        bs<String, String> getSteeringQueryParameters();

        void onSteeringManifestLoadError(IOException iOException, boolean z);

        void onSteeringManifestUpdated(SteeringManifest steeringManifest);
    }

    /* compiled from: WazeSource */
    class SteeringManifestLoaderCallback implements Loader.Callback<ParsingLoadable<SteeringManifest>> {
        final /* synthetic */ SteeringManifestTracker this$0;

        private SteeringManifestLoaderCallback(SteeringManifestTracker steeringManifestTracker) {
            Objects.requireNonNull(steeringManifestTracker);
            this.this$0 = steeringManifestTracker;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadCompleted$0(SteeringManifest steeringManifest) {
            Callback callback = this.this$0.callback;
            an.B(callback);
            callback.onSteeringManifestUpdated(steeringManifest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadError$0(IOException iOException, boolean z) {
            Callback callback = this.this$0.callback;
            an.B(callback);
            callback.onSteeringManifestLoadError(iOException, z);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<SteeringManifest> parsingLoadable, long j2, long j3, boolean z) {
            if (this.this$0.hasStarted) {
                LoadEventInfo loadEventInfoBuildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j2, j3);
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.this$0.eventDispatcher;
                an.B(eventDispatcher);
                eventDispatcher.loadCanceled(loadEventInfoBuildLoadEventInfo, 8);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<SteeringManifest> parsingLoadable, long j2, long j3) {
            if (this.this$0.hasStarted) {
                final SteeringManifest result = parsingLoadable.getResult();
                an.B(result);
                this.this$0.steeringManifest = result;
                this.this$0.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$onLoadCompleted$0(result);
                    }
                });
                SteeringManifestTracker steeringManifestTracker = this.this$0;
                Uri uri = steeringManifestTracker.steeringManifestUrl;
                an.B(uri);
                steeringManifestTracker.steeringManifestUrl = SteeringManifestTracker.getSteeringManifestUrl(uri, result.reloadUri);
                long j4 = result.timeToLiveMs;
                if (j4 == C.TIME_UNSET) {
                    j4 = 300000;
                }
                HandlerWrapper handlerWrapper = this.this$0.steeringManifestReloadHandler;
                an.B(handlerWrapper);
                SteeringManifestTracker steeringManifestTracker2 = this.this$0;
                Objects.requireNonNull(steeringManifestTracker2);
                handlerWrapper.postDelayed(new SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda1(steeringManifestTracker2), j4);
                LoadEventInfo loadEventInfoBuildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j2, j3);
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.this$0.eventDispatcher;
                an.B(eventDispatcher);
                eventDispatcher.loadCompleted(loadEventInfoBuildLoadEventInfo, 8);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<SteeringManifest> parsingLoadable, long j2, long j3, final IOException iOException, int i2) {
            long j4;
            if (!this.this$0.hasStarted) {
                return Loader.DONT_RETRY;
            }
            int i3 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
            if (i3 == 410) {
                Loader loader = this.this$0.steeringManifestLoader;
                an.B(loader);
                loader.release();
                HandlerWrapper handlerWrapper = this.this$0.steeringManifestReloadHandler;
                an.B(handlerWrapper);
                handlerWrapper.removeCallbacksAndMessages(null);
                j4 = -9223372036854775807L;
            } else {
                j4 = 300000;
                if (i3 == 429) {
                    List<String> list = parsingLoadable.getResponseHeaders().get(SteeringManifestTracker.RETRY_AFTER_HEADER);
                    if (list != null) {
                        try {
                            j4 = Long.parseLong(list.get(0)) * 1000;
                        } catch (NumberFormatException unused) {
                            Log.w(SteeringManifestTracker.TAG, "Retry-After header string doesn't contain a parsable long");
                        }
                    }
                } else if (this.this$0.steeringManifest != null && this.this$0.steeringManifest.timeToLiveMs != C.TIME_UNSET) {
                    j4 = this.this$0.steeringManifest.timeToLiveMs;
                }
            }
            if (j4 != C.TIME_UNSET) {
                HandlerWrapper handlerWrapper2 = this.this$0.steeringManifestReloadHandler;
                an.B(handlerWrapper2);
                SteeringManifestTracker steeringManifestTracker = this.this$0;
                Objects.requireNonNull(steeringManifestTracker);
                handlerWrapper2.postDelayed(new SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda1(steeringManifestTracker), j4);
            }
            final boolean z = j4 == C.TIME_UNSET;
            this.this$0.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestTracker$SteeringManifestLoaderCallback$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onLoadError$0(iOException, z);
                }
            });
            LoadEventInfo loadEventInfoBuildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j2, j3);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.this$0.eventDispatcher;
            an.B(eventDispatcher);
            eventDispatcher.loadError(loadEventInfoBuildLoadEventInfo, 8, iOException, z);
            return Loader.DONT_RETRY;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadStarted(ParsingLoadable<SteeringManifest> parsingLoadable, long j2, long j3, int i2) {
            if (this.this$0.hasStarted) {
                LoadEventInfo loadEventInfoBuildLoadEventInfo = SteeringManifestTracker.buildLoadEventInfo(parsingLoadable, j2, j3);
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.this$0.eventDispatcher;
                an.B(eventDispatcher);
                eventDispatcher.loadStarted(loadEventInfoBuildLoadEventInfo, 8, i2);
            }
        }
    }

    SteeringManifestTracker(DataSource.Factory factory, aj<ReleasableExecutor> ajVar, Clock clock) {
        this.dataSourceFactory = factory;
        this.downloadExecutorSupplier = ajVar;
        this.clock = clock;
        this.steeringManifestLoaderCallback = new SteeringManifestLoaderCallback();
        this.handler = clock.createHandler(Util.getCurrentOrMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LoadEventInfo buildLoadEventInfo(ParsingLoadable<SteeringManifest> parsingLoadable, long j2, long j3) {
        return new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j2, j3, parsingLoadable.bytesLoaded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri getSteeringManifestUrl(Uri uri, Uri uri2) {
        return uri2 == null ? uri : UriUtil.isAbsolute(uri2.toString()) ? uri2 : UriUtil.resolveToUri(uri.toString(), uri2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadSteeringManifestImmediately() {
        an.u(this.hasStarted);
        Uri uri = this.steeringManifestUrl;
        an.B(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        Callback callback = this.callback;
        an.B(callback);
        for (Map.Entry entry : new TreeMap(callback.getSteeringQueryParameters()).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        DataSpec.Builder builder = new DataSpec.Builder();
        Uri uriBuild = builderBuildUpon.build();
        an.B(uriBuild);
        builder.setUri(uriBuild);
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.dataSourceFactory.createDataSource(), builder.build(), 8, new SteeringManifestParser());
        Loader loader = this.steeringManifestLoader;
        an.B(loader);
        loader.startLoading(parsingLoadable, this.steeringManifestLoaderCallback, 0);
    }

    public void start(Uri uri, Callback callback, MediaSourceEventListener.EventDispatcher eventDispatcher) {
        this.steeringManifestUrl = uri;
        this.callback = callback;
        this.eventDispatcher = eventDispatcher;
        this.steeringManifestReloadHandler = this.clock.createHandler(Util.getCurrentOrMainLooper(), null);
        aj<ReleasableExecutor> ajVar = this.downloadExecutorSupplier;
        this.steeringManifestLoader = ajVar != null ? new Loader(ajVar.get()) : new Loader(TAG);
        this.hasStarted = true;
        loadSteeringManifestImmediately();
    }

    public void stop() {
        Loader loader = this.steeringManifestLoader;
        if (loader != null) {
            loader.release();
            this.steeringManifestLoader = null;
        }
        HandlerWrapper handlerWrapper = this.steeringManifestReloadHandler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
            this.steeringManifestReloadHandler = null;
        }
        this.callback = null;
        this.steeringManifest = null;
        this.eventDispatcher = null;
        this.hasStarted = false;
    }

    public SteeringManifestTracker(DataSource.Factory factory, aj<ReleasableExecutor> ajVar) {
        this(factory, ajVar, Clock.DEFAULT);
    }
}
