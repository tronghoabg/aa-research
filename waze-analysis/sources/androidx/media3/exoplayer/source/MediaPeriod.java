package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaPeriod extends SequenceableLoader {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.source.MediaPeriod$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$setEndPositionUs(MediaPeriod mediaPeriod, long j2) {
            return Long.MIN_VALUE;
        }

        public static void $default$setUsesStreamPrerollFlags(MediaPeriod mediaPeriod) {
        }
    }

    /* compiled from: WazeSource */
    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void onPrepared(MediaPeriod mediaPeriod);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean continueLoading(LoadingInfo loadingInfo);

    void discardBuffer(long j2, boolean z);

    long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters);

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getBufferedPositionUs();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    long getNextLoadPositionUs();

    List<StreamKey> getStreamKeys(List<ExoTrackSelection> list);

    TrackGroupArray getTrackGroups();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    boolean isLoading();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j2);

    long readDiscontinuity();

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    void reevaluateBuffer(long j2);

    long seekToUs(long j2);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2);

    long setEndPositionUs(long j2);

    void setUsesStreamPrerollFlags();
}
