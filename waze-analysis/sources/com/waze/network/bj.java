package com.waze.network;

import com.waze.navigate.dc;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private final Object f32151a;

    public bj() {
        this.f32151a = h.g.a(new dc(3));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.network.f.e, java.lang.Object] */
    public final String a() {
        return com.waze.network.b.ay.f(this.f32151a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.network.f.e, java.lang.Object] */
    public final String b() {
        ?? r1 = this.f32151a;
        h.g.b.x.f(r1, "<this>");
        return r1.f().concat("/static");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean c() {
        Object value = this.f32151a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public bj(com.waze.network.f.e eVar) {
        h.g.b.x.f(eVar, "sessionConfig");
        this.f32151a = eVar;
    }
}
