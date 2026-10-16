package com.waze.app_nav.hub.a;

import h.g.b.aq;
import h.g.b.x;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final a f15230a = new a(false);

    /* renamed from: b, reason: collision with root package name */
    private final af f15231b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15232c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f15233d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f15234e;

    /* renamed from: f, reason: collision with root package name */
    private final PriorityQueue f15235f;

    public h(af afVar, com.waze.shared_infra.i.e eVar) {
        x.f(afVar, "scope");
        x.f(eVar, "logger");
        this.f15231b = afVar;
        this.f15232c = eVar;
        this.f15233d = ck.b(f15230a);
        this.f15234e = i.c();
        this.f15235f = new PriorityQueue(4, new f(new com.waze.app_nav.hub.c(2), 0));
    }

    public static final /* synthetic */ void f(h hVar) {
        a aVarA = f15230a;
        Iterator it = hVar.f15235f.iterator();
        while (it.hasNext()) {
            aVarA = ((c) it.next()).b().a(aVarA);
        }
        com.waze.shared_infra.i.e eVar = hVar.f15232c;
        Objects.toString(aVarA);
        eVar.g("updating hub policy ".concat(aVarA.toString()));
        hVar.f15233d.e(aVarA);
    }

    @Override // com.waze.app_nav.hub.a.e
    public final /* synthetic */ ch a() {
        return this.f15233d;
    }

    @Override // com.waze.app_nav.hub.a.e
    public final void b(k kVar) {
        x.f(kVar, "rule");
        ai.m(ai.K(kVar, new g(this, new aq(), null)), this.f15231b);
    }
}
