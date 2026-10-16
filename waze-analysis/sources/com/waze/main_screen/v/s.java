package com.waze.main_screen.v;

import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f27820a;

    s(z zVar) {
        this.f27820a = zVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        long jLongValue = ((Number) obj).longValue();
        z zVar = this.f27820a;
        if (jLongValue == 0) {
            zVar.n();
            return h.ab.f48028a;
        }
        Object objO = aj.O(new x(zVar, null), eVar);
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objO != aVar) {
            objO = h.ab.f48028a;
        }
        return objO == aVar ? objO : h.ab.f48028a;
    }
}
