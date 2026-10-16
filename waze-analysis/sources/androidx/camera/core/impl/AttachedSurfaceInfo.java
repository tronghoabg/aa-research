package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AttachedSurfaceInfo {
    AttachedSurfaceInfo() {
    }

    public static AttachedSurfaceInfo create(SurfaceConfig surfaceConfig, int i2, Size size, DynamicRange dynamicRange, List<UseCaseConfigFactory.CaptureType> list, Config config, int i3, Range<Integer> range, boolean z, int i4) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i2, size, dynamicRange, list, config, i3, range, z, i4);
    }

    public abstract List<UseCaseConfigFactory.CaptureType> getCaptureTypes();

    public abstract int getCustomMaxFrameRate();

    public abstract DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    public abstract Config getImplementationOptions();

    public abstract int getSessionType();

    public abstract Size getSize();

    public abstract SurfaceConfig getSurfaceConfig();

    public abstract Range<Integer> getTargetFrameRate();

    public abstract boolean isStrictFrameRateRequired();

    public StreamSpec toStreamSpec(Config config) {
        StreamSpec.Builder builder = StreamSpec.builder(getSize());
        builder.setSessionType(getSessionType());
        builder.setExpectedFrameRateRange(getTargetFrameRate());
        builder.setDynamicRange(getDynamicRange());
        builder.setImplementationOptions(config);
        return builder.build();
    }
}
