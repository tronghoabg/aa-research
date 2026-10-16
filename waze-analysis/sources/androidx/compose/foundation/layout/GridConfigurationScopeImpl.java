package androidx.compose.foundation.layout;

import androidx.collection.MutableLongList;
import androidx.compose.foundation.layout.GridConfigurationScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridConfigurationScopeImpl implements GridConfigurationScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private float columnGap;
    private final MutableLongList columnSpecs;
    private final long constraints;
    private int flow;
    private float rowGap;
    private final MutableLongList rowSpecs;

    private GridConfigurationScopeImpl(Density density, long j2) {
        this.$$delegate_0 = density;
        this.constraints = j2;
        this.columnSpecs = new MutableLongList(0, 1, null);
        this.rowSpecs = new MutableLongList(0, 1, null);
        this.columnGap = 0.0f;
        this.rowGap = 0.0f;
        this.flow = 0;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    public void column(float f2) {
        mo2638column118E5d0(GridTrackSize.Companion.m2700Percentage9Tp3RV8(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: column-0680j_4 */
    public void mo2637column0680j_4(float f2) {
        mo2638column118E5d0(GridTrackSize.Companion.m2697FixedpsSkOvk(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: column-118E5d0 */
    public void mo2638column118E5d0(long j2) {
        this.columnSpecs.add(j2);
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: column-XZblgos */
    public void mo2639columnXZblgos(float f2) {
        mo2638column118E5d0(GridTrackSize.Companion.m2698FlexKGB9zo8(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: columnGap-0680j_4 */
    public void mo2640columnGap0680j_4(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Column gap must be non-negative");
        }
        this.columnGap = f2;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: gap-0680j_4 */
    public void mo2641gap0680j_4(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Gap must be non-negative");
        }
        this.columnGap = f2;
        this.rowGap = f2;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: gap-YgX7TsA */
    public void mo2642gapYgX7TsA(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Row gap must be non-negative");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Column gap must be non-negative");
        }
        this.rowGap = f2;
        this.columnGap = f3;
    }

    /* renamed from: getColumnGap-D9Ej5fM, reason: not valid java name */
    public final float m2661getColumnGapD9Ej5fM() {
        return this.columnGap;
    }

    public final MutableLongList getColumnSpecs() {
        return this.columnSpecs;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo2643getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: getFlow-ITJdzs4 */
    public int mo2644getFlowITJdzs4() {
        return this.flow;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: getFr-9P9H2UQ */
    public /* synthetic */ float mo2645getFr9P9H2UQ(double d2) {
        return GridConfigurationScope.CC.m2654$default$getFr9P9H2UQ(this, d2);
    }

    /* renamed from: getRowGap-D9Ej5fM, reason: not valid java name */
    public final float m2662getRowGapD9Ej5fM() {
        return this.rowGap;
    }

    public final MutableLongList getRowSpecs() {
        return this.rowSpecs;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: minmax-1z8F7YY */
    public /* synthetic */ long mo2648minmax1z8F7YY(float f2, float f3) {
        return GridTrackSize.Companion.m2699MinMax1z8F7YY(f2, f3);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo2120roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo2120roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo2121roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo2121roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    public void row(float f2) {
        mo2650row118E5d0(GridTrackSize.Companion.m2700Percentage9Tp3RV8(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: row-0680j_4 */
    public void mo2649row0680j_4(float f2) {
        mo2650row118E5d0(GridTrackSize.Companion.m2697FixedpsSkOvk(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: row-118E5d0 */
    public void mo2650row118E5d0(long j2) {
        this.rowSpecs.add(j2);
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: row-XZblgos */
    public void mo2651rowXZblgos(float f2) {
        mo2650row118E5d0(GridTrackSize.Companion.m2698FlexKGB9zo8(f2));
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: rowGap-0680j_4 */
    public void mo2652rowGap0680j_4(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Row gap must be non-negative");
        }
        this.rowGap = f2;
    }

    /* renamed from: setColumnGap-0680j_4, reason: not valid java name */
    public final void m2663setColumnGap0680j_4(float f2) {
        this.columnGap = f2;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: setFlow-4t4_IgM */
    public void mo2653setFlow4t4_IgM(int i2) {
        this.flow = i2;
    }

    /* renamed from: setRowGap-0680j_4, reason: not valid java name */
    public final void m2664setRowGap0680j_4(float f2) {
        this.rowGap = f2;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo2122toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo2122toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2123toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo2123toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo2125toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo2125toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo2126toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo2126toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo2127toPx0680j_4(float f2) {
        return this.$$delegate_0.mo2127toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo2128toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo2128toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo2129toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo2129toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2130toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo2130toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: getFr-9P9H2UQ */
    public /* synthetic */ float mo2646getFr9P9H2UQ(float f2) {
        return f2;
    }

    @Override // androidx.compose.foundation.layout.GridConfigurationScope
    /* renamed from: getFr-9P9H2UQ */
    public /* synthetic */ float mo2647getFr9P9H2UQ(int i2) {
        return GridConfigurationScope.CC.m2656$default$getFr9P9H2UQ((GridConfigurationScope) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo2124toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo2124toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo2131toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo2131toSpkPz2Gy4(i2);
    }

    public /* synthetic */ GridConfigurationScopeImpl(Density density, long j2, o oVar) {
        this(density, j2);
    }
}
