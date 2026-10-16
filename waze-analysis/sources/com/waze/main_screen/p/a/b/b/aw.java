package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.ei;
import com.waze.navigate.fu;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aw implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ az f26932a;

    aw(az azVar) {
        this.f26932a = azVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        al alVar;
        Object objD2;
        al alVar2;
        az azVar = this.f26932a;
        ei eiVar = (ei) obj;
        br brVar = azVar.f26942f;
        if (brVar != null) {
            brVar.s(null);
        }
        ei eiVar2 = ei.f31310a;
        int iOrdinal = eiVar.ordinal();
        if (iOrdinal == 0) {
            bn bnVar = azVar.f26943g;
            do {
                objD = bnVar.d();
                alVar = (al) objD;
            } while (!bnVar.f(objD, al.b(alVar, null, fu.c(alVar.f26914b, null, false, 1), null, false, 13)));
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            bn bnVar2 = azVar.f26943g;
            do {
                objD2 = bnVar2.d();
                alVar2 = (al) objD2;
            } while (!bnVar2.f(objD2, al.b(alVar2, null, fu.c(alVar2.f26914b, null, true, 1), null, false, 13)));
            azVar.f26942f = kotlinx.coroutines.aj.z(azVar.f26941e, null, null, new ay(azVar, null), 3);
        }
        return h.ab.f48028a;
    }
}
