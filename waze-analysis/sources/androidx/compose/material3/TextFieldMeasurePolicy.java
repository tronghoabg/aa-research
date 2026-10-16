package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
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
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final FloatProducer affixAlpha;
    private final TextFieldLabelPosition labelPosition;
    private final FloatProducer labelProgress;
    private final float minimizedLabelHalfHeight;
    private final PaddingValues paddingValues;
    private final FloatProducer placeholderAlpha;
    private final boolean singleLine;

    private TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f2) {
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.placeholderAlpha = floatProducer2;
        this.affixAlpha = floatProducer3;
        this.paddingValues = paddingValues;
        this.minimizedLabelHalfHeight = f2;
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m5811calculateHeightmKXJcVc(Density density, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2, boolean z, float f2) {
        int iMax;
        PaddingValues paddingValues = this.paddingValues;
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(paddingValues.mo2707calculateTopPaddingD9Ej5fM() + paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
        int iG = a.g(i2, i8, i6, i7, z ? 0 : MathHelpersKt.lerp(i3, 0, f2));
        if (i3 <= 0 || z) {
            iMax = 0;
        } else {
            float f3 = this.minimizedLabelHalfHeight;
            iMax = Math.max(density.mo2121roundToPx0680j_4(f3 + f3), MathHelpersKt.lerp(0, i3, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier().transform(f2)));
        }
        int i10 = iMo2121roundToPx0680j_4 + iMax + iG;
        if (true != z) {
            i3 = 0;
        }
        return ConstraintsKt.m11123constrainHeightK40F9xA(j2, i3 + Math.max(i4, Math.max(i5, i10)) + i9);
    }

    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private final int m5812calculateWidthyeHjK3Y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int i9 = i4 + i5;
        return ConstraintsKt.m11124constrainWidthK40F9xA(j2, i2 + Math.max(i6 + i9, Math.max(i8 + i9, i7)) + i3);
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i3;
        int iSubtractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int iSubtractConstraintSafely2;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable5;
        int iIntValue3;
        List<? extends IntrinsicMeasurable> list2;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        List<? extends IntrinsicMeasurable> list3 = list;
        int size = list3.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i5);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            i3 = i2;
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i3)).intValue();
        } else {
            i3 = i2;
            iSubtractConstraintSafely = i3;
            iIntValue = 0;
        }
        int size2 = list3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i6);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubtractConstraintSafely = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = pVar.invoke(intrinsicMeasurable9, Integer.valueOf(i3)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list3.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i7);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue4 = intrinsicMeasurable10 != null ? pVar.invoke(intrinsicMeasurable10, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int size4 = list3.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i8);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            int iIntValue5 = pVar.invoke(intrinsicMeasurable11, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            int iSubtractConstraintSafely3 = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = iIntValue5;
            iSubtractConstraintSafely2 = iSubtractConstraintSafely3;
        } else {
            iSubtractConstraintSafely2 = iSubtractConstraintSafely;
            i4 = 0;
        }
        int size5 = list3.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i9);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            iIntValue3 = pVar.invoke(intrinsicMeasurable12, Integer.valueOf(iSubtractConstraintSafely2)).intValue();
            iSubtractConstraintSafely2 = LayoutUtilKt.subtractConstraintSafely(iSubtractConstraintSafely2, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size6 = list3.size();
        int i10 = 0;
        while (i10 < size6) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i10);
            if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int iIntValue6 = pVar.invoke(intrinsicMeasurable13, Integer.valueOf(iSubtractConstraintSafely2)).intValue();
                int size7 = list3.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        list2 = list3;
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i11);
                    list2 = list3;
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                        break;
                    }
                    i11++;
                    list3 = list2;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue7 = intrinsicMeasurable14 != null ? pVar.invoke(intrinsicMeasurable14, Integer.valueOf(iSubtractConstraintSafely2)).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i12);
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                return textFieldMeasurePolicy.m5811calculateHeightmKXJcVc(intrinsicMeasureScope, iIntValue6, iIntValue4, iIntValue, iIntValue2, i4, iIntValue3, iIntValue7, intrinsicMeasurable15 != null ? pVar.invoke(intrinsicMeasurable15, Integer.valueOf(i3)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), textFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above, textFieldMeasurePolicy.labelProgress.invoke());
            }
            i10++;
            textFieldMeasurePolicy = this;
            list3 = list3;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
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
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
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
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
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
                    if (x.n(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), "Leading")) {
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
                return m5812calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? pVar.invoke(intrinsicMeasurable14, Integer.valueOf(i2)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    static final ab measure_3p2s80s$lambda$9(aq aqVar, boolean z, TextFieldMeasurePolicy textFieldMeasurePolicy, int i2, int i3, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f2, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int iMo2121roundToPx0680j_4;
        int i6;
        if (aqVar.f48105a != null) {
            if (z) {
                placementScope2 = placementScope;
                i6 = 0;
            } else {
                if (textFieldMeasurePolicy.singleLine) {
                    iMo2121roundToPx0680j_4 = Alignment.Companion.getCenterVertically().align(((Placeable) aqVar.f48105a).getHeight(), i2);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                    iMo2121roundToPx0680j_4 = i3 + placementScope2.mo2121roundToPx0680j_4(textFieldMeasurePolicy.minimizedLabelHalfHeight);
                }
                i6 = iMo2121roundToPx0680j_4;
            }
            int i7 = true != z ? i3 : 0;
            Placeable placeable9 = (Placeable) aqVar.f48105a;
            textFieldMeasurePolicy.placeWithLabel(placementScope2, i4, i5, placeable, placeable9, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, i6, i7, z, f2, textFieldMeasurePolicy.placeholderAlpha, textFieldMeasurePolicy.affixAlpha, i3 + (z ? 0 : placeable9.getHeight()), measureScope.getLayoutDirection());
        } else {
            textFieldMeasurePolicy.placeWithoutLabel(placementScope, i4, i5, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, textFieldMeasurePolicy.placeholderAlpha, textFieldMeasurePolicy.affixAlpha, placementScope.getDensity());
        }
        return ab.f48028a;
    }

    private final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, int i4, int i5, boolean z, float f2, final FloatProducer floatProducer, final FloatProducer floatProducer2, int i6, LayoutDirection layoutDirection) {
        int height = z ? placeable2.getHeight() : 0;
        int i7 = height + i6;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, height, 0.0f, 4, null);
        int heightOrZero = (i3 - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? placeable2.getHeight() : 0);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, height + Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        int iLerp = MathHelpersKt.lerp(i4, i5, f2);
        if (z) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), i2, layoutDirection), iLerp, 0.0f, 4, null);
        } else {
            int widthOrZero = layoutDirection == LayoutDirection.Ltr ? LayoutUtilKt.getWidthOrZero(placeable4) : LayoutUtilKt.getWidthOrZero(placeable5);
            Placeable.PlacementScope.place$default(placementScope, placeable2, MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable2.getWidth(), (i2 - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), (i2 - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, f2), iLerp, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable6, LayoutUtilKt.getWidthOrZero(placeable4), i7, 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithLabel$lambda$0(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable4) + LayoutUtilKt.getWidthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero2, i7, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable3, widthOrZero2, i7, 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithLabel$lambda$1(floatProducer, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable7, (i2 - LayoutUtilKt.getWidthOrZero(placeable5)) - placeable7.getWidth(), i7, 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithLabel$lambda$2(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero) + height, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, height + heightOrZero, 0.0f, 4, null);
        }
    }

    static final ab placeWithLabel$lambda$0(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab placeWithLabel$lambda$1(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab placeWithLabel$lambda$2(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    private final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, final FloatProducer floatProducer, final FloatProducer floatProducer2, float f2) {
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m11307getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i3 - LayoutUtilKt.getHeightOrZero(placeable8);
        int iB = h.h.a.b(this.paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable5, LayoutUtilKt.getWidthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iB, placeable5), 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithoutLabel$lambda$0(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable5) + LayoutUtilKt.getWidthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iB, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iB, placeable2), 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithoutLabel$lambda$1(floatProducer, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable6, (i2 - LayoutUtilKt.getWidthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, iB, placeable6), 0.0f, new l() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda7
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldMeasurePolicy.placeWithoutLabel$lambda$2(floatProducer2, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(TextFieldMeasurePolicy textFieldMeasurePolicy, int i2, int i3, Placeable placeable) {
        return textFieldMeasurePolicy.singleLine ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2) : i3;
    }

    static final ab placeWithoutLabel$lambda$0(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab placeWithoutLabel$lambda$1(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    static final ab placeWithoutLabel$lambda$2(FloatProducer floatProducer, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(floatProducer.invoke());
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda10
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.ui.layout.MeasureResult mo1704measure3p2s80s(final androidx.compose.ui.layout.MeasureScope r50, java.util.List<? extends androidx.compose.ui.layout.Measurable> r51, long r52) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldMeasurePolicy.mo1704measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda9
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new p() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            }
        });
    }

    public /* synthetic */ TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, FloatProducer floatProducer2, FloatProducer floatProducer3, PaddingValues paddingValues, float f2, o oVar) {
        this(z, textFieldLabelPosition, floatProducer, floatProducer2, floatProducer3, paddingValues, f2);
    }
}
