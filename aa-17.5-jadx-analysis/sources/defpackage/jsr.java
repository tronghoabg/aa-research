package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.car.app.SessionInfo;
import androidx.car.app.dialer.TelephoneKeypadTemplate;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.GridItem;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.PlaceListMapTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.TabTemplate;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import com.android.car.libraries.apphost.external.model.ExtendedHeader;
import com.android.car.libraries.apphost.external.model.GoogleTabTemplate;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.external.model.InCallTemplate;
import com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.android.car.libraries.apphost.external.model.RadioPlaybackTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.android.car.libraries.apphost.external.model.widgets.ActionsWidget;
import com.android.car.libraries.apphost.external.model.widgets.ItemWidget;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.android.car.libraries.apphost.external.model.widgets.VoicePlateWidget;
import com.android.car.libraries.apphost.internal.model.GoogleListTemplate;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import com.android.car.libraries.apphost.tab.model.UnrestrictedTabTemplate;
import com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class jsr extends jsd {
    private static final yph b = yph.c("CarApp.H.Tem");
    private final jsp c;

    public jsr(jsp jspVar) {
        this.c = jspVar;
    }

    @Override // defpackage.jsd
    public final /* bridge */ /* synthetic */ Object a(Pair pair) {
        mqb mqbVar = (mqb) pair.first;
        SessionInfo sessionInfo = (SessionInfo) pair.second;
        ((ype) b.l().ai((char) 2763)).y("Creating template view instance for %s", mqbVar.c());
        jsp jspVar = this.c;
        Context context = jspVar.getContext();
        yph yphVar = TemplateView.h;
        TemplateView templateView = (TemplateView) LayoutInflater.from(context).inflate(R.layout.template_view, (ViewGroup) null);
        templateView.b = jspVar.getLifecycle();
        final geu geuVarC = jspVar.c(mqbVar, sessionInfo);
        if (aczc.t()) {
            geuVarC.s(ghe.class, templateView.l);
        }
        geuVarC.s(gie.class, new gie(ajac.a(gid.b)));
        final int i = 19;
        gev.a(new joo(geuVarC, 19, null));
        geuVarC.getClass();
        gyy gyyVar = (gyy) geuVarC.F(gyy.class);
        final int i2 = 9;
        gyyVar.b(ggr.class, new jmz(i2));
        final int i3 = 11;
        gyyVar.b(gsg.class, new jmz(i3));
        final int i4 = 2;
        gyyVar.b(hhs.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i4) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        leh.a.a();
        gyyVar.b(SignInTemplate.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i2) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        gyyVar.b(MessageTemplate.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i3) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i5 = 12;
        gyyVar.b(LongMessageTemplate.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i5) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i6 = 10;
        final int i7 = 20;
        final int i8 = 15;
        final int i9 = 13;
        final int i10 = 18;
        final int i11 = 17;
        final int i12 = 16;
        final int i13 = 14;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        final int i14 = 0;
        if (((ggk) geuVarC.F(ggk.class)).f()) {
            gyyVar.b(SearchTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i9) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(WebViewTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i13) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(MapWithContentTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i8) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(RoutePreviewNavigationTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i12) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(PlaceListNavigationTemplate.class, new jmz(i7));
            gyyVar.b(MapTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i6) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(PlaceListMapTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i11) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(SectionedItemTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i10) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(GoogleListTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(ListTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i7) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(GridWrapperTemplate.class, new kbi(c4 == true ? 1 : 0));
            gyyVar.b(GridTemplate.class, new kbi(i14));
            gyyVar.b(MenuTemplate.class, new kbj());
            gyyVar.b(PaneTemplate.class, new jmz(i6));
            gyyVar.b(TabTemplate.class, new jmz(12));
            gyyVar.b(GoogleTabTemplate.class, new jmz(13));
            gyyVar.b(UnrestrictedTabTemplate.class, new jmz(i13));
            gyyVar.b(TabTemplateInternal.class, new jmz(i8));
        }
        gyyVar.b(NavigationTemplate.class, new jmz(i12));
        gyyVar.b(MinimizedStateNavigationTemplate.class, new jmz(i11));
        gyyVar.b(InCallTemplate.class, new jmz(i10));
        gyyVar.b(androidx.car.app.dialer.InCallTemplate.class, new jmz(i));
        final char c5 = c3 == true ? 1 : 0;
        gyyVar.b(TelephoneKeypadTemplate.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (c5) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        gyyVar.b(ItemWidget.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i14) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i15 = 3;
        gyyVar.b(ActionsWidget.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i15) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i16 = 4;
        gyyVar.b(PaneWidget.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i16) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i17 = 5;
        gyyVar.b(VoicePlateWidget.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i17) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        final int i18 = 7;
        final int i19 = 6;
        if (lmi.a.a().d()) {
            gyyVar.b(MediaPlaybackTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i19) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
            gyyVar.b(androidx.car.app.media.model.MediaPlaybackTemplate.class, new afeg() { // from class: kbe
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    List arrayList;
                    List<Action> actions;
                    gmw hayVar;
                    har harVar;
                    List arrayList2;
                    List<Action> actions2;
                    List<Action> actions3;
                    ListTemplate listTemplateB;
                    List listBg;
                    arrayList3 = null;
                    ArrayList arrayList3 = null;
                    fzy fzyVarD = null;
                    gag gagVarA = null;
                    switch (i18) {
                        case 0:
                            ItemWidget itemWidget = (ItemWidget) obj;
                            geu geuVar = (geu) obj2;
                            itemWidget.getClass();
                            geuVar.getClass();
                            List<GridItem> items = itemWidget.getItems();
                            ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                            for (GridItem gridItem : items) {
                                CarIcon image = gridItem.getImage();
                                fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                                gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                                gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                                uq onClickDelegate = gridItem.getOnClickDelegate();
                                arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                            }
                            CarText title = itemWidget.getTitle();
                            Action action = itemWidget.getAction();
                            fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                            Action headerAction = itemWidget.getHeaderAction();
                            return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                        case 1:
                            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                            geu geuVar2 = (geu) obj2;
                            telephoneKeypadTemplate.getClass();
                            geuVar2.getClass();
                            Header header = telephoneKeypadTemplate.getHeader();
                            fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                            String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                            Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                            primaryAction.getClass();
                            fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                            rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                            rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                            rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                            gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                            gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                            Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                            keySecondaryTexts.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                            Iterator it = keySecondaryTexts.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                value.getClass();
                                linkedHashMap.put(key, fzo.f((CarText) value));
                            }
                            return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                        case 2:
                            ((hhs) obj).getClass();
                            ((geu) obj2).getClass();
                            throw null;
                        case 3:
                            ActionsWidget actionsWidget = (ActionsWidget) obj;
                            geu geuVar3 = (geu) obj2;
                            actionsWidget.getClass();
                            geuVar3.getClass();
                            List<Action> actions4 = actionsWidget.getActions();
                            ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                            Iterator it2 = actions4.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                            }
                            Action headerAction2 = actionsWidget.getHeaderAction();
                            fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                            CarText titlePrimary = actionsWidget.getTitlePrimary();
                            CarText titleSecondary = actionsWidget.getTitleSecondary();
                            CarIcon titleIcon = actionsWidget.getTitleIcon();
                            return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                        case 4:
                            PaneWidget paneWidget = (PaneWidget) obj;
                            geu geuVar4 = (geu) obj2;
                            paneWidget.getClass();
                            geuVar4.getClass();
                            CarIcon headerIcon = paneWidget.getHeaderIcon();
                            fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                            CarText headerText = paneWidget.getHeaderText();
                            Action headerAction3 = paneWidget.getHeaderAction();
                            fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                            CarText paneText = paneWidget.getPaneText();
                            List<Action> actions5 = paneWidget.getActions();
                            ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                            Iterator it3 = actions5.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                            }
                            return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                        case 5:
                            VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                            geu geuVar5 = (geu) obj2;
                            voicePlateWidget.getClass();
                            geuVar5.getClass();
                            Action action2 = voicePlateWidget.getAction();
                            fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                            CarIcon icon = voicePlateWidget.getIcon();
                            return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                        case 6:
                            MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                            geu geuVar6 = (geu) obj2;
                            mediaPlaybackTemplate.getClass();
                            geuVar6.getClass();
                            ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                            ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                            if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList(woy.bp(actions, 10));
                                for (Action action3 : actions) {
                                    action3.getClass();
                                    arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                                }
                            }
                            if (arrayList == null) {
                                arrayList = afbe.a;
                            }
                            List list = arrayList;
                            Header header2 = mediaPlaybackTemplate.getHeader();
                            grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                            gka.b(grfVar, mediaPlaybackTemplate);
                            return grfVar;
                        case 7:
                            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                            geu geuVar7 = (geu) obj2;
                            mediaPlaybackTemplate2.getClass();
                            geuVar7.getClass();
                            afbe afbeVar = afbe.a;
                            Header header3 = mediaPlaybackTemplate2.getHeader();
                            grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                            gka.b(grfVar2, mediaPlaybackTemplate2);
                            return grfVar2;
                        case 8:
                            RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                            geu geuVar8 = (geu) obj2;
                            radioPlaybackTemplate.getClass();
                            geuVar8.getClass();
                            afbe afbeVar2 = afbe.a;
                            ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                            grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                            gka.b(grfVar3, radioPlaybackTemplate);
                            return grfVar3;
                        case 9:
                            SignInTemplate signInTemplate = (SignInTemplate) obj;
                            geu geuVar9 = (geu) obj2;
                            signInTemplate.getClass();
                            geuVar9.getClass();
                            boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                            wp signInMethod = signInTemplate.getSignInMethod();
                            boolean zIsLoading = signInTemplate.isLoading();
                            CarText title2 = signInTemplate.getTitle();
                            Action headerAction4 = signInTemplate.getHeaderAction();
                            ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                            fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                            CarText instructions = signInTemplate.getInstructions();
                            CarText additionalText = signInTemplate.getAdditionalText();
                            List<Action> actions6 = signInTemplate.getActions();
                            actions6.getClass();
                            ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                            for (Action action4 : actions6) {
                                action4.getClass();
                                arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                            }
                            return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                        case 10:
                            MapTemplate mapTemplate = (MapTemplate) obj;
                            geu geuVar10 = (geu) obj2;
                            mapTemplate.getClass();
                            geuVar10.getClass();
                            ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                            MapController mapController = mapTemplate.getMapController();
                            ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                            MapController mapController2 = mapTemplate.getMapController();
                            gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                            Header header5 = mapTemplate.getHeader();
                            fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                            Pane pane = mapTemplate.getPane();
                            if (pane != null) {
                                List<Row> rows = pane.getRows();
                                rows.getClass();
                                if (true == rows.isEmpty()) {
                                    rows = null;
                                }
                                if (rows != null) {
                                    ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                    for (Row row : rows) {
                                        row.getClass();
                                        arrayList8.add(haq.b(row, geuVar10));
                                    }
                                    harVar = new har(null, null, null, 0, arrayList8, 95);
                                } else {
                                    harVar = null;
                                }
                                CarIcon image2 = pane.getImage();
                                if (image2 != null) {
                                    ghw ghwVar = ghw.a;
                                    ghv ghvVar = ghv.a;
                                    ghvVar.getClass();
                                    gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                                }
                                List<Action> actions7 = pane.getActions();
                                actions7.getClass();
                                List<Action> listCd = woy.cd(actions7, 2);
                                ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                                for (Action action5 : listCd) {
                                    action5.getClass();
                                    arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                                }
                                hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                            } else {
                                fzg fzgVar = fzgVarJ2;
                                ItemList itemList = mapTemplate.getItemList();
                                hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                            }
                            gos gosVar = new gos(hayVar, gorVarB);
                            gka.b(gosVar, mapTemplate);
                            return gosVar;
                        case 11:
                            MessageTemplate messageTemplate = (MessageTemplate) obj;
                            geu geuVar11 = (geu) obj2;
                            messageTemplate.getClass();
                            geuVar11.getClass();
                            boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                            Header header6 = messageTemplate.getHeader();
                            fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                            CarText message = messageTemplate.getMessage();
                            CarText debugMessage = messageTemplate.getDebugMessage();
                            CarIcon icon2 = messageTemplate.getIcon();
                            if (icon2 != null) {
                                gqr gqrVar = new gqr(6);
                                gqr gqrVar2 = new gqr(7);
                                ghw ghwVar2 = ghw.a;
                                ghv ghvVar2 = ghv.a;
                                ghvVar2.getClass();
                                fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                            }
                            fzy fzyVar = fzyVarD;
                            List<Action> actions8 = messageTemplate.getActions();
                            actions8.getClass();
                            ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                            for (Action action6 : actions8) {
                                action6.getClass();
                                boolean z = zF2;
                                arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                                zF2 = z;
                            }
                            return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                        case 12:
                            LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                            geu geuVar12 = (geu) obj2;
                            longMessageTemplate.getClass();
                            geuVar12.getClass();
                            boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                            CarText title3 = longMessageTemplate.getTitle();
                            Action headerAction5 = longMessageTemplate.getHeaderAction();
                            ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                            fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                            CarText message2 = longMessageTemplate.getMessage();
                            List<Action> actions9 = longMessageTemplate.getActions();
                            actions9.getClass();
                            ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                            for (Action action7 : actions9) {
                                action7.getClass();
                                arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                            }
                            return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                        case 13:
                            SearchTemplate searchTemplate = (SearchTemplate) obj;
                            geu geuVar13 = (geu) obj2;
                            searchTemplate.getClass();
                            geuVar13.getClass();
                            vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                            boolean zIsLoading2 = searchTemplate.isLoading();
                            Action headerAction6 = searchTemplate.getHeaderAction();
                            fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                            ItemList itemList2 = searchTemplate.getItemList();
                            har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                            String initialSearchText = searchTemplate.getInitialSearchText();
                            String searchHint = searchTemplate.getSearchHint();
                            boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                            grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                            grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                            ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                            if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                                arrayList2 = afbe.a;
                            } else {
                                arrayList2 = new ArrayList(woy.bp(actions2, 10));
                                for (Action action8 : actions2) {
                                    action8.getClass();
                                    arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                                }
                            }
                            return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                        case 14:
                            WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                            geu geuVar14 = (geu) obj2;
                            webViewTemplate.getClass();
                            geuVar14.getClass();
                            String url = webViewTemplate.getUrl();
                            ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                            if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                                arrayList3 = new ArrayList(woy.bp(actions3, 10));
                                for (Action action9 : actions3) {
                                    action9.getClass();
                                    arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                                }
                            }
                            boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                            boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                            boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                            List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                            urlsToOpenOnPhone.getClass();
                            return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                        case 15:
                            MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                            geu geuVar15 = (geu) obj2;
                            mapWithContentTemplate.getClass();
                            geuVar15.getClass();
                            if (geuVar15.i().c() >= 8) {
                                xk.b.a(mapWithContentTemplate.getContentTemplate());
                            } else {
                                if (geuVar15.i().c() != 7) {
                                    geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                    throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                                }
                                xk.a.a(mapWithContentTemplate.getContentTemplate());
                            }
                            wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                            contentTemplate.getClass();
                            wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                            gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                            ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                            MapController mapController3 = mapWithContentTemplate.getMapController();
                            ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                            MapController mapController4 = mapWithContentTemplate.getMapController();
                            return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                        case 16:
                            RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                            geu geuVar16 = (geu) obj2;
                            routePreviewNavigationTemplate.getClass();
                            geuVar16.getClass();
                            gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                            hay hayVarG = grx.g(listTemplateB, geuVar16);
                            Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                            fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                            if (fwbVarE != null) {
                                ?? govVar = new gov(hayVarG, fwbVarE);
                                gka.b(govVar, routePreviewNavigationTemplate);
                                hayVarG = govVar;
                            }
                            gos gosVar2 = new gos(hayVarG, gorVarB2);
                            gka.b(gosVar2, routePreviewNavigationTemplate);
                            return gosVar2;
                        case 17:
                            PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                            geu geuVar17 = (geu) obj2;
                            placeListMapTemplate.getClass();
                            geuVar17.getClass();
                            boolean zIsLoading3 = placeListMapTemplate.isLoading();
                            fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                            ItemList itemList3 = placeListMapTemplate.getItemList();
                            gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                            gka.b(gouVar, placeListMapTemplate);
                            return gouVar;
                        case 18:
                            SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                            geu geuVar18 = (geu) obj2;
                            sectionedItemTemplate.getClass();
                            geuVar18.getClass();
                            return grx.h(sectionedItemTemplate, geuVar18, false);
                        case 19:
                            GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                            geu geuVar19 = (geu) obj2;
                            googleListTemplate.getClass();
                            geuVar19.getClass();
                            if (!googleListTemplate.getSectionedLists().isEmpty()) {
                                List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                                listBg = new ArrayList(woy.bp(sectionedLists, 10));
                                Iterator it4 = sectionedLists.iterator();
                                while (it4.hasNext()) {
                                    listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                                }
                            } else if (googleListTemplate.getSingleList() != null) {
                                ItemList singleList = googleListTemplate.getSingleList();
                                singleList.getClass();
                                listBg = woy.bg(gqk.h(singleList, geuVar19));
                            } else {
                                listBg = afbe.a;
                            }
                            List list2 = listBg;
                            Header header7 = googleListTemplate.getHeader();
                            fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                            boolean isLoading = googleListTemplate.getIsLoading();
                            List<Action> actions10 = googleListTemplate.getActions();
                            ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                            Iterator it5 = actions10.iterator();
                            while (it5.hasNext()) {
                                arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                            }
                            return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                        default:
                            ListTemplate listTemplate = (ListTemplate) obj;
                            geu geuVar20 = (geu) obj2;
                            listTemplate.getClass();
                            geuVar20.getClass();
                            return grx.g(listTemplate, geuVar20);
                    }
                }
            });
        }
        final int i20 = 8;
        gyyVar.b(RadioPlaybackTemplate.class, new afeg() { // from class: kbe
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v95, types: [gmo, gov] */
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                List arrayList;
                List<Action> actions;
                gmw hayVar;
                har harVar;
                List arrayList2;
                List<Action> actions2;
                List<Action> actions3;
                ListTemplate listTemplateB;
                List listBg;
                arrayList3 = null;
                ArrayList arrayList3 = null;
                fzy fzyVarD = null;
                gag gagVarA = null;
                switch (i20) {
                    case 0:
                        ItemWidget itemWidget = (ItemWidget) obj;
                        geu geuVar = (geu) obj2;
                        itemWidget.getClass();
                        geuVar.getClass();
                        List<GridItem> items = itemWidget.getItems();
                        ArrayList arrayList4 = new ArrayList(woy.bp(items, 10));
                        for (GridItem gridItem : items) {
                            CarIcon image = gridItem.getImage();
                            fzv fzvVarA = image != null ? fzu.a(fxi.e(image, geuVar, gridItem.getBadge(), new gah(16)), geuVar) : null;
                            gfg gfgVarC = gey.c(geuVar, gridItem.getTitle());
                            gfg gfgVarC2 = gey.c(geuVar, gridItem.getText());
                            uq onClickDelegate = gridItem.getOnClickDelegate();
                            arrayList4.add(new gna(fzvVarA, gfgVarC, gfgVarC2, onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 3) : null));
                        }
                        CarText title = itemWidget.getTitle();
                        Action action = itemWidget.getAction();
                        fvu fvuVarC = action != null ? fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12) : null;
                        Action headerAction = itemWidget.getHeaderAction();
                        return new gmx(arrayList4, title, fvuVarC, headerAction != null ? fvl.c(headerAction, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, ((ggk) geuVar.F(ggk.class)).f(), 4) : null);
                    case 1:
                        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
                        geu geuVar2 = (geu) obj2;
                        telephoneKeypadTemplate.getClass();
                        geuVar2.getClass();
                        Header header = telephoneKeypadTemplate.getHeader();
                        fzg fzgVarJ = header != null ? fww.j(header, geuVar2) : null;
                        String phoneNumber = telephoneKeypadTemplate.getPhoneNumber();
                        Action primaryAction = telephoneKeypadTemplate.getPrimaryAction();
                        primaryAction.getClass();
                        fvu fvuVarC2 = fvl.c(primaryAction, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12);
                        rg telephoneKeypadCallbackDelegate = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar = telephoneKeypadCallbackDelegate != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate, 0) : null;
                        rg telephoneKeypadCallbackDelegate2 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar2 = telephoneKeypadCallbackDelegate2 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate2, 2) : null;
                        rg telephoneKeypadCallbackDelegate3 = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
                        gdg gdgVar3 = telephoneKeypadCallbackDelegate3 != null ? new gdg(geuVar2, telephoneKeypadCallbackDelegate3, 3) : null;
                        gdg gdgVar4 = new gdg(telephoneKeypadTemplate, geuVar2, 4, null);
                        Map<Integer, CarText> keySecondaryTexts = telephoneKeypadTemplate.getKeySecondaryTexts();
                        keySecondaryTexts.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(keySecondaryTexts.size()));
                        Iterator it = keySecondaryTexts.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            linkedHashMap.put(key, fzo.f((CarText) value));
                        }
                        return new gdf(fzgVarJ, phoneNumber, fvuVarC2, gdgVar, gdgVar2, gdgVar3, gdgVar4, linkedHashMap);
                    case 2:
                        ((hhs) obj).getClass();
                        ((geu) obj2).getClass();
                        throw null;
                    case 3:
                        ActionsWidget actionsWidget = (ActionsWidget) obj;
                        geu geuVar3 = (geu) obj2;
                        actionsWidget.getClass();
                        geuVar3.getClass();
                        List<Action> actions4 = actionsWidget.getActions();
                        ArrayList arrayList5 = new ArrayList(woy.bp(actions4, 10));
                        Iterator it2 = actions4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(fvl.c((Action) it2.next(), geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, false, 12));
                        }
                        Action headerAction2 = actionsWidget.getHeaderAction();
                        fvu fvuVarC3 = headerAction2 != null ? fvl.c(headerAction2, geuVar3, ((ggk) geuVar3.F(ggk.class)).f(), null, ((ggk) geuVar3.F(ggk.class)).f(), 4) : null;
                        CarText titlePrimary = actionsWidget.getTitlePrimary();
                        CarText titleSecondary = actionsWidget.getTitleSecondary();
                        CarIcon titleIcon = actionsWidget.getTitleIcon();
                        return new fuk(arrayList5, fvuVarC3, titlePrimary, titleSecondary, titleIcon != null ? fxi.e(titleIcon, geuVar3, actionsWidget.getBadge(), new ewc(14)) : null);
                    case 4:
                        PaneWidget paneWidget = (PaneWidget) obj;
                        geu geuVar4 = (geu) obj2;
                        paneWidget.getClass();
                        geuVar4.getClass();
                        CarIcon headerIcon = paneWidget.getHeaderIcon();
                        fzw fzwVarE = headerIcon != null ? fxi.e(headerIcon, geuVar4, paneWidget.getHeaderIconBadge(), new gqr(16)) : null;
                        CarText headerText = paneWidget.getHeaderText();
                        Action headerAction3 = paneWidget.getHeaderAction();
                        fvu fvuVarC4 = headerAction3 != null ? fvl.c(headerAction3, geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, ((ggk) geuVar4.F(ggk.class)).f(), 4) : null;
                        CarText paneText = paneWidget.getPaneText();
                        List<Action> actions5 = paneWidget.getActions();
                        ArrayList arrayList6 = new ArrayList(woy.bp(actions5, 10));
                        Iterator it3 = actions5.iterator();
                        while (it3.hasNext()) {
                            arrayList6.add(fvl.c((Action) it3.next(), geuVar4, ((ggk) geuVar4.F(ggk.class)).f(), null, false, 12));
                        }
                        return new gvs(fzwVarE, headerText, fvuVarC4, paneText, arrayList6);
                    case 5:
                        VoicePlateWidget voicePlateWidget = (VoicePlateWidget) obj;
                        geu geuVar5 = (geu) obj2;
                        voicePlateWidget.getClass();
                        geuVar5.getClass();
                        Action action2 = voicePlateWidget.getAction();
                        fvv fvvVarB = action2 != null ? fvr.b(action2, geuVar5, null) : null;
                        CarIcon icon = voicePlateWidget.getIcon();
                        return new hml(fvvVarB, icon != null ? gad.b(icon, geuVar5) : null, voicePlateWidget.getPlaceholderText());
                    case 6:
                        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
                        geu geuVar6 = (geu) obj2;
                        mediaPlaybackTemplate.getClass();
                        geuVar6.getClass();
                        ggk ggkVar = (ggk) geuVar6.F(ggk.class);
                        ActionStrip actionStrip = mediaPlaybackTemplate.getActionStrip();
                        if (actionStrip == null || (actions = actionStrip.getActions()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(woy.bp(actions, 10));
                            for (Action action3 : actions) {
                                action3.getClass();
                                arrayList.add(fvl.c(action3, geuVar6, ggkVar.f(), null, false, 12));
                            }
                        }
                        if (arrayList == null) {
                            arrayList = afbe.a;
                        }
                        List list = arrayList;
                        Header header2 = mediaPlaybackTemplate.getHeader();
                        grf grfVar = new grf(list, header2 != null ? gqp.b(header2, geuVar6) : null, mediaPlaybackTemplate.getPlaybackComponentName(), false, mediaPlaybackTemplate.hasInternalAttributionIcon());
                        gka.b(grfVar, mediaPlaybackTemplate);
                        return grfVar;
                    case 7:
                        androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate2 = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
                        geu geuVar7 = (geu) obj2;
                        mediaPlaybackTemplate2.getClass();
                        geuVar7.getClass();
                        afbe afbeVar = afbe.a;
                        Header header3 = mediaPlaybackTemplate2.getHeader();
                        grf grfVar2 = new grf(afbeVar, header3 != null ? gqp.b(header3, geuVar7) : null, ((gmh) geuVar7.d()).a, false, false);
                        gka.b(grfVar2, mediaPlaybackTemplate2);
                        return grfVar2;
                    case 8:
                        RadioPlaybackTemplate radioPlaybackTemplate = (RadioPlaybackTemplate) obj;
                        geu geuVar8 = (geu) obj2;
                        radioPlaybackTemplate.getClass();
                        geuVar8.getClass();
                        afbe afbeVar2 = afbe.a;
                        ExtendedHeader header4 = radioPlaybackTemplate.getHeader();
                        grf grfVar3 = new grf(afbeVar2, header4 != null ? gqp.a(geuVar8, header4.getTitle(), header4.getStartHeaderActions(), header4.getEndHeaderActions()) : null, radioPlaybackTemplate.getPlaybackComponentName(), true, radioPlaybackTemplate.getHasInternalAttributionIcon());
                        gka.b(grfVar3, radioPlaybackTemplate);
                        return grfVar3;
                    case 9:
                        SignInTemplate signInTemplate = (SignInTemplate) obj;
                        geu geuVar9 = (geu) obj2;
                        signInTemplate.getClass();
                        geuVar9.getClass();
                        boolean zF = ((ggk) geuVar9.F(ggk.class)).f();
                        wp signInMethod = signInTemplate.getSignInMethod();
                        boolean zIsLoading = signInTemplate.isLoading();
                        CarText title2 = signInTemplate.getTitle();
                        Action headerAction4 = signInTemplate.getHeaderAction();
                        ActionStrip actionStrip2 = signInTemplate.getActionStrip();
                        fzg fzgVarK = fww.k(geuVar9, title2, headerAction4, actionStrip2 != null ? actionStrip2.getActions() : null);
                        CarText instructions = signInTemplate.getInstructions();
                        CarText additionalText = signInTemplate.getAdditionalText();
                        List<Action> actions6 = signInTemplate.getActions();
                        actions6.getClass();
                        ArrayList arrayList7 = new ArrayList(woy.bp(actions6, 10));
                        for (Action action4 : actions6) {
                            action4.getClass();
                            arrayList7.add(fvl.c(action4, geuVar9, zF, null, false, 12));
                        }
                        return new hew(signInMethod, zIsLoading, fzgVarK, instructions, additionalText, arrayList7);
                    case 10:
                        MapTemplate mapTemplate = (MapTemplate) obj;
                        geu geuVar10 = (geu) obj2;
                        mapTemplate.getClass();
                        geuVar10.getClass();
                        ActionStrip actionStrip3 = mapTemplate.getActionStrip();
                        MapController mapController = mapTemplate.getMapController();
                        ActionStrip mapActionStrip = mapController != null ? mapController.getMapActionStrip() : null;
                        MapController mapController2 = mapTemplate.getMapController();
                        gor gorVarB = gob.b(actionStrip3, mapActionStrip, mapController2 != null ? mapController2.getPanModeDelegate() : null, geuVar10);
                        Header header5 = mapTemplate.getHeader();
                        fzg fzgVarJ2 = header5 != null ? fww.j(header5, geuVar10) : null;
                        Pane pane = mapTemplate.getPane();
                        if (pane != null) {
                            List<Row> rows = pane.getRows();
                            rows.getClass();
                            if (true == rows.isEmpty()) {
                                rows = null;
                            }
                            if (rows != null) {
                                ArrayList arrayList8 = new ArrayList(woy.bp(rows, 10));
                                for (Row row : rows) {
                                    row.getClass();
                                    arrayList8.add(haq.b(row, geuVar10));
                                }
                                harVar = new har(null, null, null, 0, arrayList8, 95);
                            } else {
                                harVar = null;
                            }
                            CarIcon image2 = pane.getImage();
                            if (image2 != null) {
                                ghw ghwVar = ghw.a;
                                ghv ghvVar = ghv.a;
                                ghvVar.getClass();
                                gagVarA = gai.a(image2, geuVar10, ghwVar, ghvVar, null, 8);
                            }
                            List<Action> actions7 = pane.getActions();
                            actions7.getClass();
                            List<Action> listCd = woy.cd(actions7, 2);
                            ArrayList arrayList9 = new ArrayList(woy.bp(listCd, 10));
                            for (Action action5 : listCd) {
                                action5.getClass();
                                arrayList9.add(fvl.c(action5, geuVar10, true, null, false, 12));
                            }
                            hayVar = new gvn(fzgVarJ2, harVar, gagVarA, arrayList9, pane.isLoading());
                        } else {
                            fzg fzgVar = fzgVarJ2;
                            ItemList itemList = mapTemplate.getItemList();
                            hayVar = new hay(false, fzgVar, woy.bj(itemList != null ? gqk.h(itemList, geuVar10) : null), null, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 489);
                        }
                        gos gosVar = new gos(hayVar, gorVarB);
                        gka.b(gosVar, mapTemplate);
                        return gosVar;
                    case 11:
                        MessageTemplate messageTemplate = (MessageTemplate) obj;
                        geu geuVar11 = (geu) obj2;
                        messageTemplate.getClass();
                        geuVar11.getClass();
                        boolean zF2 = ((ggk) geuVar11.F(ggk.class)).f();
                        Header header6 = messageTemplate.getHeader();
                        fzg fzgVarJ3 = header6 != null ? fww.j(header6, geuVar11) : null;
                        CarText message = messageTemplate.getMessage();
                        CarText debugMessage = messageTemplate.getDebugMessage();
                        CarIcon icon2 = messageTemplate.getIcon();
                        if (icon2 != null) {
                            gqr gqrVar = new gqr(6);
                            gqr gqrVar2 = new gqr(7);
                            ghw ghwVar2 = ghw.a;
                            ghv ghvVar2 = ghv.a;
                            ghvVar2.getClass();
                            fzyVarD = fxp.d(icon2, geuVar11, gqrVar, gqrVar2, ghwVar2, ghvVar2);
                        }
                        fzy fzyVar = fzyVarD;
                        List<Action> actions8 = messageTemplate.getActions();
                        actions8.getClass();
                        ArrayList arrayList10 = new ArrayList(woy.bp(actions8, 10));
                        for (Action action6 : actions8) {
                            action6.getClass();
                            boolean z = zF2;
                            arrayList10.add(fvl.c(action6, geuVar11, z, null, false, 12));
                            zF2 = z;
                        }
                        return new gsb(false, fzgVarJ3, message, debugMessage, fzyVar, arrayList10, messageTemplate.isLoading());
                    case 12:
                        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
                        geu geuVar12 = (geu) obj2;
                        longMessageTemplate.getClass();
                        geuVar12.getClass();
                        boolean zF3 = ((ggk) geuVar12.F(ggk.class)).f();
                        CarText title3 = longMessageTemplate.getTitle();
                        Action headerAction5 = longMessageTemplate.getHeaderAction();
                        ActionStrip actionStrip4 = longMessageTemplate.getActionStrip();
                        fzg fzgVarK2 = fww.k(geuVar12, title3, headerAction5, actionStrip4 != null ? actionStrip4.getActions() : null);
                        CarText message2 = longMessageTemplate.getMessage();
                        List<Action> actions9 = longMessageTemplate.getActions();
                        actions9.getClass();
                        ArrayList arrayList11 = new ArrayList(woy.bp(actions9, 10));
                        for (Action action7 : actions9) {
                            action7.getClass();
                            arrayList11.add(fvl.c(action7, geuVar12, zF3, null, false, 12));
                        }
                        return new gsb(true, fzgVarK2, message2, arrayList11, 88);
                    case 13:
                        SearchTemplate searchTemplate = (SearchTemplate) obj;
                        geu geuVar13 = (geu) obj2;
                        searchTemplate.getClass();
                        geuVar13.getClass();
                        vi searchCallbackDelegate = searchTemplate.isLoading() ? null : searchTemplate.getSearchCallbackDelegate();
                        boolean zIsLoading2 = searchTemplate.isLoading();
                        Action headerAction6 = searchTemplate.getHeaderAction();
                        fvu fvuVarC5 = headerAction6 != null ? fvl.c(headerAction6, geuVar13, true, null, false, 12) : null;
                        ItemList itemList2 = searchTemplate.getItemList();
                        har harVarH = itemList2 != null ? gqk.h(itemList2, geuVar13) : null;
                        String initialSearchText = searchTemplate.getInitialSearchText();
                        String searchHint = searchTemplate.getSearchHint();
                        boolean zIsShowKeyboardByDefault = searchTemplate.isShowKeyboardByDefault();
                        grn grnVar = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 6, null) : null;
                        grn grnVar2 = searchCallbackDelegate != null ? new grn(geuVar13, searchCallbackDelegate, 7, null) : null;
                        ActionStrip actionStrip5 = searchTemplate.getActionStrip();
                        if (actionStrip5 == null || (actions2 = actionStrip5.getActions()) == null) {
                            arrayList2 = afbe.a;
                        } else {
                            arrayList2 = new ArrayList(woy.bp(actions2, 10));
                            for (Action action8 : actions2) {
                                action8.getClass();
                                arrayList2.add(fvl.c(action8, geuVar13, true, null, false, 12));
                            }
                        }
                        return new gzi(zIsLoading2, fvuVarC5, harVarH, initialSearchText, searchHint, zIsShowKeyboardByDefault, grnVar, grnVar2, arrayList2);
                    case 14:
                        WebViewTemplate webViewTemplate = (WebViewTemplate) obj;
                        geu geuVar14 = (geu) obj2;
                        webViewTemplate.getClass();
                        geuVar14.getClass();
                        String url = webViewTemplate.getUrl();
                        ActionStrip actionStrip6 = webViewTemplate.getActionStrip();
                        if (actionStrip6 != null && (actions3 = actionStrip6.getActions()) != null) {
                            arrayList3 = new ArrayList(woy.bp(actions3, 10));
                            for (Action action9 : actions3) {
                                action9.getClass();
                                arrayList3.add(fvl.c(action9, geuVar14, ((ggk) geuVar14.F(ggk.class)).f(), null, false, 12));
                            }
                        }
                        boolean zIsDomStorageEnabled = webViewTemplate.isDomStorageEnabled();
                        boolean zShouldBlockNetworkLoads = webViewTemplate.shouldBlockNetworkLoads();
                        boolean zIsJavascriptEnabled = webViewTemplate.isJavascriptEnabled();
                        List<String> urlsToOpenOnPhone = webViewTemplate.getUrlsToOpenOnPhone();
                        urlsToOpenOnPhone.getClass();
                        return new hmv(url, arrayList3, zIsDomStorageEnabled, zShouldBlockNetworkLoads, zIsJavascriptEnabled, urlsToOpenOnPhone);
                    case 15:
                        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
                        geu geuVar15 = (geu) obj2;
                        mapWithContentTemplate.getClass();
                        geuVar15.getClass();
                        if (geuVar15.i().c() >= 8) {
                            xk.b.a(mapWithContentTemplate.getContentTemplate());
                        } else {
                            if (geuVar15.i().c() != 7) {
                                geuVar15.i().e((gnf) geuVar15.F(gnf.class));
                                throw new IllegalArgumentException("MapWithContentTemplate is only available in API 7+");
                            }
                            xk.a.a(mapWithContentTemplate.getContentTemplate());
                        }
                        wb contentTemplate = mapWithContentTemplate.getContentTemplate();
                        contentTemplate.getClass();
                        wb template = hmh.a.c(geuVar15, TemplateWrapper.wrap(contentTemplate), gzc.e).getTemplate();
                        gmw gmwVarH = template instanceof SectionedItemTemplate ? grx.h((SectionedItemTemplate) template, geuVar15, true) : template instanceof gmw ? (gmw) template : (gmw) ((gyy) geuVar15.F(gyy.class)).a(template, geuVar15);
                        ActionStrip actionStrip7 = mapWithContentTemplate.getActionStrip();
                        MapController mapController3 = mapWithContentTemplate.getMapController();
                        ActionStrip mapActionStrip2 = mapController3 != null ? mapController3.getMapActionStrip() : null;
                        MapController mapController4 = mapWithContentTemplate.getMapController();
                        return new gos(gmwVarH, gob.b(actionStrip7, mapActionStrip2, mapController4 != null ? mapController4.getPanModeDelegate() : null, geuVar15));
                    case 16:
                        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
                        geu geuVar16 = (geu) obj2;
                        routePreviewNavigationTemplate.getClass();
                        geuVar16.getClass();
                        gor gorVarB2 = gob.b(routePreviewNavigationTemplate.getActionStrip(), routePreviewNavigationTemplate.getMapActionStrip(), routePreviewNavigationTemplate.getPanModeDelegate(), geuVar16);
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
                        hay hayVarG = grx.g(listTemplateB, geuVar16);
                        Action navigateAction = routePreviewNavigationTemplate.getNavigateAction();
                        fwb fwbVarE = navigateAction != null ? fvr.e(navigateAction, geuVar16, null) : null;
                        if (fwbVarE != null) {
                            ?? govVar = new gov(hayVarG, fwbVarE);
                            gka.b(govVar, routePreviewNavigationTemplate);
                            hayVarG = govVar;
                        }
                        gos gosVar2 = new gos(hayVarG, gorVarB2);
                        gka.b(gosVar2, routePreviewNavigationTemplate);
                        return gosVar2;
                    case 17:
                        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
                        geu geuVar17 = (geu) obj2;
                        placeListMapTemplate.getClass();
                        geuVar17.getClass();
                        boolean zIsLoading3 = placeListMapTemplate.isLoading();
                        fzg fzgVarK3 = fww.k(geuVar17, placeListMapTemplate.getTitle(), placeListMapTemplate.getHeaderAction(), null);
                        ItemList itemList3 = placeListMapTemplate.getItemList();
                        gou gouVar = new gou(new gos(new hay(zIsLoading3, fzgVarK3, woy.bj(itemList3 != null ? gqk.h(itemList3, geuVar17) : null), null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 504), gob.b(placeListMapTemplate.getActionStrip(), null, null, geuVar17)), placeListMapTemplate.getAnchor());
                        gka.b(gouVar, placeListMapTemplate);
                        return gouVar;
                    case 18:
                        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
                        geu geuVar18 = (geu) obj2;
                        sectionedItemTemplate.getClass();
                        geuVar18.getClass();
                        return grx.h(sectionedItemTemplate, geuVar18, false);
                    case 19:
                        GoogleListTemplate googleListTemplate = (GoogleListTemplate) obj;
                        geu geuVar19 = (geu) obj2;
                        googleListTemplate.getClass();
                        geuVar19.getClass();
                        if (!googleListTemplate.getSectionedLists().isEmpty()) {
                            List<SectionedItemList> sectionedLists = googleListTemplate.getSectionedLists();
                            listBg = new ArrayList(woy.bp(sectionedLists, 10));
                            Iterator it4 = sectionedLists.iterator();
                            while (it4.hasNext()) {
                                listBg.add(gqk.i((SectionedItemList) it4.next(), geuVar19));
                            }
                        } else if (googleListTemplate.getSingleList() != null) {
                            ItemList singleList = googleListTemplate.getSingleList();
                            singleList.getClass();
                            listBg = woy.bg(gqk.h(singleList, geuVar19));
                        } else {
                            listBg = afbe.a;
                        }
                        List list2 = listBg;
                        Header header7 = googleListTemplate.getHeader();
                        fzg fzgVarJ4 = header7 != null ? fww.j(header7, geuVar19) : null;
                        boolean isLoading = googleListTemplate.getIsLoading();
                        List<Action> actions10 = googleListTemplate.getActions();
                        ArrayList arrayList12 = new ArrayList(woy.bp(actions10, 10));
                        Iterator it5 = actions10.iterator();
                        while (it5.hasNext()) {
                            arrayList12.add(fvl.c((Action) it5.next(), geuVar19, grx.i(geuVar19), null, false, 12));
                        }
                        return new hay(isLoading, fzgVarJ4, list2, arrayList12, 1, 0, null, false, BitmapDescriptorFactory.HUE_RED, 480);
                    default:
                        ListTemplate listTemplate = (ListTemplate) obj;
                        geu geuVar20 = (geu) obj2;
                        listTemplate.getClass();
                        geuVar20.getClass();
                        return grx.g(listTemplate, geuVar20);
                }
            }
        });
        geuVarC.getClass();
        gyw gywVar = (gyw) geuVarC.F(gyw.class);
        gywVar.c(hho.class, new kbh(c2 == true ? 1 : 0));
        gywVar.c(fus.class, new kbg(geuVarC, i15));
        gywVar.c(hew.class, new kbg(geuVarC, i20));
        gywVar.c(gsb.class, new kbg(geuVarC, 9));
        gywVar.c(ggq.class, new kbh(i14));
        gywVar.c(gru.class, new kbg(geuVarC, i6));
        gywVar.c(gov.class, new kbg(geuVarC, 11));
        gywVar.c(gos.class, new kbg(geuVarC, 12));
        gywVar.c(gou.class, new kbg(geuVarC, 13));
        gywVar.c(gtn.class, new kbg(geuVarC, i13));
        gywVar.c(gcy.class, new jtw(geuVarC, i13));
        gywVar.c(gmx.class, new jtw(geuVarC, i8));
        gywVar.c(fuk.class, new jtw(geuVarC, i12));
        gywVar.c(gvs.class, new jtw(geuVarC, i11));
        gywVar.c(hml.class, new jtw(geuVarC, i10));
        gywVar.c(hay.class, new jtw(geuVarC, 19));
        gywVar.c(grf.class, new jtw(geuVarC, 20));
        gywVar.c(hmv.class, new kbg(geuVarC, c == true ? 1 : 0));
        gywVar.c(gvn.class, new kbg(geuVarC, i14));
        gywVar.c(hgw.class, new kbg(geuVarC, 2));
        gywVar.c(gzi.class, new kbg(geuVarC, 4));
        gywVar.c(gsh.class, new kbg(geuVarC, 5));
        gywVar.c(gdf.class, new kbg(woy.dG(new kbg(geuVarC, 6)), 7));
        geuVarC.getClass();
        ((gve) geuVarC.F(gve.class)).a = new gvc() { // from class: kbf
            @Override // defpackage.gvc
            public final gvg a() {
                geu geuVar = geuVarC;
                ggk ggkVar = (ggk) geuVar.F(ggk.class);
                gdv gdvVarD = geuVar.d();
                boolean z = false;
                if (gdvVarD != null && gdvVarD.f()) {
                    z = true;
                }
                return (ggkVar.A() && z) ? new grg(geuVar) : new gvf(geuVar);
            }
        };
        templateView.c = new get(templateView.getContext(), geuVarC);
        geu geuVar = templateView.c;
        geuVar.getClass();
        hem hemVarL = geuVar.l(gyy.class);
        hemVarL.getClass();
        for (Class cls : ((gyy) hemVarL).a.keySet()) {
            hmh hmhVar = hmh.a;
            hmh.a(cls, juu.a);
        }
        templateView.j = ldz.a().b() && jzg.b(geuVarC);
        leh.a();
        templateView.c = geuVarC;
        if (kbl.a.contains(((gmh) geuVarC.d()).a)) {
            ((ype) TemplateView.h.l().ai((char) 2896)).u("Content moderation is disabled for this app.");
            templateView.n = new ggw();
        } else {
            templateView.n = new ggt(geuVarC);
        }
        geuVarC.s(ggu.class, templateView.n);
        geuVarC.s(ghc.class, new ghc(geuVarC));
        geuVarC.s(ghd.class, new ghd());
        return templateView;
    }
}
