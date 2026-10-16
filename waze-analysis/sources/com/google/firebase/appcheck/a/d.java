package com.google.firebase.appcheck.a;

import android.support.v4.app.ac;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.android.gms.o.w;
import com.google.e.a.a.a.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends com.google.firebase.appcheck.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f8844a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.g.c f8845b;

    /* renamed from: c, reason: collision with root package name */
    private final List f8846c;

    /* renamed from: d, reason: collision with root package name */
    private final List f8847d;

    /* renamed from: e, reason: collision with root package name */
    private final i f8848e;

    /* renamed from: f, reason: collision with root package name */
    private final k f8849f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f8850g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f8851h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f8852i;

    /* renamed from: j, reason: collision with root package name */
    private final t f8853j;

    /* renamed from: k, reason: collision with root package name */
    private com.google.firebase.appcheck.a f8854k;

    /* renamed from: l, reason: collision with root package name */
    private com.google.firebase.appcheck.b f8855l;
    private t m;

    public d(com.google.firebase.e eVar, com.google.firebase.g.c cVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        av.m(eVar);
        av.m(cVar);
        this.f8844a = eVar;
        this.f8845b = cVar;
        this.f8846c = new ArrayList();
        this.f8847d = new ArrayList();
        this.f8848e = new i(eVar.a(), eVar.h());
        this.f8849f = new k(eVar.a(), this);
        this.f8850g = executor;
        this.f8851h = executor2;
        this.f8852i = executor3;
        w wVar = new w();
        executor3.execute(new ac(this, wVar, 11));
        this.f8853j = wVar.a();
    }

    public static /* synthetic */ t e(d dVar, com.google.firebase.appcheck.b bVar) {
        dVar.f8852i.execute(new ac(dVar, bVar, 10));
        dVar.f8855l = bVar;
        dVar.f8849f.b(bVar);
        Iterator it = dVar.f8847d.iterator();
        while (it.hasNext()) {
            ((com.google.firebase.appcheck.c) it.next()).a();
        }
        s.b(bVar);
        Iterator it2 = dVar.f8846c.iterator();
        while (it2.hasNext()) {
            ((com.google.firebase.appcheck.b.a) it2.next()).a();
        }
        return ag.c(bVar);
    }

    public static /* synthetic */ void h(d dVar, w wVar) {
        com.google.firebase.appcheck.b bVarA = dVar.f8848e.a();
        if (bVarA != null) {
            dVar.f8855l = bVarA;
        }
        wVar.c(null);
    }

    public static /* synthetic */ t i(d dVar, boolean z) {
        com.google.firebase.appcheck.b bVar;
        if (!z && (bVar = dVar.f8855l) != null && bVar.a() - System.currentTimeMillis() > 300000) {
            return ag.c(dVar.f8855l);
        }
        if (dVar.f8854k == null) {
            return ag.b(new com.google.firebase.h("No AppCheckProvider installed."));
        }
        t tVar = dVar.m;
        if (tVar == null || tVar.j() || dVar.m.i()) {
            dVar.m = dVar.f8854k.a().e(dVar.f8850g, new c(dVar, 0));
        }
        return dVar.m;
    }

    @Override // com.google.firebase.appcheck.d
    public final t a(final boolean z) {
        return this.f8853j.c(this.f8851h, new com.google.android.gms.o.a() { // from class: com.google.firebase.appcheck.a.b
            @Override // com.google.android.gms.o.a
            public final Object a(t tVar) {
                return d.i(this.f8840a, z);
            }
        });
    }

    @Override // com.google.firebase.appcheck.d
    public final t b() {
        com.google.firebase.appcheck.a aVar = this.f8854k;
        return aVar == null ? ag.b(new com.google.firebase.h("No AppCheckProvider installed.")) : aVar.a();
    }

    @Override // com.google.firebase.appcheck.d
    public final void d() {
        com.google.firebase.e eVar = this.f8844a;
        boolean zM = eVar.m();
        this.f8854k = (com.google.firebase.appcheck.a) eVar.f(com.google.firebase.appcheck.playintegrity.a.e.class);
        this.f8849f.c(zM);
    }

    final com.google.firebase.g.c f() {
        return this.f8845b;
    }
}
