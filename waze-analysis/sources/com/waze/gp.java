package com.waze;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.waze.mywaze.moods.MoodsActivity;
import com.waze.reports.AddPlaceFlowActivity;
import com.waze.reports.EditPlaceFlowActivity;
import com.waze.reports.NearbyGasStationsActivity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class gp implements com.waze.app_nav.hub.b.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24257a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24258b;

    public /* synthetic */ gp(Object obj, int i2) {
        this.f24258b = i2;
        this.f24257a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v58, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v61, types: [h.g.a.l, java.lang.Object] */
    @Override // com.waze.app_nav.hub.b.j
    public final com.waze.app_nav.hub.b.i create(Context context) {
        switch (this.f24258b) {
            case 0:
                return NativeManager.lambda$openPoi$0(this.f24257a, context);
            case 1:
                return MainActivity.n((MainActivity) this.f24257a, context);
            case 2:
                com.waze.a.h hVar = com.waze.a.h.f13638a;
                h.g.b.x.f(context, "context");
                com.waze.sharedui.g.p pVar = new com.waze.sharedui.g.p(context);
                ?? r5 = this.f24257a;
                pVar.h(r5.c(R.string.UHHOHE, new Object[0]));
                pVar.c(r5.c(R.string.OK, new Object[0]), null);
                pVar.b(R.drawable.error_icon);
                pVar.j();
                com.waze.sharedui.d.a.d dVarI = pVar.i();
                h.g.b.x.e(dVarI, "show(...)");
                return com.waze.app_nav.hub.b.m.a(dVarI);
            case 3:
                h.g.b.x.f(context, "it");
                return new com.waze.app_nav.hub.b.e((h.g.a.a) null, (com.waze.app_nav.hub.b.f) null, ComposableLambdaKt.composableLambdaInstance(-483268907, true, new com.waze.ads.c.a(this.f24257a, 5)), 7);
            case 4:
                return com.waze.map.main.p.e((com.waze.map.main.p) this.f24257a, context);
            case 5:
                return com.waze.map.main.p.d((com.waze.map.main.p) this.f24257a, context);
            case 6:
                h.g.b.x.f(context, "context");
                com.waze.ab.s sVar = new com.waze.ab.s(context, (com.waze.ab.o) this.f24257a);
                sVar.show();
                return com.waze.app_nav.hub.b.m.a(sVar);
            case 7:
                return MoodsActivity.m((MoodsActivity) this.f24257a, context);
            case 8:
                return com.waze.navbar.p.a((com.waze.navbar.p) this.f24257a, context);
            case 9:
                return AddPlaceFlowActivity.o((AddPlaceFlowActivity) this.f24257a, context);
            case 10:
                return AddPlaceFlowActivity.q((AddPlaceFlowActivity) this.f24257a, context);
            case 11:
                return AddPlaceFlowActivity.r((AddPlaceFlowActivity) this.f24257a, context);
            case 12:
                return AddPlaceFlowActivity.p((AddPlaceFlowActivity) this.f24257a, context);
            case 13:
                return EditPlaceFlowActivity.o((EditPlaceFlowActivity) this.f24257a, context);
            case 14:
                int i2 = NearbyGasStationsActivity.f33550f;
                com.waze.ab.s sVar2 = new com.waze.ab.s(context, (com.waze.ab.o) this.f24257a);
                sVar2.show();
                return com.waze.app_nav.hub.b.m.a(sVar2);
            case 15:
                return com.waze.reports.dr.i((com.waze.reports.dr) this.f24257a, context);
            case 16:
                com.waze.ab.o oVar = new com.waze.ab.o();
                ?? r52 = this.f24257a;
                oVar.Q(r52.c(R.string.OFFLINE_REPORT_GAS_TITLE, new Object[0]));
                oVar.P(r52.c(R.string.OFFLINE_REPORT_GAS_BODY, new Object[0]));
                oVar.M(r52.c(R.string.OK, new Object[0]));
                com.waze.ab.s sVar3 = new com.waze.ab.s(context, oVar);
                sVar3.show();
                return new com.waze.app_nav.hub.b.h(sVar3);
            case 17:
                return com.waze.reports.dr.j((com.waze.reports.dr) this.f24257a, context);
            case 18:
                com.waze.ab.o oVar2 = new com.waze.ab.o();
                ?? r53 = this.f24257a;
                oVar2.Q(r53.c(R.string.PLACE_CANNOT_ADD_CATEGORY_TITLE, new Object[0]));
                oVar2.P(r53.c(R.string.PLACE_CANNOT_ADD_CATEGORY_BODY, new Object[0]));
                oVar2.M(r53.c(R.string.OK, new Object[0]));
                com.waze.ab.s sVar4 = new com.waze.ab.s(context, oVar2);
                sVar4.show();
                return new com.waze.app_nav.hub.b.h(sVar4);
            case 19:
                h.g.b.x.f(context, "context");
                return com.waze.app_nav.hub.b.m.a((Dialog) this.f24257a.invoke(context));
            default:
                com.waze.ab.s sVar5 = new com.waze.ab.s(context, (com.waze.ab.o) this.f24257a);
                sVar5.show();
                return new com.waze.app_nav.hub.b.h(sVar5);
        }
    }
}
