package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.image.ImageMetadataListener;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import com.google.d.b.an;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class RendererHolder {
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_PRIMARY = 0;
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_SECONDARY = 1;
    static final int RENDERER_PREWARMING_STATE_PREWARMING_PRIMARY = 2;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_PRIMARY = 4;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_SECONDARY = 3;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_COMPLETED = 1;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_DISABLE_OFFLOAD_SCHEDULING = 2;
    private static final String TAG = "RendererHolder";
    private final int index;
    private final Renderer primaryRenderer;
    private final Renderer secondaryRenderer;
    private int prewarmingState = 0;
    private boolean primaryRequiresReset = false;
    private boolean secondaryRequiresReset = false;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface RendererPrewarmingState {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ReplaceStreamsOrDisableRendererResult {
    }

    public RendererHolder(Renderer renderer, Renderer renderer2, int i2) {
        this.primaryRenderer = renderer;
        this.index = i2;
        this.secondaryRenderer = renderer2;
    }

    private void disableRenderer(Renderer renderer, DefaultMediaClock defaultMediaClock) {
        boolean z = true;
        if (this.primaryRenderer != renderer && this.secondaryRenderer != renderer) {
            z = false;
        }
        an.u(z);
        if (isRendererEnabled(renderer)) {
            defaultMediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
        }
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            an.B(exoTrackSelection);
            formatArr[i2] = exoTrackSelection.getFormat(i2);
        }
        return formatArr;
    }

    private Renderer getRendererReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return null;
        }
        int i2 = this.index;
        SampleStream[] sampleStreamArr = mediaPeriodHolder.sampleStreams;
        if (sampleStreamArr[i2] == null) {
            return null;
        }
        if (this.primaryRenderer.getStream() == sampleStreamArr[i2]) {
            return this.primaryRenderer;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null) {
            return null;
        }
        if (renderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
            return this.secondaryRenderer;
        }
        return null;
    }

    private boolean hasFinishedReadingFromPeriodInternal(MediaPeriodHolder mediaPeriodHolder, Renderer renderer) {
        if (renderer == null) {
            return true;
        }
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[this.index];
        if (renderer.getStream() == null || (renderer.getStream() == sampleStream && (sampleStream == null || renderer.hasReadStreamToEnd() || hasReachedServerSideInsertedAdsTransition(renderer, mediaPeriodHolder)))) {
            return true;
        }
        for (MediaPeriodHolder next = mediaPeriodHolder.getNext(); next != null; next = next.getNext()) {
            if (Objects.equals(next.sampleStreams[this.index], renderer.getStream())) {
                return true;
            }
        }
        return false;
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next != null && next.prepared) {
            return (renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    private boolean isPrimaryRendererPrewarming() {
        int i2 = this.prewarmingState;
        return i2 == 2 || i2 == 4;
    }

    private boolean isSecondaryRendererPrewarming() {
        return this.prewarmingState == 3;
    }

    private void maybeDisableOrResetPositionInternal(Renderer renderer, SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j2, boolean z) {
        if (isRendererEnabled(renderer)) {
            if (sampleStream != renderer.getStream()) {
                disableRenderer(renderer, defaultMediaClock);
            } else if (z) {
                renderer.resetPosition(j2, true);
            }
        }
    }

    private void maybeResetRenderer(boolean z) {
        if (z) {
            if (this.primaryRequiresReset) {
                this.primaryRenderer.reset();
                this.primaryRequiresReset = false;
                return;
            }
            return;
        }
        if (this.secondaryRequiresReset) {
            Renderer renderer = this.secondaryRenderer;
            an.B(renderer);
            renderer.reset();
            this.secondaryRequiresReset = false;
        }
    }

    private int replaceStreamsOrDisableRendererForTransitionInternal(Renderer renderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) {
        if (renderer == null || !isRendererEnabled(renderer) || ((renderer == this.primaryRenderer && isPrimaryRendererPrewarming()) || (renderer == this.secondaryRenderer && isSecondaryRendererPrewarming()))) {
            return 1;
        }
        SampleStream stream = renderer.getStream();
        SampleStream[] sampleStreamArr = mediaPeriodHolder.sampleStreams;
        int i2 = this.index;
        SampleStream sampleStream = sampleStreamArr[i2];
        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i2);
        if (zIsRendererEnabled && stream == sampleStream) {
            return 1;
        }
        if (!renderer.isCurrentStreamFinal()) {
            Format[] formats = getFormats(trackSelectorResult.selections[this.index]);
            SampleStream sampleStream2 = mediaPeriodHolder.sampleStreams[this.index];
            an.B(sampleStream2);
            renderer.replaceStream(formats, sampleStream2, mediaPeriodHolder.getStartPositionRendererTime(), mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id);
            return 3;
        }
        if (!renderer.isEnded()) {
            return 0;
        }
        disableRenderer(renderer, defaultMediaClock);
        if (!zIsRendererEnabled || isPrewarming()) {
            maybeResetRenderer(renderer == this.primaryRenderer);
        }
        return 1;
    }

    private void setCurrentStreamFinalInternal(Renderer renderer, long j2) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j2);
        }
    }

    private void transferResources(boolean z) {
        if (z) {
            Renderer renderer = this.secondaryRenderer;
            an.B(renderer);
            renderer.handleMessage(17, this.primaryRenderer);
        } else {
            Renderer renderer2 = this.primaryRenderer;
            Renderer renderer3 = this.secondaryRenderer;
            an.B(renderer3);
            renderer2.handleMessage(17, renderer3);
        }
    }

    public boolean allowsPlayback(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        return rendererReadingFromPeriod == null || rendererReadingFromPeriod.hasReadStreamToEnd() || rendererReadingFromPeriod.isReady() || rendererReadingFromPeriod.isEnded();
    }

    public void disable(DefaultMediaClock defaultMediaClock) {
        disableRenderer(this.primaryRenderer, defaultMediaClock);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            boolean z = isRendererEnabled(renderer) && this.prewarmingState != 3;
            disableRenderer(this.secondaryRenderer, defaultMediaClock);
            maybeResetRenderer(false);
            if (z) {
                transferResources(true);
            }
        }
        this.prewarmingState = 0;
    }

    public void disablePrewarming(DefaultMediaClock defaultMediaClock) {
        boolean z;
        Renderer renderer;
        if (isPrewarming()) {
            int i2 = this.prewarmingState;
            if (i2 == 4) {
                z = true;
            } else if (i2 == 2) {
                i2 = 2;
                z = true;
            } else {
                z = false;
            }
            try {
                if (z) {
                    renderer = this.primaryRenderer;
                } else {
                    renderer = this.secondaryRenderer;
                    an.B(renderer);
                }
                disableRenderer(renderer, defaultMediaClock);
            } catch (RuntimeException e2) {
                Log.e(TAG, "Disable prewarming failed.", e2);
            }
            try {
                maybeResetRenderer(z);
            } catch (RuntimeException e3) {
                Log.e(TAG, "Reset prewarming failed.", e3);
            }
            this.prewarmingState = i2 == 4 ? 1 : 0;
        }
    }

    public void enable(RendererConfiguration rendererConfiguration, ExoTrackSelection exoTrackSelection, SampleStream sampleStream, long j2, boolean z, boolean z2, long j3, long j4, MediaSource.MediaPeriodId mediaPeriodId, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        Format[] formats = getFormats(exoTrackSelection);
        int i2 = this.prewarmingState;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.primaryRequiresReset = true;
            this.primaryRenderer.enable(rendererConfiguration, formats, sampleStream, j2, z, z2, j3, j4, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.primaryRenderer);
        } else {
            this.secondaryRequiresReset = true;
            Renderer renderer = this.secondaryRenderer;
            an.B(renderer);
            renderer.enable(rendererConfiguration, formats, sampleStream, j2, z, z2, j3, j4, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.secondaryRenderer);
        }
    }

    public void enableMayRenderStartOfStream() {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.enableMayRenderStartOfStream();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.enableMayRenderStartOfStream();
    }

    public int getEnabledRendererCount() {
        Renderer renderer = this.secondaryRenderer;
        boolean zIsRendererEnabled = isRendererEnabled(this.primaryRenderer);
        int i2 = 0;
        if (renderer != null && isRendererEnabled(renderer)) {
            i2 = 1;
        }
        return (zIsRendererEnabled ? 1 : 0) + i2;
    }

    public long getMinDurationToProgressUs(long j2, long j3) {
        long durationToProgressUs = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.getDurationToProgressUs(j2, j3) : Long.MAX_VALUE;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? durationToProgressUs : Math.min(durationToProgressUs, this.secondaryRenderer.getDurationToProgressUs(j2, j3));
    }

    public long getReadingPositionUs(MediaPeriodHolder mediaPeriodHolder) {
        return ((Renderer) Objects.requireNonNull(getRendererReadingFromPeriod(mediaPeriodHolder))).getReadingPositionUs();
    }

    public int getTrackType() {
        return this.primaryRenderer.getTrackType();
    }

    public void handleMessage(int i2, Object obj, MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        an.B(rendererReadingFromPeriod);
        rendererReadingFromPeriod.handleMessage(i2, obj);
    }

    public boolean hasFinishedReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.primaryRenderer) && hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.secondaryRenderer);
    }

    public boolean hasReadPeriodToEnd(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        an.B(rendererReadingFromPeriod);
        return rendererReadingFromPeriod.hasReadStreamToEnd();
    }

    public boolean hasSecondary() {
        return this.secondaryRenderer != null;
    }

    public boolean isEnded() {
        boolean zIsEnded = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.isEnded() : true;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? zIsEnded : this.secondaryRenderer.isEnded() & zIsEnded;
    }

    public boolean isPrewarming() {
        return isPrimaryRendererPrewarming() || isSecondaryRendererPrewarming();
    }

    public boolean isPrewarmingPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return (isPrimaryRendererPrewarming() && getRendererReadingFromPeriod(mediaPeriodHolder) == this.primaryRenderer) || (isSecondaryRendererPrewarming() && getRendererReadingFromPeriod(mediaPeriodHolder) == this.secondaryRenderer);
    }

    public boolean isReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return getRendererReadingFromPeriod(mediaPeriodHolder) != null;
    }

    public boolean isRendererEnabled() {
        int i2 = this.prewarmingState;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            return isRendererEnabled(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        an.B(renderer);
        return isRendererEnabled(renderer);
    }

    public void maybeDisableOrResetPosition(SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j2, boolean z) {
        maybeDisableOrResetPositionInternal(this.primaryRenderer, sampleStream, defaultMediaClock, j2, z);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            maybeDisableOrResetPositionInternal(renderer, sampleStream, defaultMediaClock, j2, z);
        }
    }

    public void maybeHandlePrewarmingTransition() {
        int i2 = this.prewarmingState;
        if (i2 == 3 || i2 == 4) {
            transferResources(i2 == 4);
            this.prewarmingState = this.prewarmingState != 4 ? 1 : 0;
        } else if (i2 == 2) {
            this.prewarmingState = 0;
        }
    }

    public void maybeSetOldStreamToFinal(TrackSelectorResult trackSelectorResult, TrackSelectorResult trackSelectorResult2, long j2) {
        Renderer renderer;
        int i2;
        Renderer renderer2 = this.secondaryRenderer;
        int i3 = this.index;
        boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i3);
        boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i3);
        if (renderer2 == null || (i2 = this.prewarmingState) == 3 || (i2 == 0 && isRendererEnabled(this.primaryRenderer))) {
            renderer = this.primaryRenderer;
        } else {
            renderer = this.secondaryRenderer;
            an.B(renderer);
        }
        if (!zIsRendererEnabled || renderer.isCurrentStreamFinal()) {
            return;
        }
        int trackType = getTrackType();
        RendererConfiguration[] rendererConfigurationArr = trackSelectorResult.rendererConfigurations;
        int i4 = this.index;
        RendererConfiguration rendererConfiguration = rendererConfigurationArr[i4];
        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i4];
        if (!zIsRendererEnabled2 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || trackType == -2 || isPrewarming()) {
            setCurrentStreamFinalInternal(renderer, j2);
        }
    }

    public void maybeThrowStreamError(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        an.B(rendererReadingFromPeriod);
        rendererReadingFromPeriod.maybeThrowStreamError();
    }

    public void release() {
        this.primaryRenderer.release();
        this.primaryRequiresReset = false;
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.release();
            this.secondaryRequiresReset = false;
        }
    }

    public void render(long j2, long j3) {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.render(j2, j3);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.render(j2, j3);
    }

    public int replaceStreamsOrDisableRendererForTransition(MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) {
        int iReplaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal(this.primaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock);
        return iReplaceStreamsOrDisableRendererForTransitionInternal == 1 ? replaceStreamsOrDisableRendererForTransitionInternal(this.secondaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock) : iReplaceStreamsOrDisableRendererForTransitionInternal;
    }

    public void reset() {
        if (!isRendererEnabled(this.primaryRenderer)) {
            maybeResetRenderer(true);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || isRendererEnabled(renderer)) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void resetPosition(MediaPeriodHolder mediaPeriodHolder, long j2, boolean z) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        if (rendererReadingFromPeriod != null) {
            rendererReadingFromPeriod.resetPosition(j2, z);
        }
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j2) {
        int i2;
        if (isRendererEnabled(this.primaryRenderer) && (i2 = this.prewarmingState) != 4 && i2 != 2) {
            setCurrentStreamFinalInternal(this.primaryRenderer, j2);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer) || this.prewarmingState == 3) {
            return;
        }
        setCurrentStreamFinalInternal(this.secondaryRenderer, j2);
    }

    public void setAudioSessionId(int i2) {
        if (getTrackType() == 1 || getTrackType() == 2) {
            Renderer renderer = this.primaryRenderer;
            Integer numValueOf = Integer.valueOf(i2);
            renderer.handleMessage(10, numValueOf);
            Renderer renderer2 = this.secondaryRenderer;
            if (renderer2 != null) {
                renderer2.handleMessage(10, numValueOf);
            }
        }
    }

    public void setCurrentStreamFinal(long j2) {
        int i2;
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || (i2 = this.prewarmingState) == 3 || i2 == 0) {
            renderer = this.primaryRenderer;
        }
        setCurrentStreamFinalInternal(renderer, j2);
    }

    public void setImageMetadataListener(ImageMetadataListener imageMetadataListener) {
        if (getTrackType() != 4) {
            return;
        }
        this.primaryRenderer.handleMessage(23, imageMetadataListener);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(23, imageMetadataListener);
        }
    }

    public void setPlaybackSpeed(float f2, float f3) {
        this.primaryRenderer.setPlaybackSpeed(f2, f3);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setPlaybackSpeed(f2, f3);
        }
    }

    public void setScrubbingMode(ScrubbingModeParameters scrubbingModeParameters) {
        this.primaryRenderer.handleMessage(18, scrubbingModeParameters);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(18, scrubbingModeParameters);
        }
    }

    public void setTimeline(Timeline timeline) {
        this.primaryRenderer.setTimeline(timeline);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setTimeline(timeline);
        }
    }

    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        if (getTrackType() == 2 || getTrackType() == 4) {
            this.primaryRenderer.handleMessage(7, videoFrameMetadataListener);
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null) {
                renderer.handleMessage(7, videoFrameMetadataListener);
            }
        }
    }

    public void setVideoOutput(Object obj) {
        if (getTrackType() != 2) {
            return;
        }
        int i2 = this.prewarmingState;
        if (i2 != 4 && i2 != 1) {
            this.primaryRenderer.handleMessage(1, obj);
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        an.B(renderer);
        renderer.handleMessage(1, obj);
    }

    public void setVolume(float f2) {
        if (getTrackType() != 1) {
            return;
        }
        Renderer renderer = this.primaryRenderer;
        Float fValueOf = Float.valueOf(f2);
        renderer.handleMessage(2, fValueOf);
        Renderer renderer2 = this.secondaryRenderer;
        if (renderer2 != null) {
            renderer2.handleMessage(2, fValueOf);
        }
    }

    public void start() {
        if (this.primaryRenderer.getState() == 1 && this.prewarmingState != 4) {
            this.primaryRenderer.start();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || renderer.getState() != 1 || this.prewarmingState == 3) {
            return;
        }
        this.secondaryRenderer.start();
    }

    public void startPrewarming() {
        int i2;
        an.u(!isPrewarming());
        if (isRendererEnabled(this.primaryRenderer)) {
            i2 = 3;
        } else {
            Renderer renderer = this.secondaryRenderer;
            i2 = (renderer == null || !isRendererEnabled(renderer)) ? 2 : 4;
        }
        this.prewarmingState = i2;
    }

    public void stop() {
        if (isRendererEnabled(this.primaryRenderer)) {
            ensureStopped(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        ensureStopped(this.secondaryRenderer);
    }

    public boolean supportsResetPositionWithoutKeyFrameReset(MediaPeriodHolder mediaPeriodHolder, long j2) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        return rendererReadingFromPeriod != null && rendererReadingFromPeriod.supportsResetPositionWithoutKeyFrameReset(j2);
    }

    public void setCurrentStreamFinal(MediaPeriodHolder mediaPeriodHolder, long j2) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        an.B(rendererReadingFromPeriod);
        setCurrentStreamFinalInternal(rendererReadingFromPeriod, j2);
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }
}
