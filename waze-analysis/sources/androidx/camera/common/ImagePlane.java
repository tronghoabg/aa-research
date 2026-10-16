package androidx.camera.common;

import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImagePlane extends UnsafeWrapper {
    ByteBuffer getBuffer();

    int getPixelStride();

    int getRowStride();
}
