package com.waze.main_screen.k;

import com.waze.copilot.a.w;
import h.f;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final f f26499a;

    /* renamed from: b, reason: collision with root package name */
    private final f f26500b;

    /* renamed from: c, reason: collision with root package name */
    private final f f26501c;

    /* renamed from: d, reason: collision with root package name */
    private final f f26502d;

    /* renamed from: e, reason: collision with root package name */
    private final w f26503e;

    public a() {
        g.a(new com.waze.main_screen.c.g.a(3));
        this.f26499a = g.a(new com.waze.main_screen.c.g.a(4));
        this.f26500b = g.a(new com.waze.main_screen.c.g.a(5));
        this.f26501c = g.a(new com.waze.main_screen.c.g.a(6));
        this.f26502d = g.a(new com.waze.main_screen.c.g.a(7));
        this.f26503e = new w();
    }

    public final int a() {
        return ((Number) this.f26499a.getValue()).intValue();
    }

    public final boolean b() {
        Object value = this.f26501c.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public final boolean c() {
        Object value = this.f26500b.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public final boolean d() {
        Object value = this.f26502d.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public final w e() {
        return this.f26503e;
    }
}
