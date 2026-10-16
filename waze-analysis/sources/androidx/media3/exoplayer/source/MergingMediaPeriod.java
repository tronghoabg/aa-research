package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.ForwardingTrackSelection;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bn;
import com.google.d.d.fo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final MediaPeriod[] periods;
    private final boolean[] periodsWithTimeOffsets;
    private TrackGroupArray trackGroups;
    private final ArrayList<MediaPeriod> childrenPendingPreparation = new ArrayList<>();
    private final HashMap<TrackGroup, TrackGroup> childTrackGroupByMergedTrackGroup = new HashMap<>();
    private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices = new IdentityHashMap<>();
    private MediaPeriod[] enabledPeriods = new MediaPeriod[0];

    /* compiled from: WazeSource */
    final class MergingMediaPeriodTrackSelection extends ForwardingTrackSelection {
        private final TrackGroup trackGroup;

        public MergingMediaPeriodTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            super(exoTrackSelection);
            this.trackGroup = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof MergingMediaPeriodTrackSelection)) {
                return this.trackGroup.equals(((MergingMediaPeriodTrackSelection) obj).trackGroup);
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection, androidx.media3.exoplayer.trackselection.TrackSelection
        public Format getFormat(int i2) {
            return this.trackGroup.getFormat(getWrappedInstance().getIndexInTrackGroup(i2));
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection, androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public Format getSelectedFormat() {
            return this.trackGroup.getFormat(getWrappedInstance().getSelectedIndexInTrackGroup());
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection, androidx.media3.exoplayer.trackselection.TrackSelection
        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection
        public int hashCode() {
            return (super.hashCode() * 31) + this.trackGroup.hashCode();
        }

        @Override // androidx.media3.exoplayer.trackselection.ForwardingTrackSelection, androidx.media3.exoplayer.trackselection.TrackSelection
        public int indexOf(Format format) {
            return getWrappedInstance().indexOf(this.trackGroup.indexOf(format));
        }
    }

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.periods = mediaPeriodArr;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
        this.periodsWithTimeOffsets = new boolean[mediaPeriodArr.length];
        for (int i2 = 0; i2 < mediaPeriodArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                this.periodsWithTimeOffsets[i2] = true;
                this.periods[i2] = new TimeOffsetMediaPeriod(mediaPeriodArr[i2], j2);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.childrenPendingPreparation.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        int size = this.childrenPendingPreparation.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.childrenPendingPreparation.get(i2).continueLoading(loadingInfo);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j2, boolean z) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j2, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j2, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    public MediaPeriod getChildPeriod(int i2) {
        boolean z = this.periodsWithTimeOffsets[i2];
        MediaPeriod[] mediaPeriodArr = this.periods;
        return z ? ((TimeOffsetMediaPeriod) mediaPeriodArr[i2]).getWrappedMediaPeriod() : mediaPeriodArr[i2];
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public bn<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return bn.p();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.trackGroups;
        an.B(trackGroupArray);
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        an.B(callback);
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.childrenPendingPreparation.remove(mediaPeriod);
        if (!this.childrenPendingPreparation.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (MediaPeriod mediaPeriod2 : this.periods) {
            i2 += mediaPeriod2.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            if (i3 >= mediaPeriodArr.length) {
                this.trackGroups = new TrackGroupArray(trackGroupArr);
                MediaPeriod.Callback callback = this.callback;
                an.B(callback);
                callback.onPrepared(this);
                return;
            }
            TrackGroupArray trackGroups = mediaPeriodArr[i3].getTrackGroups();
            int i5 = trackGroups.length;
            int i6 = 0;
            while (i6 < i5) {
                TrackGroup trackGroup = trackGroups.get(i6);
                Format[] formatArr = new Format[trackGroup.length];
                for (int i7 = 0; i7 < trackGroup.length; i7++) {
                    Format format = trackGroup.getFormat(i7);
                    Format.Builder builderBuildUpon = format.buildUpon();
                    String str = format.id;
                    if (str == null) {
                        str = "";
                    }
                    builderBuildUpon.setId(i3 + ":" + str);
                    String str2 = format.primaryTrackGroupId;
                    if (str2 != null) {
                        builderBuildUpon.setPrimaryTrackGroupId(i3 + ":" + str2);
                    }
                    formatArr[i7] = builderBuildUpon.build();
                }
                TrackGroup trackGroup2 = new TrackGroup(i3 + ":" + trackGroup.id, formatArr);
                this.childTrackGroupByMergedTrackGroup.put(trackGroup2, trackGroup);
                trackGroupArr[i4] = trackGroup2;
                i6++;
                i4++;
            }
            i3++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.callback = callback;
        Collections.addAll(this.childrenPendingPreparation, this.periods);
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.prepare(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        long j2 = -9223372036854775807L;
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            long discontinuity = mediaPeriod.readDiscontinuity();
            if (discontinuity == C.TIME_UNSET) {
                if (j2 != C.TIME_UNSET && mediaPeriod.seekToUs(j2) != j2) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j2 == C.TIME_UNSET) {
                for (MediaPeriod mediaPeriod2 : this.enabledPeriods) {
                    if (mediaPeriod2 == mediaPeriod) {
                        break;
                    }
                    if (mediaPeriod2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j2 = discontinuity;
            } else if (discontinuity != j2) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
        this.compositeSequenceableLoader.reevaluateBuffer(j2);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j2) {
        long jSeekToUs = this.enabledPeriods[0].seekToUs(j2);
        int i2 = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i2 >= mediaPeriodArr.length) {
                return jSeekToUs;
            }
            if (mediaPeriodArr[i2].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int length;
        int length2 = exoTrackSelectionArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = exoTrackSelectionArr.length;
            if (i3 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i3];
            Integer num = sampleStream == null ? null : this.streamPeriodIndices.get(sampleStream);
            iArr[i3] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().id;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        this.streamPeriodIndices.clear();
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.periods.length) {
            for (int i5 = i2; i5 < exoTrackSelectionArr.length; i5++) {
                sampleStreamArr3[i5] = iArr[i5] == i4 ? sampleStreamArr[i5] : null;
                if (iArr2[i5] == i4) {
                    ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i5];
                    an.B(exoTrackSelection2);
                    TrackGroup trackGroup = this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup());
                    an.B(trackGroup);
                    exoTrackSelectionArr2[i5] = new MergingMediaPeriodTrackSelection(exoTrackSelection2, trackGroup);
                } else {
                    exoTrackSelectionArr2[i5] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jSelectTracks = this.periods[i4].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j3);
            if (i4 == 0) {
                j3 = jSelectTracks;
            } else if (jSelectTracks != j3) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
                if (iArr2[i6] == i4) {
                    SampleStream sampleStream2 = sampleStreamArr3[i6];
                    an.B(sampleStream2);
                    sampleStreamArr2[i6] = sampleStreamArr3[i6];
                    this.streamPeriodIndices.put(sampleStream2, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i6] == i4) {
                    an.u(sampleStreamArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.periods[i4]);
            }
            i4++;
            arrayList = arrayList2;
            i2 = 0;
        }
        int i7 = i2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sampleStreamArr2, i7, sampleStreamArr, i7, length);
        this.enabledPeriods = (MediaPeriod[]) arrayList3.toArray(new MediaPeriod[i7]);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(arrayList3, fo.G(arrayList3, new t() { // from class: androidx.media3.exoplayer.source.MergingMediaPeriod$$ExternalSyntheticLambda0
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                return ((MediaPeriod) obj).getTrackGroups().getTrackTypes();
            }
        }));
        return j3;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long setEndPositionUs(long j2) {
        boolean z = true;
        for (MediaPeriod mediaPeriod : this.periods) {
            z &= mediaPeriod.setEndPositionUs(j2) == j2;
        }
        if (z) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void setUsesStreamPrerollFlags() {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.setUsesStreamPrerollFlags();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public /* bridge */ /* synthetic */ List getStreamKeys(List list) {
        return getStreamKeys((List<ExoTrackSelection>) list);
    }
}
