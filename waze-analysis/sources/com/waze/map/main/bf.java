package com.waze.map.main;

/* loaded from: classes6.dex */
public final class bf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29368a;

    /* renamed from: b, reason: collision with root package name */
    int f29369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29370c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29368a = obj;
        this.f29369b |= Integer.MIN_VALUE;
        return this.f29370c.emit(null, this);
    }
}
