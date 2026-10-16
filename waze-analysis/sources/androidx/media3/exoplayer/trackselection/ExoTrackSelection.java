package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ExoTrackSelection extends TrackSelection {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.trackselection.ExoTrackSelection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$clearTrackExclusions(ExoTrackSelection exoTrackSelection) {
        }

        public static long $default$getLatestBitrateEstimate(ExoTrackSelection exoTrackSelection) {
            return -2147483647L;
        }

        public static void $default$onDiscontinuity(ExoTrackSelection exoTrackSelection) {
        }

        public static void $default$onPlayWhenReadyChanged(ExoTrackSelection exoTrackSelection, boolean z) {
        }

        public static void $default$onRebuffer(ExoTrackSelection exoTrackSelection) {
        }

        public static boolean $default$shouldCancelChunkLoad(ExoTrackSelection exoTrackSelection, long j2, Chunk chunk, List list) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    void clearTrackExclusions();

    void disable();

    void enable();

    int evaluateQueueSize(long j2, List<? extends MediaChunk> list);

    boolean excludeTrack(int i2, long j2);

    long getLatestBitrateEstimate();

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    boolean isTrackExcluded(int i2, long j2);

    void onDiscontinuity();

    void onPlayWhenReadyChanged(boolean z);

    void onPlaybackSpeed(float f2);

    void onRebuffer();

    boolean shouldCancelChunkLoad(long j2, Chunk chunk, List<? extends MediaChunk> list);

    void updateSelectedTrack(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    /* compiled from: WazeSource */
    public final class Definition {
        private static final String TAG = "ETSDefinition";
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup trackGroup, int[] iArr, int i2) {
            if (iArr.length == 0) {
                Log.e(TAG, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i2;
        }

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }
    }
}
