package com.waze.network.f;

import com.waze.navigate.dc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32301a;

    public d(ag agVar) {
        h.g.b.x.f(agVar, "sessionTokenRepository");
        this.f32301a = kotlinx.coroutines.b.ai.y(new c(agVar.d()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.k a() {
        return this.f32301a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean b() {
        Object value = this.f32301a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public d() {
        this.f32301a = h.g.a(new dc(5));
    }
}
