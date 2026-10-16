package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.a.i;
import h.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i3).maxIntrinsicHeight(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iE) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i3).maxIntrinsicWidth(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iE) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        k kVar;
        int size = list.size();
        Placeable[] placeableArr = new Placeable[size];
        long jM11344getZeroYbymL2g = IntSize.Companion.m11344getZeroYbymL2g();
        List<? extends Measurable> list2 = list;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Measurable measurable = list.get(i2);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
                int width = placeableMo9741measureBRTryo0.getWidth();
                long height = placeableMo9741measureBRTryo0.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                placeableArr[i2] = placeableMo9741measureBRTryo0;
                jM11344getZeroYbymL2g = (width << 32) | height;
            }
        }
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Measurable measurable2 = list.get(i3);
            if (placeableArr[i3] == null) {
                placeableArr[i3] = measurable2.mo9741measureBRTryo0(j2);
            }
        }
        if (measureScope.isLookingAhead()) {
            kVar = new k(Integer.valueOf((int) (jM11344getZeroYbymL2g >> 32)), Integer.valueOf((int) (jM11344getZeroYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE)));
        } else {
            int width2 = 0;
            int height2 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Placeable placeable = placeableArr[i4];
                if (placeable != null) {
                    Object parentData2 = list.get(i4).getParentData();
                    AnimatedContentTransitionScopeImpl.ChildData childData2 = parentData2 instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData2 : null;
                    if (childData2 == null || !childData2.isPendingTarget()) {
                        if (placeable.getWidth() > width2) {
                            width2 = placeable.getWidth();
                        }
                        if (placeable.getHeight() > height2) {
                            height2 = placeable.getHeight();
                        }
                    }
                }
            }
            kVar = new k(Integer.valueOf(width2), Integer.valueOf(height2));
        }
        int iIntValue = ((Number) kVar.a()).intValue();
        int iIntValue2 = ((Number) kVar.b()).intValue();
        if (!measureScope.isLookingAhead()) {
            this.rootScope.m1729setMeasuredSizeozmzZPI$animation((iIntValue << 32) | (iIntValue2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        return MeasureScope.CC.layout$default(measureScope, iIntValue, iIntValue2, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, iIntValue, iIntValue2), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i3).minIntrinsicHeight(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iE) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i2));
            int iE = i.e(list);
            if (iE > 0) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i3).minIntrinsicWidth(i2));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == iE) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
