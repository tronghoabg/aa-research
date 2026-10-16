package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;
import h.ab;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RulerAlignmentKt {
    public static final Modifier fitInside(Modifier modifier, final RectRulers rectRulers) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda4
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RulerAlignmentKt.fitInside$lambda$0(rectRulers, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    static final MeasureResult fitInside$lambda$0(final RectRulers rectRulers, MeasureScope measureScope, final Measurable measurable, Constraints constraints) {
        if (Constraints.m11103getHasBoundedWidthimpl(constraints.m11113unboximpl()) && Constraints.m11102getHasBoundedHeightimpl(constraints.m11113unboximpl())) {
            final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
            final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl());
            return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RulerAlignmentKt.fitInside$lambda$0$0(rectRulers, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, measurable, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        final int width = placeableMo9741measureBRTryo0.getWidth();
        final int height = placeableMo9741measureBRTryo0.getHeight();
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RulerAlignmentKt.fitInside$lambda$0$1(rectRulers, width, height, placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab fitInside$lambda$0$0(RectRulers rectRulers, int i2, int i3, Measurable measurable, Placeable.PlacementScope placementScope) {
        int iB = h.h.a.b(placementScope.current(rectRulers.getLeft(), 0.0f));
        if (iB < 0) {
            iB = 0;
        }
        int iB2 = h.h.a.b(placementScope.current(rectRulers.getTop(), 0.0f));
        if (iB2 < 0) {
            iB2 = 0;
        }
        int iB3 = h.h.a.b(placementScope.current(rectRulers.getRight(), i2));
        if (iB3 < 0) {
            iB3 = 0;
        }
        int iB4 = h.h.a.b(placementScope.current(rectRulers.getBottom(), i3));
        int i4 = iB4 >= 0 ? iB4 : 0;
        Constraints.Companion companion = Constraints.Companion;
        int i5 = iB > i2 ? i2 : iB;
        if (iB3 <= i2) {
            i2 = iB3;
        }
        int i6 = i2 - i5;
        int i7 = iB2 > i3 ? i3 : iB2;
        if (i4 <= i3) {
            i3 = i4;
        }
        Placeable.PlacementScope.place$default(placementScope, measurable.mo9741measureBRTryo0(companion.m11117fixedJhjzzOo(i6, i3 - i7)), i5, i7, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab fitInside$lambda$0$1(RectRulers rectRulers, int i2, int i3, Placeable placeable, Placeable.PlacementScope placementScope) {
        int iB = h.h.a.b(placementScope.current(rectRulers.getLeft(), 0.0f));
        if (iB < 0) {
            iB = 0;
        }
        int iB2 = h.h.a.b(placementScope.current(rectRulers.getTop(), 0.0f));
        if (iB2 < 0) {
            iB2 = 0;
        }
        int iB3 = h.h.a.b(placementScope.current(rectRulers.getRight(), i2));
        if (iB3 < 0) {
            iB3 = 0;
        }
        int iB4 = h.h.a.b(placementScope.current(rectRulers.getBottom(), i3));
        int i4 = iB4 >= 0 ? iB4 : 0;
        if (iB > i2) {
            iB = i2;
        }
        if (iB3 > i2) {
            iB3 = i2;
        }
        int i5 = (iB + iB3) - i2;
        if (iB2 > i3) {
            iB2 = i3;
        }
        if (i4 > i3) {
            i4 = i3;
        }
        Placeable.PlacementScope.place$default(placementScope, placeable, i5 / 2, ((iB2 + i4) - i3) / 2, 0.0f, 4, null);
        return ab.f48028a;
    }

    public static final Modifier fitOutside(Modifier modifier, final RectRulers rectRulers) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda5
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RulerAlignmentKt.fitOutside$lambda$0(rectRulers, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    static final MeasureResult fitOutside$lambda$0(final RectRulers rectRulers, MeasureScope measureScope, final Measurable measurable, Constraints constraints) {
        if (!Constraints.m11103getHasBoundedWidthimpl(constraints.m11113unboximpl()) || !Constraints.m11102getHasBoundedHeightimpl(constraints.m11113unboximpl())) {
            return MeasureScope.CC.layout$default(measureScope, 0, 0, null, new l() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RulerAlignmentKt.fitOutside$lambda$0$1(measurable, (Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }
        final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
        final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl());
        return MeasureScope.CC.layout$default(measureScope, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, null, new l() { // from class: androidx.compose.foundation.layout.RulerAlignmentKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RulerAlignmentKt.fitOutside$lambda$0$0(rectRulers, iM11107getMaxWidthimpl, iM11106getMaxHeightimpl, measurable, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab fitOutside$lambda$0$0(RectRulers rectRulers, int i2, int i3, Measurable measurable, Placeable.PlacementScope placementScope) {
        int i4;
        int i5;
        int iB = h.h.a.b(placementScope.current(rectRulers.getLeft(), 0.0f));
        int iB2 = h.h.a.b(placementScope.current(rectRulers.getTop(), 0.0f));
        int iB3 = h.h.a.b(placementScope.current(rectRulers.getRight(), i2));
        int iB4 = h.h.a.b(placementScope.current(rectRulers.getBottom(), i3));
        if (iB > 0) {
            i2 = iB;
        } else {
            if (iB2 <= 0) {
                if (iB3 < i2) {
                    i2 -= iB3;
                    i4 = iB3;
                    i5 = 0;
                } else if (iB4 < i3) {
                    i3 -= iB4;
                    i5 = iB4;
                    i4 = 0;
                } else {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = i4;
                }
                Placeable.PlacementScope.place$default(placementScope, measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(i2, i3)), i4, i5, 0.0f, 4, null);
                return ab.f48028a;
            }
            i3 = iB2;
        }
        i4 = 0;
        i5 = i4;
        Placeable.PlacementScope.place$default(placementScope, measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(i2, i3)), i4, i5, 0.0f, 4, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab fitOutside$lambda$0$1(Measurable measurable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, measurable.mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(0, 0)), 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }
}
