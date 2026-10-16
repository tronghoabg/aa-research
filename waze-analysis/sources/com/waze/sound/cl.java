package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cl extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39682a;

    /* renamed from: b, reason: collision with root package name */
    Object f39683b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f39684c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ co f39685d;

    /* renamed from: e, reason: collision with root package name */
    int f39686e;

    /* renamed from: f, reason: collision with root package name */
    String f39687f;

    /* renamed from: g, reason: collision with root package name */
    String f39688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cl(co coVar, h.c.e eVar) {
        super(eVar);
        this.f39685d = coVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39684c = obj;
        this.f39686e |= Integer.MIN_VALUE;
        return this.f39685d.e(null, null, this);
    }
}
