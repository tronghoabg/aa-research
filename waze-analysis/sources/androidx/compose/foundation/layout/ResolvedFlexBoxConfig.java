package androidx.compose.foundation.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpRect;
import h.g.a.l;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ResolvedFlexBoxConfig implements FlexBoxConfigScope {
    public static final int $stable = 0;
    private AlignmentLineProviderBlock baselineAlignmentBlock;
    private AlignmentLine baselineAlignmentLine;
    private Density _density = FlexBoxKt.getDefaultDensity();
    private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private int direction = 0;
    private int wrap = 0;
    private int justifyContent = 0;
    private int alignItems = 0;
    private int alignContent = 0;
    private float rowGap = 0.0f;
    private float columnGap = 0.0f;

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: alignContent-RVFKNBI */
    public void mo2538alignContentRVFKNBI(int i2) {
        this.alignContent = i2;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    public void alignItems(final l<? super Measured, Integer> lVar) {
        this.alignItems = 4;
        this.baselineAlignmentLine = null;
        this.baselineAlignmentBlock = new AlignmentLineProviderBlock() { // from class: androidx.compose.foundation.layout.ResolvedFlexBoxConfig$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.layout.AlignmentLineProviderBlock
            public final int calculateAlignmentLinePosition(Measured measured) {
                return ((Number) lVar.invoke(measured)).intValue();
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: alignItems-yvIbNKY */
    public void mo2539alignItemsyvIbNKY(int i2) {
        this.alignItems = i2;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: columnGap-0680j_4 */
    public void mo2540columnGap0680j_4(float f2) {
        this.columnGap = f2;
    }

    public final int crossAxisGap() {
        return mo2121roundToPx0680j_4((FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 2)) ? this.rowGap : this.columnGap);
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: direction-d5Yd7B0 */
    public void mo2541directiond5Yd7B0(int i2) {
        this.direction = i2;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: gap-0680j_4 */
    public void mo2542gap0680j_4(float f2) {
        this.rowGap = f2;
        this.columnGap = f2;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: gap-YgX7TsA */
    public void mo2543gapYgX7TsA(float f2, float f3) {
        this.rowGap = f2;
        this.columnGap = f3;
    }

    /* renamed from: getAlignContent-d9B3MrI$foundation_layout, reason: not valid java name */
    public final int m2780getAlignContentd9B3MrI$foundation_layout() {
        return this.alignContent;
    }

    /* renamed from: getAlignItems-20X20zU$foundation_layout, reason: not valid java name */
    public final int m2781getAlignItems20X20zU$foundation_layout() {
        return this.alignItems;
    }

    public final int getBaseline$foundation_layout(Placeable placeable) {
        AlignmentLineProviderBlock alignmentLineProviderBlock = this.baselineAlignmentBlock;
        if (alignmentLineProviderBlock != null) {
            return alignmentLineProviderBlock.calculateAlignmentLinePosition(placeable);
        }
        AlignmentLine alignmentLine = this.baselineAlignmentLine;
        if (alignmentLine == null) {
            int i2 = placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
            return i2 == Integer.MIN_VALUE ? placeable.getHeight() : i2;
        }
        int i3 = placeable.get(alignmentLine);
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        AlignmentLine alignmentLine2 = this.baselineAlignmentLine;
        if (alignmentLine2 == null) {
            x.g();
        }
        return alignmentLine2 instanceof VerticalAlignmentLine ? placeable.getWidth() : placeable.getHeight();
    }

    public final AlignmentLineProviderBlock getBaselineAlignmentBlock() {
        return this.baselineAlignmentBlock;
    }

    public final AlignmentLine getBaselineAlignmentLine() {
        return this.baselineAlignmentLine;
    }

    /* renamed from: getColumnGap-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m2782getColumnGapD9Ej5fM$foundation_layout() {
        return this.columnGap;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo2544getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this._density.getDensity();
    }

    /* renamed from: getDirection-T4wFHC8$foundation_layout, reason: not valid java name */
    public final int m2783getDirectionT4wFHC8$foundation_layout() {
        return this.direction;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this._density.getFontScale();
    }

    public final boolean getHasBaseline() {
        return FlexAlignItems.m2502equalsimpl0(m2781getAlignItems20X20zU$foundation_layout(), 4);
    }

    /* renamed from: getJustifyContent-GomtQF4$foundation_layout, reason: not valid java name */
    public final int m2784getJustifyContentGomtQF4$foundation_layout() {
        return this.justifyContent;
    }

    /* renamed from: getRowGap-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m2785getRowGapD9Ej5fM$foundation_layout() {
        return this.rowGap;
    }

    /* renamed from: getWrap-7ziDAWk$foundation_layout, reason: not valid java name */
    public final int m2786getWrap7ziDAWk$foundation_layout() {
        return this.wrap;
    }

    public final boolean isCrossAxisReverse() {
        return FlexWrap.m2587equalsimpl0(m2786getWrap7ziDAWk$foundation_layout(), 2);
    }

    public final boolean isHorizontal() {
        return FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 2);
    }

    public final boolean isWrapEnabled() {
        return FlexWrap.m2587equalsimpl0(m2786getWrap7ziDAWk$foundation_layout(), 1) || FlexWrap.m2587equalsimpl0(m2786getWrap7ziDAWk$foundation_layout(), 2);
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: justifyContent-q3qUS_E */
    public void mo2545justifyContentq3qUS_E(int i2) {
        this.justifyContent = i2;
    }

    public final int mainAxisGap() {
        return mo2121roundToPx0680j_4((FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 0) || FlexDirection.m2563equalsimpl0(m2783getDirectionT4wFHC8$foundation_layout(), 2)) ? this.columnGap : this.rowGap);
    }

    /* renamed from: prepare-0kLqBqw, reason: not valid java name */
    public final void m2787prepare0kLqBqw(Density density, long j2) {
        this._density = density;
        this.constraints = j2;
        this.direction = 0;
        this.wrap = 0;
        this.justifyContent = 0;
        this.alignItems = 0;
        this.alignContent = 0;
        this.rowGap = 0.0f;
        this.columnGap = 0.0f;
        this.baselineAlignmentLine = null;
        this.baselineAlignmentBlock = null;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo2120roundToPxR2X_6o(long j2) {
        return Density.CC.m11128$default$roundToPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo2121roundToPx0680j_4(float f2) {
        return Density.CC.m11129$default$roundToPx0680j_4(this, f2);
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: rowGap-0680j_4 */
    public void mo2546rowGap0680j_4(float f2) {
        this.rowGap = f2;
    }

    /* renamed from: setAlignContent-RVFKNBI$foundation_layout, reason: not valid java name */
    public final void m2788setAlignContentRVFKNBI$foundation_layout(int i2) {
        this.alignContent = i2;
    }

    /* renamed from: setAlignItems-yvIbNKY$foundation_layout, reason: not valid java name */
    public final void m2789setAlignItemsyvIbNKY$foundation_layout(int i2) {
        this.alignItems = i2;
    }

    /* renamed from: setColumnGap-0680j_4$foundation_layout, reason: not valid java name */
    public final void m2790setColumnGap0680j_4$foundation_layout(float f2) {
        this.columnGap = f2;
    }

    /* renamed from: setDirection-d5Yd7B0$foundation_layout, reason: not valid java name */
    public final void m2791setDirectiond5Yd7B0$foundation_layout(int i2) {
        this.direction = i2;
    }

    /* renamed from: setJustifyContent-q3qUS_E$foundation_layout, reason: not valid java name */
    public final void m2792setJustifyContentq3qUS_E$foundation_layout(int i2) {
        this.justifyContent = i2;
    }

    /* renamed from: setRowGap-0680j_4$foundation_layout, reason: not valid java name */
    public final void m2793setRowGap0680j_4$foundation_layout(float f2) {
        this.rowGap = f2;
    }

    /* renamed from: setWrap-CLQ35Ag$foundation_layout, reason: not valid java name */
    public final void m2794setWrapCLQ35Ag$foundation_layout(int i2) {
        this.wrap = i2;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo2122toDpGaN1DYA(long j2) {
        return this._density.mo2122toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2123toDpu2uoSUM(float f2) {
        return Density.CC.m11130$default$toDpu2uoSUM(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo2125toDpSizekrfVVM(long j2) {
        return Density.CC.m11132$default$toDpSizekrfVVM(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo2126toPxR2X_6o(long j2) {
        return Density.CC.m11133$default$toPxR2X_6o(this, j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo2127toPx0680j_4(float f2) {
        return Density.CC.m11134$default$toPx0680j_4(this, f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo2128toSizeXkaWNTQ(long j2) {
        return Density.CC.m11135$default$toSizeXkaWNTQ(this, j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo2129toSp0xMU5do(float f2) {
        return this._density.mo2129toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2130toSpkPz2Gy4(float f2) {
        return Density.CC.m11136$default$toSpkPz2Gy4(this, f2);
    }

    public String toString() {
        return o.c("\n        FlexBoxConfig(\n            direction = " + ((Object) FlexDirection.m2565toStringimpl(this.direction)) + ",\n            wrap = " + ((Object) FlexWrap.m2589toStringimpl(this.wrap)) + ",\n            justifyContent = " + ((Object) FlexJustifyContent.m2576toStringimpl(this.justifyContent)) + ",\n            alignItems = " + ((Object) FlexAlignItems.m2504toStringimpl(this.alignItems)) + ",\n            alignContent = " + ((Object) FlexAlignContent.m2491toStringimpl(this.alignContent)) + ",\n            rowGap = " + ((Object) Dp.m11175toStringimpl(this.rowGap)) + ",\n            columnGap = " + ((Object) Dp.m11175toStringimpl(this.columnGap)) + "\n        )\n    ");
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    /* renamed from: wrap-CLQ35Ag */
    public void mo2547wrapCLQ35Ag(int i2) {
        this.wrap = i2;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo2124toDpu2uoSUM(int i2) {
        return Density.CC.m11131$default$toDpu2uoSUM((Density) this, i2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo2131toSpkPz2Gy4(int i2) {
        return Density.CC.m11137$default$toSpkPz2Gy4((Density) this, i2);
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfigScope
    public void alignItems(AlignmentLine alignmentLine) {
        this.alignItems = 4;
        this.baselineAlignmentLine = alignmentLine;
        this.baselineAlignmentBlock = null;
    }
}
