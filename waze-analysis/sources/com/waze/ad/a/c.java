package com.waze.ad.a;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Lifecycle.Event f13885a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Lifecycle f13886b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f13887c;

    c(Lifecycle.Event event, Lifecycle lifecycle, h.g.a.a aVar) {
        this.f13885a = event;
        this.f13886b = lifecycle;
        this.f13887c = aVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        x.f(lifecycleOwner, "source");
        x.f(event, NotificationCompat.CATEGORY_EVENT);
        if (this.f13885a == event) {
            this.f13886b.removeObserver(this);
            this.f13887c.invoke();
        }
    }
}
