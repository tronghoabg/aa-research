package com.waze.ui.e;

import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f42219b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(v vVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42220c = i2;
        this.f42219b = vVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f42220c;
        return i2 != 0 ? i2 != 1 ? new j(this.f42219b, eVar, 2, (char[]) null) : new j(this.f42219b, eVar, 1, (byte[]) null) : new j(this.f42219b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f42220c;
        return i2 != 0 ? i2 != 1 ? ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f42220c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f42218a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f42218a = 1;
                if (this.f42219b.f(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f42218a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f42218a = 1;
                if (this.f42219b.f(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f42218a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f42218a = 1;
            if (this.f42219b.e(this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(v vVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42220c = i2;
        this.f42219b = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(v vVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f42220c = i2;
        this.f42219b = vVar;
    }
}
