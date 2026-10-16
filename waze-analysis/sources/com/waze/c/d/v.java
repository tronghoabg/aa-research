package com.waze.c.d;

import com.waze.navigate.ei;
import java.util.Objects;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18395a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f18396b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f18396b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(this.f18396b, eVar);
        vVar.f18395a = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((ei) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ei eiVar = (ei) this.f18395a;
        ae aeVar = this.f18396b;
        com.waze.shared_infra.i.e eVar = aeVar.f18280k;
        Objects.toString(eiVar);
        eVar.a("Navigation state changed ".concat(String.valueOf(eiVar)));
        bn bnVar = aeVar.m;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, t.g((t) objD, null, null, null, eiVar, null, 95)));
        return h.ab.f48028a;
    }
}
