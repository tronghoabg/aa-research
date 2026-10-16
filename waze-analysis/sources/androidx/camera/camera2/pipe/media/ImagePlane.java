package androidx.camera.camera2.pipe.media;

import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImagePlane extends UnsafeWrapper {
    ByteBuffer getBuffer();

    int getPixelStride();

    int getRowStride();
}
