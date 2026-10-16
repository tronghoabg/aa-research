package com.google.firebase.sessions.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f10765a;

    /* renamed from: b, reason: collision with root package name */
    Object f10766b;

    /* renamed from: c, reason: collision with root package name */
    Object f10767c;

    /* renamed from: d, reason: collision with root package name */
    Object f10768d;

    /* renamed from: e, reason: collision with root package name */
    Object f10769e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f10770f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f10771g;

    /* renamed from: h, reason: collision with root package name */
    int f10772h;

    /* renamed from: i, reason: collision with root package name */
    d f10773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f10771g = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10770f = obj;
        this.f10772h |= Integer.MIN_VALUE;
        return this.f10771g.a(this);
    }
}
