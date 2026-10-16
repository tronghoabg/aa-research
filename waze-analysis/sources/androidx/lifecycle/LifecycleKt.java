package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import h.ab;
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.e.ac;
import kotlinx.coroutines.s;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleObserver addObserver(Lifecycle lifecycle, final q<? super LifecycleObserver, ? super LifecycleOwner, ? super Lifecycle.Event, ab> qVar) {
        x.f(lifecycle, "<this>");
        x.f(qVar, "action");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleKt$addObserver$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                x.f(lifecycleOwner, "source");
                x.f(event, NotificationCompat.CATEGORY_EVENT);
                qVar.invoke(this, lifecycleOwner, event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return lifecycleEventObserver;
    }

    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        x.f(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            s sVarQ = aj.Q();
            int i2 = av.f51370a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, sVarQ.plus(ac.f51860a.c()));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    public static final k<Lifecycle.Event> getEventFlow(Lifecycle lifecycle) {
        x.f(lifecycle, "<this>");
        k kVarN = ai.n(new LifecycleKt$eventFlow$1(lifecycle, null));
        int i2 = av.f51370a;
        return ai.H(kVarN, ac.f51860a.c());
    }
}
