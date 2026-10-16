package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingOptions {
    public static final Bundle setLaunchingActivityStack(Bundle bundle, Context context, ActivityStack activityStack) {
        x.f(bundle, "<this>");
        x.f(context, "context");
        x.f(activityStack, "activityStack");
        return ActivityEmbeddingController.Companion.getInstance(context).setLaunchingActivityStack$window(bundle, activityStack);
    }

    public static final Bundle setOverlayCreateParams(Bundle bundle, Activity activity, OverlayCreateParams overlayCreateParams) {
        x.f(bundle, "<this>");
        x.f(activity, "activity");
        x.f(overlayCreateParams, "overlayCreateParams");
        return OverlayController.Companion.getInstance(activity).setOverlayCreateParams$window(bundle, overlayCreateParams);
    }
}
