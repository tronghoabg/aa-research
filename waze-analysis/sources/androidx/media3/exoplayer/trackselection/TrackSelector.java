package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class TrackSelector {
    private BandwidthMeter bandwidthMeter;
    private InvalidationListener listener;

    /* compiled from: WazeSource */
    public interface Factory {
        TrackSelector createTrackSelector(Context context);
    }

    /* compiled from: WazeSource */
    public interface InvalidationListener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.trackselection.TrackSelector$InvalidationListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onRendererCapabilitiesChanged(InvalidationListener invalidationListener, Renderer renderer) {
            }
        }

        void onRendererCapabilitiesChanged(Renderer renderer);

        void onTrackSelectionsInvalidated();
    }

    protected final BandwidthMeter getBandwidthMeter() {
        BandwidthMeter bandwidthMeter = this.bandwidthMeter;
        an.B(bandwidthMeter);
        return bandwidthMeter;
    }

    public TrackSelectionParameters getParameters() {
        return TrackSelectionParameters.DEFAULT;
    }

    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return null;
    }

    public void init(InvalidationListener invalidationListener, BandwidthMeter bandwidthMeter) {
        an.u(this.listener == null);
        this.listener = invalidationListener;
        this.bandwidthMeter = bandwidthMeter;
    }

    protected final void invalidate() {
        InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated();
        }
    }

    protected final void invalidateForRendererCapabilitiesChange(Renderer renderer) {
        InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onRendererCapabilitiesChanged(renderer);
        }
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public abstract TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    public void setAudioAttributes(AudioAttributes audioAttributes) {
    }

    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
    }
}
