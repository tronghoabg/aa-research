package com.waze.app_nav.hub;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private final int f15340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, int i2) {
        super("EventsController", eVar);
        h.g.b.x.f("EventsController", HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(eVar, "intentFactory");
        this.f15340a = i2;
    }

    public final int a() {
        return this.f15340a;
    }

    @Override // com.waze.app_nav.hub.j
    public final String toString() {
        return "LegacyActivityEntry(entryId=" + e() + ", name=" + c() + ", requestCode=" + this.f15340a + ")";
    }
}
