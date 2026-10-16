package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.l;
import h.h.a;
import h.i;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class NonAdaptiveButtonGroupMeasurePolicy implements MeasurePolicy {
    private final float expandedRatio;
    private final Arrangement.Horizontal horizontalArrangement;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NonAdaptiveButtonGroupMeasurePolicy(Arrangement.Horizontal horizontal, float f2) {
        this.horizontalArrangement = horizontal;
        this.expandedRatio = f2;
    }

    static final ab measure_3p2s80s$lambda$3(List list, MeasureScope measureScope, int[] iArr, int[] iArr2, Placeable.PlacementScope placementScope) {
        int i2;
        int i3;
        int i4;
        int i5;
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            LayoutDirection layoutDirection = measureScope.getLayoutDirection();
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                i2 = i6 + 1;
                if (i6 > 0) {
                    i3 = iArr[i6 - 1];
                    i4 = iArr[i6];
                    i5 = i3 - i4;
                }
                i5 = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new i();
                }
                i2 = i6 + 1;
                if (i6 < h.a.i.e(list)) {
                    i3 = iArr[i2];
                    i4 = iArr[i6];
                    i5 = i3 - i4;
                }
                i5 = 0;
            }
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i6), iArr2[i6] + i5, 0, 0.0f, 4, null);
            i6 = i2;
        }
        return ab.f48028a;
    }

    public final float getExpandedRatio() {
        return this.expandedRatio;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        long j3;
        float f2;
        Object obj;
        List<? extends Measurable> list2 = list;
        int i2 = measureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM());
        long j4 = i2;
        int size = list2.size();
        int[] iArr = new int[size];
        Constraints[] constraintsArr = new Constraints[size];
        int size2 = list2.size();
        ButtonGroupParentData[] buttonGroupParentDataArr = new ButtonGroupParentData[size2];
        int iJ = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            Object parentData = list2.get(i3).getParentData();
            ButtonGroupParentData buttonGroupParentData = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            if (buttonGroupParentData == null) {
                buttonGroupParentData = new ButtonGroupParentData(0.0f, null, null, 7, null);
            }
            buttonGroupParentDataArr[i3] = buttonGroupParentData;
        }
        int size3 = list2.size();
        Animatable[] animatableArr = new Animatable[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            animatableArr[i4] = buttonGroupParentDataArr[i4].getPressedAnimatable();
        }
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int i5 = 0;
        int i6 = 0;
        int iMin = 0;
        float f3 = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            Measurable measurable = list2.get(i7);
            float weight = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(measurable));
            if (weight > 0.0f) {
                f3 += weight;
                i5++;
            } else {
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2));
                constraintsArr[i7] = Constraints.m11094boximpl(Constraints.m11097copyZbe2FdA$default(j2, 0, n.h(iMaxIntrinsicWidth, 0), 0, 0, 12, null));
                iArr[i7] = iMaxIntrinsicWidth;
                iMin = Math.min(i2, n.h((iM11107getMaxWidthimpl - i6) - iMaxIntrinsicWidth, 0));
                i6 += iMaxIntrinsicWidth + iMin;
            }
        }
        if (i5 == 0) {
            i6 -= iMin;
        } else {
            long j5 = j4 * (i5 - 1);
            long jK = n.k(((iM11107getMaxWidthimpl != Integer.MAX_VALUE ? iM11107getMaxWidthimpl : iM11109getMinWidthimpl) - i6) - j5, 0L);
            float f4 = jK / f3;
            for (int i8 = 0; i8 < size; i8++) {
                jK -= Math.round(ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list2.get(i8))) * f4);
            }
            int i9 = 0;
            iJ = 0;
            while (i9 < size) {
                int i10 = iM11107getMaxWidthimpl - i6;
                if (constraintsArr[i9] == null) {
                    float weight2 = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list2.get(i9)));
                    long j6 = jK;
                    int iSignum = Long.signum(j6);
                    f2 = f4;
                    long j7 = j6 - iSignum;
                    int iMax = Math.max(0, Math.round(weight2 * f2) + iSignum);
                    constraintsArr[i9] = Constraints.m11094boximpl(Constraints.m11097copyZbe2FdA$default(j2, iMax != Integer.MAX_VALUE ? iMax : 0, iMax, 0, 0, 12, null));
                    iArr[i9] = iMax;
                    iJ += iMax;
                    j3 = j7;
                } else {
                    j3 = jK;
                    f2 = f4;
                }
                iJ = n.j((int) (iJ + j5), 0, i10);
                i9++;
                f4 = f2;
                jK = j3;
            }
        }
        int size4 = list2.size();
        int[] iArr2 = new int[size4];
        for (int i11 = 0; i11 < size4; i11++) {
            Constraints constraints = constraintsArr[i11];
            iArr2[i11] = Constraints.m11107getMaxWidthimpl(constraints != null ? constraints.m11113unboximpl() : j2);
        }
        int size5 = list2.size();
        final int[] iArr3 = new int[size5];
        for (int i12 = 0; i12 < size5; i12++) {
            iArr3[i12] = 0;
        }
        int i13 = 1;
        if (list2.size() > 1) {
            int size6 = list2.size();
            for (int i14 = 0; i14 < size6; i14++) {
                float fFloatValue = ((Number) animatableArr[i14].getValue()).floatValue() * this.expandedRatio * iArr2[i14];
                if (i14 <= 0 || i14 >= h.a.i.e(list2)) {
                    if (i14 == 0) {
                        iArr2[1] = iArr2[1] - a.b(fFloatValue);
                    } else {
                        int i15 = i14 - 1;
                        iArr2[i15] = iArr2[i15] - a.b(fFloatValue);
                    }
                    iArr3[i14] = a.b(fFloatValue);
                } else {
                    int i16 = i14 - 1;
                    float f5 = fFloatValue / 2.0f;
                    iArr3[i14] = a.b(f5);
                    iArr2[i16] = iArr2[i16] - a.b(f5);
                    int i17 = i14 + 1;
                    iArr2[i17] = iArr2[i17] - a.b(f5);
                }
                iArr2[i14] = iArr2[i14] + a.b(fFloatValue);
            }
        }
        ArrayList arrayList = new ArrayList(list2.size());
        int size7 = list2.size();
        int i18 = 0;
        while (i18 < size7) {
            ArrayList arrayList2 = arrayList;
            Measurable measurable2 = list2.get(i18);
            Constraints constraints2 = constraintsArr[i18];
            long jM11113unboximpl = constraints2 != null ? constraints2.m11113unboximpl() : j2;
            int i19 = iArr2[i18];
            arrayList2.add(measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(jM11113unboximpl, i19, i19, 0, 0, 12, null)));
            i18++;
            list2 = list;
            arrayList = arrayList;
        }
        final ArrayList arrayList3 = arrayList;
        int iMax2 = Math.max(n.h(i6 + iJ, 0), iM11109getMinWidthimpl);
        final int[] iArr4 = new int[size];
        this.horizontalArrangement.arrange(measureScope, iMax2, iArr, measureScope.getLayoutDirection(), iArr4);
        if (arrayList3.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = arrayList3.get(0);
            int height = ((Placeable) obj2).getHeight();
            int iE = h.a.i.e(arrayList3);
            if (iE > 0) {
                while (true) {
                    Object obj3 = arrayList3.get(i13);
                    int height2 = ((Placeable) obj3).getHeight();
                    int i20 = height < height2 ? height2 : height;
                    if (height < height2) {
                        obj2 = obj3;
                    }
                    if (i13 == iE) {
                        break;
                    }
                    i13++;
                    height = i20;
                }
            }
            obj = obj2;
        }
        Placeable placeable = (Placeable) obj;
        return MeasureScope.CC.layout$default(measureScope, iMax2, placeable != null ? placeable.getHeight() : Constraints.m11108getMinHeightimpl(j2), null, new l() { // from class: androidx.compose.material3.NonAdaptiveButtonGroupMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj4) {
                return NonAdaptiveButtonGroupMeasurePolicy.measure_3p2s80s$lambda$3(arrayList3, measureScope, iArr3, iArr4, (Placeable.PlacementScope) obj4);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
