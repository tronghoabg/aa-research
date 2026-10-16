package com.waze.t.b;

/* loaded from: classes5.dex */
public final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40833a;

    /* renamed from: b, reason: collision with root package name */
    int f40834b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ av f40835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(av avVar, h.c.e eVar) {
        super(eVar);
        this.f40835c = avVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40833a = obj;
        this.f40834b |= Integer.MIN_VALUE;
        return this.f40835c.emit(null, this);
    }
}
