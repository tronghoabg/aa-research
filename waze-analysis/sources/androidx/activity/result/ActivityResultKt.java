package androidx.activity.result;

import android.content.Intent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultKt {
    public static final int component1(ActivityResult activityResult) {
        x.f(activityResult, "<this>");
        return activityResult.getResultCode();
    }

    public static final Intent component2(ActivityResult activityResult) {
        x.f(activityResult, "<this>");
        return activityResult.getData();
    }
}
