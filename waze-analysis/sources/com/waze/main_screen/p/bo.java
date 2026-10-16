package com.waze.main_screen.p;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bo extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bs f27218b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27219c;
        if (i2 == 0) {
            bo boVar = new bo(this.f27218b, eVar, 0);
            boVar.f27217a = obj;
            return boVar;
        }
        if (i2 == 1) {
            bo boVar2 = new bo(this.f27218b, eVar, 1, (byte[]) null);
            boVar2.f27217a = obj;
            return boVar2;
        }
        if (i2 == 2) {
            bo boVar3 = new bo(this.f27218b, eVar, 2, (char[]) null);
            boVar3.f27217a = obj;
            return boVar3;
        }
        if (i2 == 3) {
            bo boVar4 = new bo(this.f27218b, eVar, 3, (short[]) null);
            boVar4.f27217a = obj;
            return boVar4;
        }
        if (i2 == 4) {
            bo boVar5 = new bo(this.f27218b, eVar, 4, (int[]) null);
            boVar5.f27217a = obj;
            return boVar5;
        }
        if (i2 != 5) {
            bo boVar6 = new bo(this.f27218b, eVar, 6, (float[]) null);
            boVar6.f27217a = obj;
            return boVar6;
        }
        bo boVar7 = new bo(this.f27218b, eVar, 5, (boolean[]) null);
        boVar7.f27217a = obj;
        return boVar7;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27219c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((bo) create((com.waze.main_screen.ag.a.i) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.bv.s) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.reports_v2.presentation.a.m) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.notifications.b.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.main_screen.j.a.h) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.main_screen.b.a.f) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((com.waze.main_screen.d.a.d) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        Object objD6;
        Object objD7;
        int i2 = this.f27219c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.d.a.d dVar = (com.waze.main_screen.d.a.d) this.f27217a;
            kotlinx.coroutines.b.bn bnVar = this.f27218b.H;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, bm.m((bm) objD, null, null, null, null, dVar, null, null, null, null, null, null, 4079)));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.b.a.f fVar = (com.waze.main_screen.b.a.f) this.f27217a;
            kotlinx.coroutines.b.bn bnVar2 = this.f27218b.H;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, bm.m((bm) objD2, null, null, null, null, null, fVar, null, null, null, null, null, 4063)));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.j.a.h hVar = (com.waze.main_screen.j.a.h) this.f27217a;
            kotlinx.coroutines.b.bn bnVar3 = this.f27218b.H;
            do {
                objD3 = bnVar3.d();
            } while (!bnVar3.f(objD3, bm.m((bm) objD3, null, null, null, null, null, null, hVar, null, null, null, null, 4031)));
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.notifications.b.a aVar5 = (com.waze.notifications.b.a) this.f27217a;
            kotlinx.coroutines.b.bn bnVar4 = this.f27218b.H;
            do {
                objD4 = bnVar4.d();
            } while (!bnVar4.f(objD4, bm.m((bm) objD4, null, null, null, aVar5, null, null, null, null, null, null, null, 4087)));
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.c.a.a aVar6 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.reports_v2.presentation.a.m mVar = (com.waze.reports_v2.presentation.a.m) this.f27217a;
            kotlinx.coroutines.b.bn bnVar5 = this.f27218b.H;
            do {
                objD5 = bnVar5.d();
            } while (!bnVar5.f(objD5, bm.m((bm) objD5, null, null, null, null, null, null, null, null, mVar, null, null, DisplayStrings.DS_COMPANINIO_BOTTOM_SHEET_TITLE)));
            return h.ab.f48028a;
        }
        if (i2 != 5) {
            h.c.a.a aVar7 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.ag.a.i iVar = (com.waze.main_screen.ag.a.i) this.f27217a;
            kotlinx.coroutines.b.bn bnVar6 = this.f27218b.H;
            do {
                objD7 = bnVar6.d();
            } while (!bnVar6.f(objD7, bm.m((bm) objD7, null, null, null, null, null, null, null, iVar, null, null, null, 3967)));
            return h.ab.f48028a;
        }
        h.c.a.a aVar8 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.bv.s sVar = (com.waze.bv.s) this.f27217a;
        kotlinx.coroutines.b.bn bnVar7 = this.f27218b.H;
        do {
            objD6 = bnVar7.d();
        } while (!bnVar7.f(objD6, bm.m((bm) objD6, sVar, null, null, null, null, null, null, null, null, null, null, 4094)));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bs bsVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f27219c = i2;
        this.f27218b = bsVar;
    }
}
