package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AdsLoader {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.source.ads.AdsLoader$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$handleContentTimelineChanged(AdsLoader adsLoader, AdsMediaSource adsMediaSource, Timeline timeline) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    public interface EventListener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.source.ads.AdsLoader$EventListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAdClicked(EventListener eventListener) {
            }

            public static void $default$onAdLoadError(EventListener eventListener, AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec) {
            }

            public static void $default$onAdPlaybackState(EventListener eventListener, AdPlaybackState adPlaybackState) {
            }

            public static void $default$onAdTapped(EventListener eventListener) {
            }
        }

        void onAdClicked();

        void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec);

        void onAdPlaybackState(AdPlaybackState adPlaybackState);

        void onAdTapped();
    }

    /* compiled from: WazeSource */
    public interface Provider {
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    boolean handleContentTimelineChanged(AdsMediaSource adsMediaSource, Timeline timeline);

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i2, int i3);

    void handlePrepareError(AdsMediaSource adsMediaSource, int i2, int i3, IOException iOException);

    void release();

    void setPlayer(Player player);

    void setSupportedContentTypes(int... iArr);

    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
