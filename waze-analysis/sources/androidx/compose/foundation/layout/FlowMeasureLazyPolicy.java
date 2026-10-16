package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.foundation.layout.FlowLineMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FlowMeasureLazyPolicy implements FlowLineMeasurePolicy {
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;
    private final r<Integer, FlowLineInfo, Composer, Integer, ab> getComposable;
    private final Arrangement.Horizontal horizontalArrangement;
    private final boolean isHorizontal;
    private final int itemCount;
    private final float mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;
    private final List<p<Composer, Integer, ab>> overflowComposables;
    private final Arrangement.Vertical verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    private FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends p<? super Composer, ? super Integer, ab>> list, r<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, ab> rVar) {
        this.isHorizontal = z;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisSpacing = f2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f3;
        this.itemCount = i2;
        this.maxLines = i3;
        this.maxItemsInMainAxis = i4;
        this.overflow = flowLayoutOverflowState;
        this.overflowComposables = list;
        this.getComposable = rVar;
    }

    private final FlowLayoutOverflowState component10() {
        return this.overflow;
    }

    private final List<p<Composer, Integer, ab>> component11() {
        return this.overflowComposables;
    }

    private final r<Integer, FlowLineInfo, Composer, Integer, ab> component12() {
        return this.getComposable;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m2616component4D9Ej5fM() {
        return this.mainAxisSpacing;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name */
    private final float m2617component6D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component7() {
        return this.itemCount;
    }

    private final int component8() {
        return this.maxLines;
    }

    private final int component9() {
        return this.maxItemsInMainAxis;
    }

    /* renamed from: copy-E4Q9ldg$default, reason: not valid java name */
    public static /* synthetic */ FlowMeasureLazyPolicy m2618copyE4Q9ldg$default(FlowMeasureLazyPolicy flowMeasureLazyPolicy, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, r rVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = flowMeasureLazyPolicy.isHorizontal;
        }
        if ((i5 & 2) != 0) {
            horizontal = flowMeasureLazyPolicy.horizontalArrangement;
        }
        if ((i5 & 4) != 0) {
            vertical = flowMeasureLazyPolicy.verticalArrangement;
        }
        if ((i5 & 8) != 0) {
            f2 = flowMeasureLazyPolicy.mainAxisSpacing;
        }
        if ((i5 & 16) != 0) {
            crossAxisAlignment = flowMeasureLazyPolicy.crossAxisAlignment;
        }
        if ((i5 & 32) != 0) {
            f3 = flowMeasureLazyPolicy.crossAxisArrangementSpacing;
        }
        if ((i5 & 64) != 0) {
            i2 = flowMeasureLazyPolicy.itemCount;
        }
        if ((i5 & 128) != 0) {
            i3 = flowMeasureLazyPolicy.maxLines;
        }
        if ((i5 & 256) != 0) {
            i4 = flowMeasureLazyPolicy.maxItemsInMainAxis;
        }
        if ((i5 & 512) != 0) {
            flowLayoutOverflowState = flowMeasureLazyPolicy.overflow;
        }
        if ((i5 & 1024) != 0) {
            list = flowMeasureLazyPolicy.overflowComposables;
        }
        if ((i5 & 2048) != 0) {
            rVar = flowMeasureLazyPolicy.getComposable;
        }
        List list2 = list;
        r rVar2 = rVar;
        int i6 = i4;
        FlowLayoutOverflowState flowLayoutOverflowState2 = flowLayoutOverflowState;
        int i7 = i2;
        int i8 = i3;
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        float f4 = f3;
        return flowMeasureLazyPolicy.m2620copyE4Q9ldg(z, horizontal, vertical, f2, crossAxisAlignment2, f4, i7, i8, i6, flowLayoutOverflowState2, list2, rVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    public final MeasureResult m2619measure0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
        if (this.itemCount <= 0 || this.maxLines == 0 || this.maxItemsInMainAxis == 0 || (Constraints.m11106getMaxHeightimpl(j2) == 0 && this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible)) {
            return MeasureScope.CC.layout$default(subcomposeMeasureScope, 0, 0, null, new l() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ab.f48028a;
                }
            }, 4, null);
        }
        ContextualFlowItemIterator contextualFlowItemIterator = new ContextualFlowItemIterator(this.itemCount, new p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
                int iIntValue = ((Integer) obj).intValue();
                return subcomposeMeasureScope2.subcompose(Integer.valueOf(iIntValue), ComposableLambdaKt.composableLambdaInstance(-195060736, true, new p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda1
                    @Override // h.g.a.p
                    public final Object invoke(Object obj3, Object obj4) {
                        return FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$1$0(this.f$0, iIntValue, flowLineInfo, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }));
            }
        });
        this.overflow.setItemCount$foundation_layout(this.itemCount);
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = this;
        this.overflow.m2609setOverflowMeasurablesVKLhPVY$foundation_layout(flowMeasureLazyPolicy, j2, new p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda5
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$2(this.f$0, subcomposeMeasureScope, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
            }
        });
        return FlowLayoutKt.m2601breakDownItemsdi9J0FM(subcomposeMeasureScope, flowMeasureLazyPolicy, contextualFlowItemIterator, this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.m2724constructorimpl(j2, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab measure_0kLqBqw$lambda$1$0(FlowMeasureLazyPolicy flowMeasureLazyPolicy, int i2, FlowLineInfo flowLineInfo, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195060736, i3, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:486)");
            }
            flowMeasureLazyPolicy.getComposable.invoke(Integer.valueOf(i2), flowLineInfo, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final Measurable measure_0kLqBqw$lambda$2(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope, boolean z, int i2) {
        p<? super Composer, ? super Integer, ab> pVar = (p) i.S(flowMeasureLazyPolicy.overflowComposables, !z ? 1 : 0);
        if (pVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(flowMeasureLazyPolicy.itemCount);
        sb.append(i2);
        return (Measurable) i.S(subcomposeMeasureScope.subcompose(sb.toString(), pVar), 0);
    }

    public final boolean component1() {
        return this.isHorizontal;
    }

    public final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    public final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    public final CrossAxisAlignment component5() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-E4Q9ldg, reason: not valid java name */
    public final FlowMeasureLazyPolicy m2620copyE4Q9ldg(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List<? extends p<? super Composer, ? super Integer, ab>> list, r<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, ab> rVar) {
        return new FlowMeasureLazyPolicy(z, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, rVar, null);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public /* synthetic */ long mo2475createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z) {
        return FlowLineMeasurePolicy.CC.m2615$default$createConstraintsxF2OJ5Q(this, i2, i3, i4, i5, z);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ int crossAxisSize(Placeable placeable) {
        return FlowLineMeasurePolicy.CC.$default$crossAxisSize(this, placeable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasureLazyPolicy)) {
            return false;
        }
        FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy) obj;
        return this.isHorizontal == flowMeasureLazyPolicy.isHorizontal && x.n(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) && x.n(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) && Dp.m11169equalsimpl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) && x.n(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) && Dp.m11169equalsimpl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) && this.itemCount == flowMeasureLazyPolicy.itemCount && this.maxLines == flowMeasureLazyPolicy.maxLines && this.maxItemsInMainAxis == flowMeasureLazyPolicy.maxItemsInMainAxis && x.n(this.overflow, flowMeasureLazyPolicy.overflow) && x.n(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) && x.n(this.getComposable, flowMeasureLazyPolicy.getComposable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public /* synthetic */ int getCrossAxisPosition(Placeable placeable, int i2, LayoutDirection layoutDirection, int i3) {
        return FlowLineMeasurePolicy.CC.$default$getCrossAxisPosition(this, placeable, i2, layoutDirection, i3);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final p<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
        return new p() { // from class: androidx.compose.foundation.layout.FlowMeasureLazyPolicy$$ExternalSyntheticLambda2
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return this.f$0.m2619measure0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m11113unboximpl());
            }
        };
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return (((((((((((((((((((((FlowMeasureLazyPolicy$$ExternalSyntheticBackport0.m(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m11170hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + this.itemCount) * 31) + this.maxLines) * 31) + this.maxItemsInMainAxis) * 31) + this.overflow.hashCode()) * 31) + this.overflowComposables.hashCode()) * 31) + this.getComposable.hashCode();
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    public boolean isHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ int mainAxisSize(Placeable placeable) {
        return FlowLineMeasurePolicy.CC.$default$mainAxisSize(this, placeable);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7) {
        return FlowLineMeasurePolicy.CC.$default$placeHelper(this, placeableArr, measureScope, i2, iArr, i3, i4, iArr2, i5, i6, i7);
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy, androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public /* synthetic */ void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        FlowLineMeasurePolicy.CC.$default$populateMainAxisPositions(this, i2, iArr, iArr2, measureScope);
    }

    public String toString() {
        return "FlowMeasureLazyPolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) Dp.m11175toStringimpl(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m11175toStringimpl(this.crossAxisArrangementSpacing)) + ", itemCount=" + this.itemCount + ", maxLines=" + this.maxLines + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", overflow=" + this.overflow + ", overflowComposables=" + this.overflowComposables + ", getComposable=" + this.getComposable + ')';
    }

    public /* synthetic */ FlowMeasureLazyPolicy(boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f2, CrossAxisAlignment crossAxisAlignment, float f3, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState, List list, r rVar, o oVar) {
        this(z, horizontal, vertical, f2, crossAxisAlignment, f3, i2, i3, i4, flowLayoutOverflowState, list, rVar);
    }
}
