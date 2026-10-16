package androidx.camera.camera2.pipe.compat;

import android.view.Surface;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.StreamId;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2CaptureSequenceProcessorFactory {
    CaptureSequenceProcessor<?, ?> create(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Map<StreamId, ? extends Surface> map, Map<OutputId, ? extends Surface> map2);
}
