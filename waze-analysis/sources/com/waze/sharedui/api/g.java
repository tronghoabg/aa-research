package com.waze.sharedui.api;

import com.waze.sharedui.profile.UserProfile;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final UserProfile f38803a;

    public g(UserProfile userProfile) {
        this.f38803a = userProfile;
    }

    public final UserProfile a() {
        return this.f38803a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f38803a, ((g) obj).f38803a);
    }

    public final int hashCode() {
        UserProfile userProfile = this.f38803a;
        if (userProfile == null) {
            return 0;
        }
        return userProfile.hashCode();
    }

    public final String toString() {
        return "CheckUserAuthResponse(profile=" + this.f38803a + ")";
    }
}
