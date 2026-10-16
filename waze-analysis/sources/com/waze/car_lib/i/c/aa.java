package com.waze.car_lib.i.c;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f20056a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f20057b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.an.a.p f20058c;

    aa(ai aiVar, bn bnVar, com.waze.an.a.p pVar) {
        this.f20056a = aiVar;
        this.f20057b = bnVar;
        this.f20058c = pVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.an.a.p pVar;
        bn bnVar;
        Object objD;
        String strD = ai.d(this.f20056a, (com.waze.an.a.n) obj);
        do {
            pVar = this.f20058c;
            bnVar = this.f20057b;
            objD = bnVar.d();
        } while (!bnVar.f(objD, u.c((u) objD, null, new e(strD, new Integer(pVar.a().b().b())), 1)));
        return h.ab.f48028a;
    }
}
