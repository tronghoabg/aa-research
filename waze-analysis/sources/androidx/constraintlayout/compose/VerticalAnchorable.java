package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VerticalAnchorable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.VerticalAnchorable$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
        public static /* synthetic */ void m11637linkToVpY3zN4$default(VerticalAnchorable verticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            verticalAnchorable.mo11427linkToVpY3zN4(verticalAnchor, f2, f3);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* renamed from: linkTo-VpY3zN4 */
    void mo11427linkToVpY3zN4(ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f2, float f3);
}
