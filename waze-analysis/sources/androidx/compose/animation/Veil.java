package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.Color;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Veil {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Color> animationSpec;
    private final long initialColor;
    private final boolean matchParentSize;
    private final long targetColor;

    private Veil(long j2, long j3, FiniteAnimationSpec<Color> finiteAnimationSpec, boolean z) {
        this.initialColor = j2;
        this.targetColor = j3;
        this.animationSpec = finiteAnimationSpec;
        this.matchParentSize = z;
    }

    /* renamed from: copy-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ Veil m1860copyRFnl5yQ$default(Veil veil, long j2, long j3, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = veil.initialColor;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = veil.targetColor;
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            finiteAnimationSpec = veil.animationSpec;
        }
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i2 & 8) != 0) {
            z = veil.matchParentSize;
        }
        return veil.m1863copyRFnl5yQ(j4, j5, finiteAnimationSpec2, z);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m1861component10d7_KjU() {
        return this.initialColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m1862component20d7_KjU() {
        return this.targetColor;
    }

    public final FiniteAnimationSpec<Color> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.matchParentSize;
    }

    /* renamed from: copy-RFnl5yQ, reason: not valid java name */
    public final Veil m1863copyRFnl5yQ(long j2, long j3, FiniteAnimationSpec<Color> finiteAnimationSpec, boolean z) {
        return new Veil(j2, j3, finiteAnimationSpec, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Veil)) {
            return false;
        }
        Veil veil = (Veil) obj;
        return Color.m8229equalsimpl0(this.initialColor, veil.initialColor) && Color.m8229equalsimpl0(this.targetColor, veil.targetColor) && x.n(this.animationSpec, veil.animationSpec) && this.matchParentSize == veil.matchParentSize;
    }

    public final FiniteAnimationSpec<Color> getAnimationSpec() {
        return this.animationSpec;
    }

    /* renamed from: getInitialColor-0d7_KjU, reason: not valid java name */
    public final long m1864getInitialColor0d7_KjU() {
        return this.initialColor;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    /* renamed from: getTargetColor-0d7_KjU, reason: not valid java name */
    public final long m1865getTargetColor0d7_KjU() {
        return this.targetColor;
    }

    public int hashCode() {
        return (((((Color.m8235hashCodeimpl(this.initialColor) * 31) + Color.m8235hashCodeimpl(this.targetColor)) * 31) + this.animationSpec.hashCode()) * 31) + Veil$$ExternalSyntheticBackport0.m(this.matchParentSize);
    }

    public String toString() {
        return "Veil(initialColor=" + ((Object) Color.m8236toStringimpl(this.initialColor)) + ", targetColor=" + ((Object) Color.m8236toStringimpl(this.targetColor)) + ", animationSpec=" + this.animationSpec + ", matchParentSize=" + this.matchParentSize + ')';
    }

    public /* synthetic */ Veil(long j2, long j3, FiniteAnimationSpec finiteAnimationSpec, boolean z, o oVar) {
        this(j2, j3, finiteAnimationSpec, z);
    }
}
