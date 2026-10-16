package com.waze.bn;

import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f17157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f17158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(j jVar, h.c.e eVar) {
        super(2, eVar);
        this.f17158b = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f17158b, eVar);
        hVar.f17157a = ((Boolean) obj).booleanValue();
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((h) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f17157a;
        j jVar = this.f17158b;
        jVar.f17161a.e("IsNavigating changed to " + z);
        if (!z) {
            com.waze.resume_drive.a aVar2 = (com.waze.resume_drive.a) jVar.f17164d.d();
            if (aVar2 instanceof e) {
                jVar.f17161a.e("Stopping roaming due to end navigation");
            } else if (aVar2 instanceof d) {
                jVar.f17161a.e("Stopping pending roaming due to end navigation");
                ((d) aVar2).b().s(null);
            } else {
                if (!(aVar2 instanceof c)) {
                    throw new h.i();
                }
                jVar.f17161a.e("Already NotRoaming when navigation was canceled");
            }
            jVar.f17164d.e(c.f17149a);
        }
        return ab.f48028a;
    }
}
