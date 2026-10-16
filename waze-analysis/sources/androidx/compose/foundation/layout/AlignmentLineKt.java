package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import h.ab;
import h.g.a.l;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m2409alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f2, float f3, Measurable measurable, long j2) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m11097copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i2 = placeableMo9741measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height = getHorizontal(alignmentLine) ? placeableMo9741measureBRTryo0.getHeight() : placeableMo9741measureBRTryo0.getWidth();
        int iM11106getMaxHeightimpl = (getHorizontal(alignmentLine) ? Constraints.m11106getMaxHeightimpl(j2) : Constraints.m11107getMaxWidthimpl(j2)) - height;
        final int iJ = n.j((!Float.isNaN(f2) ? measureScope.mo2121roundToPx0680j_4(f2) : 0) - i2, 0, iM11106getMaxHeightimpl);
        final int iJ2 = n.j(((!Float.isNaN(f3) ? measureScope.mo2121roundToPx0680j_4(f3) : 0) - height) + i2, 0, iM11106getMaxHeightimpl - iJ);
        final int width = getHorizontal(alignmentLine) ? placeableMo9741measureBRTryo0.getWidth() : Math.max(placeableMo9741measureBRTryo0.getWidth() + iJ + iJ2, Constraints.m11109getMinWidthimpl(j2));
        final int iMax = getHorizontal(alignmentLine) ? Math.max(placeableMo9741measureBRTryo0.getHeight() + iJ + iJ2, Constraints.m11108getMinHeightimpl(j2)) : placeableMo9741measureBRTryo0.getHeight();
        return MeasureScope.CC.layout$default(measureScope, width, iMax, null, new l() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AlignmentLineKt.alignmentLineOffsetMeasure_tjqqzMA$lambda$1(alignmentLine, f2, iJ, width, iJ2, placeableMo9741measureBRTryo0, iMax, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab alignmentLineOffsetMeasure_tjqqzMA$lambda$1(AlignmentLine alignmentLine, float f2, int i2, int i3, int i4, Placeable placeable, int i5, Placeable.PlacementScope placementScope) {
        int i6;
        int width = getHorizontal(alignmentLine) ? 0 : !Dp.m11169equalsimpl0(f2, Dp.Companion.m11184getUnspecifiedD9Ej5fM()) ? i2 : (i3 - i4) - placeable.getWidth();
        if (getHorizontal(alignmentLine)) {
            if (Dp.m11169equalsimpl0(f2, Dp.Companion.m11184getUnspecifiedD9Ej5fM())) {
                i2 = (i5 - i4) - placeable.getHeight();
            }
            i6 = i2;
        } else {
            i6 = 0;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, i6, 0.0f, 4, null);
        return ab.f48028a;
    }

    private static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m2410paddingFrom4j6BHR0(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3) {
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f2, f3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2411paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2410paddingFrom4j6BHR0(modifier, alignmentLine, f2, f3);
    }

    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m2412paddingFromY_r0B1c(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3) {
        AlignmentLine alignmentLine2;
        long j4;
        long j5;
        AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            alignmentLine2 = alignmentLine;
            j4 = j2;
            j5 = j3;
            noInspectorInfo = new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j2, j3);
        } else {
            alignmentLine2 = alignmentLine;
            j4 = j2;
            j5 = j3;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine2, j4, j5, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2413paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
        }
        return m2412paddingFromY_r0B1c(modifier, alignmentLine, j4, j3);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m2414paddingFromBaselineVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(!Float.isNaN(f2) ? m2411paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f2, 0.0f, 4, null) : Modifier.Companion).then(!Float.isNaN(f3) ? m2411paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f3, 2, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2415paddingFromBaselineVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m11184getUnspecifiedD9Ej5fM();
        }
        return m2414paddingFromBaselineVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m2416paddingFromBaselinewCyjxdI(Modifier modifier, long j2, long j3) {
        return modifier.then(TextUnit.m11360getRawTypeimpl(j2) == 0 ? Modifier.Companion : m2413paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j2, 0L, 4, null)).then(TextUnit.m11360getRawTypeimpl(j3) == 0 ? Modifier.Companion : m2413paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j3, 2, null));
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2417paddingFromBaselinewCyjxdI$default(Modifier modifier, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j3 = TextUnit.Companion.m11373getUnspecifiedXSAIIZE();
        }
        return m2416paddingFromBaselinewCyjxdI(modifier, j2, j3);
    }
}
