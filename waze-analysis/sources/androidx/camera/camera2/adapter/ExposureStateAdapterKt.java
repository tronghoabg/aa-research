package androidx.camera.camera2.adapter;

import android.util.Range;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposureStateAdapterKt {
    private static final Range<Integer> EMPTY_RANGE;

    static {
        Integer num = (Comparable) 0;
        EMPTY_RANGE = new Range<>(num, num);
    }

    public static final Range<Integer> getEMPTY_RANGE() {
        return EMPTY_RANGE;
    }
}
