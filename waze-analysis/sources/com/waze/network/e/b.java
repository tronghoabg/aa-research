package com.waze.network.e;

import com.waze.navigate.dc;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f32235a;

    public b() {
        this.f32235a = h.g.a(new com.waze.native_managers.n(12));
    }

    public final long a() {
        return ((h.o.a) this.f32235a.getValue()).w();
    }

    public final boolean b() {
        Object value = this.f32235a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public b(byte[] bArr) {
        this.f32235a = h.g.a(new dc(4));
    }
}
