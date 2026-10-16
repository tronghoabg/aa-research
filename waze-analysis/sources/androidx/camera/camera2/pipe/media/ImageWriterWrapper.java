package androidx.camera.camera2.pipe.media;

import androidx.camera.camera2.pipe.UnsafeWrapper;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageWriterWrapper extends UnsafeWrapper, AutoCloseable {

    /* compiled from: WazeSource */
    public interface Builder {
        ImageWriterWrapper build();
    }

    /* compiled from: WazeSource */
    public interface OnImageReleasedListener {
        /* renamed from: onImageReleased-I45lehc, reason: not valid java name */
        void m1260onImageReleasedI45lehc(int i2);
    }

    ImageWrapper dequeueInputImage();

    int getFormat();

    int getMaxImages();

    boolean queueInputImage(ImageWrapper imageWrapper);

    void setOnImageReleasedListener(OnImageReleasedListener onImageReleasedListener);
}
