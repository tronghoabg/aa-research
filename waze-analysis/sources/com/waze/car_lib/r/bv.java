package com.waze.car_lib.r;

import com.waze.settings.gu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bv extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21092a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21093b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bv(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f21094c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f21094c != 0) {
            bv bvVar = new bv((h.c.e) obj3, 1, null);
            bvVar.f21092a = (com.waze.resume_drive.a) obj;
            bvVar.f21093b = (com.waze.sound.bp) obj2;
            return bvVar.invokeSuspend(h.ab.f48028a);
        }
        bv bvVar2 = new bv((h.c.e) obj3, 0);
        bvVar2.f21092a = (com.waze.sound.bp) obj;
        bvVar2.f21093b = (String) obj2;
        return bvVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f21094c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new h.k((com.waze.sound.bp) this.f21092a, (String) this.f21093b);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.resume_drive.a aVar3 = (com.waze.resume_drive.a) this.f21092a;
        Integer num = new Integer(gu.c((com.waze.sound.bp) this.f21093b).b());
        num.intValue();
        if (aVar3 instanceof com.waze.bn.e) {
            return num;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bv(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f21094c = i2;
    }
}
