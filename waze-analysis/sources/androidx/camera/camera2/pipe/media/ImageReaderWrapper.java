package androidx.camera.camera2.pipe.media;

import android.view.Surface;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageReaderWrapper extends UnsafeWrapper, AutoCloseable {

    /* compiled from: WazeSource */
    public interface OnExpectedOutputsListener {
        void onExpectedOutputs(long j2, Set<OutputId> set);
    }

    /* compiled from: WazeSource */
    public interface OnImageListener {
        /* renamed from: onImage-AQuxepk */
        void mo1259onImageAQuxepk(int i2, int i3, ImageWrapper imageWrapper);
    }

    void discardFreeBuffers();

    void flush();

    int getCapacity();

    OnExpectedOutputsListener getOnExpectedOutputsListener();

    OnImageListener getOnImageListener();

    Surface getSurface();

    Long getUsageFlags();

    void setOnExpectedOutputsListener(OnExpectedOutputsListener onExpectedOutputsListener);

    void setOnImageListener(OnImageListener onImageListener);
}
