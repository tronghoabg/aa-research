package com.waze.main_screen.af.a;

import com.waze.asks.ar;
import com.waze.asks.as;
import com.waze.asks.q;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f25760b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f25761c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.asks.d f25762d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ as f25763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(i iVar, q qVar, com.waze.asks.d dVar, as asVar, h.c.e eVar) {
        super(2, eVar);
        this.f25760b = iVar;
        this.f25761c = qVar;
        this.f25762d = dVar;
        this.f25763e = asVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f25760b, this.f25761c, this.f25762d, this.f25763e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25759a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25759a = 1;
            if (i.b(this.f25760b, this.f25761c, this) == aVar) {
                return aVar;
            }
        }
        if (this.f25762d instanceof com.waze.asks.c) {
            ar.removeReportById$default(this.f25760b.f25779h, this.f25763e.a(), null, 2, null);
        }
        return ab.f48028a;
    }
}
