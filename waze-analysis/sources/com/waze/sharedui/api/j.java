package com.waze.sharedui.api;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final UserProfile f38805a;

    public j(UserProfile userProfile) {
        this.f38805a = userProfile;
    }

    public final UserProfile a() {
        return this.f38805a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && x.n(this.f38805a, ((j) obj).f38805a);
    }

    public final int hashCode() {
        UserProfile userProfile = this.f38805a;
        if (userProfile == null) {
            return 0;
        }
        return userProfile.hashCode();
    }

    public final String toString() {
        return "LocateAccountByCommunityResponse(profile=" + this.f38805a + ")";
    }
}
