package com.waze.coroutines;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f23177a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f23178b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23179c = i2;
        this.f23178b = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f23179c != 0 ? new e((am) this.f23178b, eVar, 1) : new e((c) this.f23178b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f23179c != 0 ? ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlinx.coroutines.am] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f23179c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f23177a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f23177a = 1;
            Object objC = this.f23178b.c(this);
            return objC == aVar ? aVar : objC;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f23177a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f23177a = 1;
            if (aj.r(((c) this.f23178b).b(), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23179c = i2;
        this.f23178b = amVar;
    }
}
