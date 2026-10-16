package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.d.b.an;
import com.google.d.b.t;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.d.d.eq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final eq<CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = eq.d().e(new t() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda0
        @Override // com.google.d.b.t
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).startTimeUs);
        }
    }).b(eq.d().a().e(new t() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda1
        @Override // com.google.d.b.t
        public final Object apply(Object obj) {
            return Long.valueOf(((CuesWithTiming) obj).durationUs);
        }
    }));
    private final List<CuesWithTiming> cuesWithTimingList = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(CuesWithTiming cuesWithTiming, long j2) {
        an.l(cuesWithTiming.startTimeUs != C.TIME_UNSET);
        an.l(cuesWithTiming.durationUs != C.TIME_UNSET);
        boolean z = cuesWithTiming.startTimeUs <= j2 && j2 < cuesWithTiming.endTimeUs;
        int size = this.cuesWithTimingList.size();
        do {
            size--;
            if (size < 0) {
                this.cuesWithTimingList.add(0, cuesWithTiming);
                return z;
            }
        } while (cuesWithTiming.startTimeUs < this.cuesWithTimingList.get(size).startTimeUs);
        this.cuesWithTimingList.add(size + 1, cuesWithTiming);
        return z;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j2) {
        int i2 = 0;
        while (i2 < this.cuesWithTimingList.size()) {
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            if (j2 > j3 && j2 > this.cuesWithTimingList.get(i2).endTimeUs) {
                this.cuesWithTimingList.remove(i2);
                i2--;
            } else if (j2 < j3) {
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public bn<Cue> getCuesAtTimeUs(long j2) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j2 >= this.cuesWithTimingList.get(0).startTimeUs) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.cuesWithTimingList.size(); i2++) {
                    CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i2);
                    if (j2 >= cuesWithTiming.startTimeUs && j2 < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j2 < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                bn bnVarX = bn.x(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                bi biVar = new bi();
                for (int i3 = 0; i3 < bnVarX.size(); i3++) {
                    biVar.i(((CuesWithTiming) bnVarX.get(i3)).cues);
                }
                return biVar.f();
            }
        }
        return bn.p();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j2) {
        int i2 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i2 >= this.cuesWithTimingList.size()) {
                break;
            }
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i2).endTimeUs;
            if (j2 < j3) {
                jMin = jMin != C.TIME_UNSET ? Math.min(jMin, j3) : j3;
            } else {
                if (j2 < j4) {
                    jMin = jMin == C.TIME_UNSET ? j4 : Math.min(jMin, j4);
                }
                i2++;
            }
        }
        if (jMin != C.TIME_UNSET) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty()) {
            return C.TIME_UNSET;
        }
        if (j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        long jMax = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i2 = 0; i2 < this.cuesWithTimingList.size(); i2++) {
            long j3 = this.cuesWithTimingList.get(i2).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i2).endTimeUs;
            if (j4 > j2) {
                if (j3 > j2) {
                    break;
                }
                jMax = Math.max(jMax, j3);
            } else {
                jMax = Math.max(jMax, j4);
            }
        }
        return jMax;
    }
}
