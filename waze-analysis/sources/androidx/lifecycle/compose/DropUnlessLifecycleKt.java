package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DropUnlessLifecycleKt {
    public static final a<ab> dropUnlessResumed(LifecycleOwner lifecycleOwner, a<ab> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i2, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:99)");
        }
        int i4 = i2 << 3;
        a<ab> aVarDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, aVar, composer, (i4 & 112) | 6 | (i4 & DisplayStrings.DS_TAP_TO_VERIFY), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVarDropUnlessStateIsAtLeast;
    }

    public static final a<ab> dropUnlessStarted(LifecycleOwner lifecycleOwner, a<ab> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i2, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:77)");
        }
        int i4 = i2 << 3;
        a<ab> aVarDropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, aVar, composer, (i4 & 112) | 6 | (i4 & DisplayStrings.DS_TAP_TO_VERIFY), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVarDropUnlessStateIsAtLeast;
    }

    private static final a<ab> dropUnlessStateIsAtLeast(final Lifecycle.State state, final LifecycleOwner lifecycleOwner, final a<ab> aVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i2, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:47)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean zChangedInstance = composer.changedInstance(lifecycleOwner) | ((((i2 & 14) ^ 6) > 4 && composer.changed(state.ordinal())) || (i2 & 6) == 4) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(aVar)) || (i2 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.lifecycle.compose.DropUnlessLifecycleKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return DropUnlessLifecycleKt.dropUnlessStateIsAtLeast$lambda$1$0(lifecycleOwner, state, aVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        a<ab> aVar2 = (a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab dropUnlessStateIsAtLeast$lambda$1$0(LifecycleOwner lifecycleOwner, Lifecycle.State state, a aVar) {
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(state)) {
            aVar.invoke();
        }
        return ab.f48028a;
    }
}
