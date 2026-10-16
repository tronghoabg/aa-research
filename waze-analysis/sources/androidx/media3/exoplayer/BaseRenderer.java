package androidx.media3.exoplayer;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseRenderer implements Renderer, RendererCapabilities {
    private Clock clock;
    private RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private MediaSource.MediaPeriodId mediaPeriodId;
    private PlayerId playerId;
    private RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;
    private SampleStream stream;
    private Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final Object lock = new Object();
    private final FormatHolder formatHolder = new FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private Timeline timeline = Timeline.EMPTY;
    private long streamEndPositionUs = C.TIME_UNSET;

    public BaseRenderer(int i2) {
        this.trackType = i2;
    }

    private void resetPosition(long j2, boolean z, boolean z2) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j2;
        this.readingPositionUs = j2;
        if (!z2) {
            z2 = skipSource(j2) != 0;
        }
        onPositionReset(j2, z, z2);
    }

    private void updatePeriodInfo() {
        MediaSource.MediaPeriodId mediaPeriodId;
        int indexOfPeriod;
        if (this.timeline.isEmpty() || (mediaPeriodId = this.mediaPeriodId) == null || (indexOfPeriod = this.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            this.streamEndPositionUs = C.TIME_UNSET;
            return;
        }
        Timeline.Period period = this.timeline.getPeriod(indexOfPeriod, new Timeline.Period());
        this.streamEndPositionUs = period.durationUs;
        int i2 = mediaPeriodId.adGroupIndex;
        if (i2 != -1) {
            this.streamEndPositionUs = period.adPlaybackState.getAdGroup(i2).durationsUs[mediaPeriodId.adIndexInAdGroup];
            return;
        }
        int i3 = mediaPeriodId.nextAdGroupIndex;
        if (i3 != -1) {
            long j2 = period.adPlaybackState.getAdGroup(i3).timeUs;
            if (j2 != Long.MIN_VALUE) {
                this.streamEndPositionUs = j2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    protected final ExoPlaybackException createRendererException(Throwable th, Format format, boolean z, int i2) {
        int formatSupport = 4;
        if (format != null && !this.throwRendererExceptionIsExecuting) {
            this.throwRendererExceptionIsExecuting = true;
            try {
                formatSupport = RendererCapabilities.CC.getFormatSupport(supportsFormat(format));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.throwRendererExceptionIsExecuting = false;
            }
        }
        return ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, formatSupport, this.mediaPeriodId, z, i2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        an.u(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
        this.mediaPeriodId = null;
        this.streamEndPositionUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4, MediaSource.MediaPeriodId mediaPeriodId) {
        an.u(this.state == 0);
        this.configuration = rendererConfiguration;
        this.mediaPeriodId = mediaPeriodId;
        this.state = 1;
        onEnabled(z, z2);
        replaceStream(formatArr, sampleStream, j3, j4, mediaPeriodId);
        resetPosition(j3, z, true);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ void enableMayRenderStartOfStream() {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    protected final Clock getClock() {
        Clock clock = this.clock;
        an.B(clock);
        return clock;
    }

    protected final RendererConfiguration getConfiguration() {
        RendererConfiguration rendererConfiguration = this.configuration;
        an.B(rendererConfiguration);
        return rendererConfiguration;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ long getDurationToProgressUs(long j2, long j3) {
        return Renderer.CC.$default$getDurationToProgressUs(this, j2, j3);
    }

    protected final FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return null;
    }

    protected final MediaSource.MediaPeriodId getMediaPeriodId() {
        return this.mediaPeriodId;
    }

    protected final PlayerId getPlayerId() {
        PlayerId playerId = this.playerId;
        an.B(playerId);
        return playerId;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final SampleStream getStream() {
        return this.stream;
    }

    protected final long getStreamEndPositionUs() {
        return this.streamEndPositionUs;
    }

    protected final Format[] getStreamFormats() {
        Format[] formatArr = this.streamFormats;
        an.B(formatArr);
        return formatArr;
    }

    protected final long getStreamOffsetUs() {
        return this.streamOffsetUs;
    }

    protected final Timeline getTimeline() {
        return this.timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i2, Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i2, PlayerId playerId, Clock clock) {
        this.index = i2;
        this.playerId = playerId;
        this.clock = clock;
        onInit();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    protected final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        SampleStream sampleStream = this.stream;
        an.B(sampleStream);
        return sampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
        SampleStream sampleStream = this.stream;
        an.B(sampleStream);
        sampleStream.maybeThrowError();
    }

    protected void onDisabled() {
    }

    protected void onEnabled(boolean z, boolean z2) {
    }

    protected void onInit() {
    }

    protected void onPositionReset(long j2, boolean z, boolean z2) {
    }

    protected void onRelease() {
    }

    protected final void onRendererCapabilitiesChanged() {
        RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }

    protected void onReset() {
    }

    protected void onStarted() {
    }

    protected void onStopped() {
    }

    protected void onStreamChanged(Format[] formatArr, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    protected void onTimelineChanged(Timeline timeline) {
    }

    protected final int readSource(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        SampleStream sampleStream = this.stream;
        an.B(sampleStream);
        int data = sampleStream.readData(formatHolder, decoderInputBuffer, i2);
        if (data == -4) {
            int i3 = i2 & 1;
            if (decoderInputBuffer.isEndOfStream()) {
                if (i3 == 0) {
                    this.readingPositionUs = Long.MIN_VALUE;
                }
                return this.streamIsFinal ? -4 : -3;
            }
            long j2 = decoderInputBuffer.timeUs + this.streamOffsetUs;
            decoderInputBuffer.timeUs = j2;
            if (i3 == 0) {
                this.readingPositionUs = Math.max(this.readingPositionUs, j2);
                return -4;
            }
        } else if (data == -5) {
            Format format = formatHolder.format;
            an.B(format);
            if (format.subsampleOffsetUs == Long.MAX_VALUE) {
                return -5;
            }
            Format.Builder builderBuildUpon = format.buildUpon();
            builderBuildUpon.setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs);
            formatHolder.format = builderBuildUpon.build();
            return -5;
        }
        return data;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        an.u(this.state == 0);
        onRelease();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j2, long j3, MediaSource.MediaPeriodId mediaPeriodId) {
        an.u(!this.streamIsFinal);
        this.stream = sampleStream;
        this.mediaPeriodId = mediaPeriodId;
        updatePeriodInfo();
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j2;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j3;
        onStreamChanged(formatArr, j2, j3, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        an.u(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ void setPlaybackSpeed(float f2, float f3) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setTimeline(Timeline timeline) {
        if (Objects.equals(this.timeline, timeline)) {
            return;
        }
        this.timeline = timeline;
        updatePeriodInfo();
        onTimelineChanged(this.timeline);
    }

    protected int skipSource(long j2) {
        SampleStream sampleStream = this.stream;
        an.B(sampleStream);
        return sampleStream.skipData(j2 - this.streamOffsetUs);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        an.u(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        an.u(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public /* synthetic */ boolean supportsResetPositionWithoutKeyFrameReset(long j2) {
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j2, boolean z) {
        resetPosition(j2, false, z);
    }

    protected final ExoPlaybackException createRendererException(Throwable th, Format format, int i2) {
        return createRendererException(th, format, false, i2);
    }
}
