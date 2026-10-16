package com.waze.user;

import com.waze.shared_infra.r.x;
import h.ab;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f44811a;

    b(e eVar) {
        this.f44811a = eVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        bn bnVarE = this.f44811a.e();
        do {
            objD = bnVarE.d();
        } while (!bnVarE.f(objD, new x(((com.waze.shared_infra.h.b) objD).i())));
        return ab.f48028a;
    }
}
