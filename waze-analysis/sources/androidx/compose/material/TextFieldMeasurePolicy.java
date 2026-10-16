package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f2, PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f2;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i3;
        int iIntValue;
        int iSubtractConstraintSafely;
        IntrinsicMeasurable intrinsicMeasurable3;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable4;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i4 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i4 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i4);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i3 = i2;
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i3)).intValue();
        } else {
            i3 = i2;
            iIntValue = 0;
            iSubtractConstraintSafely = i3;
        }
        int size2 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i5);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i3)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i6);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int iIntValue3 = intrinsicMeasurable7 != null ? pVar.invoke(intrinsicMeasurable7, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int size4 = list2.size();
        for (int i7 = 0; i7 < size4; i7++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i7);
            if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int iIntValue4 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(iSubtractConstraintSafely)).intValue();
                int size5 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i8);
                    if (x.n(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                return TextFieldKt.m4270calculateHeightO3s9Psw(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
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
                return TextFieldKt.m4271calculateWidthVsPV1Ek(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    static final ab measure_3p2s80s$lambda$6(Placeable placeable, int i2, int i3, int i4, int i5, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i6, int i7, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            TextFieldKt.placeWithLabel(placementScope, i4, i5, placeable2, placeable, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, n.h(i2 - i3, 0), i6 + i7, textFieldMeasurePolicy.animationProgress, measureScope.getDensity());
        } else {
            TextFieldKt.placeWithoutLabel(placementScope, i4, i5, placeable2, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, measureScope.getDensity(), textFieldMeasurePolicy.paddingValues);
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new p() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        int i2;
        Measurable measurable3;
        final int height;
        Measurable measurable4;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        final int i3 = measureScope2.mo2121roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo2707calculateTopPaddingD9Ej5fM());
        int i4 = measureScope2.mo2121roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        final int i5 = measureScope2.mo2121roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i6);
            if (x.n(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i6++;
        }
        Measurable measurable5 = measurable;
        Placeable placeableMo9741measureBRTryo0 = measurable5 != null ? measurable5.mo9741measureBRTryo0(jM11097copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo0);
        int size2 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i7);
            if (x.n(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i7++;
        }
        Measurable measurable6 = measurable2;
        Placeable placeableMo9741measureBRTryo02 = measurable6 != null ? measurable6.mo9741measureBRTryo0(ConstraintsKt.m11127offsetNN6EwU$default(jM11097copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int i8 = -i4;
        int i9 = -(iWidthOrZero + TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo02));
        long jM11126offsetNN6EwU = ConstraintsKt.m11126offsetNN6EwU(jM11097copyZbe2FdA$default, i9, i8);
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                i2 = i4;
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i10);
            i2 = i4;
            if (x.n(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i10++;
            i4 = i2;
        }
        Measurable measurable7 = measurable3;
        Placeable placeableMo9741measureBRTryo03 = measurable7 != null ? measurable7.mo9741measureBRTryo0(jM11126offsetNN6EwU) : null;
        if (placeableMo9741measureBRTryo03 != null) {
            height = placeableMo9741measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (height == Integer.MIN_VALUE) {
                height = placeableMo9741measureBRTryo03.getHeight();
            }
        } else {
            height = 0;
        }
        final int iMax = Math.max(height, i3);
        boolean z = placeableMo9741measureBRTryo03 == null;
        final Placeable placeable = placeableMo9741measureBRTryo02;
        long jM11126offsetNN6EwU2 = ConstraintsKt.m11126offsetNN6EwU(Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null), i9, placeableMo9741measureBRTryo03 != null ? (i8 - i5) - iMax : (-i3) - i2);
        int size4 = list2.size();
        int i11 = 0;
        while (i11 < size4) {
            Measurable measurable8 = list.get(i11);
            final Placeable placeable2 = placeableMo9741measureBRTryo03;
            if (x.n(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                final Placeable placeableMo9741measureBRTryo04 = measurable8.mo9741measureBRTryo0(jM11126offsetNN6EwU2);
                long jM11097copyZbe2FdA$default2 = Constraints.m11097copyZbe2FdA$default(jM11126offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list.get(i12);
                    if (x.n(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i12++;
                }
                Measurable measurable9 = measurable4;
                final Placeable placeableMo9741measureBRTryo05 = measurable9 != null ? measurable9.mo9741measureBRTryo0(jM11097copyZbe2FdA$default2) : null;
                final int iM4271calculateWidthVsPV1Ek = TextFieldKt.m4271calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo0), TextFieldImplKt.widthOrZero(placeable), placeableMo9741measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeableMo9741measureBRTryo05), j2);
                final int iM4270calculateHeightO3s9Psw = TextFieldKt.m4270calculateHeightO3s9Psw(placeableMo9741measureBRTryo04.getHeight(), !z, iMax, TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo0), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeableMo9741measureBRTryo05), j2, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                final Placeable placeable3 = placeableMo9741measureBRTryo0;
                return MeasureScope.CC.layout$default(measureScope, iM4271calculateWidthVsPV1Ek, iM4270calculateHeightO3s9Psw, null, new l() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TextFieldMeasurePolicy.measure_3p2s80s$lambda$6(placeable2, i3, height, iM4271calculateWidthVsPV1Ek, iM4270calculateHeightO3s9Psw, placeableMo9741measureBRTryo04, placeableMo9741measureBRTryo05, placeable3, placeable, textFieldMeasurePolicy, iMax, i5, measureScope2, (Placeable.PlacementScope) obj);
                    }
                }, 4, null);
            }
            i11++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            placeableMo9741measureBRTryo03 = placeable2;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda2
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new p() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }
}
