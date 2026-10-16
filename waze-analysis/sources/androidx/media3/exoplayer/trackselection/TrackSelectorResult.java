package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.RendererConfiguration;
import com.google.d.b.an;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final Tracks tracks;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, Object obj) {
        int length = rendererConfigurationArr.length;
        an.l(length == exoTrackSelectionArr.length);
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = length;
    }

    public boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i2) {
        return trackSelectorResult != null && Objects.equals(this.rendererConfigurations[i2], trackSelectorResult.rendererConfigurations[i2]) && Objects.equals(this.selections[i2], trackSelectorResult.selections[i2]);
    }

    public boolean isRendererEnabled(int i2) {
        return this.rendererConfigurations[i2] != null;
    }

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, Tracks.EMPTY, obj);
    }

    public boolean isEquivalent(TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult != null) {
            if (trackSelectorResult.selections.length == this.selections.length) {
                for (int i2 = 0; i2 < this.selections.length; i2++) {
                    if (!isEquivalent(trackSelectorResult, i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
