package com.waze.reports_v2.c;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bj f34236a;

    bg(bj bjVar) {
        this.f34236a = bjVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        bj bjVar = this.f34236a;
        com.waze.c.e.cl clVar = (com.waze.c.e.cl) obj;
        com.waze.shared_infra.i.e eVar2 = bjVar.f34245d;
        Objects.toString(clVar);
        eVar2.a("received audioSession.state=".concat(String.valueOf(clVar)));
        if ((clVar instanceof com.waze.h.b) && !bjVar.t()) {
            bjVar.s(new az(ar.f34221l));
            bjVar.p();
        }
        return h.ab.f48028a;
    }
}
