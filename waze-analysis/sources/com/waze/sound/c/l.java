package com.waze.sound.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39620a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f39622c;

    /* renamed from: d, reason: collision with root package name */
    int f39623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f39622c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39621b = obj;
        this.f39623d |= Integer.MIN_VALUE;
        return this.f39622c.emit(null, this);
    }
}
