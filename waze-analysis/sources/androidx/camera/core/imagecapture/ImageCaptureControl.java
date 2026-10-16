package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.CaptureConfig;
import com.google.d.m.a.bm;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageCaptureControl {
    void lockFlashMode();

    bm<Void> submitStillCaptureRequests(List<CaptureConfig> list);

    void unlockFlashMode();
}
