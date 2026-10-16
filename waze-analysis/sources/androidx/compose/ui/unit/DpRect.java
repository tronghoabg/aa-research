package androidx.compose.ui.unit;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    private DpRect(long j2, long j3) {
        this(DpOffset.m11225getXD9Ej5fM(j2), DpOffset.m11227getYD9Ej5fM(j2), DpSize.m11262getWidthD9Ej5fM(j3) + DpOffset.m11225getXD9Ej5fM(j2), DpOffset.m11227getYD9Ej5fM(j2) + DpSize.m11260getHeightD9Ej5fM(j3), null);
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m11236copya9UjIt4$default(DpRect dpRect, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = dpRect.left;
        }
        if ((i2 & 2) != 0) {
            f3 = dpRect.top;
        }
        if ((i2 & 4) != 0) {
            f4 = dpRect.right;
        }
        if ((i2 & 8) != 0) {
            f5 = dpRect.bottom;
        }
        return dpRect.m11245copya9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m11241component1D9Ej5fM() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m11242component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m11243component3D9Ej5fM() {
        return this.right;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m11244component4D9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m11245copya9UjIt4(float f2, float f3, float f4, float f5) {
        return new DpRect(f2, f3, f4, f5, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m11169equalsimpl0(this.left, dpRect.left) && Dp.m11169equalsimpl0(this.top, dpRect.top) && Dp.m11169equalsimpl0(this.right, dpRect.right) && Dp.m11169equalsimpl0(this.bottom, dpRect.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m11246getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m11247getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m11248getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m11249getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m11170hashCodeimpl(this.left) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.right)) * 31) + Dp.m11170hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) Dp.m11175toStringimpl(this.left)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.top)) + ", right=" + ((Object) Dp.m11175toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottom)) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11237getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11238getLeftD9Ej5fM$annotations() {
    }

    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11239getRightD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m11240getTopD9Ej5fM$annotations() {
    }

    public /* synthetic */ DpRect(float f2, float f3, float f4, float f5, o oVar) {
        this(f2, f3, f4, f5);
    }

    public /* synthetic */ DpRect(long j2, long j3, o oVar) {
        this(j2, j3);
    }

    private DpRect(float f2, float f3, float f4, float f5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
    }
}
