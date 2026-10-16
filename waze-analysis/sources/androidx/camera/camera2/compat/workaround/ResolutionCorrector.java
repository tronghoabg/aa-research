package androidx.camera.camera2.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.SurfaceConfig;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ResolutionCorrector {
    private final ExtraCroppingQuirk extraCroppingQuirk = (ExtraCroppingQuirk) DeviceQuirks.INSTANCE.get(ExtraCroppingQuirk.class);

    public final List<Size> insertOrPrioritize(SurfaceConfig.ConfigType configType, List<Size> list) {
        Size verifiedResolution;
        x.f(configType, "configType");
        x.f(list, "supportedResolutions");
        ExtraCroppingQuirk extraCroppingQuirk = this.extraCroppingQuirk;
        if (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(configType)) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(verifiedResolution);
        for (Size size : list) {
            if (!x.n(size, verifiedResolution)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
