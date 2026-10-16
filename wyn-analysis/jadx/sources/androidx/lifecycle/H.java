package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class H {
    public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
