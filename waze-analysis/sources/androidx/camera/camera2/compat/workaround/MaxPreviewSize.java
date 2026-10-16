package androidx.camera.camera2.compat.workaround;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.SurfaceConfig;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MaxPreviewSize {
    private final ExtraCroppingQuirk extraCroppingQuirk;

    public /* synthetic */ MaxPreviewSize(ExtraCroppingQuirk extraCroppingQuirk, int i2, o oVar) {
        this((i2 & 1) != 0 ? (ExtraCroppingQuirk) DeviceQuirks.INSTANCE.get(ExtraCroppingQuirk.class) : extraCroppingQuirk);
    }

    public final Size getMaxPreviewResolution(Size size) {
        Size verifiedResolution;
        x.f(size, "defaultMaxPreviewResolution");
        ExtraCroppingQuirk extraCroppingQuirk = this.extraCroppingQuirk;
        return (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(SurfaceConfig.ConfigType.PRIV)) == null || verifiedResolution.getWidth() * verifiedResolution.getHeight() <= size.getWidth() * size.getHeight()) ? size : verifiedResolution;
    }

    public MaxPreviewSize(ExtraCroppingQuirk extraCroppingQuirk) {
        this.extraCroppingQuirk = extraCroppingQuirk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaxPreviewSize() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
