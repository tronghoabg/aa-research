package com.waze.map.d;

import com.waze.main_screen.ac.k;
import com.waze.map.aq;
import h.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f28730a = g.a(new com.waze.main_screen.c.g.a(20));

    /* renamed from: b, reason: collision with root package name */
    private final h.f f28731b = g.a(new k(1));

    @Override // com.waze.map.aq
    public final boolean a() {
        Object value = this.f28731b.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.map.aq
    public final boolean b() {
        Object value = this.f28730a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }
}
