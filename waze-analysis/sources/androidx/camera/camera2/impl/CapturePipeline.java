package androidx.camera.camera2.impl;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import h.c.e;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CapturePipeline {
    Object getCameraCapturePipeline(int i2, int i3, int i4, e<? super CameraCapturePipeline> eVar);

    int getTemplate();

    void setTemplate(int i2);

    /* renamed from: submitStillCaptures-BvXKQx0 */
    Object mo224submitStillCapturesBvXKQx0(List<CaptureConfig> list, int i2, Config config, int i3, int i4, int i5, e<? super List<? extends am<Void>>> eVar);
}
