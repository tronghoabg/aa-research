package android.support.v4.app;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class af extends ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function f107a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AtomicReference f108b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActivityResultContract f109c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ActivityResultCallback f110d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ar f111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ar arVar, Function function, AtomicReference atomicReference, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        super(null);
        this.f111e = arVar;
        this.f107a = function;
        this.f108b = atomicReference;
        this.f109c = activityResultContract;
        this.f110d = activityResultCallback;
    }

    @Override // android.support.v4.app.ao
    final void a() {
        Function function = this.f107a;
        ar arVar = this.f111e;
        this.f108b.set(((ActivityResultRegistry) function.apply(null)).register(arVar.generateActivityResultKey(), arVar, this.f109c, this.f110d));
    }
}
