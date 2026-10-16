package com.waze.main_screen.a.a;

import com.waze.navigate.ek;
import com.waze.navigate.el;
import com.waze.navigate.em;
import com.waze.navigate.et;
import h.ab;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f25548a;

    i(n nVar) {
        this.f25548a = nVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        em emVar = (em) obj;
        ek ekVarA = null;
        el elVar = emVar instanceof el ? (el) emVar : null;
        n nVar = this.f25548a;
        bn bnVar = nVar.f25564k;
        if (elVar != null) {
            if (true == et.p(elVar)) {
                elVar = null;
            }
            if (elVar != null) {
                ekVarA = elVar.a();
            }
        }
        bnVar.e(new g(ekVarA));
        return ab.f48028a;
    }
}
