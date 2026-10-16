package com.waze.bd.a;

import h.g.b.x;
import i.b.q.aa;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.f.f f16209a;

    public f(com.waze.sharedui.f.f fVar) {
        x.f(fVar, "elementSender");
        this.f16209a = fVar;
    }

    private static final l b(i.b.q.u uVar) {
        int iOrdinal = uVar.getType().ordinal();
        if (iOrdinal == 0) {
            return k.f16214a;
        }
        if (iOrdinal == 1) {
            return g.f16210a;
        }
        if (iOrdinal == 2) {
            return i.f16213a;
        }
        if (iOrdinal != 3) {
            throw new h.i();
        }
        long id = uVar.getId();
        String name = uVar.getName();
        x.e(name, "getName(...)");
        return new h(id, name);
    }

    private static final com.waze.av.a.p c(aa aaVar) {
        String country = aaVar.getLocation().getCountry();
        if (country.length() == 0) {
            country = null;
        }
        String str = country;
        String city = aaVar.getLocation().getCity();
        if (city.length() == 0) {
            city = null;
        }
        String str2 = city;
        String street = aaVar.getLocation().getStreet();
        if (street.length() == 0) {
            street = null;
        }
        String str3 = street;
        String houseNumber = aaVar.getLocation().getHouseNumber();
        if (houseNumber.length() == 0) {
            houseNumber = null;
        }
        String str4 = houseNumber;
        String state = aaVar.getLocation().getState();
        if (state.length() == 0) {
            state = null;
        }
        String str5 = state;
        String zip = aaVar.getLocation().getZip();
        if (zip.length() == 0) {
            zip = null;
        }
        String str6 = zip;
        String address = aaVar.getLocation().getAddress();
        if (address.length() == 0) {
            address = null;
        }
        com.waze.av.a.a aVar = new com.waze.av.a.a(str, str2, str3, str4, str5, str6, address);
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(aaVar.getLocation().getLatitude(), aaVar.getLocation().getLongitude());
        String venueId = aaVar.getLocation().getVenueId();
        String name = aaVar.getLocation().getName();
        if (name.length() == 0) {
            name = null;
        }
        String str7 = name;
        String brandIcon = aaVar.getBrandIcon();
        return new com.waze.av.a.p(aVar, cVar, new com.waze.av.a.o(venueId, str7, null, null, brandIcon.length() != 0 ? brandIcon : null, null, 44));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.waze.bd.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.shared_infra.h.c r15, java.lang.Long r16, boolean r17, boolean r18, h.c.e r19) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bd.a.f.a(com.waze.shared_infra.h.c, java.lang.Long, boolean, boolean, h.c.e):java.lang.Object");
    }
}
