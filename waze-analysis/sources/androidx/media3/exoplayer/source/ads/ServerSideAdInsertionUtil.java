package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j2, long j3, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j2, -1, adPlaybackState);
        int i2 = adPlaybackState.removedAdGroupCount;
        while (i2 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i2).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i2).timeUs <= mediaPeriodPositionUsForContent) {
            i2++;
        }
        AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i2, mediaPeriodPositionUsForContent).withIsServerSideInserted(i2, true).withAdCount(i2, jArr.length).withAdDurationsUs(i2, jArr).withContentResumeOffsetUs(i2, j3);
        AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackStateWithContentResumeOffsetUs;
        for (int i3 = 0; i3 < jArr.length && jArr[i3] == 0; i3++) {
            adPlaybackStateWithSkippedAd = adPlaybackStateWithSkippedAd.withSkippedAd(i2, i3);
        }
        return correctFollowingAdGroupTimes(adPlaybackStateWithSkippedAd, i2, Util.sum(jArr), j3);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i2, long j2, long j3) {
        while (true) {
            i2++;
            if (i2 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j4 = adPlaybackState.getAdGroup(i2).timeUs;
            if (j4 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i2, j4 + (-j2) + j3);
            }
        }
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i2) {
        int i3 = adPlaybackState.getAdGroup(i2).count;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static long getMediaPeriodPositionUs(long j2, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j2, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j2, int i2, int i3, AdPlaybackState adPlaybackState) {
        int i4;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
        long j3 = j2 - adGroup.timeUs;
        int i5 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i4 = 0;
            if (i5 >= i2) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i5);
            while (i4 < getAdCountInGroup(adPlaybackState, i5)) {
                j3 -= adGroup2.durationsUs[i4];
                i4++;
            }
            j3 += adGroup2.contentResumeOffsetUs;
            i5++;
        }
        if (i3 < getAdCountInGroup(adPlaybackState, i2)) {
            while (i4 < i3) {
                j3 -= adGroup.durationsUs[i4];
                i4++;
            }
        }
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long getMediaPeriodPositionUsForContent(long r10, int r12, androidx.media3.common.AdPlaybackState r13) {
        /*
            r0 = -1
            if (r12 != r0) goto L5
            int r12 = r13.adGroupCount
        L5:
            int r0 = r13.removedAdGroupCount
            r1 = 0
        L9:
            long r3 = r10 - r1
            if (r0 >= r12) goto L40
            androidx.media3.common.AdPlaybackState$AdGroup r5 = r13.getAdGroup(r0)
            long r6 = r5.timeUs
            r8 = -9223372036854775808
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L40
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 > 0) goto L40
            r3 = 0
        L1e:
            int r4 = getAdCountInGroup(r13, r0)
            if (r3 >= r4) goto L2c
            long[] r4 = r5.durationsUs
            r6 = r4[r3]
            long r1 = r1 + r6
            int r3 = r3 + 1
            goto L1e
        L2c:
            long r3 = r5.contentResumeOffsetUs
            long r1 = r1 - r3
            long r5 = r5.timeUs
            long r3 = r3 + r5
            long r7 = r10 - r1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L3d
            long r10 = java.lang.Math.max(r5, r7)
            return r10
        L3d:
            int r0 = r0 + 1
            goto L9
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(long, int, androidx.media3.common.AdPlaybackState):long");
    }

    public static long getStreamPositionUs(Player player, Object obj) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Objects.equals(period.getAdsId(), obj)) {
            return C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, period.adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), period.adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j2, int i2, int i3, AdPlaybackState adPlaybackState) {
        int i4;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i2);
        long j3 = j2 + adGroup.timeUs;
        int i5 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i4 = 0;
            if (i5 >= i2) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i5);
            while (i4 < getAdCountInGroup(adPlaybackState, i5)) {
                j3 += adGroup2.durationsUs[i4];
                i4++;
            }
            j3 -= adGroup2.contentResumeOffsetUs;
            i5++;
        }
        if (i3 < getAdCountInGroup(adPlaybackState, i2)) {
            while (i4 < i3) {
                j3 += adGroup.durationsUs[i4];
                i4++;
            }
        }
        return j3;
    }

    public static long getStreamPositionUsForContent(long j2, int i2, AdPlaybackState adPlaybackState) {
        if (i2 == -1) {
            i2 = adPlaybackState.adGroupCount;
        }
        long j3 = 0;
        for (int i3 = adPlaybackState.removedAdGroupCount; i3 < i2; i3++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
            long j4 = adGroup.timeUs;
            if (j4 == Long.MIN_VALUE || j4 > j2) {
                break;
            }
            long j5 = j4 + j3;
            for (int i4 = 0; i4 < getAdCountInGroup(adPlaybackState, i3); i4++) {
                j3 += adGroup.durationsUs[i4];
            }
            long j6 = adGroup.contentResumeOffsetUs;
            j3 -= j6;
            if (adGroup.timeUs + j6 > j2) {
                return Math.max(j5, j2 + j3);
            }
        }
        return j2 + j3;
    }

    public static long getStreamPositionUs(long j2, MediaSource.MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j2, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
