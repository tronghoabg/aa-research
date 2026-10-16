package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final ContextualFlowColumnOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final ContextualFlowColumnOverflow Visible;

    static {
        int i2 = 0;
        l lVar = null;
        Visible = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i2, null, lVar, 30, null);
        Clip = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i2, 0, lVar, null, 30, null);
    }

    /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, int i4, o oVar) {
        this(overflowType, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : lVar, (i4 & 16) != 0 ? null : lVar2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandIndicator$lambda$0$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-800948529, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:504)");
                }
                qVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p expandOrCollapseIndicator__jt2gSs$lambda$1$0(final q qVar, final FlowLayoutOverflowState flowLayoutOverflowState) {
            return ComposableLambdaKt.composableLambdaInstance(494662780, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(494662780, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:554)");
                }
                qVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p expandOrCollapseIndicator__jt2gSs$lambda$1$1(final q qVar, final FlowLayoutOverflowState flowLayoutOverflowState) {
            return ComposableLambdaKt.composableLambdaInstance(1829455235, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1829455235, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:561)");
                }
                qVar.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        public final ContextualFlowColumnOverflow expandIndicator(final q<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar) {
            return new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ComposableLambdaKt.composableLambdaInstance(-800948529, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda4
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0$0(flowLayoutOverflowState, qVar, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }, null, 22, null);
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final ContextualFlowColumnOverflow m2478expandOrCollapseIndicatorjt2gSs(final q<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar, final q<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar2, int i2, float f2, Composer composer, int i3, int i4) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169622732, i3, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:543)");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            boolean z = true;
            int i5 = (i4 & 4) != 0 ? 1 : i2;
            int iMo2121roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2121roundToPx0680j_4(f2);
            boolean zChanged = ((((i3 & 14) ^ 6) > 4 && composer.changed(qVar)) || (i3 & 6) == 4) | ((((i3 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(i5)) || (i3 & 384) == 256) | composer.changed(iMo2121roundToPx0680j_4);
            if ((((i3 & 112) ^ 48) <= 32 || !composer.changed(qVar2)) && (i3 & 48) != 32) {
                z = false;
            }
            boolean z2 = zChanged | z;
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                ContextualFlowColumnOverflow contextualFlowColumnOverflow = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i5, iMo2121roundToPx0680j_4, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(qVar, (FlowLayoutOverflowState) obj);
                    }
                }, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(qVar2, (FlowLayoutOverflowState) obj);
                    }
                }, null);
                composer.updateRememberedValue(contextualFlowColumnOverflow);
                objRememberedValue = contextualFlowColumnOverflow;
            }
            ContextualFlowColumnOverflow contextualFlowColumnOverflow2 = (ContextualFlowColumnOverflow) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return contextualFlowColumnOverflow2;
        }

        public final ContextualFlowColumnOverflow getClip() {
            return ContextualFlowColumnOverflow.Clip;
        }

        public final ContextualFlowColumnOverflow getVisible() {
            return ContextualFlowColumnOverflow.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    private ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar2) {
        super(overflowType, i2, i3, lVar, lVar2, null);
    }

    public /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, o oVar) {
        this(overflowType, i2, i3, lVar, lVar2);
    }
}
