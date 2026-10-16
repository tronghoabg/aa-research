package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class GapRememberObserverHolder implements RememberObserverHolder {
    public static final int $stable = 8;
    private int afterGroupIndex;
    private RememberObserver wrapped;

    public GapRememberObserverHolder(RememberObserver rememberObserver, int i2) {
        this.wrapped = rememberObserver;
        this.afterGroupIndex = i2;
    }

    public final int getAfterGroupIndex() {
        return this.afterGroupIndex;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfterGroupIndex(int i2) {
        this.afterGroupIndex = i2;
    }

    @Override // androidx.compose.runtime.RememberObserverHolder
    public void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
