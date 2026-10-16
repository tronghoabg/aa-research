package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class lw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25463a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lw(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25464b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f25464b;
        return i2 != 0 ? i2 != 1 ? new lw(eVar, 2, (char[]) null) : new lw(eVar, 1, (byte[]) null) : new lw(eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f25464b;
        return i2 != 0 ? i2 != 1 ? ((lw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((lw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((lw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f25464b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f25463a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                int i3 = com.waze.native_managers.o.f30705a;
                this.f25463a = 1;
                if (com.waze.an.a.a.bd.h().b(this) == aVar) {
                    return aVar;
                }
            }
            com.waze.perf.c.a(com.waze.perf.b.f33025c);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f25463a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f25463a = 1;
                if (c.f18214a.b(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f25463a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            c cVar = c.f18214a;
            this.f25463a = 1;
            obj = c.e().c(this);
            if (obj == aVar3) {
                return aVar3;
            }
        }
        com.google.android.gms.a.a.c cVar2 = (com.google.android.gms.a.a.c) obj;
        return Boolean.valueOf((cVar2 == null || cVar2.b()) ? false : true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lw(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25464b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lw(h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f25464b = i2;
    }
}
