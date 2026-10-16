package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DerivedStateObserver {
    void done(DerivedState<?> derivedState);

    void start(DerivedState<?> derivedState);
}
