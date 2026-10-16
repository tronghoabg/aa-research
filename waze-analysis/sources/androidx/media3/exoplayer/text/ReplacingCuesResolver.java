package androidx.media3.exoplayer.text;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.d.d.bn;
import com.google.d.d.fo;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j2) {
        int i2 = 0;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i2 >= size) {
                return arrayList.size();
            }
            if (j2 < arrayList.get(i2).startTimeUs) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.startTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r4
        L10:
            com.google.d.b.an.l(r0)
            long r5 = r10.startTimeUs
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.endTimeUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r4
        L26:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r2 = r9.cuesWithTimingList
            int r2 = r2.size()
        L2c:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L58
            long r5 = r10.startTimeUs
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r3 = r9.cuesWithTimingList
            java.lang.Object r3 = r3.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r7 = r3.startTimeUs
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r5 = r9.cuesWithTimingList
            if (r3 < 0) goto L47
            int r2 = r2 + r1
            r5.add(r2, r10)
            return r0
        L47:
            java.lang.Object r3 = r5.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r5 = r3.startTimeUs
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r3 = r4
            goto L56
        L55:
            r3 = r1
        L56:
            r0 = r0 & r3
            goto L2c
        L58:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r9 = r9.cuesWithTimingList
            r9.add(r4, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.ReplacingCuesResolver.addCues(androidx.media3.extractor.text.CuesWithTiming, long):boolean");
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j2) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j2);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        int i2 = indexOfCuesStartingAfter - 1;
        long j3 = this.cuesWithTimingList.get(i2).endTimeUs;
        if (j3 == C.TIME_UNSET || j3 >= j2) {
            indexOfCuesStartingAfter = i2;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public bn<Cue> getCuesAtTimeUs(long j2) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j2);
        if (indexOfCuesStartingAfter == 0) {
            return bn.p();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j3 = cuesWithTiming.endTimeUs;
        return (j3 == C.TIME_UNSET || j2 < j3) ? cuesWithTiming.cues : bn.p();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        int i2 = 1;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i2 >= size) {
                long j3 = ((CuesWithTiming) fo.Q(arrayList)).endTimeUs;
                if (j3 == C.TIME_UNSET || j2 >= j3) {
                    return Long.MIN_VALUE;
                }
                return j3;
            }
            CuesWithTiming cuesWithTiming = arrayList.get(i2);
            if (j2 < cuesWithTiming.startTimeUs) {
                long j4 = this.cuesWithTimingList.get(i2 - 1).endTimeUs;
                return (j4 == C.TIME_UNSET || j4 <= j2 || j4 >= cuesWithTiming.startTimeUs) ? cuesWithTiming.startTimeUs : j4;
            }
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j2) {
        if (this.cuesWithTimingList.isEmpty() || j2 < this.cuesWithTimingList.get(0).startTimeUs) {
            return C.TIME_UNSET;
        }
        int i2 = 1;
        while (true) {
            int size = this.cuesWithTimingList.size();
            ArrayList<CuesWithTiming> arrayList = this.cuesWithTimingList;
            if (i2 >= size) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) fo.Q(arrayList);
                long j3 = cuesWithTiming.endTimeUs;
                return (j3 == C.TIME_UNSET || j2 < j3) ? cuesWithTiming.startTimeUs : j3;
            }
            long j4 = arrayList.get(i2).startTimeUs;
            if (j2 == j4) {
                return j4;
            }
            if (j2 < j4) {
                CuesWithTiming cuesWithTiming2 = this.cuesWithTimingList.get(i2 - 1);
                long j5 = cuesWithTiming2.endTimeUs;
                return (j5 == C.TIME_UNSET || j5 > j2) ? cuesWithTiming2.startTimeUs : j5;
            }
            i2++;
        }
    }
}
