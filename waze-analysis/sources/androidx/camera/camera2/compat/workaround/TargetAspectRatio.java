package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.o;
import h.g.b.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TargetAspectRatio {
    public static final Companion Companion = new Companion(null);
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;
    public static final int RATIO_MAX_JPEG = 2;
    public static final int RATIO_ORIGINAL = 3;

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Ratio {
    }

    public final int get(CameraMetadata cameraMetadata, StreamConfigurationMapCompat streamConfigurationMapCompat) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(streamConfigurationMapCompat, "streamConfigurationMapCompat");
        return (((Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.INSTANCE.get(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new CameraQuirks(cameraMetadata, streamConfigurationMapCompat).getQuirks().get(AspectRatioLegacyApi21Quirk.class)) == null) ? 3 : 2;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
