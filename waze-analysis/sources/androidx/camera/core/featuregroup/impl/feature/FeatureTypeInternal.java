package androidx.camera.core.featuregroup.impl.feature;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FeatureTypeInternal {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FeatureTypeInternal[] $VALUES;
    public static final FeatureTypeInternal DYNAMIC_RANGE = new FeatureTypeInternal("DYNAMIC_RANGE", 0);
    public static final FeatureTypeInternal FPS_RANGE = new FeatureTypeInternal("FPS_RANGE", 1);
    public static final FeatureTypeInternal VIDEO_STABILIZATION = new FeatureTypeInternal("VIDEO_STABILIZATION", 2);
    public static final FeatureTypeInternal IMAGE_FORMAT = new FeatureTypeInternal("IMAGE_FORMAT", 3);
    public static final FeatureTypeInternal RECORDING_QUALITY = new FeatureTypeInternal("RECORDING_QUALITY", 4);

    private static final /* synthetic */ FeatureTypeInternal[] $values() {
        return new FeatureTypeInternal[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT, RECORDING_QUALITY};
    }

    static {
        FeatureTypeInternal[] featureTypeInternalArr$values = $values();
        $VALUES = featureTypeInternalArr$values;
        $ENTRIES = b.a(featureTypeInternalArr$values);
    }

    private FeatureTypeInternal(String str, int i2) {
    }

    public static a<FeatureTypeInternal> getEntries() {
        return $ENTRIES;
    }

    public static FeatureTypeInternal valueOf(String str) {
        return (FeatureTypeInternal) Enum.valueOf(FeatureTypeInternal.class, str);
    }

    public static FeatureTypeInternal[] values() {
        return (FeatureTypeInternal[]) $VALUES.clone();
    }
}
