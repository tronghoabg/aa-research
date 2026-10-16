package androidx.compose.material;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpSize;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MinimumInteractiveComponentSizeModifier implements LayoutModifier {
    private final long size;

    private MinimumInteractiveComponentSizeModifier(long j2) {
        this.size = j2;
    }

    static final ab measure_3p2s80s$lambda$0(int i2, Placeable placeable, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, a.b((i2 - placeable.getWidth()) / 2.0f), a.b((i3 - placeable.getHeight()) / 2.0f), 0.0f, 4, null);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(l lVar) {
        return Modifier.Element.CC.$default$all(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(l lVar) {
        return Modifier.Element.CC.$default$any(this, lVar);
    }

    public boolean equals(Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier = obj instanceof MinimumInteractiveComponentSizeModifier ? (MinimumInteractiveComponentSizeModifier) obj : null;
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return DpSize.m11259equalsimpl0(this.size, minimumInteractiveComponentSizeModifier.size);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, p pVar) {
        return Modifier.Element.CC.$default$foldIn(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, p pVar) {
        return Modifier.Element.CC.$default$foldOut(this, obj, pVar);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name */
    public final long m4119getSizeMYxV2XQ() {
        return this.size;
    }

    public int hashCode() {
        return DpSize.m11264hashCodeimpl(this.size);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo3273measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
        final int iMax = Math.max(placeableMo9741measureBRTryo0.getWidth(), measureScope.mo2121roundToPx0680j_4(DpSize.m11262getWidthD9Ej5fM(this.size)));
        final int iMax2 = Math.max(placeableMo9741measureBRTryo0.getHeight(), measureScope.mo2121roundToPx0680j_4(DpSize.m11260getHeightD9Ej5fM(this.size)));
        return MeasureScope.CC.layout$default(measureScope, iMax, iMax2, null, new l() { // from class: androidx.compose.material.MinimumInteractiveComponentSizeModifier$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MinimumInteractiveComponentSizeModifier.measure_3p2s80s$lambda$0(iMax, placeableMo9741measureBRTryo0, iMax2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return LayoutModifier.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j2, o oVar) {
        this(j2);
    }
}
