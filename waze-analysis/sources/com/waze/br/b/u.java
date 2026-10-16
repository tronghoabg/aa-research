package com.waze.br.b;

import h.ab;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f17352a;

    u(w wVar) {
        this.f17352a = wVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        o oVar = (o) obj;
        w wVar = this.f17352a;
        com.waze.shared_infra.i.e eVar2 = wVar.f17357b;
        Objects.toString(oVar);
        eVar2.e("conversationState: ".concat(String.valueOf(oVar)));
        bn bnVar = wVar.f17361f;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, new q(oVar)));
        if (oVar == null) {
            wVar.f17357b.g("Conversation ended by the agent");
            wVar.f17360e = null;
            br brVar = wVar.f17359d;
            if (brVar != null) {
                brVar.s(null);
            }
            wVar.f17359d = null;
        }
        return ab.f48028a;
    }
}
