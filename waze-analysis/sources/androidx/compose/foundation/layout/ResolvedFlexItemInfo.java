package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ResolvedFlexItemInfo implements FlexConfigScope {
    public static final int $stable = 0;
    private AlignmentLineProviderBlock baselineAlignmentBlock;
    private AlignmentLine baselineAlignmentLine;
    private int crossAxisSize;
    private int crossPosition;
    private int flexBaseSize;
    private int flexBoxCrossAxisMax;
    private int flexBoxCrossAxisMin;
    private int flexBoxMainAxisMax;
    private int flexBoxMainAxisMin;
    private float grow;
    private int hypotheticalMainSize;
    private boolean isFrozen;
    private int mainAxisSize;
    private int mainPosition;
    private Measurable measurable;
    private int order;
    private Placeable placeable;
    private int targetMainSize;
    private Density _density = FlexBoxKt.getDefaultDensity();
    private int alignSelf = 0;
    private float shrink = 1.0f;
    private long basis = FlexBasis.Companion.m2537getAutodlZNVs();
    private int _minMainAxisSize = -1;
    private int _maxContentSize = -1;
    private int baseline = Integer.MIN_VALUE;

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void alignSelf(final l<? super Measured, Integer> lVar) {
        this.alignSelf = 5;
        this.baselineAlignmentLine = null;
        this.baselineAlignmentBlock = new AlignmentLineProviderBlock() { // from class: androidx.compose.foundation.layout.ResolvedFlexItemInfo$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.layout.AlignmentLineProviderBlock
            public final int calculateAlignmentLinePosition(Measured measured) {
                return ((Number) lVar.invoke(measured)).intValue();
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    /* renamed from: alignSelf-aKVMlHY */
    public void mo2557alignSelfaKVMlHY(int i2) {
        this.alignSelf = i2;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void basis(float f2) {
        this.basis = FlexBasis.Companion.m2536Percentuoj9tHE(f2);
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    /* renamed from: basis-0680j_4 */
    public void mo2558basis0680j_4(float f2) {
        this.basis = FlexBasis.Companion.m2535DpcHuBJEI(f2);
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    /* renamed from: basis-MFoeH6Y */
    public void mo2559basisMFoeH6Y(long j2) {
        this.basis = j2;
    }

    /* renamed from: getAlignSelf-_ov7Qcc$foundation_layout, reason: not valid java name */
    public final int m2795getAlignSelf_ov7Qcc$foundation_layout() {
        return this.alignSelf;
    }

    public final int getBaseline(Placeable placeable, ResolvedFlexBoxConfig resolvedFlexBoxConfig) {
        AlignmentLineProviderBlock alignmentLineProviderBlock = this.baselineAlignmentBlock;
        if (alignmentLineProviderBlock != null) {
            return alignmentLineProviderBlock.calculateAlignmentLinePosition(placeable);
        }
        AlignmentLine alignmentLine = this.baselineAlignmentLine;
        if (alignmentLine == null) {
            if (FlexAlignSelf.m2514equalsimpl0(this.alignSelf, 5)) {
                return resolvedFlexBoxConfig.getBaseline$foundation_layout(placeable);
            }
            if (FlexAlignItems.m2502equalsimpl0(resolvedFlexBoxConfig.m2781getAlignItems20X20zU$foundation_layout(), 4) && FlexAlignSelf.m2514equalsimpl0(this.alignSelf, 0)) {
                return resolvedFlexBoxConfig.getBaseline$foundation_layout(placeable);
            }
            return Integer.MIN_VALUE;
        }
        int i2 = placeable.get(alignmentLine);
        if (i2 != Integer.MIN_VALUE) {
            return i2;
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

    /* renamed from: getBasis-d-lZNVs$foundation_layout, reason: not valid java name */
    public final long m2796getBasisdlZNVs$foundation_layout() {
        return this.basis;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getCrossPosition() {
        return this.crossPosition;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this._density.getDensity();
    }

    public final int getFlexBaseSize() {
        return this.flexBaseSize;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public int getFlexBoxCrossAxisMax() {
        return this.flexBoxCrossAxisMax;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public int getFlexBoxCrossAxisMin() {
        return this.flexBoxCrossAxisMin;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public int getFlexBoxMainAxisMax() {
        return this.flexBoxMainAxisMax;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public int getFlexBoxMainAxisMin() {
        return this.flexBoxMainAxisMin;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this._density.getFontScale();
    }

    public final float getGrow$foundation_layout() {
        return this.grow;
    }

    public final boolean getHasBaseline() {
        return FlexAlignSelf.m2514equalsimpl0(this.alignSelf, 5);
    }

    public final int getHypotheticalMainSize() {
        return this.hypotheticalMainSize;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainPosition() {
        return this.mainPosition;
    }

    public final int getMaxContentSize$foundation_layout(boolean z) {
        int i2 = this._maxContentSize;
        if (i2 != -1) {
            return i2;
        }
        Measurable measurable = this.measurable;
        int iMaxIntrinsicHeight = 0;
        if (z) {
            if (measurable != null) {
                iMaxIntrinsicHeight = measurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            }
        } else if (measurable != null) {
            iMaxIntrinsicHeight = measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
        }
        this._maxContentSize = iMaxIntrinsicHeight;
        return iMaxIntrinsicHeight;
    }

    public final Measurable getMeasurable() {
        return this.measurable;
    }

    public final int getMinMainAxisSize$foundation_layout(boolean z) {
        int i2 = this._minMainAxisSize;
        if (i2 != -1) {
            return i2;
        }
        Measurable measurable = this.measurable;
        int iMinIntrinsicHeight = 0;
        if (z) {
            if (measurable != null) {
                iMinIntrinsicHeight = measurable.minIntrinsicWidth(Integer.MAX_VALUE);
            }
        } else if (measurable != null) {
            iMinIntrinsicHeight = measurable.minIntrinsicHeight(Integer.MAX_VALUE);
        }
        this._minMainAxisSize = iMinIntrinsicHeight;
        return iMinIntrinsicHeight;
    }

    public final int getOrder$foundation_layout() {
        return this.order;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    public final float getShrink$foundation_layout() {
        return this.shrink;
    }

    public final int getTargetMainSize() {
        return this.targetMainSize;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void grow(float f2) {
        if (f2 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Flex grow cannot be negative: " + f2);
        }
        this.grow = f2;
    }

    public final boolean isFrozen() {
        return this.isFrozen;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void order(int i2) {
        this.order = i2;
    }

    /* renamed from: prepare-RMq0m1M, reason: not valid java name */
    public final void m2797prepareRMq0m1M(Density density, long j2) {
        this._density = density;
        this.flexBoxMainAxisMax = Constraints.m11107getMaxWidthimpl(j2);
        this.flexBoxMainAxisMin = Constraints.m11109getMinWidthimpl(j2);
        this.flexBoxCrossAxisMax = Constraints.m11106getMaxHeightimpl(j2);
        this.flexBoxCrossAxisMin = Constraints.m11108getMinHeightimpl(j2);
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

    /* renamed from: setAlignSelf-aKVMlHY$foundation_layout, reason: not valid java name */
    public final void m2798setAlignSelfaKVMlHY$foundation_layout(int i2) {
        this.alignSelf = i2;
    }

    public final void setBaseline(int i2) {
        this.baseline = i2;
    }

    /* renamed from: setBasis-MFoeH6Y$foundation_layout, reason: not valid java name */
    public final void m2799setBasisMFoeH6Y$foundation_layout(long j2) {
        this.basis = j2;
    }

    public final void setCrossAxisSize(int i2) {
        this.crossAxisSize = i2;
    }

    public final void setCrossPosition(int i2) {
        this.crossPosition = i2;
    }

    public final void setFlexBaseSize(int i2) {
        this.flexBaseSize = i2;
    }

    public final void setFrozen(boolean z) {
        this.isFrozen = z;
    }

    public final void setGrow$foundation_layout(float f2) {
        this.grow = f2;
    }

    public final void setHypotheticalMainSize(int i2) {
        this.hypotheticalMainSize = i2;
    }

    public final void setMainAxisSize(int i2) {
        this.mainAxisSize = i2;
    }

    public final void setMainPosition(int i2) {
        this.mainPosition = i2;
    }

    public final void setMeasurable(Measurable measurable) {
        this.measurable = measurable;
    }

    public final void setOrder$foundation_layout(int i2) {
        this.order = i2;
    }

    public final void setPlaceable(Placeable placeable) {
        this.placeable = placeable;
    }

    public final void setShrink$foundation_layout(float f2) {
        this.shrink = f2;
    }

    public final void setTargetMainSize(int i2) {
        this.targetMainSize = i2;
    }

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void shrink(float f2) {
        if (f2 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Flex shrink cannot be negative: " + f2);
        }
        this.shrink = f2;
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

    @Override // androidx.compose.foundation.layout.FlexConfigScope
    public void alignSelf(AlignmentLine alignmentLine) {
        this.alignSelf = 5;
        this.baselineAlignmentLine = alignmentLine;
        this.baselineAlignmentBlock = null;
    }

    public final int getBaseline() {
        return this.baseline;
    }
}
