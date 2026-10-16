package androidx.camera.video.internal.compat;

import android.media.MediaMuxer;
import java.io.FileDescriptor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api26Impl {
    private Api26Impl() {
    }

    public static MediaMuxer createMediaMuxer(FileDescriptor fileDescriptor, int i2) {
        return new MediaMuxer(fileDescriptor, i2);
    }
}
