package androidx.camera.view;

import android.content.Context;
import androidx.camera.core.RotationProvider;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RotationProvider {
    private final Map<Listener, RotationProvider.Listener> mListeners;
    private final Object mLock;
    private final androidx.camera.core.RotationProvider mRotationProviderCore;

    /* compiled from: WazeSource */
    public interface Listener {
        void onRotationChanged(int i2);
    }

    RotationProvider(Context context, boolean z) {
        this.mLock = new Object();
        this.mListeners = new HashMap();
        this.mRotationProviderCore = new androidx.camera.core.RotationProvider(context, z);
    }

    static int orientationToSurfaceRotation(int i2) {
        if (i2 >= 315 || i2 < 45) {
            return 0;
        }
        if (i2 >= 225) {
            return 1;
        }
        return i2 >= 135 ? 2 : 3;
    }

    public boolean addListener(Executor executor, final Listener listener) {
        synchronized (this.mLock) {
            RotationProvider.Listener listenerRemove = this.mListeners.remove(listener);
            if (listenerRemove != null) {
                this.mRotationProviderCore.removeListener(listenerRemove);
            }
            Objects.requireNonNull(listener);
            RotationProvider.Listener listener2 = new RotationProvider.Listener() { // from class: androidx.camera.view.RotationProvider$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.RotationProvider.Listener
                public final void onRotationChanged(int i2) {
                    listener.onRotationChanged(i2);
                }
            };
            if (!this.mRotationProviderCore.addListener(executor, listener2)) {
                return false;
            }
            this.mListeners.put(listener, listener2);
            return true;
        }
    }

    public void removeListener(Listener listener) {
        synchronized (this.mLock) {
            RotationProvider.Listener listenerRemove = this.mListeners.remove(listener);
            if (listenerRemove != null) {
                this.mRotationProviderCore.removeListener(listenerRemove);
            }
        }
    }

    void updateOrientationForTesting(int i2) {
        this.mRotationProviderCore.updateOrientationForTesting(i2);
    }

    public RotationProvider(Context context) {
        this(context, false);
    }
}
