package com.waze.coroutines;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f23180a;

    /* renamed from: b, reason: collision with root package name */
    int f23181b;

    /* renamed from: c, reason: collision with root package name */
    int f23182c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f23183d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f23184e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f23185f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f23186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(c cVar, g gVar, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f23183d = cVar;
        this.f23184e = gVar;
        this.f23185f = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        f fVar = new f(this.f23183d, this.f23184e, this.f23185f, eVar);
        fVar.f23186g = obj;
        return fVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.coroutines.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
