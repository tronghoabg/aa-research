package com.waze.sharedrive;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r implements com.waze.location.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final long f38767a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38768b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f38769c;

    public r(int i2, byte[] bArr) {
        this.f38769c = i2;
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_LOCATION_TIMEOUT_MILLIS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f38767a = h.o.c.j(lB.longValue(), h.o.d.f48272c);
        Long lB2 = ConfigValues.CONFIG_VALUE_START_STATE_LOCATION_FIX_FRESHNESS_SECONDS.b();
        h.g.b.x.e(lB2, "getValue(...)");
        this.f38768b = h.o.c.j(lB2.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.location.b.a
    public final long a() {
        return this.f38768b;
    }

    @Override // com.waze.location.b.a
    public final long b() {
        return this.f38767a;
    }

    public r(int i2) {
        this.f38769c = i2;
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_SHARE_DRIVE_LOCATION_TIMEOUT_MILLIS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f38767a = h.o.c.j(lB.longValue(), h.o.d.f48272c);
        Long lB2 = ConfigValues.CONFIG_VALUE_SHARE_DRIVE_LOCATION_FIX_FRESHNESS_SECONDS.b();
        h.g.b.x.e(lB2, "getValue(...)");
        this.f38768b = h.o.c.j(lB2.longValue(), h.o.d.f48273d);
    }
}
