package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class OutputSizesCorrector {
    private final CameraMetadata cameraMetadata;
    private final StreamConfigurationMap streamConfigurationMap;
    private final String tag = "OutputSizesCorrector";
    private final ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.INSTANCE.get(ExcludedSupportedSizesQuirk.class);
    private final ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.INSTANCE.get(ExtraSupportedOutputSizeQuirk.class);

    public OutputSizesCorrector(CameraMetadata cameraMetadata, StreamConfigurationMap streamConfigurationMap) {
        this.cameraMetadata = cameraMetadata;
        this.streamConfigurationMap = streamConfigurationMap;
    }

    private final <T> void addExtraSupportedOutputSizesByClass(List<Size> list, Class<T> cls) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.extraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(cls);
        if (extraSupportedResolutions.length != 0) {
            i.aF(list, extraSupportedResolutions);
        }
    }

    private final void addExtraSupportedOutputSizesByFormat(List<Size> list, int i2) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.extraSupportedOutputSizeQuirk;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(i2);
        if (extraSupportedResolutions.length != 0) {
            i.aF(list, extraSupportedResolutions);
        }
    }

    private final <T> void excludeProblematicOutputSizesByClass(List<Size> list, Class<T> cls) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;
        CameraMetadata cameraMetadata = this.cameraMetadata;
        if (cameraMetadata == null || (excludedSupportedSizesQuirk = this.excludedSupportedSizesQuirk) == null) {
            return;
        }
        List<Size> excludedSizes = excludedSupportedSizesQuirk.getExcludedSizes(cameraMetadata.mo565getCameraDz_R5H8(), (Class<?>) cls);
        if (excludedSizes.isEmpty()) {
            return;
        }
        list.removeAll(excludedSizes);
    }

    private final void excludeProblematicOutputSizesByFormat(List<Size> list, int i2) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;
        CameraMetadata cameraMetadata = this.cameraMetadata;
        if (cameraMetadata == null || (excludedSupportedSizesQuirk = this.excludedSupportedSizesQuirk) == null) {
            return;
        }
        List<Size> excludedSizes = excludedSupportedSizesQuirk.getExcludedSizes(cameraMetadata.mo565getCameraDz_R5H8(), i2);
        if (excludedSizes.isEmpty()) {
            return;
        }
        list.removeAll(excludedSizes);
    }

    public final <T> Size[] applyQuirks(Size[] sizeArr, Class<T> cls) {
        x.f(sizeArr, "sizes");
        x.f(cls, "klass");
        List<Size> listAa = c.aa(sizeArr);
        addExtraSupportedOutputSizesByClass(listAa, cls);
        excludeProblematicOutputSizesByClass(listAa, cls);
        if (listAa.isEmpty()) {
            Logger.w(this.tag, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) listAa.toArray(new Size[0]);
    }

    public final Size[] applyQuirks(Size[] sizeArr, int i2) {
        x.f(sizeArr, "sizes");
        List<Size> listAa = c.aa(sizeArr);
        addExtraSupportedOutputSizesByFormat(listAa, i2);
        excludeProblematicOutputSizesByFormat(listAa, i2);
        if (listAa.isEmpty()) {
            Logger.w(this.tag, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) listAa.toArray(new Size[0]);
    }
}
