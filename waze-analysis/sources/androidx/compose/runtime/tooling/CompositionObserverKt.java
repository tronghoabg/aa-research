package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.Recomposer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionObserverKt {
    public static final CompositionObserverHandle observe(Recomposer recomposer, CompositionRegistrationObserver compositionRegistrationObserver) {
        return recomposer.addCompositionRegistrationObserver$runtime(compositionRegistrationObserver);
    }

    public static final CompositionObserverHandle setObserver(Composition composition, CompositionObserver compositionObserver) {
        ObservableComposition observableComposition = (ObservableComposition) CompositionKt.getCompositionService(composition, CompositionKt.getObservableCompositionServiceKey());
        if (observableComposition != null) {
            return observableComposition.setObserver(compositionObserver);
        }
        return null;
    }
}
