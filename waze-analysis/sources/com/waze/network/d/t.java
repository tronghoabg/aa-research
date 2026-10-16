package com.waze.network.d;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import e.a.cq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements e.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32229a;

    public t(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f32229a = eVar;
    }

    @Override // e.a.l
    public final e.a.k b(cq cqVar, e.a.h hVar, e.a.i iVar) {
        String strAc;
        x.f(cqVar, "method");
        x.f(iVar, "next");
        e.a.k kVarA = iVar.a(cqVar, hVar);
        x.e(kVarA, "newCall(...)");
        String strF = cqVar.f();
        x.e(strF, "getFullMethodName(...)");
        x.f(strF, "fullMethodName");
        String str = (String) h.a.i.U(h.n.o.af(strF, new String[]{"."}, 0, 6));
        if (str == null || (strAc = h.n.o.ac(str, DomExceptionUtils.SEPARATOR, ".")) == null) {
            strAc = "";
        }
        return new u(kVarA, this.f32229a, strAc);
    }
}
