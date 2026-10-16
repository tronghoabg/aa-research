package com.waze.car_lib.p;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.OnClickListener;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.ParkedOnlyOnClickListener;
import androidx.car.app.model.Row;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemList;
import androidx.car.app.model.Toggle;
import androidx.car.app.model.signin.InputSignInMethod;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.gas.GasNativeManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class dh {
    public /* synthetic */ dh(byte[] bArr) {
    }

    public static MessageTemplate A() {
        MessageTemplate.Builder builder = new MessageTemplate.Builder("Loading");
        builder.setLoading(true);
        MessageTemplate messageTemplateBuild = builder.build();
        h.g.b.x.e(messageTemplateBuild, "build(...)");
        return messageTemplateBuild;
    }

    public static NavigationTemplate B() {
        NavigationTemplate.Builder builder = new NavigationTemplate.Builder();
        ActionStrip.Builder builder2 = new ActionStrip.Builder();
        builder2.addAction(Action.BACK);
        builder.setActionStrip(builder2.build());
        NavigationTemplate navigationTemplateBuild = builder.build();
        h.g.b.x.e(navigationTemplateBuild, "build(...)");
        return navigationTemplateBuild;
    }

    public static PlaceListNavigationTemplate C() {
        PlaceListNavigationTemplate.Builder builder = new PlaceListNavigationTemplate.Builder();
        builder.setLoading(true);
        PlaceListNavigationTemplate placeListNavigationTemplateBuild = builder.build();
        h.g.b.x.e(placeListNavigationTemplateBuild, "build(...)");
        return placeListNavigationTemplateBuild;
    }

    public static RoutePreviewNavigationTemplate D() {
        RoutePreviewNavigationTemplate.Builder builder = new RoutePreviewNavigationTemplate.Builder();
        builder.setLoading(true);
        RoutePreviewNavigationTemplate routePreviewNavigationTemplateBuild = builder.build();
        h.g.b.x.e(routePreviewNavigationTemplateBuild, "build(...)");
        return routePreviewNavigationTemplateBuild;
    }

    public static SearchTemplate E() {
        SearchTemplate.Builder builder = new SearchTemplate.Builder(new cr());
        builder.setLoading(true);
        SearchTemplate searchTemplateBuild = builder.build();
        h.g.b.x.e(searchTemplateBuild, "build(...)");
        return searchTemplateBuild;
    }

    public static Action F(String str, boolean z, boolean z2, OnClickListener onClickListener, boolean z3) {
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(onClickListener, "actionClicked");
        Action.Builder builder = new Action.Builder();
        builder.setTitle(str);
        if (z) {
            builder.setFlags(1);
            builder.setBackgroundColor(CarColor.BLUE);
        }
        if (z2) {
            builder.setFlags(4);
        }
        builder.setEnabled(z3);
        builder.setOnClickListener(onClickListener);
        return builder.build();
    }

    public static /* synthetic */ Action G(int i2, Context context, boolean z, h.g.a.a aVar, int i3) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(aVar, "onClick");
        Action.Builder builder = new Action.Builder();
        builder.setIcon(new CarIcon.Builder(IconCompat.createWithResource(context, i2)).build());
        builder.setOnClickListener(new com.waze.car_lib.screens.b.a(aVar, 18));
        if ((i3 & 4) != 0) {
            builder.setFlags(2);
        }
        if (((i3 & 8) == 0) & z) {
            builder.setFlags(1);
        }
        return builder.build();
    }

    public static MapWithContentTemplate H() {
        MapWithContentTemplate.Builder builder = new MapWithContentTemplate.Builder();
        builder.setContentTemplate(w());
        MapWithContentTemplate mapWithContentTemplateBuild = builder.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        return mapWithContentTemplateBuild;
    }

    public static /* synthetic */ Action I(String str, boolean z, boolean z2, OnClickListener onClickListener) {
        return F(str, z, z2, onClickListener, true);
    }

    public static ActionStrip J(Context context, boolean z, boolean z2, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(aVar, "reportAlertClicked");
        h.g.b.x.f(aVar2, "centerOnMeClicked");
        h.g.b.x.f(aVar3, "zoomInClicked");
        h.g.b.x.f(aVar4, "zoomOutClicked");
        ActionStrip.Builder builderC = c(context, z2, aVar3, aVar4);
        if (!z2) {
            if (z) {
                builderC.addAction(G(R.drawable.ic_icon_recenter_button, context, false, aVar2, 12));
            } else {
                builderC.addAction(G(R.drawable.icon_report_button, context, true, aVar, 4));
            }
        }
        return builderC.build();
    }

    public static ActionStrip K(Context context, boolean z, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(aVar, "zoomInClicked");
        h.g.b.x.f(aVar2, "zoomOutClicked");
        return c(context, z, aVar, aVar2).build();
    }

    public static Action L(co coVar) {
        h.g.b.x.f(coVar, "<this>");
        return F(coVar.a(), coVar.d(), false, new com.waze.car_lib.screens.b.a(coVar.b(), 19), coVar.c());
    }

    public static SignInTemplate M() {
        InputSignInMethod inputSignInMethodBuild = new InputSignInMethod.Builder(new s()).build();
        h.g.b.x.e(inputSignInMethodBuild, "build(...)");
        InputSignInMethod inputSignInMethod = inputSignInMethodBuild;
        h.g.b.x.f(inputSignInMethod, "signInMethod");
        SignInTemplate.Builder builder = new SignInTemplate.Builder(inputSignInMethod);
        builder.setLoading(true);
        SignInTemplate signInTemplateBuild = builder.build();
        h.g.b.x.e(signInTemplateBuild, "build(...)");
        return signInTemplateBuild;
    }

    public static SignInTemplate N(com.waze.n.ac acVar, h.g.a.l lVar, h.g.a.l lVar2) {
        h.g.b.x.f(acVar, "state");
        InputSignInMethod.Builder builder = new InputSignInMethod.Builder(new r(lVar, lVar2));
        if (acVar instanceof q) {
            SignInTemplate.Builder builder2 = new SignInTemplate.Builder(builder.build());
            q qVar = (q) acVar;
            builder2.setTitle(qVar.b());
            builder2.setAdditionalText(qVar.a());
            builder2.setLoading(true);
            SignInTemplate signInTemplateBuild = builder2.build();
            h.g.b.x.e(signInTemplateBuild, "build(...)");
            return signInTemplateBuild;
        }
        if (!(acVar instanceof p)) {
            throw new h.i();
        }
        p pVar = (p) acVar;
        builder.setInputType(pVar.a());
        builder.setHint(pVar.g());
        builder.setKeyboardType(pVar.b());
        String strE = pVar.e();
        if (strE != null) {
            builder.setDefaultValue(strE);
        }
        String strF = pVar.f();
        if (strF != null) {
            builder.setErrorMessage(strF);
        }
        SignInTemplate.Builder builder3 = new SignInTemplate.Builder(builder.build());
        builder3.setTitle(pVar.i());
        builder3.setHeaderAction(Action.BACK);
        String strH = pVar.h();
        if (strH != null) {
            builder3.setInstructions(strH);
        }
        String strD = pVar.d();
        if (strD != null) {
            builder3.setAdditionalText(strD);
        }
        co coVarC = pVar.c();
        if (coVarC != null) {
            Action.Builder builder4 = new Action.Builder();
            builder4.setTitle(coVarC.a());
            builder4.setEnabled(coVarC.c());
            builder4.setOnClickListener(ParkedOnlyOnClickListener.create(new com.waze.car_lib.screens.b.a(coVarC.b(), 4)));
            builder3.addAction(builder4.build());
        }
        SignInTemplate signInTemplateBuild2 = builder3.build();
        h.g.b.x.e(signInTemplateBuild2, "build(...)");
        return signInTemplateBuild2;
    }

    public static SearchTemplate P(CarContext carContext, com.waze.shared_infra.o.a aVar, n nVar, h.g.a.l lVar, h.g.a.a aVar2) {
        String strC;
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(nVar, "uiState");
        h.g.b.x.f(lVar, "onSearchTextChanged");
        h.g.b.x.f(aVar2, "onFilterToggled");
        SearchTemplate.Builder builder = new SearchTemplate.Builder(new o(lVar));
        builder.setHeaderAction(Action.BACK);
        builder.setShowKeyboardByDefault(false);
        int i2 = 1;
        if (h.g.b.x.n(nVar, i.f20808a)) {
            builder.setLoading(true);
            SearchTemplate searchTemplateBuild = builder.build();
            h.g.b.x.e(searchTemplateBuild, "build(...)");
            return searchTemplateBuild;
        }
        if (!(nVar instanceof h)) {
            throw new h.i();
        }
        h hVar = (h) nVar;
        ItemList.Builder builder2 = new ItemList.Builder();
        for (g gVar : hVar.b().a()) {
            if (gVar instanceof e) {
                e eVar = (e) gVar;
                Row.Builder builder3 = new Row.Builder();
                builder3.setTitle("  ");
                h.g.b.x.f(eVar, "<this>");
                h.g.b.x.f(aVar, "stringProvider");
                m mVarA = eVar.a();
                if (h.g.b.x.n(mVarA, j.f20809a)) {
                    strC = aVar.c(R.string.HOV_PERMITS_AREA_PERMITS_TITLE, new Object[0]);
                } else if (h.g.b.x.n(mVarA, k.f20810a)) {
                    strC = aVar.c(R.string.HOV_PERMITS_OTHER_PASSES_TITLE, new Object[0]);
                } else {
                    if (!h.g.b.x.n(mVarA, l.f20811a)) {
                        throw new h.i();
                    }
                    strC = aVar.c(R.string.HOV_PERMITS_ACTIVE_PERMITS_TITLE, new Object[0]);
                }
                CarColor carColor = CarColor.SECONDARY;
                h.g.b.x.e(carColor, "SECONDARY");
                SpannableStringBuilder spannableStringBuilder = strC;
                if (spannableStringBuilder.length() != 0) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    spannableStringBuilder2.setSpan(ForegroundCarColorSpan.create(carColor), 0, strC.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                }
                builder3.addText(spannableStringBuilder);
                Row rowBuild = builder3.build();
                h.g.b.x.e(rowBuild, "build(...)");
                builder2.addItem(rowBuild);
            } else {
                if (!(gVar instanceof f)) {
                    throw new h.i();
                }
                f fVar = (f) gVar;
                Row.Builder builder4 = new Row.Builder();
                builder4.setTitle(fVar.a());
                Toggle.Builder builder5 = new Toggle.Builder(new ce(fVar.b(), i2));
                builder5.setChecked(fVar.c());
                builder4.setToggle(builder5.build());
                Row rowBuild2 = builder4.build();
                h.g.b.x.e(rowBuild2, "build(...)");
                builder2.addItem(rowBuild2);
            }
        }
        if (hVar.b().b()) {
            h.g.a.a aVarC = hVar.c();
            Row.Builder builder6 = new Row.Builder();
            builder6.setTitle(aVar.c(R.string.ETA_SCREEN_PLAN_FOOTER, new Object[0]));
            Action.Builder builder7 = new Action.Builder();
            builder7.setIcon(com.waze.car_lib.login.i.c(carContext, com.waze.design_components.b.d.bC.b()));
            builder7.setOnClickListener(new com.waze.car_lib.screens.b.a(aVarC, 2));
            builder6.addAction(builder7.build());
            builder2.addItem(builder6.build());
        }
        builder.setItemList(builder2.build());
        builder.setInitialSearchText("");
        builder.setSearchHint(aVar.c(R.string.SEARCH, new Object[0]));
        ActionStrip.Builder builder8 = new ActionStrip.Builder();
        Action.Builder builder9 = new Action.Builder();
        builder9.setTitle(aVar.c(hVar.a(), new Object[0]));
        builder9.setOnClickListener(new com.waze.car_lib.screens.b.a(aVar2, 3));
        builder8.addAction(builder9.build());
        builder.setActionStrip(builder8.build());
        SearchTemplate searchTemplateBuild2 = builder.build();
        h.g.b.x.e(searchTemplateBuild2, "build(...)");
        return searchTemplateBuild2;
    }

    public static ListTemplate Q(com.waze.car_lib.r.co coVar, CarContext carContext) {
        h.g.b.x.f(coVar, "state");
        h.g.b.x.f(carContext, "carContext");
        ListTemplate.Builder builder = new ListTemplate.Builder();
        if (coVar instanceof cg) {
            for (cn cnVar : ((cg) coVar).c()) {
                SectionedItemList sectionedItemListCreate = SectionedItemList.create(d(cnVar.b()), cnVar.a());
                h.g.b.x.e(sectionedItemListCreate, "create(...)");
                builder.addSectionedList(sectionedItemListCreate);
            }
        } else {
            if (!(coVar instanceof cf)) {
                throw new h.i();
            }
            builder.setSingleList(d(((cf) coVar).c()));
        }
        Header.Builder builder2 = new Header.Builder();
        builder2.setTitle(coVar.h());
        builder2.setStartHeaderAction(Action.BACK);
        builder.setHeader(builder2.build());
        cm cmVarG = coVar.g();
        if (cmVarG != null) {
            Action.Builder builder3 = new Action.Builder();
            builder3.setIcon(new CarIcon.Builder(IconCompat.createWithResource(carContext, com.waze.design_components.b.d.f23302c.b())).build());
            if (cmVarG.a() == null) {
                builder3.setEnabled(false);
                builder3.setBackgroundColor(CarColor.createCustom(-12303292, -12303292));
            } else {
                builder3.setBackgroundColor(CarColor.createCustom(-16711681, -16711681));
                builder3.setOnClickListener(new w(cmVarG, carContext, 2));
            }
            builder.addAction(builder3.build());
        }
        ListTemplate listTemplateBuild = builder.build();
        h.g.b.x.e(listTemplateBuild, "build(...)");
        return listTemplateBuild;
    }

    private static de b(dg dgVar, Context context, h.g.a.a aVar, h.g.a.a aVar2, boolean z) {
        Integer numD = dgVar.d();
        CarIcon carIconBuild = numD != null ? new CarIcon.Builder(IconCompat.createWithResource(context, numD.intValue())).build() : null;
        Action action = dgVar.f() ? Action.BACK : null;
        ParkedOnlyOnClickListener parkedOnlyOnClickListenerCreate = z ? ParkedOnlyOnClickListener.create(new db(aVar, 0)) : new db(aVar, 2);
        ParkedOnlyOnClickListener parkedOnlyOnClickListenerCreate2 = z ? ParkedOnlyOnClickListener.create(new db(aVar2, 3)) : new db(aVar2, 4);
        dc dcVarA = dgVar.a();
        Action actionI = dcVarA != null ? I(dcVarA.a(), dcVarA.b(), false, parkedOnlyOnClickListenerCreate) : null;
        dc dcVarC = dgVar.c();
        return new de(dgVar.m(), dgVar.e(), carIconBuild, action, actionI, dcVarC != null ? I(dcVarC.a(), dcVarC.b(), false, parkedOnlyOnClickListenerCreate2) : null);
    }

    private static ActionStrip.Builder c(Context context, boolean z, h.g.a.a aVar, h.g.a.a aVar2) {
        ActionStrip.Builder builder = new ActionStrip.Builder();
        Action.Builder builder2 = new Action.Builder(Action.PAN);
        builder2.setIcon(new CarIcon.Builder(IconCompat.createWithResource(context, true != z ? R.drawable.icon_fill_panning_24px : R.drawable.icon_outline_close_30px)).build());
        builder.addAction(builder2.build());
        builder.addAction(G(R.drawable.icon_outline_zoom_in_30px, context, false, aVar, 8));
        builder.addAction(G(R.drawable.icon_outline_zoom_out_30px, context, false, aVar2, 8));
        return builder;
    }

    private static ItemList d(List list) {
        Row rowBuild;
        ItemList.Builder builder = new ItemList.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.waze.o.d.b.b.c cVar = (com.waze.o.d.b.b.c) it.next();
            if (cVar instanceof ck) {
                new Row.Builder();
                throw null;
            }
            int i2 = 0;
            if (cVar instanceof cl) {
                cl clVar = (cl) cVar;
                Row.Builder builder2 = new Row.Builder();
                builder2.setTitle(clVar.b());
                Toggle.Builder builder3 = new Toggle.Builder(new ce(clVar.c(), i2));
                builder3.setChecked(clVar.d());
                builder2.setToggle(builder3.build());
                if (!h.n.o.G(clVar.a())) {
                    builder2.addText(clVar.a());
                }
                rowBuild = builder2.build();
                h.g.b.x.e(rowBuild, "build(...)");
            } else if (cVar instanceof cj) {
                cj cjVar = (cj) cVar;
                Row.Builder builder4 = new Row.Builder();
                builder4.setTitle(cjVar.b());
                builder4.setOnClickListener(new com.waze.car_lib.screens.b.a(cjVar.c(), 17));
                builder4.setBrowsable(true);
                if (!h.n.o.G(cjVar.a())) {
                    builder4.addText(cjVar.a());
                }
                rowBuild = builder4.build();
                h.g.b.x.e(rowBuild, "build(...)");
            } else if (cVar instanceof ch) {
                ch chVar = (ch) cVar;
                Row.Builder builder5 = new Row.Builder();
                builder5.setTitle(chVar.b());
                builder5.setOnClickListener(new com.waze.car_lib.screens.b.a(chVar.c(), 16));
                builder5.setBrowsable(chVar.d());
                if (!h.n.o.G(chVar.a())) {
                    builder5.addText(chVar.a());
                }
                rowBuild = builder5.build();
                h.g.b.x.e(rowBuild, "build(...)");
            } else {
                if (!(cVar instanceof ci)) {
                    throw new h.i();
                }
                ci ciVar = (ci) cVar;
                Row.Builder builder6 = new Row.Builder();
                builder6.setTitle(ciVar.b());
                builder6.setBrowsable(false);
                if (!h.n.o.G(ciVar.a())) {
                    builder6.addText(ciVar.a());
                }
                rowBuild = builder6.build();
                h.g.b.x.e(rowBuild, "build(...)");
            }
            builder.addItem(rowBuild);
        }
        ItemList itemListBuild = builder.build();
        h.g.b.x.e(itemListBuild, "build(...)");
        return itemListBuild;
    }

    public static SpannableString r(String str, CarColor carColor) {
        h.g.b.x.f(str, "text");
        h.g.b.x.f(carColor, "carColor");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(ForegroundCarColorSpan.create(carColor), 0, spannableString.length(), 17);
        return spannableString;
    }

    public static MapWithContentTemplate s(com.waze.o.d.b.b.c cVar, CarContext carContext, h.g.a.a aVar, h.g.a.l lVar, da daVar) {
        GridTemplate gridTemplateG;
        h.g.b.x.f(cVar, "state");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "closeClicked");
        h.g.b.x.f(lVar, "itemClicked");
        h.g.b.x.f(daVar, "contentType");
        da daVar2 = da.f20764a;
        int iOrdinal = daVar.ordinal();
        if (iOrdinal == 0) {
            gridTemplateG = com.waze.car_lib.o.ae.g(carContext, cVar, aVar, lVar);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            CarContext carContext2 = carContext;
            h.g.b.x.f(carContext2, "carContext");
            h.g.b.x.f(cVar, "state");
            h.g.b.x.f(aVar, "closeClicked");
            h.g.b.x.f(lVar, "itemClicked");
            ListTemplate.Builder builder = new ListTemplate.Builder();
            if (cVar instanceof cz) {
                builder.setLoading(true);
                Header.Builder builder2 = new Header.Builder();
                builder2.setTitle(((cz) cVar).a());
                builder2.setStartHeaderAction(Action.BACK);
                builder.setHeader(builder2.build());
            } else {
                if (!(cVar instanceof cy)) {
                    throw new h.i();
                }
                cy cyVar = (cy) cVar;
                Header.Builder builder3 = new Header.Builder();
                builder3.setTitle(cyVar.a());
                if (cyVar.c()) {
                    builder3.setStartHeaderAction(Action.BACK);
                }
                if (cyVar.d()) {
                    builder3.addEndHeaderAction(G(R.drawable.ic_icon_outline_close_88px, carContext2, false, aVar, 12));
                }
                Header headerBuild = builder3.build();
                h.g.b.x.e(headerBuild, "build(...)");
                builder.setHeader(headerBuild);
                ItemList.Builder builder4 = new ItemList.Builder();
                for (t tVar : cyVar.b()) {
                    Row.Builder builder5 = new Row.Builder();
                    builder5.setTitle(tVar.d());
                    builder5.setImage(new CarIcon.Builder(IconCompat.createWithResource(carContext2, tVar.a())).build());
                    builder5.setOnClickListener(new w(lVar, tVar, 3));
                    String strC = tVar.c();
                    if (strC != null && !h.n.o.G(strC)) {
                        builder5.addText(tVar.c());
                    }
                    builder4.addItem(builder5.build());
                }
                builder.setSingleList(builder4.build());
            }
            ListTemplate listTemplateBuild = builder.build();
            h.g.b.x.e(listTemplateBuild, "build(...)");
            gridTemplateG = listTemplateBuild;
        }
        MapWithContentTemplate.Builder builder6 = new MapWithContentTemplate.Builder();
        builder6.setContentTemplate(gridTemplateG);
        if ((cVar instanceof cy) && ((cy) cVar).d()) {
            ActionStrip.Builder builder7 = new ActionStrip.Builder();
            builder7.addAction(G(R.drawable.ic_icon_outline_close_88px, carContext, false, aVar, 12));
            builder6.setActionStrip(builder7.build());
        }
        MapWithContentTemplate mapWithContentTemplateBuild = builder6.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        return mapWithContentTemplateBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static SearchTemplate t(CarContext carContext, com.waze.shared_infra.o.a aVar, cw cwVar, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.a aVar2, ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        ?? r1;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        CarIcon.Builder builder;
        com.waze.shared_infra.o.a aVar3 = aVar;
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar3, "stringProvider");
        h.g.b.x.f(cwVar, "uiState");
        h.g.b.x.f(lVar, "onSearchTextChanged");
        h.g.b.x.f(lVar2, "onSearchSubmitted");
        h.g.b.x.f(aVar2, "onNd4cInfoClicked");
        h.g.b.x.f(onItemVisibilityChangedListener, "onItemsVisibilityChangedListener");
        SearchTemplate.Builder builder2 = new SearchTemplate.Builder(new cx(lVar, lVar2));
        builder2.setHeaderAction(Action.BACK);
        boolean z = false;
        builder2.setShowKeyboardByDefault(false);
        cv cvVarA = cwVar.a();
        if (cvVarA instanceof ct) {
            List<cs> listA = ((ct) cvVarA).a();
            ItemList.Builder builder3 = new ItemList.Builder();
            for (cs csVar : listA) {
                Row.Builder builder4 = new Row.Builder();
                builder4.setTitle(csVar.c());
                Integer numA = csVar.a();
                if (numA != null) {
                    String strE = com.waze.sharedui.utils.f.e(aVar3, numA.intValue());
                    h.g.b.x.e(strE, "getDistanceStringLocalized(...)");
                    CarColor carColor = CarColor.GREEN;
                    i2 = 1;
                    h.g.b.x.e(carColor, "GREEN");
                    String str = strE;
                    if (str.length() == 0) {
                        spannableStringBuilder = new SpannableStringBuilder("");
                        r1 = z;
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
                        r1 = 0;
                        spannableStringBuilder3.setSpan(ForegroundCarColorSpan.create(carColor), 0, strE.length(), 33);
                        spannableStringBuilder = spannableStringBuilder3;
                    }
                } else {
                    r1 = z;
                    i2 = 1;
                    spannableStringBuilder = null;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[r1] = csVar.b();
                charSequenceArr[i2] = spannableStringBuilder;
                List listK = h.a.i.k(charSequenceArr);
                if (listK.isEmpty()) {
                    spannableStringBuilder2 = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder((CharSequence) h.a.i.P(listK));
                    for (CharSequence charSequence : listK.subList(i2, listK.size())) {
                        spannableStringBuilder4.append((CharSequence) " • ");
                        spannableStringBuilder4.append(charSequence);
                    }
                    spannableStringBuilder2 = spannableStringBuilder4;
                }
                if (spannableStringBuilder2 != null) {
                    builder4.addText(spannableStringBuilder2);
                }
                com.waze.car_lib.r.co coVarE = csVar.e();
                if (coVarE != null) {
                    h.g.b.x.f(coVarE, "<this>");
                    h.g.b.x.f(carContext, "carContext");
                    if (coVarE instanceof cp) {
                        builder = new CarIcon.Builder(IconCompat.createWithBitmap(((cp) coVarE).c()));
                    } else {
                        if (!(coVarE instanceof cq)) {
                            throw new h.i();
                        }
                        cq cqVar = (cq) coVarE;
                        com.waze.ui.ac.i iVarC = cqVar.c();
                        if ((iVarC instanceof com.waze.ui.ac.a) || (iVarC instanceof com.waze.ui.ac.h)) {
                            builder = null;
                        } else if (iVarC instanceof com.waze.ui.ac.g) {
                            builder = new CarIcon.Builder(IconCompat.createWithContentUri(((com.waze.ui.ac.g) cqVar.c()).a()));
                        } else if (iVarC instanceof com.waze.ui.ac.e) {
                            builder = new CarIcon.Builder(IconCompat.createWithResource(carContext, ((com.waze.ui.ac.e) cqVar.c()).a()));
                        } else {
                            if (!(iVarC instanceof com.waze.ui.ac.f)) {
                                throw new h.i();
                            }
                            builder = new CarIcon.Builder(IconCompat.createWithResource(carContext, ((com.waze.ui.ac.f) cqVar.c()).a()));
                        }
                    }
                    CarIcon carIconBuild = builder != null ? builder.build() : null;
                    if (carIconBuild != null) {
                        builder4.setImage(carIconBuild);
                    }
                }
                builder4.setOnClickListener(new com.waze.car_lib.screens.b.a(csVar.d(), 20));
                builder3.addItem(builder4.build());
                z = r1;
                aVar3 = aVar;
            }
            builder3.setOnItemsVisibilityChangedListener(onItemVisibilityChangedListener);
            builder2.setItemList(builder3.build());
        } else {
            if (!h.g.b.x.n(cvVarA, cu.f20750a)) {
                throw new h.i();
            }
            builder2.setLoading(true);
        }
        String strD = cwVar.d();
        builder2.setInitialSearchText(strD != null ? strD : "");
        builder2.setSearchHint(cwVar.c());
        if (cwVar.e()) {
            ActionStrip.Builder builder5 = new ActionStrip.Builder();
            Action.Builder builder6 = new Action.Builder();
            builder6.setTitle(cwVar.b());
            builder6.setOnClickListener(new db(aVar2, 1));
            builder5.addAction(builder6.build());
            builder2.setActionStrip(builder5.build());
        }
        SearchTemplate searchTemplateBuild = builder2.build();
        h.g.b.x.e(searchTemplateBuild, "build(...)");
        return searchTemplateBuild;
    }

    public static LongMessageTemplate u(Context context, com.waze.car_lib.r.cq cqVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(cqVar, "state");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        if (cqVar instanceof df) {
            df dfVar = (df) cqVar;
            LongMessageTemplate.Builder builder = new LongMessageTemplate.Builder(dfVar.a());
            builder.setTitle(dfVar.m());
            LongMessageTemplate longMessageTemplateBuild = builder.build();
            h.g.b.x.e(longMessageTemplateBuild, "build(...)");
            return longMessageTemplateBuild;
        }
        if (!(cqVar instanceof dg)) {
            throw new h.i();
        }
        de deVarB = b((dg) cqVar, context, aVar, aVar2, true);
        LongMessageTemplate.Builder builder2 = new LongMessageTemplate.Builder(deVarB.e());
        String strF = deVarB.f();
        if (strF != null) {
            builder2.setTitle(strF);
        }
        Action actionB = deVarB.b();
        if (actionB != null) {
            builder2.setHeaderAction(actionB);
        }
        Action actionA = deVarB.a();
        if (actionA != null) {
            builder2.addAction(actionA);
        }
        Action actionC = deVarB.c();
        if (actionC != null) {
            builder2.addAction(actionC);
        }
        LongMessageTemplate longMessageTemplateBuild2 = builder2.build();
        h.g.b.x.e(longMessageTemplateBuild2, "build(...)");
        return longMessageTemplateBuild2;
    }

    public static MessageTemplate v(Context context, com.waze.car_lib.r.cq cqVar, h.g.a.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(cqVar, "state");
        h.g.b.x.f(aVar, "firstActionClicked");
        h.g.b.x.f(aVar2, "secondActionClicked");
        if (cqVar instanceof df) {
            df dfVar = (df) cqVar;
            MessageTemplate.Builder builder = new MessageTemplate.Builder(dfVar.a());
            builder.setTitle(dfVar.m());
            builder.setLoading(true);
            MessageTemplate messageTemplateBuild = builder.build();
            h.g.b.x.e(messageTemplateBuild, "build(...)");
            return messageTemplateBuild;
        }
        if (!(cqVar instanceof dg)) {
            throw new h.i();
        }
        de deVarB = b((dg) cqVar, context, aVar, aVar2, false);
        MessageTemplate.Builder builder2 = new MessageTemplate.Builder(deVarB.e());
        String strF = deVarB.f();
        if (strF != null) {
            builder2.setTitle(strF);
        }
        CarIcon carIconD = deVarB.d();
        if (carIconD != null) {
            builder2.setIcon(carIconD);
        }
        Action actionB = deVarB.b();
        if (actionB != null) {
            builder2.setHeaderAction(actionB);
        }
        Action actionA = deVarB.a();
        if (actionA != null) {
            builder2.addAction(actionA);
        }
        Action actionC = deVarB.c();
        if (actionC != null) {
            builder2.addAction(actionC);
        }
        MessageTemplate messageTemplateBuild2 = builder2.build();
        h.g.b.x.e(messageTemplateBuild2, "build(...)");
        return messageTemplateBuild2;
    }

    public static GridTemplate w() {
        GridTemplate.Builder builder = new GridTemplate.Builder();
        builder.setLoading(true);
        GridTemplate gridTemplateBuild = builder.build();
        h.g.b.x.e(gridTemplateBuild, "build(...)");
        return gridTemplateBuild;
    }

    public static ListTemplate x() {
        ListTemplate.Builder builder = new ListTemplate.Builder();
        builder.setLoading(true);
        ListTemplate listTemplateBuild = builder.build();
        h.g.b.x.e(listTemplateBuild, "build(...)");
        return listTemplateBuild;
    }

    public static MapTemplate y() {
        MapTemplate.Builder builder = new MapTemplate.Builder();
        Pane.Builder builder2 = new Pane.Builder();
        builder2.setLoading(true);
        builder.setPane(builder2.build());
        MapTemplate mapTemplateBuild = builder.build();
        h.g.b.x.e(mapTemplateBuild, "build(...)");
        return mapTemplateBuild;
    }

    public static MapWithContentTemplate z() {
        MapWithContentTemplate.Builder builder = new MapWithContentTemplate.Builder();
        Pane.Builder builder2 = new Pane.Builder();
        builder2.setLoading(true);
        PaneTemplate paneTemplateBuild = new PaneTemplate.Builder(builder2.build()).build();
        h.g.b.x.e(paneTemplateBuild, "build(...)");
        builder.setContentTemplate(paneTemplateBuild);
        MapWithContentTemplate mapWithContentTemplateBuild = builder.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        return mapWithContentTemplateBuild;
    }

    public int R() {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    private dh() {
        throw null;
    }
}
