package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.ab;
import h.g.a.l;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PaddingKt {
    /* renamed from: PaddingValues-0680j_4, reason: not valid java name */
    public static final PaddingValues m2748PaddingValues0680j_4(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, null);
    }

    /* renamed from: PaddingValues-YgX7TsA, reason: not valid java name */
    public static final PaddingValues m2749PaddingValuesYgX7TsA(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2750PaddingValuesYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2749PaddingValuesYgX7TsA(f2, f3);
    }

    /* renamed from: PaddingValues-a9UjIt4, reason: not valid java name */
    public static final PaddingValues m2751PaddingValuesa9UjIt4(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2752PaddingValuesa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2751PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    /* renamed from: absolutePadding-qDBjuR0, reason: not valid java name */
    public static final Modifier m2753absolutePaddingqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, false, new l() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingKt.absolutePadding_qDBjuR0$lambda$0(f2, f3, f4, f5, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2754absolutePaddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2753absolutePaddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    static final ab absolutePadding_qDBjuR0$lambda$0(float f2, float f3, float f4, float f5, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absolutePadding");
        inspectorInfo.getProperties().set(TtmlNode.LEFT, Dp.m11162boximpl(f2));
        inspectorInfo.getProperties().set("top", Dp.m11162boximpl(f3));
        inspectorInfo.getProperties().set(TtmlNode.RIGHT, Dp.m11162boximpl(f4));
        inspectorInfo.getProperties().set("bottom", Dp.m11162boximpl(f5));
        return ab.f48028a;
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final PaddingValues minus(final PaddingValues paddingValues, final PaddingValues paddingValues2) {
        return new PaddingValues() { // from class: androidx.compose.foundation.layout.PaddingKt.minus.1
            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateBottomPadding-D9Ej5fM */
            public float mo2704calculateBottomPaddingD9Ej5fM() {
                return n.e(paddingValues.mo2704calculateBottomPaddingD9Ej5fM() - paddingValues2.mo2704calculateBottomPaddingD9Ej5fM(), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateLeftPadding-u2uoSUM */
            public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
                return n.e(paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection) - paddingValues2.mo2705calculateLeftPaddingu2uoSUM(layoutDirection), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateRightPadding-u2uoSUM */
            public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
                return n.e(paddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection) - paddingValues2.mo2706calculateRightPaddingu2uoSUM(layoutDirection), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateTopPadding-D9Ej5fM */
            public float mo2707calculateTopPaddingD9Ej5fM() {
                return n.e(paddingValues.mo2707calculateTopPaddingD9Ej5fM() - paddingValues2.mo2707calculateTopPaddingD9Ej5fM(), 0.0f);
            }
        };
    }

    public static final Modifier padding(Modifier modifier, final PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new l() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingKt.padding$lambda$0(paddingValues, (InspectorInfo) obj);
            }
        }));
    }

    static final ab padding$lambda$0(PaddingValues paddingValues, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("paddingValues", paddingValues);
        return ab.f48028a;
    }

    /* renamed from: padding-3ABfNKs, reason: not valid java name */
    public static final Modifier m2755padding3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new PaddingElement(f2, f2, f2, f2, true, new l() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingKt.padding_3ABfNKs$lambda$0(f2, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4, reason: not valid java name */
    public static final Modifier m2756paddingVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new PaddingElement(f2, f3, f2, f3, true, new l() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingKt.padding_VpY3zN4$lambda$0(f2, f3, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: padding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2757paddingVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2756paddingVpY3zN4(modifier, f2, f3);
    }

    /* renamed from: padding-qDBjuR0, reason: not valid java name */
    public static final Modifier m2758paddingqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, true, new l() { // from class: androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return PaddingKt.padding_qDBjuR0$lambda$0(f2, f3, f4, f5, (InspectorInfo) obj);
            }
        }, null));
    }

    /* renamed from: padding-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2759paddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        return m2758paddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    static final ab padding_3ABfNKs$lambda$0(float f2, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.setValue(Dp.m11162boximpl(f2));
        return ab.f48028a;
    }

    static final ab padding_VpY3zN4$lambda$0(float f2, float f3, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("horizontal", Dp.m11162boximpl(f2));
        inspectorInfo.getProperties().set("vertical", Dp.m11162boximpl(f3));
        return ab.f48028a;
    }

    static final ab padding_qDBjuR0$lambda$0(float f2, float f3, float f4, float f5, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set(TtmlNode.START, Dp.m11162boximpl(f2));
        inspectorInfo.getProperties().set("top", Dp.m11162boximpl(f3));
        inspectorInfo.getProperties().set(TtmlNode.END, Dp.m11162boximpl(f4));
        inspectorInfo.getProperties().set("bottom", Dp.m11162boximpl(f5));
        return ab.f48028a;
    }

    public static final PaddingValues plus(final PaddingValues paddingValues, final PaddingValues paddingValues2) {
        return new PaddingValues() { // from class: androidx.compose.foundation.layout.PaddingKt.plus.1
            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateBottomPadding-D9Ej5fM */
            public float mo2704calculateBottomPaddingD9Ej5fM() {
                return paddingValues.mo2704calculateBottomPaddingD9Ej5fM() + paddingValues2.mo2704calculateBottomPaddingD9Ej5fM();
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateLeftPadding-u2uoSUM */
            public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
                return paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues2.mo2705calculateLeftPaddingu2uoSUM(layoutDirection);
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateRightPadding-u2uoSUM */
            public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
                return paddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues2.mo2706calculateRightPaddingu2uoSUM(layoutDirection);
            }

            @Override // androidx.compose.foundation.layout.PaddingValues
            /* renamed from: calculateTopPadding-D9Ej5fM */
            public float mo2707calculateTopPaddingD9Ej5fM() {
                return paddingValues.mo2707calculateTopPaddingD9Ej5fM() + paddingValues2.mo2707calculateTopPaddingD9Ej5fM();
            }
        };
    }
}
