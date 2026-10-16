package com.waze.reports;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private static NativeManager.VenueFieldPoints f33679a;

    public static int b(int i2) {
        NativeManager.VenueFieldPoints venueFieldPoints = f33679a;
        if (venueFieldPoints == null) {
            return 0;
        }
        switch (i2 - 1) {
            case 0:
                return venueFieldPoints.images;
            case 1:
                return venueFieldPoints.location;
            case 2:
                return venueFieldPoints.name;
            case 3:
                return venueFieldPoints.categories;
            case 4:
                return venueFieldPoints.street;
            case 5:
                return venueFieldPoints.house_number;
            case 6:
                return venueFieldPoints.city;
            case 7:
                return venueFieldPoints.services;
            case 8:
                return venueFieldPoints.hours;
            case 9:
                return venueFieldPoints.description;
            case 10:
                return venueFieldPoints.phone;
            case 11:
                return venueFieldPoints.url;
            default:
                return 3;
        }
    }

    public static void c() {
        if (f33679a == null) {
            NativeManager.Post(new bb(0));
        }
    }
}
