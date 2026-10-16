package com.waze.profile;

import com.waze.shared_infra.r.w;
import com.waze.shared_infra.r.x;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f33397a;

    j(l lVar) {
        this.f33397a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.shared_infra.h.b bVar = (com.waze.shared_infra.h.b) obj;
        if (bVar instanceof x) {
            Object objD = l.d(this.f33397a, eVar);
            return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
        }
        if ((bVar instanceof com.waze.shared_infra.r.t) || (bVar instanceof com.waze.shared_infra.r.u) || h.g.b.x.n(bVar, com.waze.shared_infra.r.v.f37998a) || h.g.b.x.n(bVar, w.f37999a) || h.g.b.x.n(bVar, com.waze.shared_infra.r.s.f37995a) || (bVar instanceof com.waze.shared_infra.r.r)) {
            return ab.f48028a;
        }
        throw new h.i();
    }
}
