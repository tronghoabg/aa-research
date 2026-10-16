package com.waze.uid.activities;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44100a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f44101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f44101b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        m mVar = new m(this.f44101b, eVar);
        mVar.f44100a = obj;
        return mVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((String) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f44101b.s().e((String) this.f44100a);
        return ab.f48028a;
    }
}
