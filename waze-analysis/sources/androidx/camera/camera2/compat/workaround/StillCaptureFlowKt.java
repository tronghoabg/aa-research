package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StillCaptureFlowKt {
    public static final boolean shouldStopRepeatingBeforeCapture(List<Request> list) {
        x.f(list, "<this>");
        if (((StillCaptureFlashStopRepeatingQuirk) DeviceQuirks.INSTANCE.get(StillCaptureFlashStopRepeatingQuirk.class)) == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (Request request : list) {
            RequestTemplate requestTemplateM851getTemplateejQnlcg = request.m851getTemplateejQnlcg();
            if (requestTemplateM851getTemplateejQnlcg != null && requestTemplateM851getTemplateejQnlcg.m894unboximpl() == 2) {
                z = true;
            }
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            x.e(key, "CONTROL_AE_MODE");
            Integer num = (Integer) request.get(key);
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
