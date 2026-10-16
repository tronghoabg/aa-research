package com.google.android.datatransport.runtime;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac implements ab {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ad f4136a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4137b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4138c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.c f4139d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.g.g f4140e;

    ac(com.google.android.datatransport.runtime.c.a aVar, com.google.android.datatransport.runtime.c.a aVar2, com.google.android.datatransport.runtime.scheduling.c cVar, com.waze.map.g.g gVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar) {
        this.f4137b = aVar;
        this.f4138c = aVar2;
        this.f4139d = cVar;
        this.f4140e = gVar;
        mVar.b();
    }

    public static ac c() {
        ad adVar = f4136a;
        if (adVar != null) {
            return (ac) adVar.m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void d(Context context) {
        if (f4136a == null) {
            synchronized (ac.class) {
                if (f4136a == null) {
                    i iVar = new i();
                    iVar.b(context);
                    f4136a = iVar.a();
                }
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.ab
    public final void a(v vVar, com.google.android.datatransport.i iVar) {
        x xVarB = vVar.d().b(vVar.b().d());
        m mVarB = n.b();
        mVarB.i(this.f4137b.a());
        mVarB.q(this.f4138c.a());
        mVarB.p(vVar.e());
        mVarB.h(new l(vVar.a(), (byte[]) vVar.c().a(vVar.b().f())));
        mVarB.g(null);
        if (vVar.b().e() != null) {
            vVar.b().e().b();
            mVarB.m(vVar.b().e().b());
        }
        this.f4139d.b(xVarB, mVarB.a(), iVar);
    }

    public final com.google.android.datatransport.h b(j jVar) {
        Set setUnmodifiableSet = jVar instanceof k ? DesugarCollections.unmodifiableSet(((k) jVar).c()) : Collections.singleton(com.google.android.datatransport.a.a("proto"));
        w wVarA = x.a();
        wVarA.b("cct");
        wVarA.c(((com.google.android.datatransport.cct.a) jVar).d());
        return new y(setUnmodifiableSet, wVarA.a(), this);
    }

    public final com.waze.map.g.g e() {
        return this.f4140e;
    }
}
