package com.waze.o.d.b.b;

/* loaded from: classes5.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f32889a;

    /* renamed from: b, reason: collision with root package name */
    int f32890b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f32891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f32891c = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f32889a = obj;
        this.f32890b |= Integer.MIN_VALUE;
        return this.f32891c.emit(null, this);
    }
}
