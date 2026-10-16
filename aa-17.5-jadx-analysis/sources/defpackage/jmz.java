package defpackage;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.GoogleTab;
import com.android.car.libraries.apphost.external.model.GoogleTabContents;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import com.android.car.libraries.apphost.external.model.InCallTemplate;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabInternal;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class jmz implements afeg {
    private final /* synthetic */ int a;

    public /* synthetic */ jmz(int i) {
        this.a = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        har harVar;
        fvz fvzVarA;
        wb template;
        CarText carText;
        gac gacVarA;
        wb template2;
        CarText carText2;
        gac gacVarA2;
        ListTemplate listTemplateB;
        boolean z = false;
        gmwVarC = null;
        gmw gmwVarC = null;
        gmwVarC = null;
        gmw gmwVarC2 = null;
        gmw gmwVarC3 = null;
        switch (this.a) {
            case 0:
                oct octVar = (oct) obj;
                xif xifVar = jna.a;
                octVar.getClass();
                ((xgj) obj2).getClass();
                xgq xgqVar = xgq.a;
                oct octVarZ = wox.Z(xgqVar.n());
                octVarZ.s(-8);
                octVar.B(octVarZ.o());
                oct octVarZ2 = wox.Z(xgqVar.n());
                octVarZ2.s(8);
                octVar.A(octVarZ2.o());
                return afak.a;
            case 1:
                oct octVar2 = (oct) obj;
                xif xifVar2 = jna.a;
                octVar2.getClass();
                ((xgj) obj2).getClass();
                xgq xgqVar2 = xgq.a;
                oct octVarZ3 = wox.Z(xgqVar2.n());
                octVarZ3.s(-2);
                octVar2.B(octVarZ3.o());
                oct octVarZ4 = wox.Z(xgqVar2.n());
                octVarZ4.s(2);
                octVar2.A(octVarZ4.o());
                return afak.a;
            case 2:
                ((oct) obj).getClass();
                ((xgj) obj2).getClass();
                return afak.a;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                charSequence.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (zBooleanValue) {
                    spannableStringBuilder.append(" ", lnm.n(R.drawable.gs_devices_vd_theme_24), 33);
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) mki.a.c.getString(R.string.remote_playback));
                    spannableStringBuilder.append((CharSequence) " • ");
                }
                spannableStringBuilder.append(charSequence);
                return new SpannedString(spannableStringBuilder);
            case 4:
                ltr ltrVar = (ltr) obj;
                aezu aezuVar = (aezu) obj2;
                aezuVar.getClass();
                if (ltrVar != null) {
                    return thq.a(IconCompat.n(null, ltrVar.a, ltrVar.b), new oin(15));
                }
                Bitmap bitmap = (Bitmap) aezuVar.a;
                gjo gjoVar = (gjo) aezuVar.b;
                if (bitmap == null) {
                    bitmap = gjoVar.d;
                }
                if (bitmap == null) {
                    return null;
                }
                return new CarIcon(new tj(IconCompat.k(bitmap)));
            case 5:
                ltg ltgVar = (ltg) obj;
                ljx ljxVar = (ljx) obj2;
                if (ltgVar != null) {
                    return usw.e(ltgVar, ljxVar);
                }
                return null;
            case 6:
                ltg ltgVar2 = (ltg) obj;
                ljx ljxVar2 = (ljx) obj2;
                if (ltgVar2 != null) {
                    return usw.e(ltgVar2, ljxVar2);
                }
                return null;
            case 7:
                ltg ltgVar3 = (ltg) obj;
                ljx ljxVar3 = (ljx) obj2;
                if (ltgVar3 != null) {
                    return usw.e(ltgVar3, ljxVar3);
                }
                return null;
            case 8:
                List list = (List) obj;
                ljx ljxVar4 = (ljx) obj2;
                list.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(usw.e((ltg) it.next(), ljxVar4));
                }
                return arrayList;
            case 9:
                ((ggr) obj).getClass();
                ((geu) obj2).getClass();
                affa.d("remoteBytes");
                affa.d("bytes");
                System.currentTimeMillis();
                affa.d("actions");
                affa.d("headerAction");
                return new ggq();
            case 10:
                PaneTemplate paneTemplate = (PaneTemplate) obj;
                geu geuVar = (geu) obj2;
                paneTemplate.getClass();
                geuVar.getClass();
                boolean zF = ((ggk) geuVar.F(ggk.class)).f();
                Header header = paneTemplate.getHeader();
                fzg fzgVarJ = header != null ? fww.j(header, geuVar) : null;
                List<Row> rows = paneTemplate.getPane().getRows();
                rows.getClass();
                if (true == rows.isEmpty()) {
                    rows = null;
                }
                if (rows != null) {
                    ArrayList arrayList2 = new ArrayList(woy.bp(rows, 10));
                    for (Row row : rows) {
                        row.getClass();
                        arrayList2.add(haq.b(row, geuVar));
                    }
                    harVar = new har(null, null, null, 0, arrayList2, 95);
                } else {
                    harVar = null;
                }
                CarIcon image = paneTemplate.getPane().getImage();
                gag gagVarA = image != null ? gai.a(image, geuVar, null, null, null, 14) : null;
                List<Action> actions = paneTemplate.getPane().getActions();
                actions.getClass();
                List<Action> listCd = woy.cd(actions, 2);
                fzg fzgVar = fzgVarJ;
                ArrayList arrayList3 = new ArrayList(woy.bp(listCd, 10));
                for (Action action : listCd) {
                    action.getClass();
                    boolean z2 = zF;
                    arrayList3.add(fvl.c(action, geuVar, z2, null, false, 12));
                    zF = z2;
                }
                gvn gvnVar = new gvn(fzgVar, harVar, gagVarA, arrayList3, paneTemplate.getPane().isLoading());
                gka.b(gvnVar, paneTemplate);
                return gvnVar;
            case 11:
                gsg gsgVar = (gsg) obj;
                geu geuVar2 = (geu) obj2;
                gsgVar.getClass();
                geuVar2.getClass();
                wb wbVar = gsgVar.a;
                TemplateWrapper templateWrapperC = hmh.a.c(geuVar2, TemplateWrapper.wrap(wbVar), gzc.d);
                if (templateWrapperC.getTemplate() instanceof gmw) {
                    gsh gshVar = new gsh((gmw) templateWrapperC.getTemplate());
                    gka.b(gshVar, gsgVar);
                    return gshVar;
                }
                gsh gshVar2 = new gsh((gmw) ((gyy) geuVar2.F(gyy.class)).a(wbVar, geuVar2));
                gka.b(gshVar2, gsgVar);
                return gshVar2;
            case 12:
                TabTemplate tabTemplate = (TabTemplate) obj;
                geu geuVar3 = (geu) obj2;
                tabTemplate.getClass();
                geuVar3.getClass();
                hhr.b(tabTemplate, geuVar3);
                if (tabTemplate.isLoading()) {
                    fvzVarA = null;
                } else {
                    Action headerAction = tabTemplate.getHeaderAction();
                    headerAction.getClass();
                    fvzVarA = hgy.a(headerAction, geuVar3, false);
                }
                List<Tab> tabs = tabTemplate.getTabs();
                tabs.getClass();
                ArrayList arrayList4 = new ArrayList(woy.bp(tabs, 10));
                for (Tab tab : tabs) {
                    CarText title = tab.getTitle();
                    CarIcon icon = tab.getIcon();
                    ghw ghwVar = ghw.b;
                    ghv ghvVar = ghv.c;
                    ghvVar.getClass();
                    arrayList4.add(new hgv(title, gad.a(icon, geuVar3, ghwVar, ghvVar), affa.f(tab.getContentId(), tabTemplate.getActiveTabContentId()), new ah(geuVar3, tabTemplate, tab, 11, (short[]) null), tab.getContentId()));
                }
                if (!tabTemplate.isLoading()) {
                    wb template3 = tabTemplate.getTabContents().getTemplate();
                    template3.getClass();
                    gmwVarC3 = hev.c(template3, geuVar3);
                }
                return new hgw(fvzVarA, arrayList4, gmwVarC3, tabTemplate.isLoading());
            case 13:
                GoogleTabTemplate googleTabTemplate = (GoogleTabTemplate) obj;
                geu geuVar4 = (geu) obj2;
                googleTabTemplate.getClass();
                geuVar4.getClass();
                List<GoogleTab> tabs2 = googleTabTemplate.getTabs();
                tabs2.getClass();
                if (tabs2.isEmpty()) {
                    z = true;
                } else {
                    Iterator<T> it2 = tabs2.iterator();
                    while (it2.hasNext()) {
                        if (((GoogleTab) it2.next()).getIcon() == null) {
                        }
                    }
                    z = true;
                }
                Action headerAction2 = googleTabTemplate.getHeaderAction();
                fvz fvzVarA2 = headerAction2 != null ? hgy.a(headerAction2, geuVar4, true) : null;
                List<GoogleTab> tabs3 = googleTabTemplate.getTabs();
                tabs3.getClass();
                ArrayList arrayList5 = new ArrayList(woy.bp(tabs3, 10));
                for (GoogleTab googleTab : tabs3) {
                    CarText title2 = googleTab.getTitle();
                    CarIcon icon2 = googleTab.getIcon();
                    if (z) {
                        icon2.getClass();
                        ghw ghwVar2 = ghw.a;
                        ghv ghvVar2 = ghv.c;
                        ghvVar2.getClass();
                        carText = title2;
                        gacVarA = gad.a(icon2, geuVar4, ghwVar2, ghvVar2);
                    } else {
                        carText = title2;
                        gacVarA = null;
                    }
                    arrayList5.add(new hgv(carText, gacVarA, affa.f(googleTab.getContentId(), googleTabTemplate.getActiveTabContentId()), new ah((Object) geuVar4, (Object) googleTabTemplate, (Object) googleTab, 9, (byte[]) null), googleTab.getContentId()));
                }
                GoogleTabContents tabContents = googleTabTemplate.getTabContents();
                if (tabContents != null && (template = tabContents.getTemplate()) != null) {
                    gmwVarC2 = hev.c(template, geuVar4);
                }
                return new hgw(fvzVarA2, arrayList5, gmwVarC2, googleTabTemplate.isLoading());
            case 14:
                UnrestrictedTabTemplate unrestrictedTabTemplate = (UnrestrictedTabTemplate) obj;
                geu geuVar5 = (geu) obj2;
                unrestrictedTabTemplate.getClass();
                geuVar5.getClass();
                TabTemplate innerTabTemplate = unrestrictedTabTemplate.getInnerTabTemplate();
                innerTabTemplate.getClass();
                Action headerAction3 = unrestrictedTabTemplate.getHeaderAction();
                fvz fvzVarA3 = headerAction3 != null ? hgy.a(headerAction3, geuVar5, true) : null;
                List<Tab> tabs4 = innerTabTemplate.getTabs();
                tabs4.getClass();
                ArrayList arrayList6 = new ArrayList(woy.bp(tabs4, 10));
                for (Tab tab2 : tabs4) {
                    CarText title3 = tab2.getTitle();
                    CarIcon icon3 = tab2.getIcon();
                    ghw ghwVar3 = ghw.b;
                    ghv ghvVar3 = ghv.c;
                    ghvVar3.getClass();
                    arrayList6.add(new hgv(title3, gad.a(icon3, geuVar5, ghwVar3, ghvVar3), affa.f(tab2.getContentId(), innerTabTemplate.getActiveTabContentId()), new ah(geuVar5, innerTabTemplate, tab2, 12, (short[]) null), tab2.getContentId()));
                }
                wb contents = unrestrictedTabTemplate.getContents();
                return new hgw(fvzVarA3, arrayList6, contents != null ? hev.c(contents, geuVar5) : null, innerTabTemplate.isLoading());
            case 15:
                TabTemplateInternal tabTemplateInternal = (TabTemplateInternal) obj;
                geu geuVar6 = (geu) obj2;
                tabTemplateInternal.getClass();
                geuVar6.getClass();
                List<TabInternal> tabs5 = tabTemplateInternal.getTabs();
                if ((tabs5 instanceof Collection) && tabs5.isEmpty()) {
                    z = true;
                } else {
                    Iterator<T> it3 = tabs5.iterator();
                    while (it3.hasNext()) {
                        if (((TabInternal) it3.next()).getIcon() == null) {
                        }
                    }
                    z = true;
                }
                Action headerAction4 = tabTemplateInternal.getHeaderAction();
                fvz fvzVarA4 = headerAction4 != null ? hgy.a(headerAction4, geuVar6, true) : null;
                List<TabInternal> tabs6 = tabTemplateInternal.getTabs();
                ArrayList arrayList7 = new ArrayList(woy.bp(tabs6, 10));
                for (TabInternal tabInternal : tabs6) {
                    CarText title4 = tabInternal.getTitle();
                    CarIcon icon4 = tabInternal.getIcon();
                    if (z) {
                        icon4.getClass();
                        ghw ghwVar4 = ghw.b;
                        ghv ghvVar4 = ghv.c;
                        ghvVar4.getClass();
                        carText2 = title4;
                        gacVarA2 = gad.a(icon4, geuVar6, ghwVar4, ghvVar4);
                    } else {
                        carText2 = title4;
                        gacVarA2 = null;
                    }
                    arrayList7.add(new hgv(carText2, gacVarA2, affa.f(tabInternal.getContentId(), tabTemplateInternal.getActiveTabContentId()), new ah((Object) geuVar6, (Object) tabTemplateInternal, (Object) tabInternal, 10, (byte[]) null), tabInternal.getContentId()));
                }
                TabContentsInternal tabContents2 = tabTemplateInternal.getTabContents();
                if (tabContents2 != null && (template2 = tabContents2.getTemplate()) != null) {
                    gmwVarC = hev.c(template2, geuVar6);
                }
                return new hgw(fvzVarA4, arrayList7, gmwVarC, tabTemplateInternal.getIsLoading());
            case 16:
                NavigationTemplate navigationTemplate = (NavigationTemplate) obj;
                geu geuVar7 = (geu) obj2;
                navigationTemplate.getClass();
                geuVar7.getClass();
                return gmt.e(navigationTemplate, geuVar7);
            case 17:
                MinimizedStateNavigationTemplate minimizedStateNavigationTemplate = (MinimizedStateNavigationTemplate) obj;
                geu geuVar8 = (geu) obj2;
                minimizedStateNavigationTemplate.getClass();
                geuVar8.getClass();
                return gmt.e(minimizedStateNavigationTemplate.getOriginalTemplate(), geuVar8);
            case 18:
                InCallTemplate inCallTemplate = (InCallTemplate) obj;
                geu geuVar9 = (geu) obj2;
                inCallTemplate.getClass();
                geuVar9.getClass();
                boolean zF2 = ((ggk) geuVar9.F(ggk.class)).f();
                List<Action> actions2 = inCallTemplate.getActions();
                actions2.getClass();
                ArrayList arrayList8 = new ArrayList(woy.bp(actions2, 10));
                for (Action action2 : actions2) {
                    action2.getClass();
                    arrayList8.add(fvl.c(action2, geuVar9, zF2, null, false, 12));
                }
                Header header2 = inCallTemplate.getHeader();
                fzg fzgVarJ2 = header2 != null ? fww.j(header2, geuVar9) : null;
                CarIcon icon5 = inCallTemplate.getIcon();
                gac gacVarB = icon5 != null ? gad.b(icon5, geuVar9) : null;
                CarText title5 = inCallTemplate.getTitle();
                List<CarText> texts = inCallTemplate.getTexts();
                texts.getClass();
                return new gcy(fzgVarJ2, gacVarB, title5, texts, arrayList8, inCallTemplate.isLoading());
            case 19:
                androidx.car.app.dialer.InCallTemplate inCallTemplate2 = (androidx.car.app.dialer.InCallTemplate) obj;
                geu geuVar10 = (geu) obj2;
                inCallTemplate2.getClass();
                geuVar10.getClass();
                boolean zF3 = ((ggk) geuVar10.F(ggk.class)).f();
                List<Action> actions3 = inCallTemplate2.getActions();
                actions3.getClass();
                ArrayList arrayList9 = new ArrayList(woy.bp(actions3, 10));
                for (Action action3 : actions3) {
                    action3.getClass();
                    arrayList9.add(fvl.c(action3, geuVar10, zF3, null, false, 12));
                }
                Header header3 = inCallTemplate2.getHeader();
                fzg fzgVarJ3 = header3 != null ? fww.j(header3, geuVar10) : null;
                CarIcon icon6 = inCallTemplate2.getIcon();
                gac gacVarB2 = icon6 != null ? gad.b(icon6, geuVar10) : null;
                CarText title6 = inCallTemplate2.getTitle();
                List<CarText> texts2 = inCallTemplate2.getTexts();
                texts2.getClass();
                return new gcy(fzgVarJ3, gacVarB2, title6, texts2, arrayList9, inCallTemplate2.isLoading());
            default:
                PlaceListNavigationTemplate placeListNavigationTemplate = (PlaceListNavigationTemplate) obj;
                geu geuVar11 = (geu) obj2;
                placeListNavigationTemplate.getClass();
                geuVar11.getClass();
                gor gorVarB = gob.b(placeListNavigationTemplate.getActionStrip(), placeListNavigationTemplate.getMapActionStrip(), placeListNavigationTemplate.getPanModeDelegate(), geuVar11);
                Header headerD = gmk.d(gmk.c(placeListNavigationTemplate.getHeader(), placeListNavigationTemplate.getHeaderAction(), placeListNavigationTemplate.getTitle()), placeListNavigationTemplate.getOnContentRefreshDelegate(), geuVar11);
                if (placeListNavigationTemplate.isLoading()) {
                    uj ujVar = new uj();
                    if (headerD != null) {
                        ujVar.d(headerD);
                    }
                    ujVar.a = true;
                    listTemplateB = ujVar.a();
                } else {
                    listTemplateB = gmk.b(placeListNavigationTemplate.getItemList(), headerD);
                }
                return new gos(grx.g(listTemplateB, geuVar11), gorVarB);
        }
    }
}
