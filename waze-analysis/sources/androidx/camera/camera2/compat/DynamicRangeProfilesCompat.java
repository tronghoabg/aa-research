package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.DynamicRange;
import com.a.a.a.a$$ExternalSyntheticApiModelOutline0;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeProfilesCompat {
    public static final Companion Companion = new Companion(null);
    private final DynamicRangeProfilesCompatImpl impl;

    /* compiled from: WazeSource */
    public interface DynamicRangeProfilesCompatImpl {
        Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange);

        Set<DynamicRange> getSupportedDynamicRanges();

        boolean isExtraLatencyPresent(DynamicRange dynamicRange);

        DynamicRangeProfiles unwrap();
    }

    public DynamicRangeProfilesCompat(DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        x.f(dynamicRangeProfilesCompatImpl, "impl");
        this.impl = dynamicRangeProfilesCompatImpl;
    }

    public final Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        return this.impl.getDynamicRangeCaptureRequestConstraints(dynamicRange);
    }

    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return this.impl.getSupportedDynamicRanges();
    }

    public final boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        return this.impl.isExtraLatencyPresent(dynamicRange);
    }

    public final DynamicRangeProfiles toDynamicRangeProfiles() {
        if (Build.VERSION.SDK_INT >= 33) {
            return this.impl.unwrap();
        }
        throw new IllegalStateException("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API " + Build.VERSION.SDK_INT + " (requires API 33)");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final DynamicRangeProfilesCompat fromCameraMetaData(CameraMetadata cameraMetadata) {
            DynamicRangeProfilesCompat dynamicRangesCompat;
            x.f(cameraMetadata, "cameraMetadata");
            if (Build.VERSION.SDK_INT >= 33) {
                CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
                x.e(key, "REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES");
                dynamicRangesCompat = toDynamicRangesCompat(a$$ExternalSyntheticApiModelOutline0.m13483m(cameraMetadata.get(key)));
            } else {
                dynamicRangesCompat = null;
            }
            return dynamicRangesCompat == null ? DynamicRangeProfilesCompatBaseImpl.Companion.getCOMPAT_INSTANCE() : dynamicRangesCompat;
        }

        public final DynamicRangeProfilesCompat toDynamicRangesCompat(DynamicRangeProfiles dynamicRangeProfiles) {
            if (dynamicRangeProfiles == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return new DynamicRangeProfilesCompat(new DynamicRangeProfilesCompatApi33Impl(dynamicRangeProfiles));
            }
            throw new IllegalStateException("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API " + Build.VERSION.SDK_INT + " (requires API 33)");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
