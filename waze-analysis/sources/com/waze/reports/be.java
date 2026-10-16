package com.waze.reports;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private static NativeManager.VenueFieldValidators f33687a;

    public static String b(int i2) {
        NativeManager.VenueFieldValidators venueFieldValidators = f33687a;
        if (venueFieldValidators == null) {
            return null;
        }
        int i3 = i2 - 1;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? venueFieldValidators.url : venueFieldValidators.phone : venueFieldValidators.description : venueFieldValidators.city : venueFieldValidators.house_number : venueFieldValidators.street : venueFieldValidators.name;
    }

    public static void c() {
        if (f33687a == null) {
            NativeManager.Post(new bb(3));
        }
    }
}
