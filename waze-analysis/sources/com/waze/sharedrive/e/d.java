package com.waze.sharedrive.e;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38517a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f38518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedrive.d.aq f38519c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f38520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(com.waze.sharedrive.d.aq aqVar, e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f38519c = aqVar;
        this.f38518b = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f38519c, this.f38518b, eVar);
        dVar.f38520d = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        h hVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f38517a;
        try {
            if (i2 == 0) {
                e.b.c.b(obj);
                kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f38520d;
                com.waze.sharedrive.d.aq aqVar = this.f38519c;
                e eVar = this.f38518b;
                hVar = new h(aqVar, eVar.f38522b, eVar.f38523c, eVar.f38524d);
                this.f38520d = hVar;
                this.f38517a = 1;
                if (lVar.emit(hVar, this) != aVar) {
                }
                return aVar;
            }
            Object obj2 = this.f38520d;
            if (i2 != 1) {
                hVar = (Closeable) obj2;
                e.b.c.b(obj);
                throw new h.e();
            }
            hVar = (Closeable) obj2;
            e.b.c.b(obj);
            this.f38520d = hVar;
            this.f38517a = 2;
            if (kotlinx.coroutines.aj.p(this) == aVar) {
                return aVar;
            }
            throw new h.e();
        } finally {
        }
    }
}
