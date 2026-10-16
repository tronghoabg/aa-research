package com.waze.t;

import h.ab;
import java.io.ByteArrayOutputStream;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f40871a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40872b = i2;
        this.f40871a = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f40872b != 0 ? new d(this.f40871a, eVar, 1, null) : new d(this.f40871a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40872b != 0 ? ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((d) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40872b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            g gVar = this.f40871a;
            gVar.f40881c.a(r.a(gVar, " agent side audio started"));
            gVar.f40890l = new ByteArrayOutputStream();
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        g gVar2 = this.f40871a;
        g.h(gVar2);
        gVar2.f40887i++;
        gVar2.f40881c.a(r.a(gVar2, " started"));
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40872b = i2;
        this.f40871a = gVar;
    }
}
