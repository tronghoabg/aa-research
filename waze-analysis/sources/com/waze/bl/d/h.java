package com.waze.bl.d;

import com.waze.t.b.as;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f17085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f17086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f17087c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f17088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, com.waze.bl.d.a.d dVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17088d = i2;
        this.f17086b = lVar;
        this.f17087c = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f17088d != 0 ? new h(this.f17086b, (com.waze.bl.d.a.d) this.f17087c, eVar, 1) : new h(this.f17086b, (as) this.f17087c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f17088d != 0 ? ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f17088d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f17085a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f17085a = 1;
                if (l.c(this.f17086b, ((com.waze.t.b.f) this.f17087c).a(), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f17085a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            l lVar = this.f17086b;
            Object obj2 = this.f17087c;
            this.f17085a = 1;
            if (lVar.m.emit(obj2, this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, as asVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17088d = i2;
        this.f17086b = lVar;
        this.f17087c = asVar;
    }
}
