package com.waze.uid.state_impl.a;

import com.waze.shared_infra.q.i;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f44564a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f44565b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f44566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, i iVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f44565b = eVar;
        this.f44566c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f44565b, this.f44566c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r10 == r2) goto L20;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.state_impl.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
