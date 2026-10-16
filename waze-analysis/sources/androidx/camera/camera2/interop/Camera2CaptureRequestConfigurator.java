package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2CaptureRequestConfigurator {
    void configureWith(Map<CaptureRequest.Key<?>, ? extends Object> map);
}
