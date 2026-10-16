package androidx.camera.video.internal.utils;

import android.media.MediaFormat;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MediaFormatExt {
    public static final MediaFormatExt INSTANCE = new MediaFormatExt();
    public static final String KEY_CSD_0 = "csd-0";
    public static final String KEY_CSD_1 = "csd-1";
    public static final String KEY_CSD_2 = "csd-2";
    public static final String KEY_TIMELAPSE_ENABLED = "time-lapse-enable";
    public static final String KEY_TIMELAPSE_FPS = "time-lapse-fps";

    private MediaFormatExt() {
    }

    public final boolean isVideo(MediaFormat mediaFormat) {
        x.f(mediaFormat, "<this>");
        String string = mediaFormat.getString("mime");
        if (string != null) {
            return o.ah(string, "video/");
        }
        return false;
    }
}
