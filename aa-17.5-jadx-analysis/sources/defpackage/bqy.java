package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import com.android.car.libraries.apphost.external.model.GoogleTab;
import com.android.car.libraries.apphost.external.model.GoogleTabContents;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class bqy implements afeh {
    private final /* synthetic */ int a;

    public /* synthetic */ bqy(int i) {
        this.a = i;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aew aewVarB;
        wb wbVarB;
        ListTemplate listTemplateB;
        ListTemplate listTemplateB2;
        int i = 16;
        switch (this.a) {
            case 0:
                bux buxVar = (bux) obj2;
                ((Integer) obj3).intValue();
                float f = brb.a;
                buxVar.v(1058649156);
                if (((agc) obj).h(false, true)) {
                    buxVar.v(272207019);
                    aewVarB = rl.b(4, buxVar);
                    buxVar.o();
                } else {
                    buxVar.v(272326989);
                    aewVarB = rl.b(5, buxVar);
                    buxVar.o();
                }
                buxVar.o();
                return aewVarB;
            case 1:
                cuo cuoVarV = ((cto) obj2).v(((dle) obj3).a);
                return ((cts) obj).eL(cuoVarV.a, cuoVarV.b, afbf.a, new bmk(0), new bml(cuoVarV, i));
            case 2:
                cts ctsVar = (cts) obj;
                cfy cfyVar = bsd.a;
                int iEF = ctsVar.eF(10.0f);
                int i2 = iEF + iEF;
                cuo cuoVarV2 = ((cto) obj2).v(dlf.h(((dle) obj3).a, i2, 0));
                return ctsVar.eK(cuoVarV2.a - i2, cuoVarV2.b, afbf.a, new aia(cuoVarV2, iEF, 3));
            case 3:
                cts ctsVar2 = (cts) obj;
                cfy cfyVar2 = bsd.a;
                int iEF2 = ctsVar2.eF(10.0f);
                int i3 = iEF2 + iEF2;
                cuo cuoVarV3 = ((cto) obj2).v(dlf.h(((dle) obj3).a, 0, i3));
                return ctsVar2.eK(cuoVarV3.a, cuoVarV3.b - i3, afbf.a, new aia(cuoVarV3, iEF2, i));
            case 4:
                bux buxVar2 = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (buxVar2.I((iIntValue & 17) != 16, iIntValue & 1)) {
                    brp.d(null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, buxVar2, 6, 0);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            case 5:
                cts ctsVar3 = (cts) obj;
                cto ctoVar = (cto) obj2;
                ctsVar3.getClass();
                ctoVar.getClass();
                long j = ((dle) obj3).a;
                int iD = dle.d(j);
                int iEF3 = ctsVar3.eF(64.0f);
                cuo cuoVarV4 = ctoVar.v(dle.m(j, iD > iEF3 ? dle.d(j) : 0, 0, dle.c(j) > iEF3 ? dle.c(j) : 0, 0, 10));
                int iC = dlf.c(j, Math.max(cuoVarV4.a, iEF3));
                int iB = dlf.b(j, Math.max(cuoVarV4.b, iEF3));
                return ctsVar3.eK(iC, iB, afbf.a, new gli(cuoVarV4, iC, iB, 1));
            case 6:
                cts ctsVar4 = (cts) obj;
                cto ctoVar2 = (cto) obj2;
                ctsVar4.getClass();
                ctoVar2.getClass();
                cuo cuoVarV5 = ctoVar2.v(((dle) obj3).a);
                return ctsVar4.eK(cuoVarV5.a, cuoVarV5.b, afbf.a, new ewc(i));
            case 7:
                return roc.aC((atm) obj, (bux) obj2, ((Integer) obj3).intValue());
            case 8:
                geu geuVar = (geu) obj;
                TemplateWrapper templateWrapper = (TemplateWrapper) obj2;
                ListTemplate listTemplate = (ListTemplate) obj3;
                geuVar.getClass();
                templateWrapper.getClass();
                listTemplate.getClass();
                return gur.i(geuVar, gkd.a(listTemplate), templateWrapper.isRefresh(), null, null, null, 56);
            case 9:
                geu geuVar2 = (geu) obj;
                TemplateWrapper templateWrapper2 = (TemplateWrapper) obj2;
                PaneTemplate paneTemplate = (PaneTemplate) obj3;
                geuVar2.getClass();
                templateWrapper2.getClass();
                paneTemplate.getClass();
                return gur.h(geuVar2, paneTemplate, templateWrapper2.isRefresh());
            case 10:
                MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj3;
                ((geu) obj).getClass();
                ((TemplateWrapper) obj2).getClass();
                mapWithContentTemplate.getClass();
                return new gpf(mapWithContentTemplate, null);
            case 11:
                geu geuVar3 = (geu) obj;
                TemplateWrapper templateWrapper3 = (TemplateWrapper) obj2;
                GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj3;
                geuVar3.getClass();
                templateWrapper3.getClass();
                googleListTemplate.getClass();
                return gur.i(geuVar3, gkd.b(googleListTemplate), templateWrapper3.isRefresh(), null, null, null, 56);
            case 12:
                geu geuVar4 = (geu) obj;
                LocalWrapperTemplate localWrapperTemplate = (LocalWrapperTemplate) obj3;
                geuVar4.getClass();
                ((TemplateWrapper) obj2).getClass();
                localWrapperTemplate.getClass();
                return hmh.a.b(geuVar4, TemplateWrapper.wrap(localWrapperTemplate.getWrapped())).getTemplate();
            case 13:
                geu geuVar5 = (geu) obj;
                TabTemplate tabTemplate = (TabTemplate) obj3;
                geuVar5.getClass();
                ((TemplateWrapper) obj2).getClass();
                tabTemplate.getClass();
                hhr.b(tabTemplate, geuVar5);
                return gmj.a(geuVar5, new TabTemplateInternal(gmj.b(tabTemplate)));
            case 14:
                geu geuVar6 = (geu) obj;
                UnrestrictedTabTemplate unrestrictedTabTemplate = (UnrestrictedTabTemplate) obj3;
                geuVar6.getClass();
                ((TemplateWrapper) obj2).getClass();
                unrestrictedTabTemplate.getClass();
                TabTemplate innerTabTemplate = unrestrictedTabTemplate.getInnerTabTemplate();
                innerTabTemplate.getClass();
                gmv gmvVarB = gmj.b(innerTabTemplate);
                gmvVarB.c = unrestrictedTabTemplate.getHeaderAction();
                wb contents = unrestrictedTabTemplate.getContents();
                gmvVarB.e = contents != null ? new TabContentsInternal(new gms(contents)) : null;
                return gmj.a(geuVar6, new TabTemplateInternal(gmvVarB));
            case 15:
                geu geuVar7 = (geu) obj;
                TabTemplateInternal tabTemplateInternal = (TabTemplateInternal) obj3;
                geuVar7.getClass();
                ((TemplateWrapper) obj2).getClass();
                tabTemplateInternal.getClass();
                return gmj.a(geuVar7, tabTemplateInternal);
            case 16:
                geu geuVar8 = (geu) obj;
                GoogleTabTemplate googleTabTemplate = (GoogleTabTemplate) obj3;
                geuVar8.getClass();
                ((TemplateWrapper) obj2).getClass();
                googleTabTemplate.getClass();
                vu tabCallbackDelegate = googleTabTemplate.getTabCallbackDelegate();
                tabCallbackDelegate.getClass();
                gmv gmvVar = new gmv(tabCallbackDelegate);
                boolean zIsLoading = googleTabTemplate.isLoading();
                gmvVar.b = zIsLoading;
                if (!zIsLoading) {
                    gmvVar.c = googleTabTemplate.getHeaderAction();
                    GoogleTabContents tabContents = googleTabTemplate.getTabContents();
                    if (tabContents != null) {
                        wb template = tabContents.getTemplate();
                        template.getClass();
                        tabContentsInternal = new TabContentsInternal(new gms(template));
                    }
                    gmvVar.e = tabContentsInternal;
                    List<GoogleTab> tabs = googleTabTemplate.getTabs();
                    tabs.getClass();
                    ArrayList arrayList = new ArrayList(woy.bp(tabs, 10));
                    for (GoogleTab googleTab : tabs) {
                        googleTab.getClass();
                        arrayList.add(new TabInternal(googleTab.getTitle(), googleTab.getIcon(), googleTab.getContentId()));
                    }
                    gmvVar.b(arrayList);
                    gmvVar.f = googleTabTemplate.getActiveTabContentId();
                }
                return gmj.a(geuVar8, new TabTemplateInternal(gmvVar));
            case 17:
                MapTemplate mapTemplate = (MapTemplate) obj3;
                ((geu) obj).getClass();
                ((TemplateWrapper) obj2).getClass();
                mapTemplate.getClass();
                ww wwVar = new ww();
                if (mapTemplate.getPane() != null) {
                    Pane pane = mapTemplate.getPane();
                    pane.getClass();
                    Header header = mapTemplate.getHeader();
                    vb vbVar = new vb(pane);
                    if (header != null) {
                        if (header.getStartHeaderAction() != null) {
                            vbVar.c = header.getStartHeaderAction();
                        }
                        if (header.getTitle() != null) {
                            vbVar.a = header.getTitle();
                        }
                        if (!header.getEndHeaderActions().isEmpty()) {
                            sx sxVar = new sx();
                            Iterator<Action> it = header.getEndHeaderActions().iterator();
                            while (it.hasNext()) {
                                sxVar.b(it.next());
                            }
                            vbVar.d = sxVar.a();
                        }
                        vbVar.e = header;
                    }
                    Pane pane2 = vbVar.b;
                    wk wkVar = wk.b;
                    int size = pane2.getActions().size();
                    int i4 = wkVar.e;
                    if (size > i4) {
                        throw new IllegalArgumentException(a.bp(i4, "The number of actions on the pane exceeded the supported max of "));
                    }
                    wkVar.b(pane2.getRows());
                    wf.b.a(pane2.getActions());
                    wbVarB = new PaneTemplate(vbVar);
                } else {
                    wbVarB = gmk.b(mapTemplate.getItemList(), mapTemplate.getHeader());
                }
                wwVar.b = wbVarB;
                ActionStrip actionStripA = gmk.a(mapTemplate.getActionStrip());
                if (actionStripA != null) {
                    wwVar.b(actionStripA);
                }
                MapController mapController = mapTemplate.getMapController();
                if (mapController != null) {
                    wwVar.a = mapController;
                }
                return new gpf(wwVar.a(), null);
            case 18:
                RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj3;
                ((geu) obj).getClass();
                ((TemplateWrapper) obj2).getClass();
                routePreviewNavigationTemplate.getClass();
                ww wwVar2 = new ww();
                ActionStrip actionStripA2 = gmk.a(routePreviewNavigationTemplate.getActionStrip());
                if (actionStripA2 != null) {
                    wwVar2.b(actionStripA2);
                }
                wwVar2.a = gmk.e(routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate());
                Header headerC = gmk.c(routePreviewNavigationTemplate.getHeader(), routePreviewNavigationTemplate.getHeaderAction(), routePreviewNavigationTemplate.getTitle());
                if (routePreviewNavigationTemplate.isLoading()) {
                    uj ujVar = new uj();
                    if (headerC != null) {
                        ujVar.d(headerC);
                    }
                    ujVar.a = true;
                    listTemplateB = ujVar.a();
                } else {
                    listTemplateB = gmk.b(routePreviewNavigationTemplate.getItemList(), headerC);
                }
                wwVar2.b = listTemplateB;
                return new gpf(wwVar2.a(), routePreviewNavigationTemplate.getNavigateAction());
            case 19:
                geu geuVar9 = (geu) obj;
                PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj3;
                geuVar9.getClass();
                ((TemplateWrapper) obj2).getClass();
                placeListNavigationTemplate.getClass();
                ww wwVar3 = new ww();
                Header headerD = gmk.d(gmk.c(placeListNavigationTemplate.getHeader(), placeListNavigationTemplate.getHeaderAction(), placeListNavigationTemplate.getTitle()), placeListNavigationTemplate.getOnContentRefreshDelegate(), geuVar9);
                if (placeListNavigationTemplate.isLoading()) {
                    uj ujVar2 = new uj();
                    if (headerD != null) {
                        ujVar2.d(headerD);
                    }
                    ujVar2.a = true;
                    listTemplateB2 = ujVar2.a();
                } else {
                    listTemplateB2 = gmk.b(placeListNavigationTemplate.getItemList(), headerD);
                }
                wwVar3.b = listTemplateB2;
                ActionStrip actionStrip = placeListNavigationTemplate.getActionStrip();
                if (actionStrip != null) {
                    wwVar3.b(actionStrip);
                }
                wwVar3.a = gmk.e(placeListNavigationTemplate.getMapActionStrip(), placeListNavigationTemplate.getPanModeDelegate());
                return new gpf(wwVar3.a(), null);
            default:
                gab gabVar = (gab) obj;
                bux buxVar3 = (bux) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= true != ((iIntValue2 & 8) == 0 ? buxVar3.C(gabVar) : buxVar3.E(gabVar)) ? 2 : 4;
                }
                if (!buxVar3.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    buxVar3.s();
                } else if (gabVar != null) {
                    buxVar3.v(1041922084);
                    fxp.c(gabVar, BitmapDescriptorFactory.HUE_RED, cdj.b(awd.c(cfy.e, 1.0f), 60.0f), null, csh.a, null, false, false, null, buxVar3, (iIntValue2 & 14) | 25016, 1000);
                    buxVar3.o();
                } else {
                    buxVar3.v(1042179074);
                    gpm.b(awd.c(cfy.e, 1.0f), buxVar3, 6);
                    buxVar3.o();
                }
                return afak.a;
        }
    }
}
