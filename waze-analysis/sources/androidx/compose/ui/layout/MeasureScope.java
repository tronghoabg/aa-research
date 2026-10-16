package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.a.r;
import h.ab;
import h.g.a.l;
import java.util.Map;

/* compiled from: WazeSource */
@MeasureScopeMarker
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {
    MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super Placeable.PlacementScope, ab> lVar);

    MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, l<? super RulerScope, ab> lVar, l<? super Placeable.PlacementScope, ab> lVar2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static MeasureResult $default$layout(MeasureScope measureScope, int i2, int i3, Map map, l lVar, l lVar2) {
            if ((i2 & (-16777216)) != 0 || ((-16777216) & i3) != 0) {
                InlineClassHelperKt.throwIllegalStateException(a.a(i3, i2));
            }
            return new MeasureResult(i2, i3, map, lVar, measureScope, lVar2) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
                final /* synthetic */ l<Placeable.PlacementScope, ab> $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                private final l<RulerScope, ab> rulers;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i2;
                    this.this$0 = measureScope;
                    this.$placementBlock = lVar2;
                    this.width = i2;
                    this.height = i3;
                    this.alignmentLines = map;
                    this.rulers = lVar;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public l<RulerScope, ab> getRulers() {
                    return this.rulers;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    MeasureScope measureScope2 = this.this$0;
                    boolean z = measureScope2 instanceof LookaheadCapablePlaceable;
                    l<Placeable.PlacementScope, ab> lVar3 = this.$placementBlock;
                    if (z) {
                        lVar3.invoke(((LookaheadCapablePlaceable) measureScope2).getPlacementScope());
                    } else {
                        lVar3.invoke(new SimplePlacementScope(this.$width, measureScope2.getLayoutDirection(), measureScope2.getDensity(), measureScope2.getFontScale()));
                    }
                }
            };
        }

        public static /* synthetic */ boolean access$isLookingAhead$jd(MeasureScope measureScope) {
            return false;
        }

        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i2, int i3, Map map, l lVar, l lVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i4 & 4) != 0) {
                map = r.j();
            }
            Map map2 = map;
            if ((i4 & 8) != 0) {
                lVar = null;
            }
            return measureScope.layout(i2, i3, map2, lVar, lVar2);
        }

        public static MeasureResult $default$layout(MeasureScope measureScope, int i2, int i3, Map map, l lVar) {
            return measureScope.layout(i2, i3, map, null, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i2, int i3, Map map, l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i4 & 4) != 0) {
                map = r.j();
            }
            return measureScope.layout(i2, i3, map, lVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return false;
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i2, int i3, Map<AlignmentLine, Integer> map, l<? super Placeable.PlacementScope, ab> lVar) {
            return CC.$default$layout(measureScope, i2, i3, map, lVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m9791roundToPxR2X_6o(MeasureScope measureScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(measureScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m9792roundToPx0680j_4(MeasureScope measureScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(measureScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m9793toDpGaN1DYA(MeasureScope measureScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(measureScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9794toDpu2uoSUM(MeasureScope measureScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(measureScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m9796toDpSizekrfVVM(MeasureScope measureScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(measureScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m9797toPxR2X_6o(MeasureScope measureScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(measureScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m9798toPx0680j_4(MeasureScope measureScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(measureScope, f2);
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return Density.CC.$default$toRect(measureScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m9799toSizeXkaWNTQ(MeasureScope measureScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(measureScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m9800toSp0xMU5do(MeasureScope measureScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(measureScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9801toSpkPz2Gy4(MeasureScope measureScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(measureScope, f2);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i2, int i3, Map<AlignmentLine, Integer> map, l<? super RulerScope, ab> lVar, l<? super Placeable.PlacementScope, ab> lVar2) {
            return CC.$default$layout(measureScope, i2, i3, map, lVar, lVar2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9795toDpu2uoSUM(MeasureScope measureScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) measureScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9802toSpkPz2Gy4(MeasureScope measureScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) measureScope, i2);
        }
    }
}
