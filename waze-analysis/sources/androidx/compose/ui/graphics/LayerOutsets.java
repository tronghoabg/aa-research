package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayerOutsets {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LayerOutsets Zero = new LayerOutsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    private LayerOutsets(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        if (Dp.m11163compareTo0680j_4(f2, 0.0f) < 0 || Dp.m11163compareTo0680j_4(f4, 0.0f) < 0 || Dp.m11163compareTo0680j_4(f3, 0.0f) < 0 || Dp.m11163compareTo0680j_4(f5, 0.0f) < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Layer outsets must be non-negative");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayerOutsets)) {
            return false;
        }
        LayerOutsets layerOutsets = (LayerOutsets) obj;
        return Dp.m11169equalsimpl0(this.left, layerOutsets.left) && Dp.m11169equalsimpl0(this.top, layerOutsets.top) && Dp.m11169equalsimpl0(this.right, layerOutsets.right) && Dp.m11169equalsimpl0(this.bottom, layerOutsets.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m8479getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m8480getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m8481getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m8482getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m11170hashCodeimpl(this.left) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.right)) * 31) + Dp.m11170hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "LayerOutsets(left=" + ((Object) Dp.m11175toStringimpl(this.left)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.top)) + ", right=" + ((Object) Dp.m11175toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottom)) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final LayerOutsets getZero() {
            return LayerOutsets.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ LayerOutsets(float f2, float f3, float f4, float f5, o oVar) {
        this(f2, f3, f4, f5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LayerOutsets(float f2, float f3, float f4, float f5, int i2, o oVar) {
        f5 = (i2 & 8) != 0 ? 0.0f : f5;
        f4 = (i2 & 4) != 0 ? 0.0f : f4;
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, f4, f5, null);
    }
}
