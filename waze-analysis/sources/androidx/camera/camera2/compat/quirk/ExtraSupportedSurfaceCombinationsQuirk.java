package androidx.camera.camera2.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import e.c.d.a;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {
    public static final Companion Companion;
    private static final SurfaceCombination FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION;
    private static final SurfaceCombination FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION;
    private static final SurfaceCombination LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION;
    private static final Set<String> SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS;
    private static final Set<String> SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS;
    private static final String TAG = "ExtraSupportedSurfaceCombinationsQuirk";

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION = companion.createFullYuvPrivYuvConfiguration$camera_camera2();
        FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION = companion.createFullYuvYuvYuvConfiguration$camera_camera2();
        LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION = companion.createLevel3PrivPrivYuvSubsetConfiguration$camera_camera2();
        SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS = a.r("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD");
        SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS = a.r("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F");
    }

    private final List<SurfaceCombination> getLimitedDeviceExtraSupportedFullConfigurations(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 == 0) {
            arrayList.add(FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION);
            arrayList.add(FULL_LEVEL_YUV_YUV_YUV_CONFIGURATION);
        }
        return arrayList;
    }

    private final List<SurfaceCombination> getSamsungS7ExtraCombinations(String str) {
        ArrayList arrayList = new ArrayList();
        if (x.n(str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
            arrayList.add(FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION);
        }
        return arrayList;
    }

    public final List<SurfaceCombination> getExtraSupportedSurfaceCombinations(String str) {
        x.f(str, "cameraId");
        Companion companion = Companion;
        return companion.isSamsungS7$camera_camera2() ? getSamsungS7ExtraCombinations(str) : (companion.supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() || companion.supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2()) ? i.d(LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION) : i.h();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SurfaceCombination createFullYuvPrivYuvConfiguration$camera_camera2() {
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public final SurfaceCombination createFullYuvYuvYuvConfiguration$camera_camera2() {
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public final SurfaceCombination createLevel3PrivPrivYuvSubsetConfiguration$camera_camera2() {
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.VGA, null, 4, null));
            surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(SurfaceConfig.Companion, SurfaceConfig.ConfigType.YUV, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
            return surfaceCombination;
        }

        public final boolean isEnabled() {
            return isSamsungS7$camera_camera2() || supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() || supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2();
        }

        public final boolean isSamsungS7$camera_camera2() {
            return o.m("heroqltevzw", Build.DEVICE, true) || o.m("heroqltetmo", Build.DEVICE, true);
        }

        public final boolean supportExtraLevel3ConfigurationsGoogleDevice$camera_camera2() {
            if (!Device.INSTANCE.isGoogleDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            return ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS.contains(upperCase);
        }

        public final boolean supportExtraLevel3ConfigurationsSamsungDevice$camera_camera2() {
            if (!Device.INSTANCE.isSamsungDevice()) {
                return false;
            }
            String str = Build.MODEL;
            x.e(str, "MODEL");
            String upperCase = str.toUpperCase(Locale.ROOT);
            x.e(upperCase, "toUpperCase(...)");
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS.iterator();
            while (it.hasNext()) {
                if (o.ah(upperCase, (String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
