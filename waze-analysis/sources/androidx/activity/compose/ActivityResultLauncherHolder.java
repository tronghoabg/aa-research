package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;
    private ActivityResultLauncher<I> launcher;

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i2, ActivityOptionsCompat activityOptionsCompat) {
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        activityResultLauncher.launch(i2, activityOptionsCompat);
    }

    public final void setLauncher(ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        activityResultLauncher.unregister();
    }
}
