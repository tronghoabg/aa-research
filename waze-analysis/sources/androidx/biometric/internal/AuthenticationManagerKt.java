package androidx.biometric.internal;

import android.app.Activity;
import android.support.v4.app.ar;
import android.support.v4.app.av;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AuthenticationManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isPermanentlyRemoved(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        boolean z;
        boolean z2 = event == Lifecycle.Event.ON_STOP || event == Lifecycle.Event.ON_DESTROY;
        if (lifecycleOwner instanceof Activity) {
            Activity activity = (Activity) lifecycleOwner;
            z = activity.isFinishing() || !activity.isChangingConfigurations();
        } else {
            if (lifecycleOwner instanceof ar) {
                ar arVar = (ar) lifecycleOwner;
                if (arVar.isRemoving()) {
                    if (arVar.getActivity() != null) {
                        av activity2 = arVar.getActivity();
                        x.c(activity2);
                        if (!activity2.isChangingConfigurations()) {
                        }
                    }
                }
            }
        }
        return z2 && z;
    }
}
