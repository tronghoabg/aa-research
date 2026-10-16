package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import h.ab;
import h.b.a;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final FloatProducer affixAlpha;
    private final float horizontalIconPadding;
    private final TextFieldLabelPosition labelPosition;
    private final FloatProducer labelProgress;
    private final l<Size, ab> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final FloatProducer placeholderAlpha;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    private OutlinedTextFieldMeasurePolicy(l<? super Size, ab> lVar, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f2) {
        this.onLabelMeasured = lVar;
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.placeholderAlpha = floatProducer2;
        this.affixAlpha = floatProducer3;
        this.paddingValues = paddingValues;
        this.horizontalIconPadding = f2;
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m5357calculateHeightmKXJcVc(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2, boolean z, float f2) {
        int iG = a.g(i6, i8, i4, i5, z ? 0 : MathHelpersKt.lerp(i7, 0, f2));
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(this.paddingValues.mo2707calculateTopPaddingD9Ej5fM());
        if (!z) {
            fMo2127toPx0680j_4 = MathHelpersKt.lerp(fMo2127toPx0680j_4, Math.max(fMo2127toPx0680j_4, i7 / 2.0f), f2);
        }
        float fMo2127toPx0680j_42 = fMo2127toPx0680j_4 + iG + density.mo2127toPx0680j_4(this.paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        if (true != z) {
            i7 = 0;
        }
        return ConstraintsKt.m11123constrainHeightK40F9xA(j2, i7 + Math.max(i2, Math.max(i3, h.h.a.b(fMo2127toPx0680j_42))) + i9);
    }

    /* renamed from: calculateWidth-IzADHW4, reason: not valid java name */
    private final int m5358calculateWidthIzADHW4(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, float f2) {
        int i9 = i4 + i5;
        return ConstraintsKt.m11124constrainWidthK40F9xA(j2, Math.max(i2 + Math.max(i6 + i9, Math.max(i8 + i9, MathHelpersKt.lerp(i7, 0, f2))) + i3, h.h.a.b((i7 + density.mo2127toPx0680j_4(this.paddingValues.mo2705calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + this.paddingValues.mo2706calculateRightPaddingu2uoSUM(LayoutDirection.Ltr))) * f2)));
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubtractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable5;
        int iIntValue4;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        int i4;
        int i5;
        int i6;
        int iIntValue5;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        float fInvoke = outlinedTextFieldMeasurePolicy.labelProgress.invoke();
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i7);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
        } else {
            iSubtractConstraintSafely = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i8);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(intrinsicMeasurable9, Integer.valueOf(i2)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i9);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue6 = intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(MathHelpersKt.lerp(iSubtractConstraintSafely, i2, fInvoke))).intValue() : 0;
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i10);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            iIntValue3 = pVar.invoke(intrinsicMeasurable11, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i11);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            iIntValue4 = pVar.invoke(intrinsicMeasurable12, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i12 = 0;
        while (i12 < size6) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i12);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int iIntValue7 = pVar.invoke(intrinsicMeasurable13, Integer.valueOf(iSubtractConstraintSafely)).intValue();
                int size7 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        i3 = iIntValue7;
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i13);
                    i3 = iIntValue7;
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                        break;
                    }
                    i13++;
                    iIntValue7 = i3;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue8 = intrinsicMeasurable14 != null ? pVar.invoke(intrinsicMeasurable14, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
                int size8 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i14);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                if (intrinsicMeasurable15 != null) {
                    i4 = iIntValue3;
                    i5 = iIntValue8;
                    i6 = iIntValue;
                    iIntValue5 = pVar.invoke(intrinsicMeasurable15, Integer.valueOf(i2)).intValue();
                } else {
                    i4 = iIntValue3;
                    i5 = iIntValue8;
                    i6 = iIntValue;
                    iIntValue5 = 0;
                }
                return outlinedTextFieldMeasurePolicy.m5357calculateHeightmKXJcVc(intrinsicMeasureScope, i6, iIntValue2, i4, iIntValue4, i3, iIntValue6, i5, iIntValue5, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), outlinedTextFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above, fInvoke);
            }
            i12++;
            iIntValue6 = iIntValue6;
            outlinedTextFieldMeasurePolicy = this;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i3);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), "TextField")) {
                int iIntValue = pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i2)).intValue();
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i4 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i4);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue() : 0;
                int size3 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i5);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? pVar.invoke(intrinsicMeasurable9, Integer.valueOf(i2)).intValue() : 0;
                int size4 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i6);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0;
                int size5 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i7);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? pVar.invoke(intrinsicMeasurable11, Integer.valueOf(i2)).intValue() : 0;
                int size6 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i8);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? pVar.invoke(intrinsicMeasurable12, Integer.valueOf(i2)).intValue() : 0;
                int size7 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i9);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return m5358calculateWidthIzADHW4(intrinsicMeasureScope, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? pVar.invoke(intrinsicMeasurable14, Integer.valueOf(i2)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.labelProgress.invoke());
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    static final ab measure_3p2s80s$lambda$11(OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, aq aqVar, Placeable placeable6, Placeable placeable7, Placeable placeable8, MeasureScope measureScope, boolean z, float f2, Placeable.PlacementScope placementScope) {
        outlinedTextFieldMeasurePolicy.place(placementScope, i2, i3, placeable, placeable2, placeable3, placeable4, placeable5, (Placeable) aqVar.f48105a, placeable6, placeable7, placeable8, outlinedTextFieldMeasurePolicy.placeholderAlpha, outlinedTextFieldMeasurePolicy.affixAlpha, placementScope.getDensity(), measureScope.getLayoutDirection(), z, f2, placementScope.mo2127toPx0680j_4(outlinedTextFieldMeasurePolicy.horizontalIconPadding));
        return ab.f48028a;
    }

    private final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, final FloatProducer floatProducer, final FloatProducer floatProducer2, float f2, LayoutDirection layoutDirection, boolean z, float f3, float f4) {
        int i4;
        int i5;
        int i6;
        int heightOrZero = z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        int heightOrZero2 = (i2 - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0);
        int iB = h.h.a.b(this.paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f2);
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, heightOrZero + Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            int iLerp = MathHelpersKt.lerp(z ? 0 : this.singleLine ? Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), heightOrZero2) : iB, z ? 0 : -(placeable6.getHeight() / 2), f3);
            if (z) {
                Placeable.PlacementScope.place$default(placementScope, placeable6, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i3, layoutDirection), iLerp, 0.0f, 4, null);
            } else {
                float fCalculateStartPadding = PaddingKt.calculateStartPadding(this.paddingValues, layoutDirection) * f2;
                float fCalculateEndPadding = PaddingKt.calculateEndPadding(this.paddingValues, layoutDirection) * f2;
                float width = placeable == null ? fCalculateStartPadding : placeable.getWidth() + n.e(fCalculateStartPadding - f4, 0.0f);
                float width2 = placeable2 == null ? fCalculateEndPadding : placeable2.getWidth() + n.e(fCalculateEndPadding - f4, 0.0f);
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                Placeable.PlacementScope.place$default(placementScope, placeable6, h.h.a.b(MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable6.getWidth(), i3 - h.h.a.b(width + width2), layoutDirection) + (layoutDirection == layoutDirection2 ? width : width2), TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i3 - h.h.a.b(fCalculateStartPadding + fCalculateEndPadding), layoutDirection) + (layoutDirection == layoutDirection2 ? fCalculateStartPadding : fCalculateEndPadding), f3)), iLerp, 0.0f, 4, null);
            }
        }
        if (placeable3 != null) {
            i4 = heightOrZero2;
            i5 = iB;
            i6 = heightOrZero;
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable3, LayoutUtilKt.getWidthOrZero(placeable), place$calculateVerticalPosition(i6, this, i4, i5, placeable6, placeable3), 0.0f, new l() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return OutlinedTextFieldMeasurePolicy.place$lambda$1(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        } else {
            i4 = heightOrZero2;
            i5 = iB;
            i6 = heightOrZero;
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable) + LayoutUtilKt.getWidthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero, place$calculateVerticalPosition(i6, this, i4, i5, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable7, widthOrZero, place$calculateVerticalPosition(i6, this, i4, i5, placeable6, placeable7), 0.0f, new l() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return OutlinedTextFieldMeasurePolicy.place$lambda$2(floatProducer, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable4, (i3 - LayoutUtilKt.getWidthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(i6, this, i4, i5, placeable6, placeable4), 0.0f, new l() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return OutlinedTextFieldMeasurePolicy.place$lambda$3(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), i6 + Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i4), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i6 + i4, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(int i2, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i3, int i4, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.singleLine) {
            i4 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
        }
        int i5 = i2 + i4;
        return outlinedTextFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above ? i5 : Math.max(i5, LayoutUtilKt.getHeightOrZero(placeable) / 2);
    }

    static final ab place$lambda$1(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab place$lambda$2(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab place$lambda$3(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.MeasureResult mo1704measure3p2s80s(final androidx.compose.ui.layout.MeasureScope r51, java.util.List<? extends androidx.compose.ui.layout.Measurable> r52, long r53) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.mo1704measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda7
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    public /* synthetic */ OutlinedTextFieldMeasurePolicy(l lVar, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f2, o oVar) {
        this(lVar, z, textFieldLabelPosition, floatProducer, floatProducer2, floatProducer3, paddingValues, f2);
    }
}
