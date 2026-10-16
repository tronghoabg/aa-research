package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import com.google.d.b.an;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    public static final Comparator<Format> DEFAULT_FORMAT_COMPARATOR = new Comparator() { // from class: androidx.media3.exoplayer.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((Format) obj2).bitrate, ((Format) obj).bitrate);
        }
    };
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    protected BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, Comparator<Format> comparator) {
        Format[] formatArr;
        int length = iArr.length;
        an.u(length > 0);
        this.type = i2;
        an.B(trackGroup);
        this.group = trackGroup;
        this.length = length;
        this.formats = new Format[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            formatArr = this.formats;
            if (i3 >= length2) {
                break;
            }
            formatArr[i3] = trackGroup.getFormat(iArr[i3]);
            i3++;
        }
        an.B(comparator);
        Arrays.sort(formatArr, comparator);
        this.tracks = new int[this.length];
        int i4 = 0;
        while (true) {
            int i5 = this.length;
            if (i4 >= i5) {
                this.excludeUntilTimes = new long[i5];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i4] = trackGroup.indexOf(this.formats[i4]);
                i4++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void clearTrackExclusions() {
        Arrays.fill(this.excludeUntilTimes, 0L);
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.group.equals(baseTrackSelection.group) && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i2, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i2, jElapsedRealtime);
        int i3 = 0;
        while (true) {
            if (i3 < this.length) {
                if (zIsTrackExcluded) {
                    break;
                }
                zIsTrackExcluded = (i3 == i2 || isTrackExcluded(i3, jElapsedRealtime)) ? false : true;
                i3++;
            } else if (!zIsTrackExcluded) {
                return false;
            }
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i2] = Math.max(jArr[i2], Util.addWithOverflowDefault(jElapsedRealtime, j2, Long.MAX_VALUE));
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final Format getFormat(int i2) {
        return this.formats[i2];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i2) {
        return this.tracks[i2];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public /* synthetic */ long getLatestBitrateEstimate() {
        return -2147483647L;
    }

    protected final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iIdentityHashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        this.hashCode = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i2) {
        for (int i3 = 0; i3 < this.length; i3++) {
            if (this.tracks[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i2, long j2) {
        return this.excludeUntilTimes[i2] > j2;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlayWhenReadyChanged(boolean z) {
        this.playWhenReady = z;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f2) {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j2, Chunk chunk, List list) {
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.formats[i2] == format) {
                return i2;
            }
        }
        return -1;
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i2) {
        this(trackGroup, iArr, i2, DEFAULT_FORMAT_COMPARATOR);
    }

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }
}
