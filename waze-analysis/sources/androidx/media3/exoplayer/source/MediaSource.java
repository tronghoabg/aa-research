package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.aj;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaSource {

    /* compiled from: WazeSource */
    public interface Factory {
        public static final Factory UNSUPPORTED = MediaSourceFactory.UNSUPPORTED;

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.MediaSource$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            @Deprecated
            public static Factory $default$experimentalParseSubtitlesDuringExtraction(Factory factory, boolean z) {
                return factory;
            }

            public static Factory $default$experimentalSetCodecsToParseWithinGopSampleDependencies(Factory factory, int i2) {
                return factory;
            }

            public static Factory $default$setCmcdConfigurationFactory(Factory factory, CmcdConfiguration.Factory factory2) {
                return factory;
            }

            public static Factory $default$setDownloadExecutor(Factory factory, aj ajVar) {
                return factory;
            }

            public static Factory $default$setSubtitleParserFactory(Factory factory, SubtitleParser.Factory factory2) {
                return factory;
            }
        }

        MediaSource createMediaSource(MediaItem mediaItem);

        @Deprecated
        Factory experimentalParseSubtitlesDuringExtraction(boolean z);

        Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2);

        int[] getSupportedTypes();

        Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory);

        Factory setDownloadExecutor(aj<ReleasableExecutor> ajVar);

        Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider);

        Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        Factory setSubtitleParserFactory(SubtitleParser.Factory factory);
    }

    /* compiled from: WazeSource */
    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline);
    }

    void addDrmEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener);

    void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    boolean canUpdateMediaItem(MediaItem mediaItem);

    MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator, long j2);

    void disable(MediaSourceCaller mediaSourceCaller);

    void enable(MediaSourceCaller mediaSourceCaller);

    Timeline getInitialTimeline();

    MediaItem getMediaItem();

    boolean isSingleWindow();

    void maybeThrowSourceInfoRefreshError();

    @Deprecated
    void prepareSource(MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId);

    void prepareSource(MediaSourceCaller mediaSourceCaller, PlayerId playerId, BandwidthMeter bandwidthMeter);

    void releasePeriod(MediaPeriod mediaPeriod);

    void releaseSource(MediaSourceCaller mediaSourceCaller);

    void removeDrmEventListener(DrmSessionEventListener drmSessionEventListener);

    void removeEventListener(MediaSourceEventListener mediaSourceEventListener);

    void updateMediaItem(MediaItem mediaItem);

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.source.MediaSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$canUpdateMediaItem(MediaSource mediaSource, MediaItem mediaItem) {
            return false;
        }

        public static Timeline $default$getInitialTimeline(MediaSource mediaSource) {
            return null;
        }

        public static boolean $default$isSingleWindow(MediaSource mediaSource) {
            return true;
        }

        @Deprecated
        public static void $default$prepareSource(MediaSource mediaSource, MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId) {
            throw new IllegalStateException("prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented");
        }

        public static void $default$updateMediaItem(MediaSource mediaSource, MediaItem mediaItem) {
        }
    }

    /* compiled from: WazeSource */
    public final class MediaPeriodId {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final int nextAdGroupIndex;
        public final Object periodUid;
        public final long windowSequenceNumber;

        private MediaPeriodId(Object obj, int i2, int i3, long j2, int i4) {
            this.periodUid = obj;
            this.adGroupIndex = i2;
            this.adIndexInAdGroup = i3;
            this.windowSequenceNumber = j2;
            this.nextAdGroupIndex = i4;
        }

        public MediaPeriodId copyWithPeriodUid(Object obj) {
            return this.periodUid.equals(obj) ? this : new MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
        }

        public MediaPeriodId copyWithWindowSequenceNumber(long j2) {
            return this.windowSequenceNumber == j2 ? this : new MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j2, this.nextAdGroupIndex);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodId)) {
                return false;
            }
            MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
            return equalsExceptNextAdGroupIndex(mediaPeriodId) && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
        }

        public boolean equalsExceptNextAdGroupIndex(MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId == null) {
                return false;
            }
            if (this == mediaPeriodId) {
                return true;
            }
            return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber;
        }

        public int hashCode() {
            return ((((((((this.periodUid.hashCode() + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
        }

        public boolean isAd() {
            return this.adGroupIndex != -1;
        }

        public MediaPeriodId(Object obj) {
            this(obj, -1L);
        }

        public MediaPeriodId(Object obj, long j2) {
            this(obj, -1, -1, j2, -1);
        }

        public MediaPeriodId(Object obj, int i2, int i3, long j2) {
            this(obj, i2, i3, j2, -1);
        }

        public MediaPeriodId(Object obj, long j2, int i2) {
            this(obj, -1, -1, j2, i2);
        }
    }
}
