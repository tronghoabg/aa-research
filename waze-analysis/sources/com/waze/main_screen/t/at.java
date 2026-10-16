package com.waze.main_screen.t;

import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class at extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aw f27517b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27518c;
        if (i2 == 0) {
            at atVar = new at(this.f27517b, eVar, 0);
            atVar.f27516a = obj;
            return atVar;
        }
        if (i2 == 1) {
            at atVar2 = new at(this.f27517b, eVar, 1, (byte[]) null);
            atVar2.f27516a = obj;
            return atVar2;
        }
        if (i2 == 2) {
            at atVar3 = new at(this.f27517b, eVar, 2, (char[]) null);
            atVar3.f27516a = obj;
            return atVar3;
        }
        if (i2 == 3) {
            at atVar4 = new at(this.f27517b, eVar, 3, (short[]) null);
            atVar4.f27516a = obj;
            return atVar4;
        }
        if (i2 != 4) {
            at atVar5 = new at(this.f27517b, eVar, 5, (boolean[]) null);
            atVar5.f27516a = obj;
            return atVar5;
        }
        at atVar6 = new at(this.f27517b, eVar, 4, (int[]) null);
        atVar6.f27516a = obj;
        return atVar6;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27518c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((at) create((com.waze.main_screen.ag.a.i) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((com.waze.bv.s) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((com.waze.reports_v2.presentation.a.m) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((com.waze.notifications.b.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((com.waze.main_screen.b.a.f) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((com.waze.main_screen.d.a.d) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        Object objD6;
        int i2 = this.f27518c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.d.a.d dVar = (com.waze.main_screen.d.a.d) this.f27516a;
            bn bnVar = this.f27517b.C;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, as.m((as) objD, null, null, null, dVar, null, null, false, null, null, null, false, null, 16375)));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.b.a.f fVar = (com.waze.main_screen.b.a.f) this.f27516a;
            bn bnVar2 = this.f27517b.C;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, as.m((as) objD2, null, null, null, null, fVar, null, false, null, null, null, false, null, 16367)));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.notifications.b.a aVar4 = (com.waze.notifications.b.a) this.f27516a;
            bn bnVar3 = this.f27517b.C;
            do {
                objD3 = bnVar3.d();
            } while (!bnVar3.f(objD3, as.m((as) objD3, null, null, aVar4, null, null, null, false, null, null, null, false, null, 16379)));
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.reports_v2.presentation.a.m mVar = (com.waze.reports_v2.presentation.a.m) this.f27516a;
            bn bnVar4 = this.f27517b.C;
            do {
                objD4 = bnVar4.d();
            } while (!bnVar4.f(objD4, as.m((as) objD4, null, null, null, null, null, null, false, mVar, null, null, false, null, 16255)));
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.ag.a.i iVar = (com.waze.main_screen.ag.a.i) this.f27516a;
            bn bnVar5 = this.f27517b.C;
            do {
                objD6 = bnVar5.d();
            } while (!bnVar5.f(objD6, as.m((as) objD6, null, null, null, null, null, iVar, false, null, null, null, false, null, 16351)));
            return h.ab.f48028a;
        }
        h.c.a.a aVar7 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.bv.s sVar = (com.waze.bv.s) this.f27516a;
        bn bnVar6 = this.f27517b.C;
        do {
            objD5 = bnVar6.d();
        } while (!bnVar6.f(objD5, as.m((as) objD5, sVar, null, null, null, null, null, false, null, null, null, false, null, 16382)));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(aw awVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f27518c = i2;
        this.f27517b = awVar;
    }
}
