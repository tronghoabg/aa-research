package androidx.window.area;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WindowAreaPresentationSessionCallback {
    void onContainerVisibilityChanged(boolean z);

    void onSessionEnded(Throwable th);

    void onSessionStarted(WindowAreaSessionPresenter windowAreaSessionPresenter);
}
