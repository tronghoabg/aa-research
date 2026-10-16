package com.waze.alerters;

import androidx.exifinterface.media.ExifInterface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f14130a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.d f14131b;

    public a(com.waze.config.b bVar, com.waze.config.d dVar) {
        x.f(bVar, "blockedLaneIconsEnabled");
        x.f(dVar, "personalSafetyAlertIconVariant");
        this.f14130a = bVar;
        this.f14131b = dVar;
    }

    public final boolean a() {
        Boolean boolB = this.f14130a.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public final boolean b() {
        return x.n(this.f14131b.b(), ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
    }
}
