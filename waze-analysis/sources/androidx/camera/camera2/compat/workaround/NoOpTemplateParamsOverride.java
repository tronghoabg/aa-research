package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.RequestTemplate;
import h.a.r;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NoOpTemplateParamsOverride implements TemplateParamsOverride {
    public static final NoOpTemplateParamsOverride INSTANCE = new NoOpTemplateParamsOverride();

    private NoOpTemplateParamsOverride() {
    }

    @Override // androidx.camera.camera2.compat.workaround.TemplateParamsOverride
    /* renamed from: getOverrideParams-xlOpshk, reason: not valid java name */
    public Map<CaptureRequest.Key<?>, Object> mo230getOverrideParamsxlOpshk(RequestTemplate requestTemplate) {
        return r.j();
    }
}
