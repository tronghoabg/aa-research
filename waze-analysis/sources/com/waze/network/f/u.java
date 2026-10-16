package com.waze.network.f;

import com.waze.authentication.ax;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f32345a;

    /* renamed from: b, reason: collision with root package name */
    Object f32346b;

    /* renamed from: c, reason: collision with root package name */
    boolean f32347c;

    /* renamed from: d, reason: collision with root package name */
    int f32348d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f32349e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.authentication.x f32350f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ax f32351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(w wVar, ax axVar, com.waze.authentication.x xVar, h.c.e eVar) {
        super(2, eVar);
        this.f32349e = wVar;
        this.f32351g = axVar;
        this.f32350f = xVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new u(this.f32349e, this.f32351g, this.f32350f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
