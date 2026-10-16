package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AdTimeline extends ForwardingTimeline {
    private final AdPlaybackState[] adPlaybackStates;

    public AdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        int periodCount = timeline.getPeriodCount();
        an.u(timeline.getWindowCount() == 1);
        this.adPlaybackStates = new AdPlaybackState[periodCount];
        Timeline.Period period = new Timeline.Period();
        int i2 = 0;
        while (i2 < periodCount) {
            this.timeline.getPeriod(i2, period);
            AdTimeline adTimeline = this;
            AdPlaybackState adPlaybackState2 = adPlaybackState;
            this.adPlaybackStates[i2] = adTimeline.forPeriod(adPlaybackState2, period.positionInWindowUs, period.durationUs, i2 == periodCount + (-1));
            i2++;
            this = adTimeline;
            adPlaybackState = adPlaybackState2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.common.AdPlaybackState forPeriod(androidx.media3.common.AdPlaybackState r5, long r6, long r8, boolean r10) {
        /*
            r4 = this;
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L19
            if (r10 == 0) goto L18
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 != 0) goto L13
            long r8 = r5.contentDurationUs
        L13:
            androidx.media3.common.AdPlaybackState r4 = r5.withContentDurationUs(r8)
            return r4
        L18:
            r6 = r0
        L19:
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            if (r10 == 0) goto L27
            long r8 = r5.contentDurationUs
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            long r8 = r8 - r6
            goto L28
        L27:
            r8 = r2
        L28:
            androidx.media3.common.AdPlaybackState r4 = r5.withContentDurationUs(r8)
            r5 = 0
        L2d:
            int r8 = r4.adGroupCount
            if (r5 >= r8) goto L4c
            androidx.media3.common.AdPlaybackState$AdGroup r8 = r4.getAdGroup(r5)
            long r8 = r8.timeUs
            r0 = -9223372036854775808
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L44
            if (r10 != 0) goto L49
            androidx.media3.common.AdPlaybackState r4 = r4.withSkippedAdGroup(r5)
            goto L49
        L44:
            long r8 = r8 - r6
            androidx.media3.common.AdPlaybackState r4 = r4.withAdGroupTimeUs(r5, r8)
        L49:
            int r5 = r5 + 1
            goto L2d
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.AdTimeline.forPeriod(androidx.media3.common.AdPlaybackState, long, long, boolean):androidx.media3.common.AdPlaybackState");
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
        this.timeline.getPeriod(i2, period, z);
        long j2 = period.durationUs;
        if (j2 == C.TIME_UNSET) {
            j2 = this.adPlaybackStates[i2].contentDurationUs;
        }
        period.set(period.id, period.uid, period.windowIndex, j2, period.getPositionInWindowUs(), this.adPlaybackStates[i2], period.isPlaceholder);
        return period;
    }
}
