package com.waze.main_screen.p;

import androidx.compose.ui.node.Ref;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27007a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(Ref ref, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27008b = i2;
        this.f27007a = ref;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27008b;
        if (i2 == 0) {
            return new ab((com.waze.c.e.k) this.f27007a, eVar, 0);
        }
        if (i2 == 1) {
            return new ab((Ref) this.f27007a, eVar, 1);
        }
        if (i2 == 2) {
            return new ab((bf) this.f27007a, eVar, 2);
        }
        Object obj2 = this.f27007a;
        return i2 != 3 ? new ab((bf) obj2, eVar, 4, (byte[]) null) : new ab((com.waze.c.e.k) obj2, eVar, 3, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27008b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27008b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((com.waze.c.e.k) this.f27007a).e();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.bottom_bars.b.a aVar3 = (com.waze.main_screen.bottom_bars.b.a) ((Ref) this.f27007a).getValue();
            if (aVar3 != null) {
                aVar3.e();
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            bf bfVar = (bf) this.f27007a;
            com.waze.z.a.b.ad adVarI = bfVar.h().e().i();
            if ((adVarI != com.waze.z.a.b.ad.f45734b && adVarI != com.waze.z.a.b.ad.f45733a) || bfVar.r().m()) {
                bfVar.F();
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((com.waze.c.e.k) this.f27007a).e();
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bf bfVar2 = (bf) this.f27007a;
        com.waze.reports_v2.presentation.a.ab abVarK = bfVar2.K();
        if (abVarK != null) {
            abVarK.m(bfVar2.q().l());
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(com.waze.c.e.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27008b = i2;
        this.f27007a = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(com.waze.c.e.k kVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27008b = i2;
        this.f27007a = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27008b = i2;
        this.f27007a = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(bf bfVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27008b = i2;
        this.f27007a = bfVar;
    }
}
