package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    private BoxWithConstraintsScopeImpl(Density density, long j2) {
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
        this.density = density;
        this.constraints = j2;
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m2472copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i2 & 2) != 0) {
            j2 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m2474copy0kLqBqw(density, j2);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m2473component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m2474copy0kLqBqw(Density density, long j2) {
        return new BoxWithConstraintsScopeImpl(density, j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return x.n(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m11100equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo2467getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo2468getMaxHeightD9Ej5fM() {
        return Constraints.m11102getHasBoundedHeightimpl(mo2467getConstraintsmsEJaDk()) ? this.density.mo2124toDpu2uoSUM(Constraints.m11106getMaxHeightimpl(mo2467getConstraintsmsEJaDk())) : Dp.Companion.m11183getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo2469getMaxWidthD9Ej5fM() {
        return Constraints.m11103getHasBoundedWidthimpl(mo2467getConstraintsmsEJaDk()) ? this.density.mo2124toDpu2uoSUM(Constraints.m11107getMaxWidthimpl(mo2467getConstraintsmsEJaDk())) : Dp.Companion.m11183getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo2470getMinHeightD9Ej5fM() {
        return this.density.mo2124toDpu2uoSUM(Constraints.m11108getMinHeightimpl(mo2467getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo2471getMinWidthD9Ej5fM() {
        return this.density.mo2124toDpu2uoSUM(Constraints.m11109getMinWidthimpl(mo2467getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m11110hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m11112toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j2, o oVar) {
        this(density, j2);
    }
}
