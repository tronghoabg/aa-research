package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long liveStreamStartPositionProjectionUs;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        an.l(!z4 || z2);
        an.l(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        an.l(z5);
        this.id = mediaPeriodId;
        this.startPositionUs = j2;
        this.liveStreamStartPositionProjectionUs = j3;
        this.requestedContentPositionUs = j4;
        this.durationUs = j5;
        this.isFollowedByTransitionToSameStream = z;
        this.isLastInTimelinePeriod = z2;
        this.isLastInTimelineWindow = z3;
        this.isFinal = z4;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j2) {
        return j2 == this.requestedContentPositionUs ? this : new MediaPeriodInfo(this.id, this.startPositionUs, this.liveStreamStartPositionProjectionUs, j2, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j2, long j3) {
        return (j2 == this.startPositionUs && j3 == this.liveStreamStartPositionProjectionUs) ? this : new MediaPeriodInfo(this.id, j2, j3, this.requestedContentPositionUs, this.durationUs, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Objects.equals(this.id, mediaPeriodInfo.id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL;
        long j2 = this.durationUs;
        return (((((((((((((iHashCode * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) j2)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
