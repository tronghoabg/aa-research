package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PaddingValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo2704calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo2707calculateTopPaddingD9Ej5fM();

    /* compiled from: WazeSource */
    public final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        private Absolute(float f2, float f3, float f4, float f5) {
            this.left = f2;
            this.top = f3;
            this.right = f4;
            this.bottom = f5;
            if (!((f2 >= 0.0f) & (f3 >= 0.0f) & (f4 >= 0.0f)) || !(f5 >= 0.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
            }
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo2704calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo2707calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Dp.m11169equalsimpl0(this.left, absolute.left) && Dp.m11169equalsimpl0(this.top, absolute.top) && Dp.m11169equalsimpl0(this.right, absolute.right) && Dp.m11169equalsimpl0(this.bottom, absolute.bottom);
        }

        public int hashCode() {
            return (((((Dp.m11170hashCodeimpl(this.left) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.right)) * 31) + Dp.m11170hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.m11175toStringimpl(this.left)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.top)) + ", right=" + ((Object) Dp.m11175toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottom)) + ')';
        }

        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m2768getBottomD9Ej5fM$annotations() {
        }

        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m2769getLeftD9Ej5fM$annotations() {
        }

        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m2770getRightD9Ej5fM$annotations() {
        }

        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m2771getTopD9Ej5fM$annotations() {
        }

        public /* synthetic */ Absolute(float f2, float f3, float f4, float f5, o oVar) {
            this(f2, f3, f4, f5);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Absolute(float f2, float f3, float f4, float f5, int i2, o oVar) {
            f5 = (i2 & 8) != 0 ? 0.0f : f5;
            f4 = (i2 & 4) != 0 ? 0.0f : f4;
            this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, f4, f5, null);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PaddingValues Zero = new Absolute(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

        private Companion() {
        }

        public final PaddingValues getZero() {
            return Zero;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
