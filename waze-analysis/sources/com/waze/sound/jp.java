package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40338a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jq f40339b;

    /* renamed from: c, reason: collision with root package name */
    int f40340c;

    /* renamed from: d, reason: collision with root package name */
    jq f40341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jp(jq jqVar, h.c.e eVar) {
        super(eVar);
        this.f40339b = jqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40338a = obj;
        this.f40340c |= Integer.MIN_VALUE;
        Object objB = jq.b(this.f40339b, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
