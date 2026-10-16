package com.waze.search.a;

import android.os.Parcelable;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.waze.av.d.k;
import com.waze.av.d.o;
import com.waze.av.d.q;
import com.waze.av.d.s;
import com.waze.car_lib.o.ab;
import com.waze.gas.GasNativeManager;
import com.waze.search.bd;
import com.waze.strings.DisplayStrings;
import com.waze.ui.ac.n;
import com.waze.z.a.be;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import i.b.v.aa;
import i.b.v.ay;
import i.b.v.bb;
import i.b.v.bh;
import i.b.v.bi;
import i.b.v.bz;
import i.b.v.ce;
import i.b.v.ch;
import i.b.v.cz;
import i.b.v.ef;
import i.b.v.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {
    public static final void a(n nVar, List list, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        x.f(nVar, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(list, "categories");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(196838825);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(196838825, i3, -1, "com.waze.search.categories.CategoriesScreen (CategoriesScreen.kt:46)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DecayAnimationSpec decayAnimationSpec = (DecayAnimationSpec) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(decayAnimationSpec);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.search.d.a.d(decayAnimationSpec);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.search.d.a.d dVar = (com.waze.search.d.a.d) objRememberedValue2;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i3 >> 9) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(aVar2, composerStartRestartGroup, (i3 >> 12) & 14);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            be.h(com.waze.search.d.a.b.d(nVar, composerStartRestartGroup, i3 & 14), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 16.0f, 7, null), (h.g.a.a) stateRememberUpdatedState.getValue(), null, ComposableLambdaKt.rememberComposableLambda(1736349560, true, new com.waze.main_screen.c.b.a(stateRememberUpdatedState2, 4), composerStartRestartGroup, 54), null, composerStartRestartGroup, 24624, 40);
            Modifier.Companion companion = Modifier.Companion;
            com.waze.search.d.a.d dVar2 = dVar;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new ab(list, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            LazyDslKt.LazyColumn(companion, null, null, false, null, null, dVar2, false, null, (l) objRememberedValue3, composerStartRestartGroup, 6, DisplayStrings.DS_MAJOR);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(nVar, list, modifier, aVar, aVar2, i2, 8));
        }
    }

    static final h.ab b(com.waze.search.d.a.a.a aVar, int i2, Composer composer) {
        k(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final com.waze.av.d.j d(bz bzVar) {
        x.f(bzVar, "<this>");
        int iOrdinal = bzVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.av.d.j.f16079a;
        }
        if (iOrdinal == 1) {
            return com.waze.av.d.j.f16080b;
        }
        if (iOrdinal == 2) {
            return com.waze.av.d.j.f16081c;
        }
        if (iOrdinal == 3) {
            return com.waze.av.d.j.f16082d;
        }
        throw new h.i();
    }

    public static final k e(i.b.n.ab abVar, com.waze.aw.a aVar) {
        Object next;
        u location;
        com.waze.av.d.u uVar;
        com.waze.av.d.u uVar2;
        Object next2;
        String str;
        com.waze.av.d.a aVar2;
        com.waze.av.d.d dVar;
        String str2;
        i.b.v.f fVar;
        String str3;
        com.waze.av.d.b bVarL;
        com.waze.ca.c discountedRate;
        i.b.v.i iVar;
        String text;
        ArrayList arrayList;
        Integer numValueOf;
        x.f(abVar, "<this>");
        x.f(aVar, "moodNameProvider");
        List<bi> entryExitPointsList = abVar.getVenue().getEntryExitPointsList();
        x.e(entryExitPointsList, "getEntryExitPointsList(...)");
        Iterator<T> it = entryExitPointsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bi biVar = (bi) next;
            if (biVar.getType() == bh.ENTRY || biVar.getType() == bh.BOTH) {
                break;
            }
        }
        bi biVar2 = (bi) next;
        if (biVar2 == null || (location = biVar2.getPoint()) == null) {
            location = abVar.getVenue().getLocation();
            x.e(location, "getLocation(...)");
        }
        String venueId = abVar.getVenue().getVenueId();
        x.e(venueId, "getVenueId(...)");
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(location.getY(), location.getX());
        com.waze.av.a.a aVar3 = new com.waze.av.a.a(abVar.getVenue().getCountry(), abVar.getVenue().getCity(), abVar.getVenue().getStreet(), abVar.getVenue().getHouseNumber(), abVar.getVenue().getState(), null, null, 96);
        String formattedName = abVar.getVenue().getFormattedName();
        String context = abVar.getContext();
        String strI = context != null ? i(context) : null;
        String phone = abVar.getVenue().getPhone();
        String strI2 = phone != null ? i(phone) : null;
        String routingContext = abVar.getRoutingContext();
        String strI3 = routingContext != null ? i(routingContext) : null;
        String name = abVar.getVenue().getName();
        String strI4 = name != null ? i(name) : null;
        String description = abVar.getVenue().getDescription();
        String strI5 = description != null ? i(description) : null;
        String url = abVar.getVenue().getUrl();
        String strI6 = url != null ? i(url) : null;
        String urlDisplayName = abVar.getVenue().getUrlDisplayName();
        String strI7 = urlDisplayName != null ? i(urlDisplayName) : null;
        String name2 = abVar.getVenue().getCreatedByInfo().getName();
        if (name2 == null || name2.length() == 0) {
            uVar = null;
        } else {
            String name3 = abVar.getVenue().getCreatedByInfo().getName();
            x.e(name3, "getName(...)");
            uVar = new com.waze.av.d.u(name3, aVar.getMoodNameById(abVar.getVenue().getCreatedByInfo().getMood()));
        }
        String name4 = abVar.getVenue().getLastUpdatedByInfo().getName();
        if (name4 == null || name4.length() == 0) {
            uVar2 = null;
        } else {
            String name5 = abVar.getVenue().getLastUpdatedByInfo().getName();
            x.e(name5, "getName(...)");
            uVar2 = new com.waze.av.d.u(name5, aVar.getMoodNameById(abVar.getVenue().getLastUpdatedByInfo().getMood()));
        }
        List<ce> imagesList = abVar.getVenue().getImagesList();
        x.e(imagesList, "getImagesList(...)");
        List<ce> list = imagesList;
        com.waze.av.d.u uVar3 = uVar2;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list, 10));
        for (ce ceVar : list) {
            x.c(ceVar);
            arrayList2.add(f(ceVar, aVar));
        }
        ArrayList arrayList3 = arrayList2;
        List<cz> productList = abVar.getVenue().getProductList();
        x.e(productList, "getProductList(...)");
        List<cz> list2 = productList;
        ArrayList arrayList4 = new ArrayList(h.a.i.q(list2, 10));
        for (cz czVar : list2) {
            x.c(czVar);
            arrayList4.add(h(czVar));
        }
        ArrayList arrayList5 = arrayList4;
        List<ch> hoursList = abVar.getVenue().getHoursList();
        x.e(hoursList, "getHoursList(...)");
        q qVarG = g(hoursList);
        String brandId = abVar.getVenue().getBrandId();
        String strI8 = brandId != null ? i(brandId) : null;
        List<String> categoriesList = abVar.getVenue().getCategoriesList();
        x.e(categoriesList, "getCategoriesList(...)");
        List<String> servicesList = abVar.getVenue().getServicesList();
        x.e(servicesList, "getServicesList(...)");
        List<ay> evConnectorOverviewsList = abVar.getVenue().getEvChargingVenue().getEvConnectorOverviewsList();
        x.e(evConnectorOverviewsList, "getEvConnectorOverviewsList(...)");
        List<ay> list3 = evConnectorOverviewsList;
        ArrayList arrayList6 = new ArrayList(h.a.i.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            ay ayVar = (ay) it2.next();
            x.c(ayVar);
            Iterator it3 = it2;
            String typeId = ayVar.getEvConnector().getTypeId();
            x.e(typeId, "getTypeId(...)");
            int count = ayVar.getCount();
            float maxPowerKw = ayVar.getMaxPowerKw();
            if (ayVar.hasAvailableCount()) {
                arrayList = arrayList3;
                numValueOf = Integer.valueOf(ayVar.getAvailableCount());
            } else {
                arrayList = arrayList3;
                numValueOf = null;
            }
            arrayList6.add(new com.waze.av.d.f(typeId, count, maxPowerKw, numValueOf));
            arrayList3 = arrayList;
            it2 = it3;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList6;
        aa accessType = abVar.getVenue().getEvChargingVenue().getAccessType();
        x.e(accessType, "getAccessType(...)");
        boolean z = accessType == aa.PRIVATE || accessType == aa.RESTRICTED;
        String strI9 = i(abVar.getVenue().getEvChargingVenue().getDirections());
        List<bb> paymentMethodsList = abVar.getVenue().getEvChargingVenue().getPaymentMethodsList();
        x.e(paymentMethodsList, "getPaymentMethodsList(...)");
        List<bb> list4 = paymentMethodsList;
        ArrayList arrayList9 = new ArrayList(h.a.i.q(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList9.add(((bb) it4.next()).getDisplayString());
        }
        ArrayList arrayList10 = arrayList9;
        String currency = abVar.getVenue().getCurrency();
        Integer numValueOf2 = abVar.getVenue().getGooglePlaceAttributes().hasPriceLevel() ? Integer.valueOf(abVar.getVenue().getGooglePlaceAttributes().getPriceLevel()) : null;
        String priceLevelSymbol = abVar.getVenue().getGooglePlaceAttributes().hasPriceLevelSymbol() ? abVar.getVenue().getGooglePlaceAttributes().getPriceLevelSymbol() : null;
        Double dValueOf = abVar.getVenue().getGooglePlaceAttributes().getRating().hasRating() ? Double.valueOf(abVar.getVenue().getGooglePlaceAttributes().getRating().getRating()) : null;
        Integer numValueOf3 = abVar.getVenue().getGooglePlaceAttributes().getRating().hasUserRatingsCount() ? Integer.valueOf(abVar.getVenue().getGooglePlaceAttributes().getRating().getUserRatingsCount()) : null;
        String timezone = abVar.getVenue().getTimezone();
        bz businessStatus = abVar.getVenue().getGooglePlaceAttributes().getBusinessStatus();
        x.e(businessStatus, "getBusinessStatus(...)");
        com.waze.av.d.j jVarD = d(businessStatus);
        boolean updateable = abVar.getUpdateable();
        boolean residential = abVar.getVenue().getResidential();
        String listIcon = abVar.getListIcon();
        String badge = abVar.getBadge();
        i.b.n.e deal = abVar.getDeal();
        String strI10 = (deal == null || (text = deal.getText()) == null) ? null : i(text);
        boolean z2 = abVar.getProvider().equals("googlePlaces") || abVar.getProvider().equals("googlePlacesComposite");
        ef venue = abVar.getVenue();
        x.e(venue, "getVenue(...)");
        List<i.b.v.i> bookingOffersList = venue.getBookingOffersList();
        x.e(bookingOffersList, "getBookingOffersList(...)");
        Iterator<T> it5 = bookingOffersList.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((i.b.v.i) next2).getType() == i.b.v.h.PARKING) {
                break;
            }
        }
        i.b.v.i iVar2 = (i.b.v.i) next2;
        if (iVar2 != null) {
            i.b.v.h type = iVar2.getType();
            x.e(type, "getType(...)");
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                dVar = com.waze.av.d.d.f16051a;
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                dVar = com.waze.av.d.d.f16052b;
            }
            List<i.b.v.f> ratesList = iVar2.getRatesList();
            x.e(ratesList, "getRatesList(...)");
            ArrayList arrayList11 = new ArrayList();
            Iterator<T> it6 = ratesList.iterator();
            while (true) {
                str2 = "getStandardRate(...)";
                if (!it6.hasNext()) {
                    break;
                }
                Object next3 = it6.next();
                i.b.v.f fVar2 = (i.b.v.f) next3;
                if (fVar2.hasStandardRate()) {
                    iVar = iVar2;
                    com.waze.ca.c standardRate = fVar2.getStandardRate();
                    x.e(standardRate, "getStandardRate(...)");
                    if (a.a.J(standardRate)) {
                        arrayList11.add(next3);
                    }
                } else {
                    iVar = iVar2;
                }
                iVar2 = iVar;
            }
            i.b.v.i iVar3 = iVar2;
            ArrayList arrayList12 = new ArrayList();
            Iterator it7 = arrayList11.iterator();
            while (it7.hasNext()) {
                i.b.v.f fVar3 = (i.b.v.f) it7.next();
                x.c(fVar3);
                Iterator it8 = it7;
                com.waze.ca.c standardRate2 = fVar3.getStandardRate();
                x.e(standardRate2, str2);
                com.waze.av.d.b bVarL2 = l(standardRate2);
                if (fVar3.hasDiscountedRate()) {
                    fVar = fVar3;
                    com.waze.ca.c discountedRate2 = fVar.getDiscountedRate();
                    str3 = str2;
                    x.e(discountedRate2, "getDiscountedRate(...)");
                    if (a.a.J(discountedRate2) && (discountedRate = fVar.getDiscountedRate()) != null) {
                        bVarL = l(discountedRate);
                    }
                    arrayList12.add(new com.waze.av.d.c(bVarL2, bVarL, fVar.getDuration().getSeconds()));
                    it7 = it8;
                    venueId = venueId;
                    str2 = str3;
                } else {
                    fVar = fVar3;
                    str3 = str2;
                }
                bVarL = null;
                arrayList12.add(new com.waze.av.d.c(bVarL2, bVarL, fVar.getDuration().getSeconds()));
                it7 = it8;
                venueId = venueId;
                str2 = str3;
            }
            str = venueId;
            aVar2 = new com.waze.av.d.a(dVar, arrayList12, iVar3.hasReservationUri() ? iVar3.getReservationUri() : null);
        } else {
            str = venueId;
            aVar2 = null;
        }
        return new k(str, cVar, aVar3, formattedName, strI, strI3, strI4, strI5, strI2, strI6, strI7, uVar, uVar3, arrayList7, arrayList5, qVarG, strI8, categoriesList, null, servicesList, arrayList8, z, strI9, arrayList10, currency, numValueOf2, priceLevelSymbol, dValueOf, numValueOf3, timezone, jVarD, null, updateable, residential, listIcon, badge, strI10, z2, aVar2, false, 0, DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_ALTERNATIVE_TRANSPORT_HASH_TAG);
    }

    public static final o f(ce ceVar, com.waze.aw.a aVar) {
        x.f(ceVar, "<this>");
        x.f(aVar, "moodNameProvider");
        Object value = bd.f35539b.getValue();
        x.e(value, "getValue(...)");
        String strValueOf = String.valueOf((String) value);
        String strValueOf2 = String.valueOf(ceVar.getId());
        Object value2 = bd.f35540c.getValue();
        x.e(value2, "getValue(...)");
        String strValueOf3 = String.valueOf((String) value2);
        String strValueOf4 = String.valueOf(ceVar.getId());
        String name = ceVar.getCreatedByInfo().getName();
        x.e(name, "getName(...)");
        return new o(strValueOf.concat(strValueOf2), strValueOf3.concat(strValueOf4), new com.waze.av.d.u(name, aVar.getMoodNameById(ceVar.getCreatedByInfo().getMood())), ceVar.getByMe());
    }

    public static final q g(List list) {
        String to;
        x.f(list, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<ch> arrayList = new ArrayList();
        for (Object obj : list) {
            ch chVar = (ch) obj;
            String from = chVar.getFrom();
            if (from != null && from.length() != 0 && (to = chVar.getTo()) != null && to.length() != 0) {
                arrayList.add(obj);
            }
        }
        for (ch chVar2 : arrayList) {
            List<Long> daysList = chVar2.getDaysList();
            x.e(daysList, "getDaysList(...)");
            for (Long l2 : daysList) {
                Parcelable.Creator<com.waze.av.d.e> creator = com.waze.av.d.e.CREATOR;
                com.waze.av.d.e eVarQ = com.waze.ad.c.b.q((int) l2.longValue());
                if (linkedHashMap.get(eVarQ) == null) {
                    linkedHashMap.put(eVarQ, new ArrayList());
                }
                List list2 = (List) linkedHashMap.get(eVarQ);
                if (list2 != null) {
                    list2.add(com.waze.ad.c.b.i(chVar2.getFrom(), chVar2.getTo()));
                }
            }
        }
        return new q(linkedHashMap);
    }

    public static final s h(cz czVar) {
        x.f(czVar, "<this>");
        String id = czVar.getId();
        x.e(id, "getId(...)");
        return new s(id, Float.valueOf(czVar.getPrice()), Long.valueOf(czVar.getLastUpdated()), czVar.getUpdatedBy());
    }

    public static final String i(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        return str2.length() != 0 ? str2 : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final com.waze.search.d.a.a.a aVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1179488789);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179488789, i3, -1, "com.waze.search.categories.CategoryListItem (CategoriesScreen.kt:73)");
            }
            String strD = com.waze.search.d.a.b.d(aVar.c(), composerStartRestartGroup, 0);
            com.waze.z.a.a.a aVar2 = new com.waze.z.a.a.a(aVar.b(), new com.waze.z.a.s(ContentScale.Companion.getInside(), ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null), 43), Dp.m11162boximpl(24.0f), null);
            long jO = com.waze.bz.a.d(composerStartRestartGroup, 0).o();
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(aVar))) {
                z = true;
            }
            c cVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || cVarRememberedValue == Composer.Companion.getEmpty()) {
                cVarRememberedValue = new c(aVar, 2, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(cVarRememberedValue);
            }
            com.waze.z.a.a.h.h(strD, false, true, null, jO, (h.g.a.a) ((h.l.f) cVarRememberedValue), aVar2, ComposableLambdaKt.rememberComposableLambda(463996968, true, new p() { // from class: com.waze.search.a.e
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(463996968, iIntValue, -1, "com.waze.search.categories.CategoryListItem.<anonymous> (CategoriesScreen.kt:91)");
                        }
                        com.waze.search.d.a.a.a aVar3 = aVar;
                        Modifier modifierRotate = RotateKt.rotate(SizeKt.m2822size3ABfNKs(Modifier.Companion, 16.0f), 180.0f);
                        Role roleM10309boximpl = Role.m10309boximpl(Role.Companion.m10316getButtono7Vup1c());
                        boolean zChangedInstance = composer2.changedInstance(aVar3);
                        c cVarRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || cVarRememberedValue2 == Composer.Companion.getEmpty()) {
                            cVarRememberedValue2 = new c(aVar3, 3, (char[]) null);
                            composer2.updateRememberedValue(cVarRememberedValue2);
                        }
                        IconKt.m4110Iconww6aTOc(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.T.c(com.waze.design_components.b.e.f23312a), composer2, 0), (String) null, be.J(modifierRotate, false, roleM10309boximpl, (h.g.a.a) cVarRememberedValue2, composer2, 54, 10), com.waze.bz.a.d(composer2, 0).r(), composer2, Painter.$stable | 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), null, null, composerStartRestartGroup, 12583344, 0, DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.search.a.f
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return j.b(aVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final com.waze.av.d.b l(com.waze.ca.c cVar) {
        return new com.waze.av.d.b(Long.valueOf(cVar.getUnits()), Integer.valueOf(cVar.getNanos()), cVar.getCurrencyCode());
    }
}
