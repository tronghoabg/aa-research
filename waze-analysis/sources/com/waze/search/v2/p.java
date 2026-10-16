package com.waze.search.v2;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {
    public static final String a() {
        return ConfigValues.CONFIG_VALUE_PROVIDER_SEARCH_GAS_USER_PRODUCT.b();
    }

    public static final String b() {
        String strB = ConfigValues.CONFIG_VALUE_PROVIDER_SEARCH_GAS_USER_BRAND.b();
        h.g.b.x.e(strB, "getValue(...)");
        return strB;
    }

    public static final com.waze.shared_infra.h.c c(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "location");
        return com.waze.shared_infra.h.b.a((int) ConfigValues.CONFIG_VALUE_SEARCH_RECENTER_MAP_BORDER_METERS.b().longValue(), cVar);
    }

    public static final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_PARKING_BOOKING_DISPLAY_RATES.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_PARKING_BOOKING_RESERVATION_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static final Cdo f() {
        int iLongValue = (int) ConfigValues.CONFIG_VALUE_PROVIDER_SEARCH_GAS_STATIONS_SORT.b().longValue();
        Integer numValueOf = Integer.valueOf(iLongValue);
        numValueOf.getClass();
        if (iLongValue == 0) {
            return new dn(a());
        }
        numValueOf.getClass();
        if (iLongValue == 1) {
            return dm.f36378a;
        }
        numValueOf.getClass();
        if (iLongValue == 2) {
            return dl.f36377a;
        }
        numValueOf.getClass();
        return iLongValue == 3 ? dk.f36376a : dk.f36376a;
    }
}
