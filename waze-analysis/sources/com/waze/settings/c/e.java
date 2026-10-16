package com.waze.settings.c;

import com.waze.settings.de;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ de f36931a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.settings.tree.d.n f36932b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(b bVar, de deVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36933c = i2;
        this.f36932b = bVar;
        this.f36931a = deVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f36933c;
        com.waze.settings.tree.d.n nVar = this.f36932b;
        if (i2 != 0) {
            return new e((b) nVar, this.f36931a, eVar, 1);
        }
        return new e((h) nVar, this.f36931a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f36933c != 0 ? ((e) create((com.waze.ev.m) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((com.waze.ev.m) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f36933c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((h) this.f36932b).F(this.f36931a);
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        de deVar = this.f36931a;
        ((b) this.f36932b).E(deVar.g());
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(h hVar, de deVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36933c = i2;
        this.f36932b = hVar;
        this.f36931a = deVar;
    }
}
