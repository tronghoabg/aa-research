package com.waze.install;

import android.content.Context;
import com.waze.location.LocationSensorListener;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class d extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public static final d f24771a = new d();

    d() {
        super(1, LocationSensorListener.class, "canUseLocation", "canUseLocation(Landroid/content/Context;)Z", 0);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(LocationSensorListener.canUseLocation((Context) obj));
    }
}
