package androidx.camera.camera2.pipe.media;

import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageSource extends UnsafeWrapper, AutoCloseable {
    void discardFreeBuffers();

    void flush();

    ExpectedOutputsListener getExpectedOutputsListener();

    ImageListener getImageListener();

    Surface getSurface();

    void setExpectedOutputsListener(ExpectedOutputsListener expectedOutputsListener);

    void setImageListener(ImageListener imageListener);
}
