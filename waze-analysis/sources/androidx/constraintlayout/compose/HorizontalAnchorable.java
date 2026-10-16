package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface HorizontalAnchorable {
    /* renamed from: linkTo-VpY3zN4 */
    void mo11425linkToVpY3zN4(ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f2, float f3);

    /* renamed from: linkTo-VpY3zN4 */
    void mo11426linkToVpY3zN4(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f2, float f3);

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.HorizontalAnchorable$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static /* synthetic */ void m11542linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            horizontalAnchorable.mo11425linkToVpY3zN4(baselineAnchor, f2, f3);
        }

        /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static /* synthetic */ void m11543linkToVpY3zN4$default(HorizontalAnchorable horizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            horizontalAnchorable.mo11426linkToVpY3zN4(horizontalAnchor, f2, f3);
        }
    }
}
