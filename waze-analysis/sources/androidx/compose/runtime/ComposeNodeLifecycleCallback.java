package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ComposeNodeLifecycleCallback {
    void onDeactivate();

    void onRelease();

    void onReuse();
}
