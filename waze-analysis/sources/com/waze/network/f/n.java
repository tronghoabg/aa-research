package com.waze.network.f;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32323a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32324b;

    public n() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REALTIME_EXCLUDE_CONSENT_FROM_LOGIN.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f32323a = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_REALTIME_EXCLUDE_MEETINGS_FROM_LOGIN.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        this.f32324b = boolB2.booleanValue();
    }

    public final boolean a() {
        return this.f32323a;
    }

    public final boolean b() {
        return this.f32324b;
    }
}
