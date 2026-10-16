package androidx.camera.camera2.adapter;

import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.core.ZoomState;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZoomValue implements ZoomState {
    private Float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    /* compiled from: WazeSource */
    public final class LinearZoom {
        private final float value;

        public LinearZoom(float f2) {
            this.value = f2;
        }

        public static /* synthetic */ LinearZoom copy$default(LinearZoom linearZoom, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = linearZoom.value;
            }
            return linearZoom.copy(f2);
        }

        public final float component1() {
            return this.value;
        }

        public final LinearZoom copy(float f2) {
            return new LinearZoom(f2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinearZoom) && Float.compare(this.value, ((LinearZoom) obj).value) == 0;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.value);
        }

        public String toString() {
            return "LinearZoom(value=" + this.value + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomValue(LinearZoom linearZoom, float f2, float f3) {
        this(ZoomMath.INSTANCE.getZoomRatioFromLinearZoom(linearZoom.getValue(), f2, f3), f2, f3);
        x.f(linearZoom, "linearZoom");
        this.linearZoom = Float.valueOf(linearZoom.getValue());
    }

    private final float component1() {
        return this.zoomRatio;
    }

    private final float component2() {
        return this.minZoomRatio;
    }

    private final float component3() {
        return this.maxZoomRatio;
    }

    public static /* synthetic */ ZoomValue copy$default(ZoomValue zoomValue, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = zoomValue.zoomRatio;
        }
        if ((i2 & 2) != 0) {
            f3 = zoomValue.minZoomRatio;
        }
        if ((i2 & 4) != 0) {
            f4 = zoomValue.maxZoomRatio;
        }
        return zoomValue.copy(f2, f3, f4);
    }

    public final ZoomValue copy(float f2, float f3, float f4) {
        return new ZoomValue(f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoomValue)) {
            return false;
        }
        ZoomValue zoomValue = (ZoomValue) obj;
        return Float.compare(this.zoomRatio, zoomValue.zoomRatio) == 0 && Float.compare(this.minZoomRatio, zoomValue.minZoomRatio) == 0 && Float.compare(this.maxZoomRatio, zoomValue.maxZoomRatio) == 0;
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        Float f2 = this.linearZoom;
        if (f2 != null) {
            return f2.floatValue();
        }
        return ZoomMath.INSTANCE.getLinearZoomFromZoomRatio(this.zoomRatio, this.minZoomRatio, this.maxZoomRatio);
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.zoomRatio) * 31) + Float.floatToIntBits(this.minZoomRatio)) * 31) + Float.floatToIntBits(this.maxZoomRatio);
    }

    public String toString() {
        return "ZoomValue(zoomRatio=" + this.zoomRatio + ", minZoomRatio=" + this.minZoomRatio + ", maxZoomRatio=" + this.maxZoomRatio + ")";
    }

    public ZoomValue(float f2, float f3, float f4) {
        this.zoomRatio = f2;
        this.minZoomRatio = f3;
        this.maxZoomRatio = f4;
    }
}
