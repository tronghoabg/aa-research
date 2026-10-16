package androidx.media3.muxer;

import androidx.media3.common.MediaLibraryInfo;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MuxerException extends Exception {
    static {
        MediaLibraryInfo.registerModule("media3.muxer");
    }

    public MuxerException(String str, Throwable th) {
        super(str, th);
    }
}
