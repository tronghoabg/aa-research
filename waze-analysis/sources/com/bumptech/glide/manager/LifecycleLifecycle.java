package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class LifecycleLifecycle implements LifecycleObserver, f {

    /* renamed from: a, reason: collision with root package name */
    private final Set f3526a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Lifecycle f3527b;

    LifecycleLifecycle(Lifecycle lifecycle) {
        this.f3527b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.f
    public final void a(g gVar) {
        this.f3526a.add(gVar);
        Lifecycle lifecycle = this.f3527b;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            gVar.g();
        } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            gVar.h();
        } else {
            gVar.i();
        }
    }

    @Override // com.bumptech.glide.manager.f
    public final void b(g gVar) {
        this.f3526a.remove(gVar);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.g.r.g(this.f3526a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).g();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.g.r.g(this.f3526a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).h();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = com.bumptech.glide.g.r.g(this.f3526a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).i();
        }
    }
}
