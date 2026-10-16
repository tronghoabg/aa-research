package androidx.compose.animation;

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
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private boolean hasLookaheadOccurred;
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.scope = animatedVisibilityScopeImpl;
    }

    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicHeight = list.get(0).maxIntrinsicHeight(i2);
        int iE = i.e(list);
        if (iE > 0) {
            int i3 = 1;
            while (true) {
                int iMaxIntrinsicHeight2 = list.get(i3).maxIntrinsicHeight(i2);
                if (iMaxIntrinsicHeight2 > iMaxIntrinsicHeight) {
                    iMaxIntrinsicHeight = iMaxIntrinsicHeight2;
                }
                if (i3 == iE) {
                    break;
                }
                i3++;
            }
        }
        return iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMaxIntrinsicWidth = list.get(0).maxIntrinsicWidth(i2);
        int iE = i.e(list);
        if (iE > 0) {
            int i3 = 1;
            while (true) {
                int iMaxIntrinsicWidth2 = list.get(i3).maxIntrinsicWidth(i2);
                if (iMaxIntrinsicWidth2 > iMaxIntrinsicWidth) {
                    iMaxIntrinsicWidth = iMaxIntrinsicWidth2;
                }
                if (i3 == iE) {
                    break;
                }
                i3++;
            }
        }
        return iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeableMo9741measureBRTryo0 = list.get(i2).mo9741measureBRTryo0(j2);
            iMax = Math.max(iMax, placeableMo9741measureBRTryo0.getWidth());
            iMax2 = Math.max(iMax2, placeableMo9741measureBRTryo0.getHeight());
            arrayList.add(placeableMo9741measureBRTryo0);
        }
        ArrayList arrayList2 = arrayList;
        if (measureScope.isLookingAhead()) {
            long j3 = MuxerUtil.UNSIGNED_INT_MAX_VALUE & iMax2;
            this.hasLookaheadOccurred = true;
            this.scope.getTargetSize$animation().setValue(IntSize.m11331boximpl((iMax << 32) | j3));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.getTargetSize$animation().setValue(IntSize.m11331boximpl((iMax << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & iMax2)));
        }
        return MeasureScope.CC.layout$default(measureScope, iMax, iMax2, null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList2), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicHeight = list.get(0).minIntrinsicHeight(i2);
        int iE = i.e(list);
        if (iE > 0) {
            int i3 = 1;
            while (true) {
                int iMinIntrinsicHeight2 = list.get(i3).minIntrinsicHeight(i2);
                if (iMinIntrinsicHeight2 > iMinIntrinsicHeight) {
                    iMinIntrinsicHeight = iMinIntrinsicHeight2;
                }
                if (i3 == iE) {
                    break;
                }
                i3++;
            }
        }
        return iMinIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMinIntrinsicWidth = list.get(0).minIntrinsicWidth(i2);
        int iE = i.e(list);
        if (iE > 0) {
            int i3 = 1;
            while (true) {
                int iMinIntrinsicWidth2 = list.get(i3).minIntrinsicWidth(i2);
                if (iMinIntrinsicWidth2 > iMinIntrinsicWidth) {
                    iMinIntrinsicWidth = iMinIntrinsicWidth2;
                }
                if (i3 == iE) {
                    break;
                }
                i3++;
            }
        }
        return iMinIntrinsicWidth;
    }

    public final void setHasLookaheadOccurred(boolean z) {
        this.hasLookaheadOccurred = z;
    }
}
