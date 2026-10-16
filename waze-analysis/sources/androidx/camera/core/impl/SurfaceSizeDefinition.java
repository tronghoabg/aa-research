package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class SurfaceSizeDefinition {
    SurfaceSizeDefinition() {
    }

    public static SurfaceSizeDefinition create(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        return new AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4, map5, map6);
    }

    public abstract Size getAnalysisSize();

    public Size getMaximum16x9Size(int i2) {
        return getMaximumSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getMaximum16x9SizeMap();

    public Size getMaximum4x3Size(int i2) {
        return getMaximumSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getMaximum4x3SizeMap();

    public Size getMaximumSize(int i2) {
        return getMaximumSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getMaximumSizeMap();

    public abstract Size getPreviewSize();

    public abstract Size getRecordSize();

    public Size getS1440pSize(int i2) {
        return getS1440pSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getS1440pSizeMap();

    public Size getS720pSize(int i2) {
        return getS720pSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getS720pSizeMap();

    public Size getUltraMaximumSize(int i2) {
        return getUltraMaximumSizeMap().get(Integer.valueOf(i2));
    }

    public abstract Map<Integer, Size> getUltraMaximumSizeMap();
}
