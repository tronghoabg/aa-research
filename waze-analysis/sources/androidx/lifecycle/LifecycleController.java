package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h.g.b.x;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final br brVar) {
        x.f(lifecycle, "lifecycle");
        x.f(state, "minState");
        x.f(dispatchQueue, "dispatchQueue");
        x.f(brVar, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f$0, brVar, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            brVar.s(null);
            finish();
        }
    }

    private final void handleDestroy(br brVar) {
        brVar.s(null);
        finish();
    }

    static final void observer$lambda$0(LifecycleController lifecycleController, br brVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "source");
        x.f(event, "<unused var>");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            brVar.s(null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
