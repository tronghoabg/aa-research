package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bn implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33265a;

    public /* synthetic */ bn(int i2) {
        this.f33265a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f33265a) {
            case 0:
                by byVar = (by) obj;
                h.g.b.x.f(byVar, "it");
                return byVar.a().f();
            case 1:
                by byVar2 = (by) obj;
                h.g.b.x.f(byVar2, "it");
                boolean z = false;
                if (h.g.b.x.n(byVar2.f(), ce.f33304a) && !byVar2.b().f().isEmpty() && byVar2.b().e() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                by byVar3 = (by) obj;
                h.g.b.x.f(byVar3, "it");
                return Boolean.valueOf(byVar3.h());
            case 3:
                by byVar4 = (by) obj;
                h.g.b.x.f(byVar4, "it");
                return byVar4.b().f();
            case 4:
                by byVar5 = (by) obj;
                h.g.b.x.f(byVar5, "it");
                return (bx) byVar5.a().d();
            case 5:
                by byVar6 = (by) obj;
                h.g.b.x.f(byVar6, "it");
                return byVar6.f();
            case 6:
                i.b.l.cd cdVar = (i.b.l.cd) obj;
                int i2 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar, "it");
                return cdVar.getAddWaypointResponse();
            case 7:
                i.b.l.cd cdVar2 = (i.b.l.cd) obj;
                int i3 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar2, "it");
                return cdVar2.getEstimateWaypointDetoursResponseV2();
            case 8:
                i.b.l.cd cdVar3 = (i.b.l.cd) obj;
                int i4 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar3, "it");
                return cdVar3.getSearchV2Response();
            case 9:
                i.b.l.cd cdVar4 = (i.b.l.cd) obj;
                int i5 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar4, "it");
                return cdVar4.getSearchResponse();
            case 10:
                i.b.l.cd cdVar5 = (i.b.l.cd) obj;
                int i6 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar5, "it");
                return cdVar5.getVenueList();
            case 11:
                i.b.l.cd cdVar6 = (i.b.l.cd) obj;
                int i7 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar6, "it");
                return cdVar6.getGetSettingsCopilotCarsResponse();
            case 12:
                i.b.l.cd cdVar7 = (i.b.l.cd) obj;
                int i8 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar7, "it");
                return cdVar7.getGetSettingsCopilotVoicesResponse();
            case 13:
                i.b.l.cd cdVar8 = (i.b.l.cd) obj;
                int i9 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar8, "it");
                return cdVar8.getReportThumbsDownResponse();
            case 14:
                i.b.l.cd cdVar9 = (i.b.l.cd) obj;
                int i10 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar9, "it");
                return cdVar9.getPushDisplayedResponse();
            case 15:
                i.b.l.cd cdVar10 = (i.b.l.cd) obj;
                int i11 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar10, "it");
                return cdVar10.getNotifyReferrerReceivedResponse();
            case 16:
                i.b.l.cd cdVar11 = (i.b.l.cd) obj;
                int i12 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar11, "it");
                return cdVar11.getLocateAccountByCommunityResponse();
            case 17:
                i.b.l.cd cdVar12 = (i.b.l.cd) obj;
                int i13 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar12, "it");
                return cdVar12.getEngagementDisplayedResponse();
            case 18:
                i.b.l.cd cdVar13 = (i.b.l.cd) obj;
                int i14 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar13, "it");
                return cdVar13.getEngagementButtonClickedResponse();
            case 19:
                i.b.l.cd cdVar14 = (i.b.l.cd) obj;
                int i15 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar14, "it");
                return cdVar14.getStartWalkingResponse();
            default:
                i.b.l.cd cdVar15 = (i.b.l.cd) obj;
                int i16 = com.waze.sharedui.api.a.f38785a;
                h.g.b.x.f(cdVar15, "it");
                return cdVar15.getRoutesDurationResponse();
        }
    }
}
