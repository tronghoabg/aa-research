package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import h.ab;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding = 10.0f;
    private static final Modifier IncreaseHorizontalSemanticsBounds = PaddingKt.m2757paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new q() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda1
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$0((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }), true, new l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    }), 10.0f, 0.0f, 2, null);
    private static final Modifier IncreaseVerticalSemanticsBounds = PaddingKt.m2757paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.Companion, new q() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda3
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$0((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }), true, new l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    }), 0.0f, 10.0f, 1, null);
    private static final float VerticalSemanticsBoundsPadding = 10.0f;

    static final MeasureResult IncreaseHorizontalSemanticsBounds$lambda$0(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final int i2 = measureScope.mo2121roundToPx0680j_4(HorizontalSemanticsBoundsPadding);
        int i3 = i2 + i2;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(constraints.m11113unboximpl(), i3, 0));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth() - i3, placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$0$0(placeableMo9741measureBRTryo0, i2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab IncreaseHorizontalSemanticsBounds$lambda$0$0(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, -i2, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final MeasureResult IncreaseVerticalSemanticsBounds$lambda$0(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final int i2 = measureScope.mo2121roundToPx0680j_4(VerticalSemanticsBoundsPadding);
        int i3 = i2 + i2;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(ConstraintsKt.m11126offsetNN6EwU(constraints.m11113unboximpl(), 0, i3));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight() - i3, null, new l() { // from class: androidx.compose.material3.internal.AccessibilityUtilKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$0$0(placeableMo9741measureBRTryo0, i2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab IncreaseVerticalSemanticsBounds$lambda$0$0(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i2, 0.0f, 4, null);
        return ab.f48028a;
    }

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }

    public static final Modifier getIncreaseVerticalSemanticsBounds() {
        return IncreaseVerticalSemanticsBounds;
    }

    public static final float getVerticalSemanticsBoundsPadding() {
        return VerticalSemanticsBoundsPadding;
    }

    public static /* synthetic */ void getHorizontalSemanticsBoundsPadding$annotations() {
    }

    public static /* synthetic */ void getVerticalSemanticsBoundsPadding$annotations() {
    }
}
