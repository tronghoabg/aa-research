package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.Map;

/* loaded from: classes.dex */
public final class lkb {
    public static final Map a;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(2L, "PAUSE");
        yfuVar.e(1L, "STOP");
        yfuVar.e(4L, "PLAY");
        yfuVar.e(512L, "PLAY_PAUSE");
        yfuVar.e(32L, "SKIP_TO_NEXT");
        yfuVar.e(16L, "SKIP_TO_PREVIOUS");
        yfuVar.e(4096L, "SKIP_TO_QUEUE_ITEM");
        yfuVar.e(256L, "SEEK_TO");
        yfuVar.e(1024L, "PLAY_FROM_MEDIA_ID");
        yfuVar.e(2048L, "PLAY_FROM_SEARCH");
        a = yfuVar.d(true);
    }

    public static String a(AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            return "NULL";
        }
        switch (aaPlaybackState.Q()) {
            case 0:
                return "NONE";
            case 1:
                return "STOPPED";
            case 2:
                return "PAUSED";
            case 3:
                return "PLAYING";
            case 4:
                return "FAST_FORWARDING";
            case 5:
                return "REWINDING";
            case 6:
                return "BUFFERING";
            case 7:
                return "ERROR";
            case 8:
                return "CONNECTING";
            case 9:
                return "SKIPPING_TO_PREVIOUS";
            case 10:
                return "SKIPPING_TO_NEXT";
            case 11:
                return "SKIPPING_TO_QUEUE_ITEM";
            default:
                return "UNKNOWN(" + aaPlaybackState.Q() + ")";
        }
    }

    public static boolean b(AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            return false;
        }
        int iQ = aaPlaybackState.Q();
        return iQ == 3 || iQ == 6;
    }
}
