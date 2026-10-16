package com.waze.car_lib.j;

import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f20251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f20252b;

    p(aq aqVar, r rVar) {
        this.f20251a = aqVar;
        this.f20252b = rVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        aq aqVar = this.f20251a;
        if (!zBooleanValue) {
            com.waze.car_lib.i.a.aa aaVar = (com.waze.car_lib.i.a.aa) aqVar.f48105a;
            if (aaVar != null) {
                aaVar.a();
            }
            aqVar.f48105a = null;
        } else if (aqVar.f48105a == null) {
            aqVar.f48105a = this.f20252b.f20258c.a();
        }
        return h.ab.f48028a;
    }
}
