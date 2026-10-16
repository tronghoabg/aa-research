package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(I i2) {
        launch(i2, null);
    }

    public abstract void launch(I i2, ActivityOptionsCompat activityOptionsCompat);

    public abstract void unregister();
}
