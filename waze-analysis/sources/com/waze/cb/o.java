package com.waze.cb;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f22107b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.q.i f22108c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(s sVar, com.waze.shared_infra.q.i iVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22109d = i2;
        this.f22107b = sVar;
        this.f22108c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f22109d != 0 ? new o(this.f22107b, this.f22108c, eVar, 1, null) : new o(this.f22107b, this.f22108c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f22109d != 0 ? ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f22109d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f22106a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                s sVar = this.f22107b;
                com.waze.shared_infra.q.i iVar = this.f22108c;
                this.f22106a = 1;
                if (com.waze.a.h.f13638a.e(sVar.f22119b, iVar, sVar.f22120c, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f22106a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            s sVar2 = this.f22107b;
            com.waze.shared_infra.q.i iVar2 = this.f22108c;
            this.f22106a = 1;
            if (com.waze.a.h.f13638a.c(sVar2.f22119b, null, iVar2, sVar2.f22120c, new android.support.v4.a.a.c(12), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(s sVar, com.waze.shared_infra.q.i iVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f22109d = i2;
        this.f22107b = sVar;
        this.f22108c = iVar;
    }
}
