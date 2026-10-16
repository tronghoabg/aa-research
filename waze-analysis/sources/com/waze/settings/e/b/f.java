package com.waze.settings.e.b;

import android.content.Context;
import com.waze.bs;
import com.waze.settings.cs;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37139a;

    f(l lVar) {
        this.f37139a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        e eVar2 = (e) obj;
        if (eVar2 instanceof b) {
            cs csVarD = l.d(this.f37139a);
            if (csVarD != null) {
                csVarD.b(-1);
            }
        } else if (eVar2 instanceof c) {
            cs csVarD2 = l.d(this.f37139a);
            if (csVarD2 != null) {
                csVarD2.b(0);
            }
        } else if (eVar2 instanceof a) {
            cs csVarD3 = l.d(this.f37139a);
            if (csVarD3 != null) {
                csVarD3.b(3);
            }
        } else {
            if (!(eVar2 instanceof d)) {
                throw new h.i();
            }
            l lVar = this.f37139a;
            bs bsVarC = l.c(lVar);
            Context contextRequireContext = lVar.requireContext();
            x.e(contextRequireContext, "requireContext(...)");
            bsVarC.a(contextRequireContext, ((d) eVar2).a());
        }
        return ab.f48028a;
    }
}
