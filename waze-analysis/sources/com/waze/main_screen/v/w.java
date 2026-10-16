package com.waze.main_screen.v;

import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f27830b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(z zVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27831c = i2;
        this.f27830b = zVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27831c;
        return i2 != 0 ? i2 != 1 ? new w(this.f27830b, eVar, 2, (char[]) null) : new w(this.f27830b, eVar, 1, (byte[]) null) : new w(this.f27830b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27831c;
        return i2 != 0 ? i2 != 1 ? ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.ui.ac.g gVarA;
        com.waze.ui.ac.g gVarA2;
        com.waze.ui.ac.g gVarA3;
        int i2 = this.f27831c;
        String strA = null;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f27829a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f27829a = 1;
                if (ai.k(this.f27830b.f27840c.a(), new v(null, 0), this) == aVar) {
                    return aVar;
                }
            }
            z zVar = this.f27830b;
            ad adVar = zVar.f27845h;
            af afVar = af.f27781a;
            n nVar = (n) zVar.f27847j.d();
            String strC = nVar != null ? nVar.c() : null;
            n nVar2 = (n) zVar.f27847j.d();
            String strD = nVar2 != null ? nVar2.d() : null;
            n nVar3 = (n) zVar.f27847j.d();
            if (nVar3 != null && (gVarA = nVar3.a()) != null) {
                strA = gVarA.a();
            }
            adVar.c(afVar, strC, strD, strA);
            zVar.n();
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f27829a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f27829a = 1;
                if (ai.k(this.f27830b.f27842e.a(), new v((h.c.e) null, 2, (char[]) null), this) == aVar2) {
                    return aVar2;
                }
            }
            z zVar2 = this.f27830b;
            ad adVar2 = zVar2.f27845h;
            af afVar2 = af.f27782b;
            n nVar4 = (n) zVar2.f27847j.d();
            String strC2 = nVar4 != null ? nVar4.c() : null;
            n nVar5 = (n) zVar2.f27847j.d();
            String strD2 = nVar5 != null ? nVar5.d() : null;
            n nVar6 = (n) zVar2.f27847j.d();
            if (nVar6 != null && (gVarA3 = nVar6.a()) != null) {
                strA = gVarA3.a();
            }
            adVar2.c(afVar2, strC2, strD2, strA);
            zVar2.n();
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f27829a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f27829a = 1;
            if (ai.k(this.f27830b.f27839b.ah(), new v((h.c.e) null, 1, (byte[]) null), this) == aVar3) {
                return aVar3;
            }
        }
        z zVar3 = this.f27830b;
        ad adVar3 = zVar3.f27845h;
        af afVar3 = af.f27781a;
        n nVar7 = (n) zVar3.f27847j.d();
        String strC3 = nVar7 != null ? nVar7.c() : null;
        n nVar8 = (n) zVar3.f27847j.d();
        String strD3 = nVar8 != null ? nVar8.d() : null;
        n nVar9 = (n) zVar3.f27847j.d();
        if (nVar9 != null && (gVarA2 = nVar9.a()) != null) {
            strA = gVarA2.a();
        }
        adVar3.c(afVar3, strC3, strD3, strA);
        zVar3.n();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(z zVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27831c = i2;
        this.f27830b = zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(z zVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27831c = i2;
        this.f27830b = zVar;
    }
}
