package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f33598a;

    /* renamed from: b, reason: collision with root package name */
    int f33599b;

    /* renamed from: c, reason: collision with root package name */
    int f33600c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f33601d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ak f33602e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f33603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ak akVar, kotlinx.coroutines.af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f33602e = akVar;
        this.f33603f = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ai aiVar = new ai(this.f33602e, this.f33603f, eVar);
        aiVar.f33601d = obj;
        return aiVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((com.waze.shared_infra.h.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
