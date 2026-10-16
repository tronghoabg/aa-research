package com.waze.navigate.location_preview;

import com.waze.R;
import com.waze.map.b.ed;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.h.c f31743a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ed f31744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(com.waze.shared_infra.h.c cVar, ed edVar, h.c.e eVar) {
        super(2, eVar);
        this.f31743a = cVar;
        this.f31744b = edVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f31743a, this.f31744b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.install.ah.d(this.f31744b, null, null, h.a.i.d(com.waze.map.c.b(new com.waze.map.bc(this.f31743a, new com.waze.map.az(R.drawable.WazeMap_SelectionMarker), null, null, null, 0.0f, null, 1020))), null, null, null, 251);
        return h.ab.f48028a;
    }
}
