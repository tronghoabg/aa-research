package androidx.media3.exoplayer.trackselection;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.dc;
import com.google.d.d.eb;
import com.google.d.d.fo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final bn<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    /* compiled from: WazeSource */
    public final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j2, long j3) {
            this.totalBandwidth = j2;
            this.allocatedBandwidth = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List<AdaptationCheckpoint> list, Clock clock, Comparator<Format> comparator) {
        long j5;
        super(trackGroup, iArr, i2, comparator);
        if (j4 < j2) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j5 = j2;
        } else {
            j5 = j4;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j2 * 1000;
        this.maxDurationForQualityDecreaseUs = j3 * 1000;
        this.minDurationToRetainAfterDiscardUs = j5 * 1000;
        this.maxWidthToDiscard = i3;
        this.maxHeightToDiscard = i4;
        this.bandwidthFraction = f2;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f3;
        this.adaptationCheckpoints = bn.n(list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.latestBitrateEstimate = -2147483647L;
    }

    private static void addCheckpoint(List<bi<AdaptationCheckpoint>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            bi<AdaptationCheckpoint> biVar = list.get(i2);
            if (biVar != null) {
                biVar.g(new AdaptationCheckpoint(j2, jArr[i2]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j2, long j3) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.length; i3++) {
            if (j2 == Long.MIN_VALUE || !isTrackExcluded(i3, j2)) {
                Format format = getFormat(i3);
                if (canSelectFormat(format, format.bitrate, j3)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bn<bn<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                int i2 = bn.f7456d;
                bi biVar = new bi();
                biVar.g(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(biVar);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int length = sortedTrackBitrates.length;
        int[] iArr = new int[length];
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < sortedTrackBitrates.length; i3++) {
            long[] jArr2 = sortedTrackBitrates[i3];
            jArr[i3] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        bn<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i4 = 0; i4 < switchOrder.size(); i4++) {
            int iIntValue = switchOrder.get(i4).intValue();
            int i5 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i5;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i5];
            addCheckpoint(arrayList, jArr);
        }
        for (int i6 = 0; i6 < definitionArr.length; i6++) {
            if (arrayList.get(i6) != null) {
                long j2 = jArr[i6];
                jArr[i6] = j2 + j2;
            }
        }
        addCheckpoint(arrayList, jArr);
        bi biVar2 = new bi();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            bi biVar3 = (bi) arrayList.get(i7);
            biVar2.g(biVar3 == null ? bn.p() : biVar3.f());
        }
        return biVar2.f();
    }

    private long getAllocatedBandwidth(long j2) {
        bn<AdaptationCheckpoint> bnVar = this.adaptationCheckpoints;
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j2);
        if (bnVar.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i2 = 1;
        while (i2 < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i2).totalBandwidth < totalAllocatableBandwidth) {
            i2++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i2 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i2);
        long j3 = adaptationCheckpoint.totalBandwidth;
        long j4 = totalAllocatableBandwidth - j3;
        long j5 = adaptationCheckpoint2.totalBandwidth - j3;
        return adaptationCheckpoint.allocatedBandwidth + ((long) ((j4 / j5) * (adaptationCheckpoint2.allocatedBandwidth - r0)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (!list.isEmpty()) {
            MediaChunk mediaChunk = (MediaChunk) fo.Q(list);
            long j2 = mediaChunk.startTimeUs;
            if (j2 != C.TIME_UNSET) {
                long j3 = mediaChunk.endTimeUs;
                if (j3 != C.TIME_UNSET) {
                    return j3 - j2;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i2 = this.selectedIndex;
        if (i2 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i2].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[definition.tracks.length];
                int i3 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    long j2 = definition.group.getFormat(iArr[i3]).bitrate;
                    long[] jArr2 = jArr[i2];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i3] = j2;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    private static bn<Integer> getSwitchOrder(long[][] jArr) {
        dc dcVarC = eb.b().b().c();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            int length = jArr[i2].length;
            if (length > 1) {
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    long[] jArr2 = jArr[i2];
                    int length2 = jArr2.length;
                    double dLog = AudioStats.AUDIO_AMPLITUDE_NONE;
                    if (i3 >= length2) {
                        break;
                    }
                    long j2 = jArr2[i3];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i3] = dLog;
                    i3++;
                }
                int i4 = length - 1;
                double d2 = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d3 = dArr[i5];
                    i5++;
                    dcVarC.y(Double.valueOf(d2 == AudioStats.AUDIO_AMPLITUDE_NONE ? 1.0d : (((d3 + dArr[i5]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i2));
                }
            }
        }
        return bn.n(dcVarC.A());
    }

    private long getTotalAllocatableBandwidth(long j2) {
        float fMax;
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        float f2 = (long) (bitrateEstimate * this.bandwidthFraction);
        if (timeToFirstByteEstimateUs == C.TIME_UNSET || j2 == C.TIME_UNSET) {
            fMax = f2 / this.playbackSpeed;
        } else {
            float f3 = j2;
            fMax = (f2 * Math.max((f3 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f3;
        }
        return (long) fMax;
    }

    private long minDurationForQualityIncreaseUs(long j2, long j3) {
        if (j2 == C.TIME_UNSET) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j3 != C.TIME_UNSET) {
            j2 -= j3;
        }
        return Math.min((long) (j2 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    protected boolean canSelectFormat(Format format, int i2, long j2) {
        return ((long) i2) <= j2;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
        this.lastBufferEvaluationMs = C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        int i2;
        int i3;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) fo.Q(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j2, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getAllocatedBandwidth(getLastChunkDurationUs(list))));
            for (int i4 = 0; i4 < size; i4++) {
                MediaChunk mediaChunk = list.get(i4);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j2, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i2 = format2.height) != -1 && i2 <= this.maxHeightToDiscard && (i3 = format2.width) != -1 && i3 <= this.maxWidthToDiscard && i2 < format.height) {
                    return i4;
                }
            }
        }
        return size;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    protected long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // androidx.media3.exoplayer.trackselection.BaseTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f2) {
        this.playbackSpeed = f2;
    }

    protected boolean shouldEvaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        long j3 = this.lastBufferEvaluationMs;
        if (j3 == C.TIME_UNSET || j2 - j3 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) fo.Q(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        long allocatedBandwidth = getAllocatedBandwidth(nextChunkDurationUs);
        int i2 = this.reason;
        if (i2 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, allocatedBandwidth);
            return;
        }
        int i3 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) fo.Q(list)).trackFormat);
        if (iIndexOf != -1) {
            i2 = ((MediaChunk) fo.Q(list)).trackSelectionReason;
            i3 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, allocatedBandwidth);
        if (iDetermineIdealSelectedIndex != i3 && !isTrackExcluded(i3, jElapsedRealtime)) {
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j4, nextChunkDurationUs);
            if ((iDetermineIdealSelectedIndex < i3 && j3 < jMinDurationForQualityIncreaseUs) || (iDetermineIdealSelectedIndex > i3 && j3 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i3;
            }
        }
        if (iDetermineIdealSelectedIndex != i3) {
            i2 = 3;
        }
        this.reason = i2;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    /* compiled from: WazeSource */
    public class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private Comparator<Format> trackFormatComparator;

        public Factory(int i2, int i3, int i4, int i5, int i6, float f2, float f3, Clock clock) {
            this.minDurationForQualityIncreaseMs = i2;
            this.maxDurationForQualityDecreaseMs = i3;
            this.minDurationToRetainAfterDiscardMs = i4;
            this.maxWidthToDiscard = i5;
            this.maxHeightToDiscard = i6;
            this.bandwidthFraction = f2;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f3;
            this.clock = clock;
            this.trackFormatComparator = BaseTrackSelection.DEFAULT_FORMAT_COMPARATOR;
        }

        protected AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, bn<AdaptationCheckpoint> bnVar) {
            Clock clock = this.clock;
            Comparator<Format> comparator = this.trackFormatComparator;
            return new AdaptiveTrackSelection(trackGroup, iArr, i2, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, bnVar, clock, comparator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            Factory factory;
            BandwidthMeter bandwidthMeter2;
            int[] iArr;
            int length;
            ExoTrackSelection exoTrackSelectionCreateAdaptiveTrackSelection;
            bn adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i2 = 0;
            while (i2 < definitionArr.length) {
                ExoTrackSelection.Definition definition = definitionArr[i2];
                if (definition == null || (length = (iArr = definition.tracks).length) == 0) {
                    factory = this;
                    bandwidthMeter2 = bandwidthMeter;
                } else {
                    if (length == 1) {
                        exoTrackSelectionCreateAdaptiveTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                        factory = this;
                        bandwidthMeter2 = bandwidthMeter;
                    } else {
                        factory = this;
                        bandwidthMeter2 = bandwidthMeter;
                        exoTrackSelectionCreateAdaptiveTrackSelection = factory.createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter2, (bn) adaptationCheckpoints.get(i2));
                    }
                    exoTrackSelectionArr[i2] = exoTrackSelectionCreateAdaptiveTrackSelection;
                }
                i2++;
                this = factory;
                bandwidthMeter = bandwidthMeter2;
            }
            return exoTrackSelectionArr;
        }

        public Factory setTrackFormatComparator(Comparator<Format> comparator) {
            an.B(comparator);
            this.trackFormatComparator = comparator;
            return this;
        }

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public Factory(int i2, int i3, int i4, float f2) {
            this(i2, i3, i4, 1279, 719, f2, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i2, int i3, int i4, float f2, float f3, Clock clock) {
            this(i2, i3, i4, 1279, 719, f2, f3, clock);
        }

        public Factory(int i2, int i3, int i4, int i5, int i6, float f2) {
            this(i2, i3, i4, i5, i6, f2, 0.75f, Clock.DEFAULT);
        }
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, long j2, long j3, long j4, int i3, int i4, float f2, float f3, List<AdaptationCheckpoint> list, Clock clock) {
        this(trackGroup, iArr, i2, bandwidthMeter, j2, j3, j4, i3, i4, f2, f3, list, clock, BaseTrackSelection.DEFAULT_FORMAT_COMPARATOR);
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, bn.p(), Clock.DEFAULT);
    }
}
