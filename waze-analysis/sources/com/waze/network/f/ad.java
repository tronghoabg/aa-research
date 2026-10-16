package com.waze.network.f;

import com.waze.network.as;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ad implements x {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f32272a = h.g.a(new com.waze.native_managers.n(13));

    private final kotlinx.coroutines.ab d() {
        Object value = this.f32272a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (kotlinx.coroutines.ab) value;
    }

    @Override // com.waze.authentication.ay
    public final /* bridge */ /* synthetic */ Object a(Object obj, h.c.e eVar) {
        Object objV = kotlinx.coroutines.aj.v(d(), new ah((af) obj, (h.c.e) null, 1), eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objV != aVar) {
            objV = h.ab.f48028a;
        }
        return objV == aVar ? objV : h.ab.f48028a;
    }

    @Override // com.waze.network.f.x
    public final int b() {
        return as.a();
    }

    @Override // com.waze.network.f.x
    public final Object c(h.c.e eVar) {
        Object objV = kotlinx.coroutines.aj.v(d(), new ac(null), eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }
}
