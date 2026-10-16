package android.support.v4.app;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ag extends ActivityResultLauncher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f112a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActivityResultContract f113b;

    ag(AtomicReference atomicReference, ActivityResultContract activityResultContract) {
        this.f112a = atomicReference;
        this.f113b = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final ActivityResultContract getContract() {
        return this.f113b;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void launch(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f112a.get();
        if (activityResultLauncher == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        activityResultLauncher.launch(obj, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void unregister() {
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f112a.getAndSet(null);
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
    }
}
