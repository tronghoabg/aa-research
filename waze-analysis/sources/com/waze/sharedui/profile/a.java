package com.waze.sharedui.profile;

import com.google.d.b.an;
import com.waze.sharedui.models.PlaceData;
import h.g.b.x;
import i.b.e.k;
import i.b.e.l;
import i.b.l.jc;
import i.b.s;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final UserProfile f39070a;

    static {
        jc defaultInstance = jc.getDefaultInstance();
        x.e(defaultInstance, "getDefaultInstance(...)");
        f39070a = a(defaultInstance, UserProfileSource.CACHE);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.sharedui.profile.UserProfile a(i.b.l.jc r23, com.waze.sharedui.profile.UserProfileSource r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.profile.a.a(i.b.l.jc, com.waze.sharedui.profile.UserProfileSource):com.waze.sharedui.profile.UserProfile");
    }

    private static final PlaceData c(l lVar) {
        String venueId = lVar.getPlace().getVenueId();
        x.e(venueId, "getVenueId(...)");
        if (true == an.f(venueId)) {
            venueId = PlaceData.NON_WAZE_VENUE_ID;
        }
        PlaceData placeData = new PlaceData(venueId);
        s location = lVar.getPlace().getLocation();
        placeData.setCoordinate(new com.waze.shared_infra.h.c(location.getLatTimes1000000(), location.getLonTimes1000000()));
        placeData.setFullAddress(lVar.getPlace().getCity(), lVar.getPlace().getStreet(), lVar.getPlace().getHouse());
        placeData.setTitle(lVar.getPlace().getLocationName());
        if (lVar.hasType()) {
            if (lVar.getType() == k.HOME) {
                placeData.setHome(true);
                return placeData;
            }
            if (lVar.getType() == k.WORK) {
                placeData.setWork(true);
            }
        }
        return placeData;
    }
}
