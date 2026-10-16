package com.waze.av.c;

import h.a.r;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16018a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f16019b = r.k(new h.k("parking", com.waze.design_components.b.d.af), new h.k("gas_station", com.waze.design_components.b.d.f23303d), new h.k("charging_station", com.waze.design_components.b.d.av), new h.k("food", com.waze.design_components.b.d.aH), new h.k("coffee", com.waze.design_components.b.d.V), new h.k("pharmacies", com.waze.design_components.b.d.W), new h.k("hospital_and_medical_care", com.waze.design_components.b.d.X), new h.k("hotels_and_lodging", com.waze.design_components.b.d.Y), new h.k("outdoor_parks", com.waze.design_components.b.d.Z), new h.k("drive_thru", com.waze.design_components.b.d.aa), new h.k("shopping", com.waze.design_components.b.d.f23307h), new h.k("grocery_stores", com.waze.design_components.b.d.ah), new h.k("emergency_shelter", com.waze.design_components.b.d.bv), new h.k("crisis_locations", com.waze.design_components.b.d.bB), new h.k("category_more", com.waze.design_components.b.d.N), new h.k("category_saved_places", com.waze.design_components.b.d.M));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f16020c;

    /* renamed from: d, reason: collision with root package name */
    private static final h.f f16021d;

    static {
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.aJ;
        com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.aM;
        com.waze.design_components.b.d dVar3 = com.waze.design_components.b.d.aN;
        com.waze.design_components.b.d dVar4 = com.waze.design_components.b.d.aP;
        com.waze.design_components.b.d dVar5 = com.waze.design_components.b.d.aQ;
        com.waze.design_components.b.d dVar6 = com.waze.design_components.b.d.aR;
        com.waze.design_components.b.d dVar7 = com.waze.design_components.b.d.Y;
        com.waze.design_components.b.d dVar8 = com.waze.design_components.b.d.aV;
        com.waze.design_components.b.d dVar9 = com.waze.design_components.b.d.aW;
        com.waze.design_components.b.d dVar10 = com.waze.design_components.b.d.aH;
        com.waze.design_components.b.d dVar11 = com.waze.design_components.b.d.Z;
        com.waze.design_components.b.d dVar12 = com.waze.design_components.b.d.bh;
        com.waze.design_components.b.d dVar13 = com.waze.design_components.b.d.bk;
        com.waze.design_components.b.d dVar14 = com.waze.design_components.b.d.au;
        com.waze.design_components.b.d dVar15 = com.waze.design_components.b.d.bB;
        f16020c = r.k(new h.k("AIRPORT", com.waze.design_components.b.d.aI), new h.k("ATM", dVar), new h.k("BAKERY", com.waze.design_components.b.d.aK), new h.k("BANK_FINANCIAL", dVar), new h.k("BAR", com.waze.design_components.b.d.aL), new h.k("BOOKSTORE", dVar2), new h.k("BUS_STATION", dVar3), new h.k("CAFE", com.waze.design_components.b.d.V), new h.k("CAMPING_TRAILER_PARK", com.waze.design_components.b.d.aO), new h.k("CAR_DEALERSHIP", dVar4), new h.k("CAR_RENTAL", dVar4), new h.k("CAR_SERVICES", dVar5), new h.k("CAR_WASH", dVar5), new h.k("CARPOOL_SPOT", com.waze.design_components.b.d.C), new h.k("CHARGING_STATION", com.waze.design_components.b.d.av), new h.k("CITY_HALL", dVar6), new h.k("COLLEGE_UNIVERSITY", dVar6), new h.k("CONSTRUCTION_SITE", com.waze.design_components.b.d.aS), new h.k("CONVENTIONS_EVENT_CENTER", com.waze.design_components.b.d.aT), new h.k("COTTAGE_CABIN", dVar7), new h.k("CULTURE_AND_ENTERTAINEMENT", com.waze.design_components.b.d.aU), new h.k("DEPARTMENT_STORE", dVar8), new h.k("ELECTRONICS", dVar9), new h.k("EMERGENCY_SHELTER", com.waze.design_components.b.d.bv), new h.k("FASHION_AND_CLOTHING", dVar8), new h.k("FAST_FOOD", com.waze.design_components.b.d.U), new h.k("FERRY_PIER", com.waze.design_components.b.d.aX), new h.k("FLOWERS", com.waze.design_components.b.d.aY), new h.k("FOOD_AND_DRINK", dVar10), new h.k("FOOD_COURT", dVar10), new h.k("FOREST_GROVE", dVar11), new h.k("FURNITURE_HOME_STORE", com.waze.design_components.b.d.aZ), new h.k("GARAGE_AUTOMOTIVE_SHOP", com.waze.design_components.b.d.ba), new h.k("GAS_STATION", com.waze.design_components.b.d.f23303d), new h.k("GIFTS", com.waze.design_components.b.d.bb), new h.k("GOVERNMENT", dVar6), new h.k("GYM_FITNESS", com.waze.design_components.b.d.bc), new h.k("HOSPITAL_URGENT_CARE", com.waze.design_components.b.d.X), new h.k("HOSTEL", dVar7), new h.k("HOTEL", dVar7), new h.k("ICE_CREAM", com.waze.design_components.b.d.bd), new h.k("INFORMATION_POINT", com.waze.design_components.b.d.ag), new h.k("JEWELRY", com.waze.design_components.b.d.be), new h.k("JUNCTION_INTERCHANGE", com.waze.design_components.b.d.bf), new h.k("LAUNDRY_DRY_CLEAN", dVar9), new h.k("LIBRARY", dVar2), new h.k("MOVIE_THEATER", com.waze.design_components.b.d.bg), new h.k("MUSIC_STORE", dVar12), new h.k("MUSIC_VENUE", dVar12), new h.k("NATURAL_FEATURES", dVar11), new h.k("OFFICES", com.waze.design_components.b.d.bi), new h.k("OUTDOORS", dVar11), new h.k("PARK", dVar11), new h.k("PARKING_LOT", com.waze.design_components.b.d.af), new h.k("PARKING_LATAM", com.waze.design_components.b.d.ai), new h.k("PERSONAL_CARE", com.waze.design_components.b.d.bj), new h.k("PET_STORE_VETERINARIAN_SERVICES", dVar13), new h.k("PHARMACY", com.waze.design_components.b.d.W), new h.k("PHOTOGRAPHY", com.waze.design_components.b.d.aB), new h.k("POLICE_STATION", com.waze.design_components.b.d.bl), new h.k("POST_OFFICE", com.waze.design_components.b.d.x), new h.k("RESTAURANT", dVar10), new h.k("SCHOOL", com.waze.design_components.b.d.bm), new h.k("SUBWAY_STATION", dVar14), new h.k("SUPERMARKET_GROCERY", com.waze.design_components.b.d.ah), new h.k("TAXI_STATION", com.waze.design_components.b.d.bn), new h.k("TELECOM", com.waze.design_components.b.d.B), new h.k("TRAIN_STATION", dVar14), new h.k("TUNNEL =", com.waze.design_components.b.d.bo), new h.k("ZOO_AQUARIUM", dVar13), new h.k("CRISIS_LOCATIONS", dVar15), new h.k("SHELTER_LOCATIONS", com.waze.design_components.b.d.bz), new h.k("DONATION_CENTERS", com.waze.design_components.b.d.bA), new h.k("OTHER_CRISIS_LOCATIONS", dVar15), new h.k("SHOPPING_AND_SERVICES", com.waze.design_components.b.d.f23307h), new h.k("TRANSPORTATION", dVar3), new h.k("LODGING", dVar7), new h.k("PROFESSIONAL_AND_PUBLIC", dVar6));
        f16021d = h.g.a(new com.waze.main_screen.ac.k(15));
    }

    public static final int a(String str, String str2, com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar) {
        x.f(dVar, "fallback");
        x.f(eVar, "resId");
        if (((Boolean) f16021d.getValue()).booleanValue() && com.waze.ad.c.b.t(str2, str)) {
            dVar = com.waze.design_components.b.d.ai;
        } else {
            com.waze.design_components.b.d dVar2 = (com.waze.design_components.b.d) f16019b.get(str);
            if (dVar2 != null || (dVar2 = (com.waze.design_components.b.d) f16020c.get(str2)) != null) {
                dVar = dVar2;
            }
        }
        return dVar.c(eVar);
    }

    public static final Map b() {
        return f16020c;
    }

    public static /* synthetic */ int c(String str, String str2, com.waze.design_components.b.d dVar, com.waze.design_components.b.e eVar, int i2) {
        if ((i2 & 4) != 0) {
            dVar = com.waze.design_components.b.d.I;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return a(str, str2, dVar, eVar);
    }
}
