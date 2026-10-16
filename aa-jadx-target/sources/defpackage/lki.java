package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lki {
    public static final java.util.Map a;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(2L, "PAUSE");
        yhaVar.f(1L, "STOP");
        yhaVar.f(4L, "PLAY");
        yhaVar.f(512L, "PLAY_PAUSE");
        yhaVar.f(32L, "SKIP_TO_NEXT");
        yhaVar.f(16L, "SKIP_TO_PREVIOUS");
        yhaVar.f(4096L, "SKIP_TO_QUEUE_ITEM");
        yhaVar.f(256L, "SEEK_TO");
        yhaVar.f(1024L, "PLAY_FROM_MEDIA_ID");
        yhaVar.f(2048L, "PLAY_FROM_SEARCH");
        a = yhaVar.d(true);
    }

    public static java.lang.String a(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            return "NULL";
        }
        switch (aaPlaybackState.Q()) {
            case defpackage.abnt.b /* 0 */:
                return "NONE";
            case 1:
                return "STOPPED";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "PAUSED";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "PLAYING";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "FAST_FORWARDING";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "REWINDING";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BUFFERING";
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return "ERROR";
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
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

    public static boolean b(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null) {
            return false;
        }
        int iQ = aaPlaybackState.Q();
        return iQ == 3 || iQ == 6;
    }
}
