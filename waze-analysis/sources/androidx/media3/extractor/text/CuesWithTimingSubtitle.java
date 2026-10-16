package androidx.media3.extractor.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bn;
import com.google.d.d.eq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CuesWithTimingSubtitle implements Subtitle {
    private static final eq<CuesWithTiming> CUES_BY_START_TIME_ASCENDING = eq.d().e(new t() { // from class: androidx.media3.extractor.text.CuesWithTimingSubtitle$$ExternalSyntheticLambda0
        @Override // com.google.d.b.t
        public final Object apply(Object obj) {
            return Long.valueOf(CuesWithTimingSubtitle.normalizeUnsetStartTimeToZero(((CuesWithTiming) obj).startTimeUs));
        }
    });
    private static final String TAG = "CuesWithTimingSubtitle";
    private final bn<bn<Cue>> eventCues;
    private final long[] eventTimesUs;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CuesWithTimingSubtitle(java.util.List<androidx.media3.extractor.text.CuesWithTiming> r15) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.CuesWithTimingSubtitle.<init>(java.util.List):void");
    }

    private static long normalizeUnsetStartTimeToZero(long j2) {
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public bn<Cue> getCues(long j2) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.eventTimesUs, j2, true, false);
        return iBinarySearchFloor == -1 ? bn.p() : this.eventCues.get(iBinarySearchFloor);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i2) {
        an.l(i2 < this.eventCues.size());
        return this.eventTimesUs[i2];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j2) {
        bn<bn<Cue>> bnVar = this.eventCues;
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j2, false, false);
        if (iBinarySearchCeil < bnVar.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
