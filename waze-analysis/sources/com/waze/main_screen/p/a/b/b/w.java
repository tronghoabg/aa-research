package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.NavResultData;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f26997a;

    w(ab abVar) {
        this.f26997a = abVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        NavResultData navResultData = (NavResultData) obj;
        bn bnVar = this.f26997a.f26881d;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, s.a((s) objD, navResultData, false, false, 30)));
        return h.ab.f48028a;
    }
}
