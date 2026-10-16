package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$contentDelegate$1 implements p<Composer, Integer, ab> {
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ q<ConstraintLayoutScope, Composer, Integer, ab> $content;
    final /* synthetic */ MutableState<ab> $contentTracker;
    final /* synthetic */ MutableState<ConstraintSet> $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState<ConstraintSet> $start;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(MutableState<ab> mutableState, Ref<CompositionSource> ref, ConstraintLayoutScope constraintLayoutScope, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, ab> qVar, o<ConstraintSet> oVar, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3) {
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$content = qVar;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
    }

    public final void invoke(Composer composer, int i2) {
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-314716594, i2, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(ab.f48028a);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        this.$content.invoke(this.$scope, composer, 0);
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope = this.$scope;
        final MutableState<ConstraintSet> mutableState = this.$start;
        final MutableState<ConstraintSet> mutableState2 = this.$end;
        final o<ConstraintSet> oVar = this.$channel;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (a) new a<ab>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$contentDelegate$1$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RawConstraintSet rawConstraintSet = new RawConstraintSet(constraintLayoutScope.getContainerObject().mo11647clone());
                    if (mutableState.getValue() != null && mutableState2.getValue() != null) {
                        oVar.i(rawConstraintSet);
                    } else {
                        mutableState.setValue(rawConstraintSet);
                        mutableState2.setValue(mutableState.getValue());
                    }
                }

                @Override // h.g.a.a
                public /* bridge */ /* synthetic */ ab invoke() {
                    invoke2();
                    return ab.f48028a;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        EffectsKt.SideEffect((a) objRememberedValue, composer, 0);
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
