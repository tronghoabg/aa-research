package androidx.camera.common.internal;

import android.util.Size;
import h.g.b.o;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class MutableDeviceLimits extends DeviceLimits {
    public static final Companion Companion = new Companion(null);

    public static final MutableDeviceLimits create() {
        return Companion.create();
    }

    public abstract DeviceLimits build();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Map<Integer, Size> getMaxOutputSizes();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Map<Integer, Size> getMaxOutputSizes16by9();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Map<Integer, Size> getMaxOutputSizes4by3();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Size getMaxPreviewSize();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Size getMaxRecordSize();

    @Override // androidx.camera.common.internal.DeviceLimits
    public abstract Map<Integer, Size> getMaxUltraOutputSizes();

    public abstract void setMaxOutputSizes(Map<Integer, Size> map);

    public abstract void setMaxOutputSizes16by9(Map<Integer, Size> map);

    public abstract void setMaxOutputSizes4by3(Map<Integer, Size> map);

    public abstract void setMaxPreviewSize(Size size);

    public abstract void setMaxRecordSize(Size size);

    public abstract void setMaxUltraOutputSizes(Map<Integer, Size> map);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final MutableDeviceLimits create() {
            return new DeviceLimitsImpl(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
