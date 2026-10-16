package com.waze.nightmode;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.b f32460a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f32461b;

    public d() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_ANDROID_AUTO_USE_MOBILE_THEME_MODE_ON_CAR;
        h.g.b.x.e(bVar, "CONFIG_VALUE_ANDROID_AUT…_MOBILE_THEME_MODE_ON_CAR");
        this.f32460a = bVar;
        this.f32461b = new ac(com.waze.n.ac.p(bVar), this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a d(boolean z) {
        return z ? a.f32438b : a.f32437a;
    }

    @Override // com.waze.nightmode.b
    public final a a() {
        Boolean boolB = this.f32460a.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return d(boolB.booleanValue());
    }

    @Override // com.waze.nightmode.b
    public final kotlinx.coroutines.b.k b() {
        return this.f32461b;
    }
}
