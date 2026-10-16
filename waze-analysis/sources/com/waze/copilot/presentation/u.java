package com.waze.copilot.presentation;

import com.waze.copilot.a.au;
import h.ab;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23161a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CopilotMarketplaceViewModel f23162b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ UpdateCoPilotSelectionRequest f23163c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(CopilotMarketplaceViewModel copilotMarketplaceViewModel, UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23164d = i2;
        this.f23162b = copilotMarketplaceViewModel;
        this.f23163c = updateCoPilotSelectionRequest;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f23164d != 0 ? new u(this.f23162b, this.f23163c, eVar, 1, null) : new u(this.f23162b, this.f23163c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f23164d != 0 ? ((u) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((u) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        com.waze.copilot.data.b.p pVar;
        com.waze.copilot.data.b.g gVar;
        if (this.f23164d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            try {
                if (this.f23161a != 0) {
                    e.b.c.b(obj);
                    this = this;
                } else {
                    e.b.c.b(obj);
                    CopilotMarketplaceViewModel copilotMarketplaceViewModel = this.f23162b;
                    this.f23161a = 1;
                    Object objG = aj.G(h.o.a.m(copilotMarketplaceViewModel.f23103k), new u(copilotMarketplaceViewModel, this.f23163c, null, 1, null), this);
                    this = objG;
                    if (objG == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e2) {
                CopilotMarketplaceViewModel copilotMarketplaceViewModel2 = this.f23162b;
                com.waze.copilot.a.o oVar = copilotMarketplaceViewModel2.f23098f;
                e2.getMessage();
                oVar.g(com.waze.copilot.a.n.f22847a, null);
                copilotMarketplaceViewModel2.f23101i.a(e2, null);
                copilotMarketplaceViewModel2.w();
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f23161a != 0) {
            e.b.c.b(obj);
            objA = ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            CopilotMarketplaceViewModel copilotMarketplaceViewModel3 = this.f23162b;
            UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest = this.f23163c;
            au auVar = copilotMarketplaceViewModel3.f23095c;
            List<CopilotSelectionResponse> actions = updateCoPilotSelectionRequest.getActions();
            ArrayList arrayList = new ArrayList(h.a.i.q(actions, 10));
            for (CopilotSelectionResponse copilotSelectionResponse : actions) {
                CopilotTypeResponse type = copilotSelectionResponse.getType();
                CopilotTypeResponse copilotTypeResponse = CopilotTypeResponse.CAR;
                CopilotOperationResponse copilotOperationResponse = CopilotOperationResponse.SELECT;
                int iOrdinal = type.ordinal();
                if (iOrdinal == 0) {
                    pVar = com.waze.copilot.data.b.p.f23012a;
                } else if (iOrdinal == 1) {
                    pVar = com.waze.copilot.data.b.p.f23013b;
                } else {
                    if (iOrdinal != 2) {
                        throw new h.i();
                    }
                    pVar = com.waze.copilot.data.b.p.f23014c;
                }
                int iOrdinal2 = copilotSelectionResponse.getOperation().ordinal();
                if (iOrdinal2 == 0) {
                    gVar = com.waze.copilot.data.b.g.f22991a;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new h.i();
                    }
                    gVar = com.waze.copilot.data.b.g.f22992b;
                }
                arrayList.add(new com.waze.copilot.data.b.o(pVar, gVar, copilotSelectionResponse.getAssetId()));
            }
            ArrayList arrayList2 = arrayList;
            CopilotSelectionResponse copilotSelectionResponse2 = (CopilotSelectionResponse) h.a.i.R(updateCoPilotSelectionRequest.getActions());
            String campaignId = copilotSelectionResponse2 != null ? copilotSelectionResponse2.getCampaignId() : null;
            this.f23161a = 1;
            objA = auVar.a(arrayList2, campaignId, this);
            if (objA == aVar2) {
                return aVar2;
            }
        }
        CopilotMarketplaceViewModel copilotMarketplaceViewModel4 = this.f23162b;
        if (h.m.e(objA)) {
            CopilotMarketplaceViewModel.k(copilotMarketplaceViewModel4);
        }
        if (h.m.c(objA) != null) {
            copilotMarketplaceViewModel4.w();
        }
        return h.m.d(objA);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(CopilotMarketplaceViewModel copilotMarketplaceViewModel, UpdateCoPilotSelectionRequest updateCoPilotSelectionRequest, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f23164d = i2;
        this.f23162b = copilotMarketplaceViewModel;
        this.f23163c = updateCoPilotSelectionRequest;
    }
}
