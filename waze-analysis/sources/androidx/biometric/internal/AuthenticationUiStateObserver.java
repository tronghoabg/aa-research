package androidx.biometric.internal;

import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class AuthenticationUiStateObserver {
    private br uiStateObserverJob;

    public final void connectObservers() {
        this.uiStateObserverJob = createObserverJob();
    }

    protected abstract br createObserverJob();

    public final void disconnectObservers() {
        br brVar = this.uiStateObserverJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.uiStateObserverJob = null;
    }
}
