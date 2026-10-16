package com.waze.shared_infra.a;

import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f37789a;

    /* renamed from: b, reason: collision with root package name */
    private final af f37790b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineExceptionHandler f37791c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f37792d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f37793e;

    /* renamed from: f, reason: collision with root package name */
    private a f37794f;

    public k(ch chVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        x.f(chVar, "applicationStatus");
        x.f(eVar, "logger");
        x.f(abVar, "dispatcher");
        this.f37789a = eVar;
        h.c.j jVarPlus = aj.Q().plus(abVar);
        String canonicalName = getClass().getCanonicalName();
        af afVarE = aj.e(jVarPlus.plus(new ae(canonicalName == null ? "" : canonicalName)));
        this.f37790b = afVarE;
        this.f37791c = new i(CoroutineExceptionHandler.f51269c, this, 0);
        this.f37792d = kotlinx.coroutines.h.i.c();
        this.f37793e = new LinkedHashSet();
        this.f37794f = a.f37761a;
        ai.m(ai.K(chVar, new g(this, null)), afVarE);
    }

    public static final /* synthetic */ void e(k kVar) {
        a aVar = kVar.f37794f;
        a aVar2 = a.f37761a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            aj.h(kVar.f37790b, null);
            return;
        }
        Set<c> set = kVar.f37793e;
        for (c cVar : set) {
            kVar.f37789a.e("starting daemon ".concat(String.valueOf(cVar.c())));
            aj.z(kVar.f37790b, null, null, new j(cVar, null, 0), 3);
        }
        set.clear();
    }

    public final void f(c cVar) {
        x.f(cVar, "daemon");
        aj.z(this.f37790b, this.f37791c, null, new h(this, cVar, null), 2);
    }
}
