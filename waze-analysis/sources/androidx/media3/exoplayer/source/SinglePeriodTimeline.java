package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final MediaItem MEDIA_ITEM;
    private static final Object UID = new Object();
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final MediaItem.LiveConfiguration liveConfiguration;
    private final Object manifest;
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.setMediaId("SinglePeriodTimeline");
        builder.setUri(Uri.EMPTY);
        MEDIA_ITEM = builder.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        MediaItem mediaItem = MEDIA_ITEM;
        MediaItem.Builder builderBuildUpon = mediaItem.buildUpon();
        builderBuildUpon.setTag(obj2);
        this(j2, j3, j4, j5, j6, j7, j8, z, z2, false, obj, builderBuildUpon.build(), z3 ? mediaItem.liveConfiguration : null);
    }

    @Override // androidx.media3.common.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z) {
        an.A(i2, 1);
        period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs, AdPlaybackState.NONE, false);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public Object getUidOfPeriod(int i2) {
        an.A(i2, 1);
        return UID;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.common.Timeline.Window getWindow(int r24, androidx.media3.common.Timeline.Window r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.google.d.b.an.A(r2, r1)
            boolean r13 = r0.isDynamic
            long r1 = r0.windowDefaultStartPositionUs
            if (r13 == 0) goto L2c
            boolean r3 = r0.suppressPositionProjection
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r26 > r3 ? 1 : (r26 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.windowDurationUs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r26
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            androidx.media3.common.MediaItem r4 = r0.mediaItem
            java.lang.Object r5 = r0.manifest
            long r6 = r0.presentationStartTimeMs
            long r8 = r0.windowStartTimeMs
            long r10 = r0.elapsedRealtimeEpochOffsetMs
            boolean r12 = r0.isSeekable
            androidx.media3.common.MediaItem$LiveConfiguration r14 = r0.liveConfiguration
            long r1 = r0.windowDurationUs
            r17 = r1
            long r0 = r0.windowPositionInPeriodUs
            java.lang.Object r3 = androidx.media3.common.Timeline.Window.SINGLE_WINDOW_UID
            r19 = 0
            r20 = 0
            r2 = r25
            r21 = r0
            r2.set(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SinglePeriodTimeline.getWindow(int, androidx.media3.common.Timeline$Window, long):androidx.media3.common.Timeline$Window");
    }

    @Override // androidx.media3.common.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j2;
        this.windowStartTimeMs = j3;
        this.elapsedRealtimeEpochOffsetMs = j4;
        this.periodDurationUs = j5;
        this.windowDurationUs = j6;
        this.windowPositionInPeriodUs = j7;
        this.windowDefaultStartPositionUs = j8;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.suppressPositionProjection = z3;
        this.manifest = obj;
        an.B(mediaItem);
        this.mediaItem = mediaItem;
        this.liveConfiguration = liveConfiguration;
    }

    @Deprecated
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, Object obj, MediaItem mediaItem, MediaItem.LiveConfiguration liveConfiguration) {
        this(j2, j3, j4, j5, j6, j7, j8, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        MediaItem mediaItem2;
        MediaItem.LiveConfiguration liveConfiguration;
        if (z3) {
            mediaItem2 = mediaItem;
            liveConfiguration = mediaItem2.liveConfiguration;
        } else {
            mediaItem2 = mediaItem;
            liveConfiguration = null;
        }
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j2, j3, j4, j5, z, z2, false, obj, mediaItem2, liveConfiguration);
    }

    @Deprecated
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j2, j3, j4, j5, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j2, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(j2, j2, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j2, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j2, j2, 0L, 0L, z, z2, z3, obj, obj2);
    }
}
