package com.waze.search.v2;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.waze.MoodManager;
import com.waze.R;
import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.navigate.AddressItem;
import com.waze.navigate.AutocompleteSearchActivity;
import com.waze.search.stats.SearchStatsSender$SearchCategoryGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gb {
    public static final /* synthetic */ com.waze.navigate.location_preview.a a(com.waze.av.d.u uVar) {
        String moodResourceName = MoodManager.getMoodResourceName(uVar.a());
        h.g.b.x.e(moodResourceName, "getMoodResourceName(...)");
        return new com.waze.navigate.location_preview.a(moodResourceName, uVar.b());
    }

    public static final Object b(ft ftVar, com.waze.navigate.location_preview.ay ayVar, com.waze.av.d.k kVar, com.waze.navigate.location_preview.o oVar, h.g.a.l lVar, h.c.e eVar) {
        Object objD = kotlinx.coroutines.aj.d(new ga(ayVar, ftVar, lVar, oVar, kVar, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    public static final Intent c(Context context, boolean z, boolean z2) {
        h.g.b.x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) AutocompleteSearchActivity.class);
        intent.putExtra("SearchMode", true != z ? 4 : 3);
        intent.putExtra("IsEditMode", z2);
        return intent;
    }

    public static final com.waze.navigate.location_preview.c d(com.waze.av.d.k kVar, com.waze.ev.n nVar) {
        h.g.b.x.f(kVar, "<this>");
        h.g.b.x.f(nVar, "evRepository");
        if (kVar.F().isEmpty() && kVar.t() == null && kVar.E().isEmpty()) {
            return null;
        }
        List<com.waze.av.d.f> listF = kVar.F();
        ArrayList arrayList = new ArrayList(h.a.i.q(listF, 10));
        for (com.waze.av.d.f fVar : listF) {
            arrayList.add(new com.waze.ev.c(fVar.d(), fVar.b(), fVar.a(), fVar.c()));
        }
        return com.waze.navigate.et.h(new com.waze.ev.a(arrayList, kVar.K(), kVar.E(), kVar.t()), nVar);
    }

    public static final com.waze.ui.m.ad e(final AddressItem addressItem, final com.waze.favorites.q qVar, IsHomeWorkSetResult isHomeWorkSetResult, final com.waze.favorites.k kVar, final h.g.a.a aVar, final h.g.a.a aVar2) {
        boolean z;
        Object next;
        h.g.b.x.f(addressItem, "addressItem");
        h.g.b.x.f(qVar, "favoritesStatsReporter");
        h.g.b.x.f(kVar, "favMgr");
        h.g.b.x.f(aVar, "onDone");
        h.g.b.x.f(aVar2, "onCancelled");
        final boolean z2 = true;
        boolean z3 = isHomeWorkSetResult == null || !isHomeWorkSetResult.getIsHomeSet();
        if (isHomeWorkSetResult == null || !isHomeWorkSetResult.getIsWorkSet()) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.ADD_FAVORITES_POP_UP_TITLE);
        h.g.b.x.f(addressItem, "addressItem");
        Iterator it = h.a.i.i(addressItem.getTitle(), addressItem.getAddress()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            h.g.b.x.c(str);
            if (str.length() > 0) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        boolean z4 = (isHomeWorkSetResult == null || !isHomeWorkSetResult.getIsWorkSet()) ? z : false;
        final boolean z5 = z3;
        h.g.a.l lVar = new h.g.a.l() { // from class: com.waze.search.v2.cw
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return gb.f(kVar, addressItem, aVar, qVar, z5, z2, (String) obj);
            }
        };
        h.g.a.a aVar3 = new h.g.a.a() { // from class: com.waze.search.v2.cx
            @Override // h.g.a.a
            public final Object invoke() {
                return gb.g(aVar2, qVar, z5, z2);
            }
        };
        final int i2 = 1;
        h.g.a.a aVar4 = new h.g.a.a() { // from class: com.waze.search.v2.cy
            @Override // h.g.a.a
            public final Object invoke() {
                int i3 = i2;
                boolean z6 = z2;
                boolean z7 = z5;
                com.waze.favorites.q qVar2 = qVar;
                h.g.a.a aVar5 = aVar;
                AddressItem addressItem2 = addressItem;
                com.waze.favorites.k kVar2 = kVar;
                return i3 != 0 ? gb.h(kVar2, addressItem2, aVar5, qVar2, z7, z6) : gb.i(kVar2, addressItem2, aVar5, qVar2, z7, z6);
            }
        };
        final int i3 = 0;
        return new com.waze.ui.m.ad(jVar, str3, z3, z4, lVar, aVar3, aVar4, new h.g.a.a() { // from class: com.waze.search.v2.cy
            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i3;
                boolean z6 = z2;
                boolean z7 = z5;
                com.waze.favorites.q qVar2 = qVar;
                h.g.a.a aVar5 = aVar;
                AddressItem addressItem2 = addressItem;
                com.waze.favorites.k kVar2 = kVar;
                return i32 != 0 ? gb.h(kVar2, addressItem2, aVar5, qVar2, z7, z6) : gb.i(kVar2, addressItem2, aVar5, qVar2, z7, z6);
            }
        });
    }

    static final h.ab f(com.waze.favorites.k kVar, AddressItem addressItem, h.g.a.a aVar, com.waze.favorites.q qVar, boolean z, boolean z2, String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        String string = h.n.o.v(str).toString();
        if (!TextUtils.isEmpty(string)) {
            n(qVar, z, z2, com.waze.favorites.p.f23816a);
            com.waze.places.f fVarZ = com.waze.navigate.et.z(addressItem);
            h.g.b.x.e(fVarZ, "toPlace(...)");
            kVar.e(fVarZ, string);
        }
        aVar.invoke();
        return h.ab.f48028a;
    }

    static final h.ab g(h.g.a.a aVar, com.waze.favorites.q qVar, boolean z, boolean z2) {
        n(qVar, z, z2, com.waze.favorites.p.f23819d);
        aVar.invoke();
        return h.ab.f48028a;
    }

    static final h.ab h(com.waze.favorites.k kVar, AddressItem addressItem, h.g.a.a aVar, com.waze.favorites.q qVar, boolean z, boolean z2) {
        n(qVar, z, z2, com.waze.favorites.p.f23817b);
        com.waze.places.f fVarZ = com.waze.navigate.et.z(addressItem);
        h.g.b.x.e(fVarZ, "toPlace(...)");
        h.g.b.x.f(fVarZ, "place");
        kVar.e(fVarZ, com.waze.shared_infra.o.b.a().c(R.string.HOME, new Object[0]));
        aVar.invoke();
        return h.ab.f48028a;
    }

    static final h.ab i(com.waze.favorites.k kVar, AddressItem addressItem, h.g.a.a aVar, com.waze.favorites.q qVar, boolean z, boolean z2) {
        n(qVar, z, z2, com.waze.favorites.p.f23818c);
        com.waze.places.f fVarZ = com.waze.navigate.et.z(addressItem);
        h.g.b.x.e(fVarZ, "toPlace(...)");
        h.g.b.x.f(fVarZ, "place");
        kVar.e(fVarZ, com.waze.shared_infra.o.b.a().c(R.string.WORK, new Object[0]));
        aVar.invoke();
        return h.ab.f48028a;
    }

    public static /* synthetic */ AddressItem j(com.waze.av.d.k kVar, int i2, String str, boolean z, int i3) {
        h.g.b.x.f(kVar, "<this>");
        AddressItem addressItem = new AddressItem(kVar.h().c(), kVar.h().d(), com.waze.search.h.cd.f(kVar.a()));
        addressItem.setIntPosition(Integer.valueOf(kVar.h().c()), Integer.valueOf(kVar.h().d()));
        addressItem.setVenueId(kVar.A());
        String strB = kVar.B();
        if (strB == null) {
            strB = "";
        }
        addressItem.setTitle(strB);
        com.waze.reports.ed venueData = addressItem.getVenueData();
        if (venueData != null) {
            venueData.W(addressItem.getTitle());
        }
        com.waze.reports.ed venueData2 = addressItem.getVenueData();
        if (venueData2 != null) {
            venueData2.Q(kVar.p());
        }
        com.waze.reports.ed venueData3 = addressItem.getVenueData();
        if (venueData3 != null) {
            venueData3.O(h.a.i.af(kVar.D(), h.a.i.j(null)));
        }
        com.waze.reports.ed venueData4 = addressItem.getVenueData();
        if (venueData4 != null) {
            venueData4.ad(kVar.I());
        }
        com.waze.reports.ed venueData5 = addressItem.getVenueData();
        if (venueData5 != null) {
            venueData5.Z(kVar.h().c(), kVar.h().d());
        }
        com.waze.reports.ed venueData6 = addressItem.getVenueData();
        if (venueData6 != null) {
            com.waze.av.d.q qVarD = kVar.d();
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = qVarD.a().values().iterator();
            while (it.hasNext()) {
                for (com.waze.av.d.p pVar : (List) it.next()) {
                    Set setEntrySet = qVarD.a().entrySet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : setEntrySet) {
                        if (((List) ((Map.Entry) obj).getValue()).contains(pVar)) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = new ArrayList(h.a.i.q(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Integer.valueOf(((com.waze.av.d.e) ((Map.Entry) it2.next()).getKey()).ordinal()));
                    }
                    linkedHashMap.put(pVar, h.a.i.au(arrayList4));
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                com.waze.av.d.p pVar2 = (com.waze.av.d.p) entry.getKey();
                Set set = (Set) entry.getValue();
                ArrayList arrayList5 = new ArrayList(7);
                for (int i4 = 0; i4 < 7; i4++) {
                    arrayList5.add(0);
                }
                ArrayList arrayList6 = arrayList5;
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    arrayList6.set(((Number) it3.next()).intValue(), 1);
                }
                String str2 = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(pVar2.a()), Integer.valueOf(pVar2.b())}, 2));
                h.g.b.x.e(str2, "format(...)");
                String str3 = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(pVar2.c()), Integer.valueOf(pVar2.d())}, 2));
                h.g.b.x.e(str3, "format(...)");
                OpeningHours.Builder builderNewBuilder = OpeningHours.newBuilder();
                builderNewBuilder.addAllDays(arrayList6);
                builderNewBuilder.setFrom(str2);
                builderNewBuilder.setTo(str3);
                OpeningHours openingHoursBuild = builderNewBuilder.build();
                h.g.b.x.e(openingHoursBuild, "build(...)");
                arrayList.add(openingHoursBuild);
            }
            venueData6.X(arrayList);
        }
        com.waze.reports.ed venueData7 = addressItem.getVenueData();
        if (venueData7 != null) {
            venueData7.N(kVar.s());
        }
        com.waze.reports.ed venueData8 = addressItem.getVenueData();
        if (venueData8 != null) {
            venueData8.Y(kVar.w());
        }
        com.waze.reports.ed venueData9 = addressItem.getVenueData();
        if (venueData9 != null) {
            venueData9.ah(kVar.C());
        }
        com.waze.reports.ed venueData10 = addressItem.getVenueData();
        if (venueData10 != null) {
            venueData10.ac(kVar.y());
        }
        com.waze.reports.ed venueData11 = addressItem.getVenueData();
        if (venueData11 != null) {
            venueData11.ag(Boolean.valueOf(kVar.J()));
        }
        Double dI = kVar.i();
        if (dI != null) {
            double dDoubleValue = dI.doubleValue();
            com.waze.reports.ed venueData12 = addressItem.getVenueData();
            if (venueData12 != null) {
                venueData12.ab(Double.valueOf(dDoubleValue));
            }
        }
        Integer numK = kVar.k();
        if (numK != null) {
            int iIntValue = numK.intValue();
            com.waze.reports.ed venueData13 = addressItem.getVenueData();
            if (venueData13 != null) {
                venueData13.aa(Integer.valueOf(iIntValue));
            }
        }
        for (com.waze.av.d.o oVar : kVar.G()) {
            com.waze.reports.ed venueData14 = addressItem.getVenueData();
            if (venueData14 != null) {
                String strC = oVar.c();
                String strB2 = oVar.b();
                com.waze.av.d.u uVarA = oVar.a();
                venueData14.J(strC, strB2, uVarA != null ? uVarA.b() : null);
            }
        }
        int i5 = (i3 & 2) != 0 ? 0 : i2;
        addressItem.setVenueAddress(kVar.a().b(), kVar.a().e(), kVar.a().a(), kVar.a().f(), kVar.a().c(), kVar.a().g());
        addressItem.setType(i5);
        int i6 = (i5 == 1 || i5 == 3 || i5 == 5) ? 1 : 99;
        int i7 = i3 & 4;
        boolean z2 = !((i3 & 8) == 0);
        String str4 = i7 == 0 ? str : null;
        addressItem.setCategory(i6);
        addressItem.setId(str4);
        addressItem.mIsNavigable = z2 | z;
        return addressItem;
    }

    public static final com.waze.search.stats.b k(String str) {
        h.g.b.x.f(str, "resultSource");
        return h.g.b.x.n(str, "GOOGLE") ? com.waze.search.stats.b.f36009b : h.g.b.x.n(str, "WAZE") ? com.waze.search.stats.b.f36010c : com.waze.search.stats.b.f36008a;
    }

    public static final SearchStatsSender$SearchCategoryGroup l(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1355030580:
                if (str.equals("coffee")) {
                    return SearchStatsSender$SearchCategoryGroup.COFFEE;
                }
                return null;
            case -1247032460:
                if (str.equals("hotels_and_lodging")) {
                    return SearchStatsSender$SearchCategoryGroup.HOTELS_AND_LODGING;
                }
                return null;
            case -968051567:
                if (str.equals("pharmacies")) {
                    return SearchStatsSender$SearchCategoryGroup.PHARMACIES;
                }
                return null;
            case -793201736:
                if (str.equals("parking")) {
                    return SearchStatsSender$SearchCategoryGroup.PARKING;
                }
                return null;
            case -537986395:
                if (str.equals("category_saved_places")) {
                    return SearchStatsSender$SearchCategoryGroup.SAVED_PLACES;
                }
                return null;
            case -344460952:
                if (str.equals("shopping")) {
                    return SearchStatsSender$SearchCategoryGroup.SHOPPING;
                }
                return null;
            case -298696924:
                if (str.equals("grocery_stores")) {
                    return SearchStatsSender$SearchCategoryGroup.GROCERY_STORES;
                }
                return null;
            case 3148894:
                if (str.equals("food")) {
                    return SearchStatsSender$SearchCategoryGroup.FOOD;
                }
                return null;
            case 338666998:
                if (str.equals("category_more")) {
                    return SearchStatsSender$SearchCategoryGroup.MORE;
                }
                return null;
            case 431968460:
                if (str.equals("hospital_and_medical_care")) {
                    return SearchStatsSender$SearchCategoryGroup.HOSPITAL_AND_MEDICAL_CARE;
                }
                return null;
            case 577688908:
                if (str.equals("drive_thru")) {
                    return SearchStatsSender$SearchCategoryGroup.DRIVE_THRU;
                }
                return null;
            case 772885966:
                if (str.equals("gas_station")) {
                    return SearchStatsSender$SearchCategoryGroup.GAS_STATION;
                }
                return null;
            case 1587219398:
                if (str.equals("outdoor_parks")) {
                    return SearchStatsSender$SearchCategoryGroup.OUTDOOR_PARKS;
                }
                return null;
            case 1825048934:
                if (str.equals("charging_station")) {
                    return SearchStatsSender$SearchCategoryGroup.CHARGING_STATION;
                }
                return null;
            case 1919954658:
                if (str.equals("crisis_locations")) {
                    return SearchStatsSender$SearchCategoryGroup.CRISIS_LOCATION;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final SearchStatsSender$SearchCategoryGroup m(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1433764466:
                    if (str.equals("GAS_STATION")) {
                        return SearchStatsSender$SearchCategoryGroup.GAS_STATION;
                    }
                    break;
                case -482959215:
                    if (str.equals("PHARMACIES")) {
                        return SearchStatsSender$SearchCategoryGroup.PHARMACIES;
                    }
                    break;
                case -75219048:
                    if (str.equals("PARKING")) {
                        return SearchStatsSender$SearchCategoryGroup.PARKING;
                    }
                    break;
                case 2163806:
                    if (str.equals("FOOD")) {
                        return SearchStatsSender$SearchCategoryGroup.FOOD;
                    }
                    break;
                case 2372437:
                    if (str.equals("MORE")) {
                        return SearchStatsSender$SearchCategoryGroup.MORE;
                    }
                    break;
                case 150899524:
                    if (str.equals("GROCERY_STORES")) {
                        return SearchStatsSender$SearchCategoryGroup.GROCERY_STORES;
                    }
                    break;
                case 272040204:
                    if (str.equals("HOSPITAL_AND_MEDICAL_CARE")) {
                        return SearchStatsSender$SearchCategoryGroup.HOSPITAL_AND_MEDICAL_CARE;
                    }
                    break;
                case 283766580:
                    if (str.equals("HOTELS_AND_LODGING")) {
                        return SearchStatsSender$SearchCategoryGroup.HOTELS_AND_LODGING;
                    }
                    break;
                case 433656100:
                    if (str.equals("SAVED_PLACES")) {
                        return SearchStatsSender$SearchCategoryGroup.SAVED_PLACES;
                    }
                    break;
                case 438165864:
                    if (str.equals("SHOPPING")) {
                        return SearchStatsSender$SearchCategoryGroup.SHOPPING;
                    }
                    break;
                case 1092333932:
                    if (str.equals("DRIVE_THRU")) {
                        return SearchStatsSender$SearchCategoryGroup.DRIVE_THRU;
                    }
                    break;
                case 1324627846:
                    if (str.equals("OUTDOOR_PARKS")) {
                        return SearchStatsSender$SearchCategoryGroup.OUTDOOR_PARKS;
                    }
                    break;
                case 1993266124:
                    if (str.equals("COFFEE")) {
                        return SearchStatsSender$SearchCategoryGroup.COFFEE;
                    }
                    break;
                case 2034861382:
                    if (str.equals("CHARGING_STATION")) {
                        return SearchStatsSender$SearchCategoryGroup.CHARGING_STATION;
                    }
                    break;
            }
        }
        return l(str);
    }

    private static final void n(com.waze.favorites.q qVar, boolean z, boolean z2, com.waze.favorites.p pVar) {
        qVar.a(pVar, z, z2);
    }
}
