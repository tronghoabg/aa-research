package com.waze.car_lib.screens;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.waze.planned_drive.PlannedDriveFragment;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class t implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22032a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22033b;

    public /* synthetic */ t(Object obj, int i2) {
        this.f22033b = i2;
        this.f22032a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = this.f22033b;
        if (i2 == 0) {
            v.f((v) this.f22032a, lifecycleOwner, event);
            return;
        }
        if (i2 == 1) {
            PlannedDriveFragment.t((PlannedDriveFragment) this.f22032a, event);
            return;
        }
        int i3 = com.waze.bw.c.d.ct.f18062a;
        h.g.b.x.f(lifecycleOwner, "<unused var>");
        h.g.b.x.f(event, NotificationCompat.CATEGORY_EVENT);
        com.waze.z.a.ae aeVar = com.waze.z.a.ae.f45619a;
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
        if (event.ordinal() != 1) {
            return;
        }
        a.a.t(this.f22032a).invoke();
    }
}
