package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import h.a.i;
import h.f;
import h.g;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GuaranteedConfigurationsUtil {
    public static final GuaranteedConfigurationsUtil INSTANCE = new GuaranteedConfigurationsUtil();
    private static final f QUERYABLE_VIC_FCQ_COMBINATIONS$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return GuaranteedConfigurationsUtil.INSTANCE.generateVicQueryableFcqCombinations();
        }
    });
    private static final f QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.GuaranteedConfigurationsUtil$$ExternalSyntheticLambda1
        @Override // h.g.a.a
        public final Object invoke() {
            return GuaranteedConfigurationsUtil.INSTANCE.generateBaklavaQueryableFcqCombinations();
        }
    });

    private GuaranteedConfigurationsUtil() {
    }

    private final List<SurfaceCombination> createPrivJpegXCombinations(SurfaceConfig.ConfigSize configSize, SurfaceConfig.ConfigSize configSize2) {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, configSize, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, configSize2, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, configSize, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG_R, configSize2, null, 4, null));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SurfaceCombination> generateBaklavaQueryableFcqCombinations() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_16_9, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.UHD, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        arrayList.add(surfaceCombination4);
        return arrayList;
    }

    public static final List<SurfaceCombination> generateHighSpeedSupportedCombinationList(Size size, SurfaceSizeDefinition surfaceSizeDefinition) {
        x.f(size, "maxSupportedSize");
        x.f(surfaceSizeDefinition, "surfaceSizeDefinition");
        ArrayList arrayList = new ArrayList();
        SurfaceConfig surfaceConfigTransformSurfaceConfig$default = SurfaceConfig.Companion.transformSurfaceConfig$default(SurfaceConfig.Companion, 34, size, surfaceSizeDefinition, 0, null, null, 56, null);
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        surfaceCombination2.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static final List<SurfaceCombination> generateSupportedCombinationList(int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (i2 == 0 || i2 == 1 || i2 == 3 || i2 == 4) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (i2 == 1 || i2 == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (z) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (z2 && i2 == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
            return arrayList;
        }
        if (i2 == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SurfaceCombination> generateVicQueryableFcqCombinations() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1080P_16_9, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        arrayList.add(surfaceCombination2);
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_16_9, SurfaceConfig.ConfigSize.MAXIMUM_16_9));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_16_9, SurfaceConfig.ConfigSize.UHD));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_16_9, SurfaceConfig.ConfigSize.S1440P_16_9));
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1080P_16_9;
        arrayList.addAll(createPrivJpegXCombinations(configSize, configSize));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S720P_16_9, SurfaceConfig.ConfigSize.MAXIMUM_16_9));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S720P_16_9, SurfaceConfig.ConfigSize.UHD));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S720P_16_9, SurfaceConfig.ConfigSize.S1080P_16_9));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.X_VGA, SurfaceConfig.ConfigSize.MAXIMUM_4_3));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_4_3, SurfaceConfig.ConfigSize.MAXIMUM_4_3));
        return arrayList;
    }

    public static final List<SurfaceCombination> get10BitSupportedCombinationList() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        return i.i(surfaceCombination, surfaceCombination2, surfaceCombination3, surfaceCombination4, surfaceCombination5, surfaceCombination6, surfaceCombination7, surfaceCombination8);
    }

    public static final List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination3);
        return arrayList;
    }

    public static final List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S720P_16_9, null, 4, null));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination9);
        return arrayList;
    }

    public static final List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public static final List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public static final List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static final List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination6);
        return arrayList;
    }

    public static final List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, null, 4, null));
        arrayList.add(surfaceCombination10);
        return arrayList;
    }

    public static final List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination8);
        return arrayList;
    }

    public static final List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG_R, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG_R, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static final List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination2);
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, null, 4, null));
        arrayList.add(surfaceCombination3);
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination4);
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination5);
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination6);
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination7);
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination8);
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination9);
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination10);
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination11);
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.ULTRA_MAXIMUM, null, 4, null));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.RAW, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombination12);
        return arrayList;
    }

    public final List<SurfaceCombination> getQUERYABLE_BAKLAVA_FCQ_COMBINATIONS() {
        return (List) QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate.getValue();
    }

    public final List<SurfaceCombination> getQUERYABLE_VIC_FCQ_COMBINATIONS() {
        return (List) QUERYABLE_VIC_FCQ_COMBINATIONS$delegate.getValue();
    }

    public final List<SurfaceCombination> getQueryableFcqCombinations$camera_camera2(CameraMetadata cameraMetadata, VideoStabilization videoStabilization) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(videoStabilization, "videoStabilization");
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            x.e(key, "INFO_SESSION_CONFIGURATION_QUERY_VERSION");
            Object obj = cameraMetadata.get((CameraCharacteristics.Key<Object>) key);
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue >= 35 && videoStabilization != VideoStabilization.ON) {
                arrayList.addAll(getQUERYABLE_VIC_FCQ_COMBINATIONS());
            }
            if (iIntValue >= 36 && videoStabilization != VideoStabilization.PREVIEW) {
                arrayList.addAll(getQUERYABLE_BAKLAVA_FCQ_COMBINATIONS());
                return arrayList;
            }
        }
        return arrayList;
    }

    public final List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.S1440P_4_3, StreamUseCase.PREVIEW_VIDEO_STILL));
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.S1440P_4_3, StreamUseCase.PREVIEW_VIDEO_STILL));
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination9.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination10.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination11.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        surfaceCombination12.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.VIDEO_RECORD));
        surfaceCombination13.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.RECORD, StreamUseCase.STILL_CAPTURE));
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, StreamUseCase.PREVIEW));
        surfaceCombination14.addSurfaceConfig(SurfaceConfig.Companion.create(SurfaceConfig.ConfigType.JPEG, SurfaceConfig.ConfigSize.MAXIMUM, StreamUseCase.STILL_CAPTURE));
        return i.i(surfaceCombination, surfaceCombination2, surfaceCombination3, surfaceCombination4, surfaceCombination5, surfaceCombination6, surfaceCombination7, surfaceCombination8, surfaceCombination9, surfaceCombination10, surfaceCombination11, surfaceCombination12, surfaceCombination13, surfaceCombination14);
    }
}
