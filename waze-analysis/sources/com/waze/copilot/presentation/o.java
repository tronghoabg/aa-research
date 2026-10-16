package com.waze.copilot.presentation;

import com.waze.copilot.a.ak;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23142a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CopilotMarketplaceViewModel f23143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(CopilotMarketplaceViewModel copilotMarketplaceViewModel, h.c.e eVar) {
        super(2, eVar);
        this.f23143b = copilotMarketplaceViewModel;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f23143b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f23142a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            CopilotMarketplaceViewModel copilotMarketplaceViewModel = this.f23143b;
            ak akVar = copilotMarketplaceViewModel.f23096d;
            com.waze.copilot.a.k kVar = copilotMarketplaceViewModel.f23100h;
            this.f23142a = 1;
            obj = akVar.a(kVar);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        bn bnVar = this.f23143b.f23102j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, r.f((r) objD, null, null, null, str, null, 23)));
        return ab.f48028a;
    }
}
