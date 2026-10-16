package androidx.camera.camera2.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtraSupportedOutputSizeQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);

    private final Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new Size[]{new Size(DisplayStrings.DS_VOICE_COMMANDS_GOOGLE_ASSISTANT_PRIVACY_TEXT_PRIVACY_POLICY_LINK_TEXT, DisplayStrings.DS_KEEP_WAZE_ON_TOP_POPUP_TEXT), new Size(960, DisplayStrings.DS_KM_PD)};
    }

    public final <T> Size[] getExtraSupportedResolutions(Class<T> cls) {
        x.f(cls, "klass");
        return (StreamConfigurationMap.isOutputSupportedFor(cls) && Companion.isMotoE5Play$camera_camera2()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return isMotoE5Play$camera_camera2();
        }

        public final boolean isMotoE5Play$camera_camera2() {
            return Device.INSTANCE.isMotorolaDevice() && o.m("moto e5 play", Build.MODEL, true);
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    public final Size[] getExtraSupportedResolutions(int i2) {
        return (i2 == 34 && Companion.isMotoE5Play$camera_camera2()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }
}
