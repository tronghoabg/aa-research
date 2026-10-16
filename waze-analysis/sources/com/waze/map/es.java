package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class es extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f28854b;

    /* renamed from: c, reason: collision with root package name */
    int f28855c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.google_assistant.ah f28856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    es(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f28854b = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f28853a = obj;
        this.f28855c |= Integer.MIN_VALUE;
        return gb.s(this.f28854b, null, null, this);
    }
}
