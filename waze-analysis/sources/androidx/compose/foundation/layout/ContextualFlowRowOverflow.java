package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
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
public final class ContextualFlowRowOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final ContextualFlowRowOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final ContextualFlowRowOverflow Visible;

    static {
        int i2 = 0;
        l lVar = null;
        Visible = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i2, null, lVar, 30, null);
        Clip = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.Clip, i2, 0, lVar, null, 30, null);
    }

    /* synthetic */ ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, int i4, o oVar) {
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
                    ComposerKt.traceEventStart(1173882609, i2, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:366)");
                }
                qVar.invoke(new ContextualFlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(2006590568, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2006590568, i2, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:416)");
                }
                qVar.invoke(new ContextualFlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(-628801663, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-628801663, i2, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:423)");
                }
                qVar.invoke(new ContextualFlowRowOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        public final ContextualFlowRowOverflow expandIndicator(final q<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, ab> qVar) {
            return new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ComposableLambdaKt.composableLambdaInstance(1173882609, true, new p() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0$0(flowLayoutOverflowState, qVar, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }, null, 22, null);
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final ContextualFlowRowOverflow m2483expandOrCollapseIndicatorjt2gSs(final q<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, ab> qVar, final q<? super ContextualFlowRowOverflowScope, ? super Composer, ? super Integer, ab> qVar2, int i2, float f2, Composer composer, int i3, int i4) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1802465558, i3, -1, "androidx.compose.foundation.layout.ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:405)");
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
                ContextualFlowRowOverflow contextualFlowRowOverflow = new ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i5, iMo2121roundToPx0680j_4, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(qVar, (FlowLayoutOverflowState) obj);
                    }
                }, new l() { // from class: androidx.compose.foundation.layout.ContextualFlowRowOverflow$Companion$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(qVar2, (FlowLayoutOverflowState) obj);
                    }
                }, null);
                composer.updateRememberedValue(contextualFlowRowOverflow);
                objRememberedValue = contextualFlowRowOverflow;
            }
            ContextualFlowRowOverflow contextualFlowRowOverflow2 = (ContextualFlowRowOverflow) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return contextualFlowRowOverflow2;
        }

        public final ContextualFlowRowOverflow getClip() {
            return ContextualFlowRowOverflow.Clip;
        }

        public final ContextualFlowRowOverflow getVisible() {
            return ContextualFlowRowOverflow.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    private ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar2) {
        super(overflowType, i2, i3, lVar, lVar2, null);
    }

    public /* synthetic */ ContextualFlowRowOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, o oVar) {
        this(overflowType, i2, i3, lVar, lVar2);
    }
}
