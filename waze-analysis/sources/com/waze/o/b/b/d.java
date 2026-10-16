package com.waze.o.b.b;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements com.waze.o.c.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32729a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32730b;

    public d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_COMPANINIO_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        this.f32729a = boolB.booleanValue();
        Long lB = ConfigValues.CONFIG_VALUE_COMPANINIO_LOCATION_EXPIRATION_MS.b();
        x.e(lB, "getValue(...)");
        this.f32730b = lB.longValue();
        new com.waze.h.c.a(com.waze.h.c.b.f24342c, com.waze.h.c.d.f24349a, com.waze.h.c.c.f24346a);
    }

    @Override // com.waze.o.c.c.b
    public final long a() {
        return this.f32730b;
    }

    @Override // com.waze.t.b.c
    public final /* synthetic */ String b() {
        return null;
    }

    @Override // com.waze.t.b.c
    public final void c() {
    }

    @Override // com.waze.o.c.c.b
    public final boolean d() {
        return this.f32729a;
    }

    @Override // com.waze.t.b.c
    public final boolean e() {
        return true;
    }

    @Override // com.waze.t.b.c
    public final boolean q() {
        return false;
    }
}
