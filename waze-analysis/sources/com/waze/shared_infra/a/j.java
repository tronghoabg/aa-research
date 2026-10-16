package com.waze.shared_infra.a;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f37786a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f37787b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f37788c = i2;
        this.f37787b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f37788c != 0 ? new j(this.f37787b, eVar, 1, null) : new j(this.f37787b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f37788c != 0 ? ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f37788c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f37786a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f37786a = 1;
                if (this.f37787b.b(this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f37786a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f37786a = 1;
            if (this.f37787b.b(this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(c cVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f37788c = i2;
        this.f37787b = cVar;
    }
}
