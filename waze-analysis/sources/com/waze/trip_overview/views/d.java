package com.waze.trip_overview.views;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RouteHeader f41505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Context context, RouteHeader routeHeader) {
        super(context);
        this.f41505a = routeHeader;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i2) {
        RouteHeader routeHeader = this.f41505a;
        routeHeader.k(routeHeader.j());
    }
}
