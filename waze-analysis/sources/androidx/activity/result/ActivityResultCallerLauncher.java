package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<ab> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultContract<ab, O> contract;
    private final ActivityResultLauncher<I> launcher;
    private final f resultContract$delegate;

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i2) {
        x.f(activityResultLauncher, "launcher");
        x.f(activityResultContract, "callerContract");
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i2;
        this.resultContract$delegate = g.a(new a() { // from class: androidx.activity.result.ActivityResultCallerLauncher$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ActivityResultCallerLauncher.resultContract_delegate$lambda$0(this.f$0);
            }
        });
        this.contract = getResultContract();
    }

    private final ActivityResultContract<ab, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    static final ActivityResultCallerLauncher$resultContract$2$1 resultContract_delegate$lambda$0(final ActivityResultCallerLauncher activityResultCallerLauncher) {
        return new ActivityResultContract<ab, O>(activityResultCallerLauncher) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            {
                this.this$0 = activityResultCallerLauncher;
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, ab abVar) {
                x.f(context, "context");
                x.f(abVar, "input");
                ActivityResultCallerLauncher<I, O> activityResultCallerLauncher2 = this.this$0;
                return activityResultCallerLauncher2.getCallerContract().createIntent(context, activityResultCallerLauncher2.getCallerInput());
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public O parseResult(int i2, Intent intent) {
                return (O) this.this$0.getCallerContract().parseResult(i2, intent);
            }
        };
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract<ab, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(ab abVar, ActivityOptionsCompat activityOptionsCompat) {
        x.f(abVar, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }
}
