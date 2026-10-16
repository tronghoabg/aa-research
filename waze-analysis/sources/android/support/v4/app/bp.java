package android.support.v4.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bp implements ca {

    /* renamed from: a, reason: collision with root package name */
    private final Lifecycle f184a;

    /* renamed from: b, reason: collision with root package name */
    private final ca f185b;

    /* renamed from: c, reason: collision with root package name */
    private final LifecycleEventObserver f186c;

    bp(Lifecycle lifecycle, ca caVar, LifecycleEventObserver lifecycleEventObserver) {
        this.f184a = lifecycle;
        this.f185b = caVar;
        this.f186c = lifecycleEventObserver;
    }

    public final void a() {
        this.f184a.removeObserver(this.f186c);
    }

    public final boolean b(Lifecycle.State state) {
        return this.f184a.getCurrentState().isAtLeast(state);
    }

    @Override // android.support.v4.app.ca
    public final void onFragmentResult(String str, Bundle bundle) {
        this.f185b.onFragmentResult(str, bundle);
    }
}
