package com.waze.car_lib.i.c;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20070a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f20071b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f20072c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f20073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ai aiVar, bn bnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20073d = i2;
        this.f20071b = aiVar;
        this.f20072c = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f20073d != 0 ? new af(this.f20071b, this.f20072c, eVar, 1, null) : new af(this.f20071b, this.f20072c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20073d != 0 ? ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((af) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20073d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20070a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20070a = 1;
                if (kotlinx.coroutines.b.ai.e(new ae(this.f20071b.f20082a.a(), 1), new w(this.f20072c, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20070a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ai aiVar = this.f20071b;
            this.f20070a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.A(new ae(aiVar.f20082a.a(), 0), new com.waze.alerters.h(11)), new ab(this.f20072c, aiVar, null), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(ai aiVar, bn bnVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f20073d = i2;
        this.f20071b = aiVar;
        this.f20072c = bnVar;
    }
}
