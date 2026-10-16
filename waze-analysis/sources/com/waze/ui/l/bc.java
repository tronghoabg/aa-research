package com.waze.ui.l;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintSet;
import androidx.constraintlayout.compose.Measurer2;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableState f42568a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Measurer2 f42569b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ConstraintSet f42570c;

    public bc(MutableState mutableState, Measurer2 measurer2, ConstraintSet constraintSet) {
        this.f42568a = mutableState;
        this.f42569b = measurer2;
        this.f42570c = constraintSet;
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
        this.f42568a.getValue();
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        ConstraintSet constraintSet = this.f42570c;
        Measurer2 measurer2 = this.f42569b;
        long jM11569performMeasureDjhGOtQ = measurer2.m11569performMeasureDjhGOtQ(j2, layoutDirection, constraintSet, list, linkedHashMap, 257);
        return MeasureScope.CC.layout$default(measureScope, IntSize.m11339getWidthimpl(jM11569performMeasureDjhGOtQ), IntSize.m11338getHeightimpl(jM11569performMeasureDjhGOtQ), null, new bb(measurer2, list, linkedHashMap), 4, null);
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
