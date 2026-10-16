package com.waze.sharedrive.g;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ba implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f38685a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Measurer2 f38686b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f38687c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableState f38688d;

    public ba(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, MutableState mutableState2) {
        this.f38685a = mutableState;
        this.f38686b = measurer2;
        this.f38687c = constraintSetForInlineDsl;
        this.f38688d = mutableState2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f38685a.getValue();
        ConstraintSetForInlineDsl constraintSetForInlineDsl = this.f38687c;
        Measurer2 measurer2 = this.f38686b;
        long jM11569performMeasureDjhGOtQ = measurer2.m11569performMeasureDjhGOtQ(j2, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, 257);
        this.f38688d.getValue();
        return MeasureScope.CC.layout$default(measureScope, IntSize.m11339getWidthimpl(jM11569performMeasureDjhGOtQ), IntSize.m11338getHeightimpl(jM11569performMeasureDjhGOtQ), null, new az(measurer2, list, linkedHashMap), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
