package com.waze;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jg {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24937a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24938b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24939c;

    public jg() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_SHARE_TEXT_INTENT_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f24937a = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_SHARE_TEXT_INTENT_IN_CAR_ENABLED.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        this.f24938b = boolB2.booleanValue();
        this.f24939c = (int) ConfigValues.CONFIG_VALUE_SHARE_TEXT_MAX_LENGTH.b().longValue();
    }

    public final int a() {
        return this.f24939c;
    }

    public final boolean b() {
        return this.f24937a;
    }

    public final boolean c() {
        return this.f24938b;
    }
}
