package androidx.compose.ui.window;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPopup_androidKt$Popup$popupLayout$1$1$1 extends y implements p<Composer, Integer, ab> {
    final /* synthetic */ State<p<Composer, Integer, ab>> $currentContent$delegate;
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidPopup_androidKt$Popup$popupLayout$1$1$1(PopupLayout popupLayout, State<? extends p<? super Composer, ? super Integer, ab>> state) {
        super(2);
        this.$this_apply = popupLayout;
        this.$currentContent$delegate = state;
    }

    public final void invoke(Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-297523940, i2, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
        }
        CompositionLocalKt.CompositionLocalProvider(AndroidPopup_androidKt.getLocalIsInPopupLayout().provides(true), ComposableLambdaKt.rememberComposableLambda(1022273628, true, new AnonymousClass1(this.$this_apply, this.$currentContent$delegate), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return ab.f48028a;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ State<p<Composer, Integer, ab>> $currentContent$delegate;
        final /* synthetic */ PopupLayout $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PopupLayout popupLayout, State<? extends p<? super Composer, ? super Integer, ab>> state) {
            super(2);
            this.$this_apply = popupLayout;
            this.$currentContent$delegate = state;
        }

        public final void invoke(Composer composer, int i2) {
            if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022273628, i2, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
            }
            Modifier.Companion companion = Modifier.Companion;
            AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1 androidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1RememberedValue = composer.rememberedValue();
            if (androidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1RememberedValue == Composer.Companion.getEmpty()) {
                androidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1RememberedValue = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.INSTANCE;
                composer.updateRememberedValue(androidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1RememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) androidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1RememberedValue);
            boolean zChangedInstance = composer.changedInstance(this.$this_apply);
            PopupLayout popupLayout = this.$this_apply;
            AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1 androidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1RememberedValue = composer.rememberedValue();
            if (zChangedInstance || androidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1RememberedValue == Composer.Companion.getEmpty()) {
                androidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1RememberedValue = new AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1(popupLayout);
                composer.updateRememberedValue(androidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1RememberedValue);
            }
            Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics, (l) androidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1RememberedValue), true != this.$this_apply.getCanCalculatePosition() ? 0.0f : 1.0f);
            p pVarPopup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(this.$currentContent$delegate);
            AndroidPopup_androidKt$SimpleStack$1$1 androidPopup_androidKt$SimpleStack$1$1RememberedValue = composer.rememberedValue();
            if (androidPopup_androidKt$SimpleStack$1$1RememberedValue == Composer.Companion.getEmpty()) {
                androidPopup_androidKt$SimpleStack$1$1RememberedValue = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                composer.updateRememberedValue(androidPopup_androidKt$SimpleStack$1$1RememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) androidPopup_androidKt$SimpleStack$1$1RememberedValue;
            int iM = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarPopup$lambda$0.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }
}
