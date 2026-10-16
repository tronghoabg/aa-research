package androidx.compose.runtime.tooling;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface CompositionRegistrationObserver {
    void onCompositionRegistered(ObservableComposition observableComposition);

    void onCompositionUnregistered(ObservableComposition observableComposition);
}
