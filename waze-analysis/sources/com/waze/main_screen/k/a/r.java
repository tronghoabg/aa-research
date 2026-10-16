package com.waze.main_screen.k.a;

import com.waze.main_screen.c.ap;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f26559b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f26560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(u uVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f26560c = i2;
        this.f26559b = uVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f26560c != 0 ? new r(this.f26559b, eVar, 1, null) : new r(this.f26559b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f26560c != 0 ? ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((r) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f26560c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f26558a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                u uVar = this.f26559b;
                this.f26558a = 1;
                if (ai.e(ai.z(new g(uVar.f26575i, 2), new ap(7)), new q(uVar, null, 1, null), this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f26558a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            u uVar2 = this.f26559b;
            this.f26558a = 1;
            if (ai.e(ai.z(uVar2.f26575i, new p(0)), new q(uVar2, null, 0), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(u uVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f26560c = i2;
        this.f26559b = uVar;
    }
}
