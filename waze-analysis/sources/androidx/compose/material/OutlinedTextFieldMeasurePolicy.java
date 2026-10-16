package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.internal.LayoutUtilKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final l<Size, ab> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(l<? super Size, ab> lVar, boolean z, float f2, PaddingValues paddingValues) {
        this.onLabelMeasured = lVar;
        this.singleLine = z;
        this.animationProgress = f2;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iSubtractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable4;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i3 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i3);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i3++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue();
        } else {
            iSubtractConstraintSafely = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i4);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i5);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int iIntValue3 = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(MathHelpersKt.lerp(iSubtractConstraintSafely, i2, this.animationProgress))).intValue() : 0;
        int size4 = list2.size();
        for (int i6 = 0; i6 < size4; i6++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i6);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int iIntValue4 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(iSubtractConstraintSafely)).intValue();
                int size5 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i7);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                return OutlinedTextFieldKt.m4141calculateHeightO3s9Psw(iIntValue, iIntValue2, iIntValue4, iIntValue3, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable5 = list.get(i3);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int iIntValue = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue();
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i4 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i4);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable6 != null ? pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2)).intValue() : 0;
                int size3 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i5);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i2)).intValue() : 0;
                int size4 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i6);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable8 != null ? pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue() : 0;
                int size5 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i7);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                return OutlinedTextFieldKt.m4142calculateWidthO3s9Psw(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    static final ab measure_3p2s80s$lambda$7(int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        OutlinedTextFieldKt.place(placementScope, i2, i3, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope.getDensity(), measureScope.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        Measurable measurable3;
        long jM8058getZeroNHjbRc;
        Measurable measurable4;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        MeasureScope measureScope2 = measureScope;
        int i2 = measureScope2.mo2121roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i3);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i3++;
        }
        Measurable measurable5 = measurable;
        Placeable placeableMo9741measureBRTryo0 = measurable5 != null ? measurable5.mo9741measureBRTryo0(jM11097copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo0);
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i4);
            if (x.n(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i4++;
        }
        Measurable measurable6 = measurable2;
        Placeable placeableMo9741measureBRTryo02 = measurable6 != null ? measurable6.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo02);
        int i5 = measureScope2.mo2121roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo2705calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo2121roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo2706calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i6 = -i2;
        int i7 = -iWidthOrZero2;
        long jM11126offsetNN6EwU = ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, MathHelpersKt.lerp(i7 - i5, -i5, outlinedTextFieldMeasurePolicy.animationProgress), i6);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i8);
            if (x.n(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i8++;
        }
        Measurable measurable7 = measurable3;
        final Placeable placeableMo9741measureBRTryo03 = measurable7 != null ? measurable7.mo9741measureBRTryo0(jM11126offsetNN6EwU) : null;
        if (placeableMo9741measureBRTryo03 != null) {
            jM8058getZeroNHjbRc = (Float.floatToRawIntBits(placeableMo9741measureBRTryo03.getHeight()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(placeableMo9741measureBRTryo03.getWidth()) << 32);
        } else {
            jM8058getZeroNHjbRc = Size.Companion.m8058getZeroNHjbRc();
        }
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m8037boximpl(jM8058getZeroNHjbRc));
        long j3 = j2;
        long jM11097copyZbe2FdA$default2 = Constraints.m11097copyZbe2FdA$default(ConstraintsKt.m11126offsetNN6EwU(j3, i7, i6 - Math.max(TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo03) / 2, measureScope2.mo2121roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo2707calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        int size4 = list2.size();
        int i9 = 0;
        while (i9 < size4) {
            Measurable measurable8 = list.get(i9);
            if (x.n(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                Placeable placeableMo9741measureBRTryo04 = measurable8.mo9741measureBRTryo0(jM11097copyZbe2FdA$default2);
                long jM11097copyZbe2FdA$default3 = Constraints.m11097copyZbe2FdA$default(jM11097copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list.get(i10);
                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i10++;
                }
                Measurable measurable9 = measurable4;
                final Placeable placeableMo9741measureBRTryo05 = measurable9 != null ? measurable9.mo9741measureBRTryo0(jM11097copyZbe2FdA$default3) : null;
                int iM4142calculateWidthO3s9Psw = OutlinedTextFieldKt.m4142calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo02), placeableMo9741measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j3, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int iM4141calculateHeightO3s9Psw = OutlinedTextFieldKt.m4141calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo02), placeableMo9741measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo03), TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo05), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int size6 = list2.size();
                int i11 = 0;
                while (i11 < size6) {
                    Measurable measurable10 = list.get(i11);
                    if (x.n(LayoutIdKt.getLayoutId(measurable10), OutlinedTextFieldKt.BorderId)) {
                        final Placeable placeableMo9741measureBRTryo06 = measurable10.mo9741measureBRTryo0(ConstraintsKt.Constraints(iM4142calculateWidthO3s9Psw != Integer.MAX_VALUE ? iM4142calculateWidthO3s9Psw : 0, iM4142calculateWidthO3s9Psw, iM4141calculateHeightO3s9Psw != Integer.MAX_VALUE ? iM4141calculateHeightO3s9Psw : 0, iM4141calculateHeightO3s9Psw));
                        final int i12 = iM4141calculateHeightO3s9Psw;
                        final Placeable placeable = placeableMo9741measureBRTryo02;
                        final Placeable placeable2 = placeableMo9741measureBRTryo04;
                        final int i13 = iM4142calculateWidthO3s9Psw;
                        final Placeable placeable3 = placeableMo9741measureBRTryo0;
                        return MeasureScope.CC.layout$default(measureScope, i13, i12, null, new l() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda2
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return OutlinedTextFieldMeasurePolicy.measure_3p2s80s$lambda$7(i12, i13, placeable3, placeable, placeable2, placeableMo9741measureBRTryo03, placeableMo9741measureBRTryo05, placeableMo9741measureBRTryo06, outlinedTextFieldMeasurePolicy, measureScope, (Placeable.PlacementScope) obj);
                            }
                        }, 4, null);
                    }
                    i11++;
                    outlinedTextFieldMeasurePolicy = this;
                    iM4142calculateWidthO3s9Psw = iM4142calculateWidthO3s9Psw;
                    placeableMo9741measureBRTryo04 = placeableMo9741measureBRTryo04;
                    placeableMo9741measureBRTryo02 = placeableMo9741measureBRTryo02;
                    iM4141calculateHeightO3s9Psw = iM4141calculateHeightO3s9Psw;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new e();
            }
            i9++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            j3 = j2;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }
}
