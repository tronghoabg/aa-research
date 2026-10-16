package android.support.v4.app;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ak implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f117a;

    ak(ar arVar) {
        this.f117a = arVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        View view;
        if (event != Lifecycle.Event.ON_STOP || (view = this.f117a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
