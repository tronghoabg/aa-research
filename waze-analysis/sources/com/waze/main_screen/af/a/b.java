package com.waze.main_screen.af.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f25757b;

    /* renamed from: c, reason: collision with root package name */
    int f25758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(i iVar, h.c.e eVar) {
        super(eVar);
        this.f25757b = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25756a = obj;
        this.f25758c |= Integer.MIN_VALUE;
        return i.b(this.f25757b, null, this);
    }
}
