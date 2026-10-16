package com.waze.sharedrive.c;

import com.google.v.du;
import com.waze.sharedrive.a.ac;
import com.waze.sharedrive.a.ae;
import com.waze.sharedrive.a.ai;
import com.waze.sharedrive.a.am;
import e.a.cm;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38096a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ du f38097b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f38098c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ae aeVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f38099d;
        if (i2 == 0) {
            h hVar = new h((com.waze.sharedrive.a.f) this.f38097b, eVar, 0);
            hVar.f38098c = obj;
            return hVar;
        }
        if (i2 == 1) {
            h hVar2 = new h((com.waze.sharedrive.a.b) this.f38097b, eVar, 1);
            hVar2.f38098c = obj;
            return hVar2;
        }
        if (i2 == 2) {
            h hVar3 = new h((com.waze.sharedrive.a.n) this.f38097b, eVar, 2);
            hVar3.f38098c = obj;
            return hVar3;
        }
        if (i2 == 3) {
            h hVar4 = new h((am) this.f38097b, eVar, 3);
            hVar4.f38098c = obj;
            return hVar4;
        }
        if (i2 == 4) {
            h hVar5 = new h((com.waze.sharedrive.a.h) this.f38097b, eVar, 4);
            hVar5.f38098c = obj;
            return hVar5;
        }
        du duVar = this.f38097b;
        if (i2 != 5) {
            h hVar6 = new h((ai) duVar, eVar, 6);
            hVar6.f38098c = obj;
            return hVar6;
        }
        h hVar7 = new h((ae) duVar, eVar, 5);
        hVar7.f38098c = obj;
        return hVar7;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f38099d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((ac) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f38099d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar = (ac) this.f38098c;
            du duVar = this.f38097b;
            this.f38096a = 1;
            Object objB = acVar.b((com.waze.sharedrive.a.f) duVar, new cm(), this);
            return objB == aVar ? aVar : objB;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar2 = (ac) this.f38098c;
            du duVar2 = this.f38097b;
            this.f38096a = 1;
            Object objA = acVar2.a((com.waze.sharedrive.a.b) duVar2, new cm(), this);
            return objA == aVar2 ? aVar2 : objA;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar3 = (ac) this.f38098c;
            du duVar3 = this.f38097b;
            this.f38096a = 1;
            Object objE = acVar3.e((com.waze.sharedrive.a.n) duVar3, new cm(), this);
            return objE == aVar3 ? aVar3 : objE;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar4 = (ac) this.f38098c;
            du duVar4 = this.f38097b;
            this.f38096a = 1;
            Object objI = acVar4.i((am) duVar4, new cm(), this);
            return objI == aVar4 ? aVar4 : objI;
        }
        if (i2 == 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar5 = (ac) this.f38098c;
            du duVar5 = this.f38097b;
            this.f38096a = 1;
            Object objC = acVar5.c((com.waze.sharedrive.a.h) duVar5, new cm(), this);
            return objC == aVar5 ? aVar5 : objC;
        }
        if (i2 != 5) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            if (this.f38096a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ac acVar6 = (ac) this.f38098c;
            du duVar6 = this.f38097b;
            this.f38096a = 1;
            Object objH = acVar6.h((ai) duVar6, new cm(), this);
            return objH == aVar6 ? aVar6 : objH;
        }
        h.c.a.a aVar7 = h.c.a.a.f48038a;
        if (this.f38096a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        ac acVar7 = (ac) this.f38098c;
        du duVar7 = this.f38097b;
        this.f38096a = 1;
        Object objG = acVar7.g((ae) duVar7, new cm(), this);
        return objG == aVar7 ? aVar7 : objG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ai aiVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = aiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.sharedrive.a.b bVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.sharedrive.a.f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.sharedrive.a.h hVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(com.waze.sharedrive.a.n nVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38099d = i2;
        this.f38097b = nVar;
    }
}
