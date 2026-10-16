package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes3.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSource.Factory dataSourceFactory;
    private final DataSpec dataSpec;
    private final aj<ReleasableExecutor> downloadExecutorSupplier;
    private final long durationUs;
    private final Format format;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final Timeline timeline;
    private TransferListener transferListener;
    private final boolean treatLoadErrorsAsEndOfStream;

    /* compiled from: WazeSource */
    public final class Factory {
        private final DataSource.Factory dataSourceFactory;
        private aj<ReleasableExecutor> downloadExecutorSupplier;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private Object tag;
        private String trackId;
        private boolean treatLoadErrorsAsEndOfStream;

        public Factory(DataSource.Factory factory) {
            an.B(factory);
            this.dataSourceFactory = factory;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.treatLoadErrorsAsEndOfStream = true;
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, long j2) {
            return new SingleSampleMediaSource(this.trackId, subtitleConfiguration, this.dataSourceFactory, j2, this.loadErrorHandlingPolicy, this.treatLoadErrorsAsEndOfStream, this.tag, this.downloadExecutorSupplier);
        }

        public <T extends Executor> Factory setDownloadExecutor(final aj<T> ajVar, final Consumer<T> consumer) {
            this.downloadExecutorSupplier = new aj() { // from class: androidx.media3.exoplayer.source.SingleSampleMediaSource$Factory$$ExternalSyntheticLambda0
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ReleasableExecutor.CC.from((Executor) ajVar.get(), consumer);
                }
            };
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        @Deprecated
        public Factory setTrackId(String str) {
            this.trackId = str;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean z) {
            this.treatLoadErrorsAsEndOfStream = z;
            return this;
        }
    }

    private SingleSampleMediaSource(String str, MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, long j2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean z, Object obj, aj<ReleasableExecutor> ajVar) {
        this.dataSourceFactory = factory;
        this.durationUs = j2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.treatLoadErrorsAsEndOfStream = z;
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setUri(Uri.EMPTY);
        builder.setMediaId(subtitleConfiguration.uri.toString());
        builder.setSubtitleConfigurations(bn.q(subtitleConfiguration));
        builder.setTag(obj);
        MediaItem mediaItemBuild = builder.build();
        this.mediaItem = mediaItemBuild;
        Format.Builder builder2 = new Format.Builder();
        builder2.setSampleMimeType((String) an.I(subtitleConfiguration.mimeType, MimeTypes.TEXT_UNKNOWN));
        builder2.setLanguage(subtitleConfiguration.language);
        builder2.setSelectionFlags(subtitleConfiguration.selectionFlags);
        builder2.setRoleFlags(subtitleConfiguration.roleFlags);
        builder2.setLabel(subtitleConfiguration.label);
        String str2 = subtitleConfiguration.id;
        builder2.setId(str2 != null ? str2 : str);
        this.format = builder2.build();
        DataSpec.Builder builder3 = new DataSpec.Builder();
        builder3.setUri(subtitleConfiguration.uri);
        builder3.setFlags(1);
        this.dataSpec = builder3.build();
        this.timeline = new SinglePeriodTimeline(j2, true, false, false, (Object) null, mediaItemBuild);
        this.downloadExecutorSupplier = ajVar;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        aj<ReleasableExecutor> ajVar = this.downloadExecutorSupplier;
        TransferListener transferListener = this.transferListener;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        ReleasableExecutor releasableExecutor = ajVar != null ? ajVar.get() : null;
        boolean z = this.treatLoadErrorsAsEndOfStream;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        long j3 = this.durationUs;
        Format format = this.format;
        return new SingleSampleMediaPeriod(this.dataSpec, this.dataSourceFactory, transferListener, format, j3, loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, z, releasableExecutor);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(TransferListener transferListener) {
        this.transferListener = transferListener;
        refreshSourceInfo(this.timeline);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).release();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
    }
}
