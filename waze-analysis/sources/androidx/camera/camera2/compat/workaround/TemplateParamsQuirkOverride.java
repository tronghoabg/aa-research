package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.Quirks;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TemplateParamsQuirkOverride implements TemplateParamsOverride {
    private final boolean workaroundByCaptureIntentPreview;
    private final boolean workaroundByCaptureIntentStillCapture;

    public TemplateParamsQuirkOverride(Quirks quirks) {
        x.f(quirks, "quirks");
        this.workaroundByCaptureIntentPreview = CaptureIntentPreviewQuirk.Companion.workaroundByCaptureIntentPreview(quirks);
        this.workaroundByCaptureIntentStillCapture = quirks.contains(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // androidx.camera.camera2.compat.workaround.TemplateParamsOverride
    /* renamed from: getOverrideParams-xlOpshk */
    public Map<CaptureRequest.Key<?>, Object> mo230getOverrideParamsxlOpshk(RequestTemplate requestTemplate) {
        return (requestTemplate != null && requestTemplate.m894unboximpl() == 3 && this.workaroundByCaptureIntentPreview) ? r.e(new k(CaptureRequest.CONTROL_CAPTURE_INTENT, 1)) : (requestTemplate != null && requestTemplate.m894unboximpl() == 4 && this.workaroundByCaptureIntentStillCapture) ? r.e(new k(CaptureRequest.CONTROL_CAPTURE_INTENT, 2)) : r.j();
    }
}
