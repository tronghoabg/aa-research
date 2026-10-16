package com.waze.map;

import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29152a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gi(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29153b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f29153b != 0) {
            gi giVar = new gi(eVar, 1, null);
            giVar.f29152a = obj;
            return giVar;
        }
        gi giVar2 = new gi(eVar, 0);
        giVar2.f29152a = obj;
        return giVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f29153b != 0 ? ((gi) create((Boolean) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((gi) create((Rect) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f29153b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(h.g.b.x.n((Boolean) this.f29152a, true));
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(!((Rect) this.f29152a).isEmpty());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gi(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29153b = i2;
    }
}
