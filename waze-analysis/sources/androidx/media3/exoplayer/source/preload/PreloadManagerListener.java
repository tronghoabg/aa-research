package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface PreloadManagerListener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.source.preload.PreloadManagerListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onCompleted(PreloadManagerListener preloadManagerListener, MediaItem mediaItem) {
        }

        public static void $default$onError(PreloadManagerListener preloadManagerListener, PreloadException preloadException) {
        }
    }

    void onCompleted(MediaItem mediaItem);

    void onError(PreloadException preloadException);
}
