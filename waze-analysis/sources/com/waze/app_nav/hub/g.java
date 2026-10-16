package com.waze.app_nav.hub;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class g extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f15341a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15342b;

    public g(String str, e eVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(eVar, "intentFactory");
        this.f15341a = str;
        this.f15342b = eVar;
    }

    @Override // com.waze.app_nav.hub.j
    public final e b() {
        return this.f15342b;
    }

    @Override // com.waze.app_nav.hub.j
    public final String c() {
        return this.f15341a;
    }
}
