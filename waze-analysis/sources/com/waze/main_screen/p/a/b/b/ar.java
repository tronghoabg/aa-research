package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.ft;
import com.waze.navigate.fu;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f26923a;

    ar(az azVar) {
        this.f26923a = azVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        al alVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bn bnVar = this.f26923a.f26943g;
        do {
            objD = bnVar.d();
            alVar = (al) objD;
        } while (!bnVar.f(objD, al.b(alVar, null, fu.c(alVar.f26914b, new ft(zBooleanValue), false, 2), null, false, 13)));
        return h.ab.f48028a;
    }
}
