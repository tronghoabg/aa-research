package com.waze.bw.c.c;

import com.waze.bw.c.d.a.bp;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17767a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f17768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp f17769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.tide.s f17770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(am amVar, com.waze.tide.s sVar, bp bpVar, h.c.e eVar) {
        super(2, eVar);
        this.f17768b = amVar;
        this.f17770d = sVar;
        this.f17769c = bpVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new aa(this.f17768b, this.f17770d, this.f17769c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17767a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            am amVar = this.f17768b;
            com.waze.tide.s sVar = this.f17770d;
            bp bpVar = this.f17769c;
            this.f17767a = 1;
            obj = amVar.w.k(sVar, bpVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.waze.sharedui.api.c cVar = (com.waze.sharedui.api.c) obj;
        if (cVar != null) {
            this.f17768b.z.c(cVar);
        }
        bn bnVar = this.f17768b.x;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, com.waze.bw.c.d.l.h((com.waze.bw.c.d.l) objD, null, null, false, null, null, null, 125)));
        return h.ab.f48028a;
    }
}
