package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.NavResultData;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class at implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f26926a;

    at(az azVar) {
        this.f26926a = azVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        NavResultData navResultData = (NavResultData) obj;
        bn bnVar = this.f26926a.f26943g;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, al.b((al) objD, navResultData, null, null, false, 14)));
        return h.ab.f48028a;
    }
}
