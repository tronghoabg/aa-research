package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.c;
import h.ab;
import h.g.a.l;
import h.g.b.ao;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import h.i;
import h.k.j;
import h.k.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ButtonGroupMeasurePolicy implements MultiContentMeasurePolicy {
    private final float expandedRatio;
    private final Arrangement.Horizontal horizontalArrangement;
    private final ButtonGroupOverflowState overflowState;
    private final Alignment.Vertical verticalAlignment;

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

    public /* synthetic */ ButtonGroupMeasurePolicy(ButtonGroupOverflowState buttonGroupOverflowState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, float f2, int i2, o oVar) {
        this(buttonGroupOverflowState, horizontal, (i2 & 4) != 0 ? Alignment.Companion.getTop() : vertical, f2);
    }

    static final ab measure_3p2s80s$lambda$4(List list, MeasureScope measureScope, int[] iArr, List list2, int i2, ButtonGroupMeasurePolicy buttonGroupMeasurePolicy, int[] iArr2, List list3, ao aoVar, Placeable.PlacementScope placementScope) {
        int i3;
        int i4;
        int i5;
        List list4;
        int i6;
        Alignment.Vertical alignment;
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            LayoutDirection layoutDirection = measureScope.getLayoutDirection();
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                i3 = i7 + 1;
                if (i7 > 0) {
                    i4 = iArr[i7 - 1];
                    i5 = iArr[i7];
                    i6 = i4 - i5;
                    list4 = list2;
                }
                list4 = list2;
                i6 = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new i();
                }
                i3 = i7 + 1;
                if (i7 < h.a.i.e(list)) {
                    i4 = iArr[i3];
                    i5 = iArr[i7];
                    i6 = i4 - i5;
                    list4 = list2;
                }
                list4 = list2;
                i6 = 0;
            }
            Object parentData = ((Measurable) list4.get(i7)).getParentData();
            ButtonGroupParentData buttonGroupParentData = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i7), iArr2[i7] + i6, (buttonGroupParentData == null || (alignment = buttonGroupParentData.getAlignment()) == null) ? buttonGroupMeasurePolicy.verticalAlignment.align(((Placeable) list.get(i7)).getHeight(), i2) : alignment.align(((Placeable) list.get(i7)).getHeight(), i2), 0.0f, 4, null);
            i7 = i3;
        }
        if (list3 != null) {
            int size2 = list3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Placeable placeable = (Placeable) list3.get(i8);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, aoVar.f48103a, buttonGroupMeasurePolicy.verticalAlignment.align(placeable.getHeight(), i2), 0.0f, 4, null);
            }
        }
        return ab.f48028a;
    }

    public final float getExpandedRatio() {
        return this.expandedRatio;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final ButtonGroupOverflowState getOverflowState() {
        return this.overflowState;
    }

    public final Alignment.Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2625measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        Object buttonGroupParentData;
        List<? extends Measurable> list2;
        Animatable[] animatableArr;
        long j3;
        List<? extends Measurable> list3;
        Integer numValueOf;
        int[] iArr;
        int i2;
        ao aoVar;
        final ArrayList arrayList;
        int i3;
        int[] iArrCopyOfRange;
        final List<? extends Measurable> list4 = list.get(0);
        List<? extends Measurable> list5 = list.get(1);
        this.overflowState.setTotalItemCount(list4.size());
        int i4 = measureScope.mo2121roundToPx0680j_4(this.horizontalArrangement.mo2446getSpacingD9Ej5fM());
        long j4 = i4;
        int size = list4.size();
        final ArrayList arrayList2 = new ArrayList();
        int[] iArr2 = new int[size];
        Constraints[] constraintsArr = new Constraints[size];
        int size2 = list4.size();
        ButtonGroupParentData[] buttonGroupParentDataArr = new ButtonGroupParentData[size2];
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                break;
            }
            Object parentData = list4.get(i5).getParentData();
            buttonGroupParentData = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            if (buttonGroupParentData == null) {
                buttonGroupParentData = new ButtonGroupParentData(0.0f, null, null, 7, null);
            }
            buttonGroupParentDataArr[i5] = buttonGroupParentData;
            i5++;
        }
        int size3 = list4.size();
        Animatable[] animatableArr2 = new Animatable[size3];
        for (int i6 = 0; i6 < size3; i6++) {
            animatableArr2[i6] = buttonGroupParentDataArr[i6].getPressedAnimatable();
        }
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        int i7 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            Measurable measurable = list4.get(i8);
            float weight = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(measurable));
            if (weight > 0.0f) {
                f2 += weight;
                i7++;
            } else {
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2));
                constraintsArr[i8] = Constraints.m11094boximpl(Constraints.m11097copyZbe2FdA$default(j2, 0, n.h(iMaxIntrinsicWidth, 0), 0, 0, 12, null));
                iArr2[i8] = iMaxIntrinsicWidth;
                iMin += iMaxIntrinsicWidth + Math.min(i4, n.h((iM11107getMaxWidthimpl - iMin) - iMaxIntrinsicWidth, 0));
            }
        }
        if (i7 == 0) {
            list2 = list5;
        } else {
            list2 = list5;
            long j5 = j4 * (i7 - 1);
            long jK = n.k(((iM11107getMaxWidthimpl != Integer.MAX_VALUE ? iM11107getMaxWidthimpl : iM11109getMinWidthimpl) - iMin) - j5, 0L);
            float f3 = jK / f2;
            for (int i9 = 0; i9 < size; i9++) {
                jK -= Math.round(ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list4.get(i9))) * f3);
            }
            int i10 = 0;
            int iJ = 0;
            while (i10 < size) {
                long j6 = jK;
                int i11 = iM11107getMaxWidthimpl - iMin;
                if (constraintsArr[i10] == null) {
                    float weight2 = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list4.get(i10)));
                    int iSignum = Long.signum(j6);
                    j3 = j5;
                    long j7 = j6 - iSignum;
                    animatableArr = animatableArr2;
                    int iMax = Math.max(0, Math.round(f3 * weight2) + iSignum);
                    constraintsArr[i10] = Constraints.m11094boximpl(Constraints.m11097copyZbe2FdA$default(j2, iMax != Integer.MAX_VALUE ? iMax : 0, iMax, 0, 0, 12, null));
                    iArr2[i10] = iMax;
                    iJ += iMax;
                    j6 = j7;
                } else {
                    animatableArr = animatableArr2;
                    j3 = j5;
                }
                iJ = n.j((int) (iJ + j3), 0, i11);
                i10++;
                animatableArr2 = animatableArr;
                j5 = j3;
                jK = j6;
            }
        }
        Animatable[] animatableArr3 = animatableArr2;
        ao aoVar2 = new ao();
        int size4 = list4.size();
        int[] iArr3 = new int[size4];
        for (int i12 = 0; i12 < size4; i12++) {
            Constraints constraints = constraintsArr[i12];
            iArr3[i12] = Constraints.m11107getMaxWidthimpl(constraints != null ? constraints.m11113unboximpl() : j2);
        }
        int iE = c.E(iArr3) + ((list4.size() - 1) * i4);
        if (iE <= iM11107getMaxWidthimpl) {
            aoVar = aoVar2;
            iArr = iArr3;
            arrayList = null;
        } else {
            if (list2.isEmpty()) {
                list3 = list2;
                iArr = iArr3;
                i2 = i4;
                numValueOf = null;
            } else {
                list3 = list2;
                numValueOf = Integer.valueOf(list3.get(0).maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)));
                int iE2 = h.a.i.e(list3);
                if (iE2 > 0) {
                    int i13 = 1;
                    while (true) {
                        iArr = iArr3;
                        i2 = i4;
                        Integer numValueOf2 = Integer.valueOf(list3.get(i13).maxIntrinsicWidth(Constraints.m11106getMaxHeightimpl(j2)));
                        if (numValueOf2.compareTo(numValueOf) > 0) {
                            numValueOf = numValueOf2;
                        }
                        if (i13 == iE2) {
                            break;
                        }
                        i13++;
                        i4 = i2;
                        iArr3 = iArr;
                    }
                } else {
                    iArr = iArr3;
                    i2 = i4;
                }
            }
            Integer num = numValueOf;
            int iIntValue = num != null ? num.intValue() : 0;
            int i14 = iM11107getMaxWidthimpl - iIntValue;
            int i15 = iIntValue;
            int i16 = 0;
            while (i16 < size4) {
                int i17 = iArr[i16];
                if (i17 > i14) {
                    break;
                }
                i15 += i17;
                aoVar2.f48103a += i17;
                i14 -= i17 + i2;
                i16++;
            }
            int i18 = i2 * i16;
            int i19 = i15 + i18;
            aoVar2.f48103a += i18;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size5 = list3.size();
            int i20 = 0;
            while (i20 < size5) {
                arrayList3.add(list3.get(i20).mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(j2, 0, i14 + iIntValue, 0, 0, 13, null)));
                i20++;
                aoVar2 = aoVar2;
                list3 = list3;
                arrayList3 = arrayList3;
                i19 = i19;
            }
            aoVar = aoVar2;
            int i21 = i19;
            arrayList = arrayList3;
            size4 = i16;
            iE = i21;
        }
        this.overflowState.setVisibleItemCount(size4);
        final int[] iArr4 = new int[size4];
        for (int i22 = 0; i22 < size4; i22++) {
            iArr4[i22] = 0;
        }
        if (list4.size() > 1) {
            for (int i23 = 0; i23 < size4; i23++) {
                float fFloatValue = ((Number) animatableArr3[i23].getValue()).floatValue() * this.expandedRatio * iArr[i23];
                if (i23 <= 0 || i23 >= size4 - 1) {
                    if (i23 == 0) {
                        iArr[1] = iArr[1] - a.b(fFloatValue);
                    } else {
                        int i24 = i23 - 1;
                        iArr[i24] = iArr[i24] - a.b(fFloatValue);
                    }
                    iArr4[i23] = a.b(fFloatValue);
                } else {
                    float f4 = fFloatValue / 2.0f;
                    iArr4[i23] = a.b(f4);
                    int i25 = i23 - 1;
                    iArr[i25] = iArr[i25] - a.b(f4);
                    int i26 = i23 + 1;
                    iArr[i26] = iArr[i26] - a.b(f4);
                }
                iArr[i23] = iArr[i23] + a.b(fFloatValue);
            }
        }
        for (int i27 = 0; i27 < size4; i27++) {
            Measurable measurable2 = list4.get(i27);
            Constraints constraints2 = constraintsArr[i27];
            long jM11113unboximpl = constraints2 != null ? constraints2.m11113unboximpl() : j2;
            int i28 = iArr[i27];
            arrayList2.add(measurable2.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(jM11113unboximpl, i28, i28, 0, 0, 12, null)));
        }
        int iMax2 = Math.max(n.h(iE, 0), iM11109getMinWidthimpl);
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        final int[] iArr5 = new int[size4];
        MeasureScope measureScope2 = measureScope;
        j jVar = new j(0, size4 - 1);
        x.f(iArr2, "<this>");
        x.f(jVar, "indices");
        if (jVar.isEmpty()) {
            iArrCopyOfRange = new int[0];
            i3 = 1;
        } else {
            int iIntValue2 = jVar.getStart().intValue();
            i3 = 1;
            int iIntValue3 = jVar.getEndInclusive().intValue() + 1;
            x.f(iArr2, "<this>");
            c.e(iIntValue3, size);
            iArrCopyOfRange = Arrays.copyOfRange(iArr2, iIntValue2, iIntValue3);
            x.e(iArrCopyOfRange, "copyOfRange(...)");
        }
        horizontal.arrange(measureScope2, iMax2, iArrCopyOfRange, measureScope.getLayoutDirection(), iArr5);
        if (!arrayList2.isEmpty()) {
            buttonGroupParentData = arrayList2.get(0);
            int height = ((Placeable) buttonGroupParentData).getHeight();
            int iE3 = h.a.i.e(arrayList2);
            if (iE3 > 0) {
                int i29 = i3;
                while (true) {
                    Object obj = arrayList2.get(i29);
                    int height2 = ((Placeable) obj).getHeight();
                    int i30 = height < height2 ? height2 : height;
                    if (height < height2) {
                        buttonGroupParentData = obj;
                    }
                    if (i29 == iE3) {
                        break;
                    }
                    i29++;
                    height = i30;
                }
            }
        }
        Placeable placeable = (Placeable) buttonGroupParentData;
        final int height3 = placeable != null ? placeable.getHeight() : Constraints.m11108getMinHeightimpl(j2);
        final ao aoVar3 = aoVar;
        return MeasureScope.CC.layout$default(measureScope, iMax2, height3, null, new l() { // from class: androidx.compose.material3.ButtonGroupMeasurePolicy$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj2) {
                return ButtonGroupMeasurePolicy.measure_3p2s80s$lambda$4(arrayList2, measureScope, iArr4, list4, height3, this, iArr5, arrayList, aoVar3, (Placeable.PlacementScope) obj2);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    public ButtonGroupMeasurePolicy(ButtonGroupOverflowState buttonGroupOverflowState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, float f2) {
        this.overflowState = buttonGroupOverflowState;
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
        this.expandedRatio = f2;
    }
}
