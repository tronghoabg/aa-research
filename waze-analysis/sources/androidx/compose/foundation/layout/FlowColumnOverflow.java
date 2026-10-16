package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowColumnOverflow;
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
public final class FlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    private static final FlowColumnOverflow Clip;
    public static final Companion Companion = new Companion(null);
    private static final FlowColumnOverflow Visible;

    static {
        int i2 = 0;
        l lVar = null;
        Visible = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, i2, null, lVar, 30, null);
        Clip = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, i2, 0, lVar, null, 30, null);
    }

    /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, int i4, o oVar) {
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
                    ComposerKt.traceEventStart(-1176120337, i2, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:231)");
                }
                qVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(1455675245, true, new p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1455675245, i2, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:278)");
                }
                qVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
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
            return ComposableLambdaKt.composableLambdaInstance(-892739916, true, new p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(flowLayoutOverflowState, qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ab expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(FlowLayoutOverflowState flowLayoutOverflowState, q qVar, Composer composer, int i2) {
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-892739916, i2, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:285)");
                }
                qVar.invoke(new FlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        public final FlowColumnOverflow expandIndicator(final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar) {
            return new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ComposableLambdaKt.composableLambdaInstance(-1176120337, true, new p() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda1
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return FlowColumnOverflow.Companion.expandIndicator$lambda$0$0(flowLayoutOverflowState, qVar, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }, null, 22, null);
        }

        /* renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final FlowColumnOverflow m2597expandOrCollapseIndicatorjt2gSs(final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar, final q<? super FlowColumnOverflowScope, ? super Composer, ? super Integer, ab> qVar2, int i2, float f2, Composer composer, int i3, int i4) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582202068, i3, -1, "androidx.compose.foundation.layout.FlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:267)");
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
                FlowColumnOverflow flowColumnOverflow = new FlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i5, iMo2121roundToPx0680j_4, new l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(qVar, (FlowLayoutOverflowState) obj);
                    }
                }, new l() { // from class: androidx.compose.foundation.layout.FlowColumnOverflow$Companion$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(qVar2, (FlowLayoutOverflowState) obj);
                    }
                }, null);
                composer.updateRememberedValue(flowColumnOverflow);
                objRememberedValue = flowColumnOverflow;
            }
            FlowColumnOverflow flowColumnOverflow2 = (FlowColumnOverflow) objRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return flowColumnOverflow2;
        }

        public final FlowColumnOverflow getClip() {
            return FlowColumnOverflow.Clip;
        }

        public final FlowColumnOverflow getVisible() {
            return FlowColumnOverflow.Visible;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }
    }

    private FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar, l<? super FlowLayoutOverflowState, ? extends p<? super Composer, ? super Integer, ab>> lVar2) {
        super(overflowType, i2, i3, lVar, lVar2, null);
    }

    public /* synthetic */ FlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, l lVar, l lVar2, o oVar) {
        this(overflowType, i2, i3, lVar, lVar2);
    }
}
