package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSize;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HorizontalCenterOpticallyKt {
    public static final float CenterOpticallyCoefficient = 0.11f;

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final Modifier m4971horizontalCenterOptically4j6BHR0(Modifier modifier, final CornerBasedShape cornerBasedShape, final float f2, final float f3) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$0(f2, f3, cornerBasedShape, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4973horizontalCenterOptically4j6BHR0$default(Modifier modifier, CornerBasedShape cornerBasedShape, float f2, float f3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return m4971horizontalCenterOptically4j6BHR0(modifier, cornerBasedShape, f2, f3);
    }

    static final MeasureResult horizontalCenterOptically_4j6BHR0$lambda$0(float f2, float f3, CornerBasedShape cornerBasedShape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        int width = placeableMo9741measureBRTryo0.getWidth();
        int height = placeableMo9741measureBRTryo0.getHeight();
        long jFloatToRawIntBits = Float.floatToRawIntBits(width);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(height);
        final float f4 = -measureScope.mo2127toPx0680j_4(f2);
        final float f5 = measureScope.mo2127toPx0680j_4(f3);
        CornerSize topStart = cornerBasedShape.getTopStart();
        long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        MeasureScope measureScope2 = measureScope;
        final float fMo3077toPxTmRCtEA = (((topStart.mo3077toPxTmRCtEA(j2, measureScope2) + cornerBasedShape.getBottomStart().mo3077toPxTmRCtEA(j2, measureScope2)) / 2.0f) - ((cornerBasedShape.getTopEnd().mo3077toPxTmRCtEA(j2, measureScope2) + cornerBasedShape.getBottomEnd().mo3077toPxTmRCtEA(j2, measureScope2)) / 2.0f)) * 0.11f;
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$0$0(fMo3077toPxTmRCtEA, f4, f5, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab horizontalCenterOptically_4j6BHR0$lambda$0$0(float f2, float f3, float f4, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, a.b(n.g(f2, f3, f4)), 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final MeasureResult horizontalCenterOptically_4j6BHR0$lambda$1(float f2, float f3, final ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        int width = placeableMo9741measureBRTryo0.getWidth();
        int height = placeableMo9741measureBRTryo0.getHeight();
        final float f4 = -measureScope.mo2127toPx0680j_4(f2);
        final float f5 = measureScope.mo2127toPx0680j_4(f3);
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1$0(shapeWithHorizontalCenterOptically, f4, f5, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab horizontalCenterOptically_4j6BHR0$lambda$1$0(ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f2, float f3, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, a.b(n.g(shapeWithHorizontalCenterOptically.offset(), f2, f3)), 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final Modifier m4972horizontalCenterOptically4j6BHR0(Modifier modifier, final ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, final float f2, final float f3) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.HorizontalCenterOpticallyKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1(f2, f3, shapeWithHorizontalCenterOptically, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4974horizontalCenterOptically4j6BHR0$default(Modifier modifier, ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f2, float f3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return m4972horizontalCenterOptically4j6BHR0(modifier, shapeWithHorizontalCenterOptically, f2, f3);
    }
}
