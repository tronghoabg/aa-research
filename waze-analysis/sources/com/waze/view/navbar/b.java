package com.waze.view.navbar;

import android.view.ViewTreeObserver;
import com.waze.main.navigate.EventOnRoute;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventOnRoute[] f45066a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EventsOnRouteView f45067b;

    b(EventsOnRouteView eventsOnRouteView, EventOnRoute[] eventOnRouteArr) {
        this.f45066a = eventOnRouteArr;
        Objects.requireNonNull(eventsOnRouteView);
        this.f45067b = eventsOnRouteView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        EventsOnRouteView eventsOnRouteView = this.f45067b;
        eventsOnRouteView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        eventsOnRouteView.e(this.f45066a);
    }
}
