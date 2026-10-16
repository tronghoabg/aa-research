package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    private final Renderer[] renderers;

    private DefaultRendererCapabilitiesList(Renderer[] rendererArr) {
        this.renderers = (Renderer[]) Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            this.renderers[i2].init(i2, PlayerId.UNSET, SystemClock.DEFAULT);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] getRendererCapabilities() {
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[this.renderers.length];
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i2 >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i2] = rendererArr[i2].getCapabilities();
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (Renderer renderer : this.renderers) {
            renderer.release();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }

    /* compiled from: WazeSource */
    public final class Factory implements RendererCapabilitiesList.Factory {
        private final RenderersFactory renderersFactory;

        public Factory(Context context) {
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        static /* synthetic */ void lambda$createRendererCapabilitiesList$0(CueGroup cueGroup) {
        }

        static /* synthetic */ void lambda$createRendererCapabilitiesList$1(Metadata metadata) {
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener(this) { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
                {
                    Objects.requireNonNull(this);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onDroppedFrames(int i2, long j2) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onRenderedFirstFrame(Object obj, long j2) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoCodecError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoCodecParametersChanged(CodecParameters codecParameters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDecoderInitialized(String str, long j2, long j3) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDecoderReleased(String str) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoFrameProcessingOffset(long j2, int i2) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                }
            }, new AudioRendererEventListener(this) { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
                {
                    Objects.requireNonNull(this);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioCodecError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioCodecParametersChanged(CodecParameters codecParameters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDecoderInitialized(String str, long j2, long j3) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDecoderReleased(String str) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioPositionAdvancing(long j2) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioSessionIdChanged(int i2) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioSinkError(Exception exc) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onAudioUnderrun(int i2, long j2, long j3) {
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                }
            }, new TextOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.text.TextOutput
                public final void onCues(CueGroup cueGroup) {
                }

                @Override // androidx.media3.exoplayer.text.TextOutput
                public /* synthetic */ void onCues(List list) {
                }
            }, new MetadataOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda1
                @Override // androidx.media3.exoplayer.metadata.MetadataOutput
                public final void onMetadata(Metadata metadata) {
                }
            }));
        }

        public Factory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }
    }
}
