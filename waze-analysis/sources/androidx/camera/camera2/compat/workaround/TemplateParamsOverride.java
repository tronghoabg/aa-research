package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.Quirks;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TemplateParamsOverride {
    /* renamed from: getOverrideParams-xlOpshk */
    Map<CaptureRequest.Key<?>, Object> mo230getOverrideParamsxlOpshk(RequestTemplate requestTemplate);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public static final Companion Companion = new Companion(null);

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final TemplateParamsOverride provideTemplateParamsOverride(CameraQuirks cameraQuirks) {
                x.f(cameraQuirks, "cameraQuirks");
                Quirks quirks = cameraQuirks.getQuirks();
                return (CaptureIntentPreviewQuirk.Companion.workaroundByCaptureIntentPreview(quirks) || quirks.contains(ImageCaptureFailedForVideoSnapshotQuirk.class)) ? new TemplateParamsQuirkOverride(quirks) : NoOpTemplateParamsOverride.INSTANCE;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }
}
