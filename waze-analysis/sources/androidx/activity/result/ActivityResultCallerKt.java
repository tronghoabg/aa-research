package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<ab> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, ActivityResultRegistry activityResultRegistry, final l<O, ab> lVar) {
        x.f(activityResultCaller, "<this>");
        x.f(activityResultContract, "contract");
        x.f(activityResultRegistry, "registry");
        x.f(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                lVar.invoke(obj);
            }
        }), activityResultContract, i2);
    }

    public static final <I, O> ActivityResultLauncher<ab> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, final l<O, ab> lVar) {
        x.f(activityResultCaller, "<this>");
        x.f(activityResultContract, "contract");
        x.f(lVar, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                lVar.invoke(obj);
            }
        }), activityResultContract, i2);
    }
}
